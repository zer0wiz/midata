package com.nkia.cygnus.midata.ElasticSearch;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * <pre> com.nkia.cygnus.midata.ElasticSearch </pre>
 *
 * @Author : <a href="mailto:hhlee@nkia.co.kr">Neo</a>
 * @Date : 2017-08-17.
 * @Version : 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticSearchTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void test() throws Exception {
        mockMvc.perform(get("/test/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    //ElasticSearch
    // 연결 테스트
    // 유효 index 테스트
    // index 확인 테스트
    // index생성 테스트
    // index 테스트
    // bulkIndex 테스트
}
