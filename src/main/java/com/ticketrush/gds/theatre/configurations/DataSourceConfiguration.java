package com.ticketrush.gds.theatre.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 * Author: srinivasun
 * Since: 15/10/24
 */
@Configuration
@ConfigurationProperties(prefix = "datasource")
public class DataSourceConfiguration {

    // datasource bean configurations goes here
}
