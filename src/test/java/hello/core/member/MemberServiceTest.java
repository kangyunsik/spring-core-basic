package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //GIVEN
        Member member = new Member(1L,"memberA",Grade.VIP);

        //WHEN
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //THEN
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}