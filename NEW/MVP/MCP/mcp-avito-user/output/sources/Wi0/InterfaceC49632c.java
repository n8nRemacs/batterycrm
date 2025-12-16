package wi0;

import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.ConfirmCodeResponse;
import com.avito.android.remote.ConfirmPhoneResponse;
import com.avito.android.remote.ContactInfo;
import com.avito.android.remote.SaveResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RecallMeApiV2.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJN\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lwi0/c;", "", "", "itemId", "buyerNeeds", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/ContactInfo;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buyerName", "buyerPhone", "channel", "Lcom/avito/android/remote/SaveResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phone", "Lcom/avito/android/remote/ConfirmCodeResponse;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "Lcom/avito/android/remote/ConfirmPhoneResponse;", "c", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: wi0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49632c {

    /* compiled from: RecallMeApiV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wi0.c$a */
    public static final class a {
    }

    @J81.f("1/recallme-requests/get-contact-info")
    @l
    Object a(@t("itemID") @k String str, @l @t("buyerNeeds") String str2, @k Continuation<? super TypedResult<ContactInfo>> continuation);

    @o("1/recallme-requests/save-recallme-request")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @l
    Object b(@J81.c("itemID") @k String str, @J81.c("buyerName") @l String str2, @J81.c("buyerPhone") @k String str3, @J81.c("buyerNeeds") @l String str4, @J81.c("channel") @l String str5, @k Continuation<? super TypedResult<SaveResponse>> continuation);

    @o("1/recallme-requests/confirm-phone")
    @J81.e
    @l
    Object c(@J81.c("phone") @k String str, @J81.c("code") @k String str2, @k Continuation<? super TypedResult<ConfirmPhoneResponse>> continuation);

    @o("1/recallme-requests/confirm-code")
    @J81.e
    @l
    Object d(@J81.c("phone") @k String str, @k Continuation<? super TypedResult<ConfirmCodeResponse>> continuation);
}
