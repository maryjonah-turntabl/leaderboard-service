package io.turntabl.leaderboardservice.service;

import io.turntabl.leaderboardservice.client.CodewarsClient;
import io.turntabl.leaderboardservice.converter.UserDtoToProfileConverter;
import org.mockito.Mock;

class CodewarsPollingServiceTest {

    @Mock
    private CodewarsClient codewarsClient;
    private UserDtoToProfileConverter userDtoToProfileConverter;

    private LeaderboardRepositoryService underTest;

}
