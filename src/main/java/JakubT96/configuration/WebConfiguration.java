package JakubT96.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*
Konfigurační třída která nám povolí tzv. CORS (Cross Origin Resource
Sharing). Kvůli bezpečnosti ve výchozím nastavení nemůžeme
přes webový prohlížeč komunikovat se serverem, který se nachází na jiné
URL adrese, než na které se nacházíme my
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        WebMvcConfigurer.super.addCorsMappings(registry);
        registry.addMapping("/**")
                .allowedMethods("HEAD", "GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedOriginPatterns("**")
                .allowCredentials(true);
    }
}