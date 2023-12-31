package com.cmc.zenefitserver.domain.policy.domain.enums;

import com.cmc.zenefitserver.global.error.ErrorCode;
import com.cmc.zenefitserver.global.error.exception.BusinessException;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

import java.util.Arrays;


@Getter
public enum CityCode {

    // 1. 서울
    JONGRO("003002001001", "종로구"),
    JUNG("003002001002", "중구"),
    YONGSAN("003002001003", "용산구"),
    SUNGDONG("003002001004", "성동구"),
    GWANGJIN("003002001005", "광진구"),
    DONGDAEMUN("003002001006", "동대문구"),
    JUNGNANG("003002001007", "중랑구"),
    SUNGBUK("003002001008", "성북구"),
    GANGBUK("003002001009", "강북구"),
    DOBONG("003002001010", "도봉구"),
    NOWON("003002001011", "노원구"),
    EUNPYEONG("003002001012", "은평구"),
    SEODAEMUN("003002001013", "서대문구"),
    MAPO("003002001014", "마포구"),
    YANGCHEON("003002001015", "양천구"),
    GANGSEO("003002001016", "강서구"),
    GURO("003002001017", "구로구"),
    GUMCHEON("003002001018", "금천구"),
    YEONGDEUNGPO("003002001019", "영등포구"),
    DONGJAK("003002001020", "동작구"),
    GWANAK("003002001021", "관악구"),
    SECHO("003002001022", "서초구"),
    GANGNAM("003002001023", "강남구"),
    SONGPA("003002001024", "송파구"),
    GANGDONG("003002001025", "강동구"),

    // 2. 부산
    BUSAN_JUNG("003002002001", "중구"),
    BUSAN_SEO("003002002002", "서구"),
    BUSAN_DONG("003002002003", "동구"),
    BUSAN_YEONGDO("003002002004", "영도구"),
    BUSAN_BUJIN("003002002005", "부산진구"),
    BUSAN_DONGRAE("003002002006", "동래구"),
    BUSAN_NAM("003002002007", "남구"),
    BUSAN_BUK("003002002008", "북구"),
    BUSAN_HAEUNDAE("003002002009", "해운대구"),
    BUSAN_SAHAGU("003002002010", "사하구"),
    BUSAN_GEUMJEONG("003002002011", "금정구"),
    BUSAN_GANGSEO("003002002012", "강서구"),
    BUSAN_YEONJE("003002002013", "연제구"),
    BUSAN_SUYEONG("003002002014", "수영구"),
    BUSAN_SASANG("003002002015", "사상구"),
    BUSAN_GIJANG("003002002016", "기장군"),

    // 3. 대구
    DAEGU_JUNG("003002003001", "중구"),
    DAEGU_DONG("003002003002", "동구"),
    DAEGU_SEO("003002003003", "서구"),
    DAEGU_NAM("003002003004", "남구"),
    DAEGU_BUK("003002003005", "북구"),
    DAEGU_SUSUNG("003002003006", "수성구"),
    DAEGU_DALSEO("003002003007", "달서구"),
    DAEGU_DALSEONG("003002003008", "달성군"),
    DAEGU_GUNWI("003002003009", "군위군"),

    // 4. 인천
    INCHEON_JUNG("003002004001", "중구"),
    INCHEON_DONG("003002004002", "동구"),
    INCHEON_MICHEUHOL("003002004004", "미추홀구"),
    INCHEON_YEONSU("003002004005", "연수구"),
    INCHEON_NAMDONG("003002004006", "남동구"),
    INCHEON_BUPYEONG("003002004007", "부평구"),
    INCHEON_GYEGWANG("003002004008", "계양구"),
    INCHEON_SEO("003002004009", "서구"),
    INCHEON_GANGHWA("003002004010", "강화군"),
    INCHEON_ONGJIN("003002004011", "옹진군"),

    // 5. 광주
    GWANGJU_DONG("003002005001", "동구"),
    GWANGJU_SEO("003002005002", "서구"),
    GWANGJU_NAM("003002005003", "남구"),
    GWANGJU_BUK("003002005004", "북구"),
    GWANGJU_GWANGSAN("003002005005", "광산구"),


    // 6. 대전
    DAEJEON_DONG("003002006001", "동구"),
    DAEJEON_JUNG("003002006002", "중구"),
    DAEJEON_SEO("003002006003", "서구"),
    DAEJEON_YUSEONG("003002006004", "유성구"),
    DAEJEON_DAEDEOK("003002006005", "대덕구"),


    // 7. 울산
    ULSAN_JUNG("003002007001", "중구"),
    ULSAN_NAM("003002007002", "남구"),
    ULSAN_DONG("003002007003", "동구"),
    ULSAN_BUK("003002007004", "북구"),
    ULSAN_ULJU("003002007005", "울주군"),


    // 8. 경기
    GYEONGGI_SUWON("003002008001", "수원시"),
    GYEONGGI_SEONGNAM("003002008002", "성남시"),
    GYEONGGI_UIJEONGBU("003002008003", "의정부시"),
    GYEONGGI_ANYANG("003002008004", "안양시"),
    GYEONGGI_BUCHEON("003002008005", "부천시"),
    GYEONGGI_GWANGMYEONG("003002008006", "광명시"),
    GYEONGGI_PYONGTAEK("003002008007", "평택시"),
    GYEONGGI_DONGDUCHEON("003002008008", "동두천시"),
    GYEONGGI_ANSAN("003002008009", "안산시"),
    GYEONGGI_GOYANG("003002008010", "고양시"),
    GYEONGGI_GWACHEON("003002008011", "과천시"),
    GYEONGGI_GURI("003002008012", "구리시"),
    GYEONGGI_NAMYANGJU("003002008013", "남양주시"),
    GYEONGGI_OSAN("003002008014", "오산시"),
    GYEONGGI_SIHEUNG("003002008015", "시흥시"),
    GYEONGGI_GUNPO("003002008016", "군포시"),
    GYEONGGI_UIWANG("003002008017", "의왕시"),
    GYEONGGI_HANAM("003002008018", "하남시"),
    GYEONGGI_YONGIN("003002008019", "용인시"),
    GYEONGGI_PAJU("003002008020", "파주시"),
    GYEONGGI_ICHEON("003002008021", "이천시"),
    GYEONGGI_ANSEONG("003002008022", "안성시"),
    GYEONGGI_GIMPO("003002008023", "김포시"),
    GYEONGGI_HWASEONG("003002008024", "화성시"),
    GYEONGGI_GWANGJU("003002008025", "광주시"),
    GYEONGGI_YANGJU("003002008026", "양주시"),
    GYEONGGI_POCHUN("003002008027", "포천시"),
    GYEONGGI_YEOJU("003002008028", "여주시"),
    GYEONGGI_YEONCHEON("003002008031", "연천군"),
    GYEONGGI_GAPYEONG("003002008033", "가평군"),
    GYEONGGI_YANGPYEONG("003002008034", "양평군"),

    // 9. 강원
    GANGWON_CHUNCHEON("003002009001", "춘천시"),
    GANGWON_WONJU("003002009002", "원주시"),
    GANGWON_GANGNEUNG("003002009003", "강릉시"),
    GANGWON_DONGHAE("003002009004", "동해시"),
    GANGWON_TAEBACK("003002009005", "태백시"),
    GANGWON_SOCKCHO("003002009006", "속초시"),
    GANGWON_SAMCHEOK("003002009007", "삼척시"),
    GANGWON_HONGCHEON("003002009008", "홍천군"),
    GANGWON_HOENGSEONG("003002009009", "횡성군"),
    GANGWON_YEONGWOL("003002009010", "영월군"),
    GANGWON_PYOUNGCHANG("003002009011", "평창군"),
    GANGWON_JEONGSEON("003002009012", "정선군"),
    GANGWON_CHEORWON("003002009013", "철원군"),
    GANGWON_HWACHEON("003002009014", "화천군"),
    GANGWON_YANGGU("003002009015", "양구군"),
    GANGWON_INJE("003002009016", "인제군"),
    GANGWON_GOSEONG("003002009017", "고성군"),
    GANGWON_YANGYANG("003002009018", "양양군"),

    // 10. 충북
    CHUNGBUK_CHEONGJU("003002010001", "청주시"),
    CHUNGBUK_CHUNGJU("003002010002", "충주시"),
    CHUNGBUK_JECHEON("003002010003", "제천시"),
    CHUNGBUK_BOEUN("003002010005", "보은군"),
    CHUNGBUK_OKCHEON("003002010006", "옥천군"),
    CHUNGBUK_YEONGDONG("003002010007", "영동군"),
    CHUNGBUK_JEUNGPYEONG("003002010008", "증평군"),
    CHUNGBUK_JINCHEON("003002010009", "진천군"),
    CHUNGBUK_GOESAN("003002010010", "괴산군"),
    CHUNGBUK_EUMSEONG("003002010011", "음성군"),
    CHUNGBUK_DANYANG("003002010012", "단양군"),

    // 11. 충남
    CHUNGNAM_CHEONAN("003002011001", "천안시"),
    CHUNGNAM_GONGJU("003002011002", "공주시"),
    CHUNGNAM_BORYEONG("003002011003", "보령시"),
    CHUNGNAM_ASAN("003002011004", "아산시"),
    CHUNGNAM_SEOSAN("003002011005", "서산시"),
    CHUNGNAM_NONSAN("003002011006", "논산시"),
    CHUNGNAM_GYERYONG("003002011007", "계룡시"),
    CHUNGNAM_DANGJIN("003002011008", "당진시"),
    CHUNGNAM_GEUMSAN("003002011009", "금산군"),
    CHUNGNAM_BUYEO("003002011011", "부여군"),
    CHUNGNAM_SEOCHEON("003002011012", "서천군"),
    CHUNGNAM_CHEONGYANG("003002011013", "청양군"),
    CHUNGNAM_HONGSEONG("003002011014", "홍성군"),
    CHUNGNAM_YESAN("003002011015", "예산군"),
    CHUNGNAM_TAEAN("003002011016", "태안군"),

    // 12. 전북
    JEONBUK_JEONJU("003002012001", "전주시"),
    JEONBUK_GUNSAN("003002012002", "군산시"),
    JEONBUK_IKSAN("003002012003", "익산시"),
    JEONBUK_JEONGEUP("003002012004", "정읍시"),
    JEONBUK_NAMWON("003002012005", "남원시"),
    JEONBUK_GIMJE("003002012006", "김제시"),
    JEONBUK_WANJU("003002012007", "완주군"),
    JEONBUK_JINAN("003002012008", "진안군"),
    JEONBUK_MUJU("003002012009", "무주군"),
    JEONBUK_JANGSU("003002012010", "장수군"),
    JEONBUK_IMSIL("003002012011", "임실군"),
    JEONBUK_SUNCHANG("003002012012", "순창군"),
    JEONBUK_GOCHANG("003002012013", "고창군"),
    JEONBUK_BUAN("003002012014", "부안군"),

    // 13. 전남
    JEONNAM_MOKPO("003002013001", "목포시"),
    JEONNAM_YEOSU("003002013002", "여수시"),
    JEONNAM_SUNCHEON("003002013003", "순천시"),
    JEONNAM_NAJU("003002013004", "나주시"),
    JEONNAM_GWANGYANG("003002013005", "광양시"),
    JEONNAM_DAMYANG("003002013006", "담양군"),
    JEONNAM_GOKSEONG("003002013007", "곡성군"),
    JEONNAM_GURYE("003002013008", "구례군"),
    JEONNAM_GOHEUNG("003002013009", "고흥군"),
    JEONNAM_BOSEONG("003002013010", "보성군"),
    JEONNAM_HWASUN("003002013011", "화순군"),
    JEONNAM_JANGHEUNG("003002013012", "장흥군"),
    JEONNAM_GANGJIN("003002013013", "강진군"),
    JEONNAM_HAENAM("003002013014", "해남군"),
    JEONNAM_YEONGAM("003002013015", "영암군"),
    JEONNAM_MUAN("003002013016", "무안군"),
    JEONNAM_HAMPYEONG("003002013017", "함평군"),
    JEONNAM_YEONGGWANG("003002013018", "영광군"),
    JEONNAM_JANGSEONG("003002013019", "장성군"),
    JEONNAM_WANDO("003002013020", "완도군"),
    JEONNAM_JINDO("003002013021", "진도군"),
    JEONNAM_SINAN("003002013022", "신안군"),

    // 14. 경북
    GYEONGBUK_POHANG("003002014001", "포항시"),
    GYEONGBUK_GYEONGJU("003002014002", "경주시"),
    GYEONGBUK_GIMCHEON("003002014003", "김천시"),
    GYEONGBUK_ANDONG("003002014004", "안동시"),
    GYEONGBUK_GUMI("003002014005", "구미시"),
    GYEONGBUK_YEONGJU("003002014006", "영주시"),
    GYEONGBUK_YEONGCHUN("003002014007", "영천시"),
    GYEONGBUK_SANGJU("003002014008", "상주시"),
    GYEONGBUK_MUNGYEONG("003002014009", "문경시"),
    GYEONGBUK_GYEONGSAN("003002014010", "경산시"),
    GYEONGBUK_UISEONG("003002014012", "의성군"),
    GYEONGBUK_CHEONGSONG("003002014013", "청송군"),
    GYEONGBUK_YEONGYANG("003002014014", "영양군"),
    GYEONGBUK_YEONGDEOK("003002014015", "영덕군"),
    GYEONGBUK_CHEONGDO("003002014016", "청도군"),
    GYEONGBUK_GORYEONG("003002014017", "고령군"),
    GYEONGBUK_SEONGJU("003002014018", "성주군"),
    GYEONGBUK_CHILGOK("003002014019", "칠곡군"),
    GYEONGBUK_YECHEON("003002014020", "예천군"),
    GYEONGBUK_BONGHWA("003002014021", "봉화군"),
    GYEONGBUK_ULJIN("003002014022", "울진군"),
    GYEONGBUK_ULLEUNG("003002014023", "울릉군"),

    // 15. 경남
    GYEONGNAM_CHANGWON("003002015001", "창원시"),
    GYEONGNAM_JINJU("003002015003", "진주시"),
    GYEONGNAM_TONGYEONG("003002015005", "통영시"),
    GYEONGNAM_SACHEON("003002015006", "사천시"),
    GYEONGNAM_GIMHAE("003002015007", "김해시"),
    GYEONGNAM_MIRYANG("003002015008", "밀양시"),
    GYEONGNAM_GEOJE("003002015009", "거제시"),
    GYEONGNAM_YANGSAN("003002015010", "양산시"),
    GYEONGNAM_YEORYEONG("003002015011", "의령군"),
    GYEONGNAM_HAMAN("003002015012", "함안군"),
    GYEONGNAM_CHANGNYEONG("003002015013", "창녕군"),
    GYEONGNAM_GOSEONG("003002015014", "고성군"),
    GYEONGNAM_NAMHAE("003002015015", "남해군"),
    GYEONGNAM_HADONG("003002015016", "하동군"),
    GYEONGNAM_SANSCHEONG("003002015017", "산청군"),
    GYEONGNAM_HAMYANG("003002015018", "함양군"),
    GYEONGNAM_GEOCHANG("003002015019", "거창군"),
    GYEONGNAM_HAPCHEON("003002015020", "합천군"),

    // 16. 제주
    JEJU_JEJU("003002016001", "제주시"),
    JEJU_SEOGWIPO("003002016002", "서귀포시"),

    // 17. 세종
    SEJONG_SEONG("003002017001", "세종시");
    private final String code;
    private final String name;

    CityCode(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static CityCode findCityCode(String code) {
        return Arrays.stream(CityCode.values())
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElseGet(null);
    }

    public static String findName(String cityCode) {
        return Arrays.stream(CityCode.values())
                .filter(code -> code.name().equals(cityCode))
                .findFirst()
                .map(code -> code.getName())
                .orElse(null);
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static CityCode findCityCodeByName(String name) {
        return Arrays.stream(CityCode.values())
                .filter(code -> code.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new BusinessException(ErrorCode.NOT_FOUND_CITY_ENUM_VALUE));
    }
}
