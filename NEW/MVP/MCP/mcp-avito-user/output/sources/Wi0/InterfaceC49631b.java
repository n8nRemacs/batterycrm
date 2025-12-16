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
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: RecallMeApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJS\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lwi0/b;", "", "", "itemId", "buyerNeeds", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/ContactInfo;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "buyerName", "buyerPhone", "channel", "Lcom/avito/android/remote/SaveResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "phone", "Lcom/avito/android/remote/ConfirmCodeResponse;", "d", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "code", "Lcom/avito/android/remote/ConfirmPhoneResponse;", "c", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: wi0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49631b {
    @J81.f("1/recallme-requests/get-contact-info")
    @k
    I<TypedResult<ContactInfo>> a(@t("itemID") @k String itemId, @l @t("buyerNeeds") String buyerNeeds);

    @o("1/recallme-requests/save-recallme-request")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @k
    I<TypedResult<SaveResponse>> b(@J81.c("itemID") @k String itemId, @J81.c("buyerName") @l String buyerName, @J81.c("buyerPhone") @k String buyerPhone, @J81.c("buyerNeeds") @l String buyerNeeds, @J81.c("channel") @l String channel);

    @o("1/recallme-requests/confirm-phone")
    @J81.e
    @k
    I<TypedResult<ConfirmPhoneResponse>> c(@J81.c("phone") @k String phone, @J81.c("code") @k String code);

    @o("1/recallme-requests/confirm-code")
    @J81.e
    @k
    I<TypedResult<ConfirmCodeResponse>> d(@J81.c("phone") @k String phone);
}
