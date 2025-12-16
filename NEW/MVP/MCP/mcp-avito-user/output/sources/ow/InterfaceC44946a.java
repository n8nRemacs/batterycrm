package ow;

import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import qw.AbstractC47454a;

/* compiled from: DevelopmentsAdviceApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJÙ\u0001\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u001a2\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001e\u0010\u001fJÔ\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u00052\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Low/a;", "", "", "superForm", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/developments_advice/remote/model/ContactInfoResponse;", "d", "(Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/z;", "", "phone", "name", "question", ContextActionHandler.Link.URL, "advertId", "developmentId", "developerId", "offerId", "requestType", "fromPage", "marketingParams", "asSoonAsPossible", "callbackTimeFrom", "callbackTimeTo", "formTitle", "formSubtitle", "Lio/reactivex/rxjava3/core/I;", "Lqw/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "c", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-network_developments-advice"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: ow.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44946a {

    /* compiled from: DevelopmentsAdviceApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ow.a$a, reason: collision with other inner class name */
    public static final class C12247a {
    }

    @o("1/developments-advice/getAdvice")
    @e
    @InterfaceC42830m
    @k
    I<TypedResult<AbstractC47454a>> a(@J81.c("phone") @k String phone, @J81.c("name") @l String name, @J81.c("questionText") @l String question, @J81.c(ContextActionHandler.Link.URL) @l String url, @J81.c("itemId") @l String advertId, @J81.c("developmentId") @l String developmentId, @J81.c("developerId") @l String developerId, @J81.c("specialOffer") @l String offerId, @J81.c("requestType") @l String requestType, @J81.c("fromPage") @l String fromPage, @J81.c("marketingParams") @l String marketingParams, @J81.c("asSoonAsPossible") @l Boolean asSoonAsPossible, @J81.c("callbackTimeFrom") @l String callbackTimeFrom, @J81.c("callbackTimeTo") @l String callbackTimeTo, @J81.c("formTitle") @l String formTitle, @J81.c("formSubtitle") @l String formSubtitle);

    @o("1/developments-advice/getAdvice")
    @e
    @l
    Object b(@J81.c("phone") @k String str, @J81.c("name") @l String str2, @J81.c("questionText") @l String str3, @J81.c(ContextActionHandler.Link.URL) @l String str4, @J81.c("itemId") @l String str5, @J81.c("developmentId") @l String str6, @J81.c("developerId") @l String str7, @J81.c("specialOffer") @l String str8, @J81.c("requestType") @l String str9, @J81.c("fromPage") @l String str10, @J81.c("marketingParams") @l String str11, @J81.c("asSoonAsPossible") @l Boolean bool, @J81.c("callbackTimeFrom") @l String str12, @J81.c("callbackTimeTo") @l String str13, @J81.c("formTitle") @l String str14, @J81.c("formSubtitle") @l String str15, @k Continuation<? super TypedResult<AbstractC47454a>> continuation);

    @o("1/developments-advice/getContactInfo")
    @e
    @l
    Object c(@J81.c("isSuperForm") @l Boolean bool, @k Continuation<? super TypedResult<ContactInfoResponse>> continuation);

    @o("1/developments-advice/getContactInfo")
    @e
    @InterfaceC42830m
    @k
    z<TypedResult<ContactInfoResponse>> d(@J81.c("isSuperForm") @l Boolean superForm);
}
