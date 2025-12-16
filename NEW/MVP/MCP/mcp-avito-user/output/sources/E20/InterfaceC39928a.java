package e20;

import J81.f;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.mortgage_invite.generated.api.api_2_mortgage_form_participant_create_post.CreateParticipantInV2;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import f20.C40220a;
import g20.C40520a;
import g20.C40521b;
import h20.C40763a;
import j20.C42181a;
import k20.C42477a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: MortgageInviteApi.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J:\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H§@¢\u0006\u0004\b\u0015\u0010\u0013J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\b\b\u0001\u0010\r\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Le20/a;", "", "", "query", "", "limit", "offset", "Lcom/avito/android/remote/model/TypedResult;", "Lf20/a;", "c", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicationId", "Lg20/b;", "request", "Lg20/a;", "d", "(Ljava/lang/String;Lg20/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Li20/b;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj20/a;", "a", "Lh20/a;", "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/mortgage_invite/generated/api/api_2_mortgage_form_participant_create_post/CreateParticipantInV2;", "Lk20/a;", "f", "(Lcom/avito/android/mortgage_invite/generated/api/api_2_mortgage_form_participant_create_post/CreateParticipantInV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: e20.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC39928a {
    @f("1/mortgage-professional/application/participants-form/get")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@k Continuation<? super TypedResult<C42181a>> continuation);

    @f("1/mortgage-professional/application/invite-form/get")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@k Continuation<? super TypedResult<i20.b>> continuation);

    @f("1/client/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@l @t("query") String str, @l @t("limit") Long l12, @l @t("offset") Long l13, @k Continuation<? super TypedResult<C40220a>> continuation);

    @o("1/mortgage-form/application/{applicationId}/contact-info/update")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object d(@s("applicationId") @k String str, @J81.a @k C40521b c40521b, @k Continuation<? super TypedResult<C40520a>> continuation);

    @f("1/mortgage-professional/application/{applicationId}/client/form/get")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@s("applicationId") @k String str, @k Continuation<? super TypedResult<C40763a>> continuation);

    @o("2/mortgage-form/participant/create")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object f(@J81.a @k CreateParticipantInV2 createParticipantInV2, @k Continuation<? super TypedResult<C42477a>> continuation);
}
