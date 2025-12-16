package com.avito.android.remote;

import com.avito.android.remote.model.PhoneResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;

/* compiled from: AsyncPhoneApi.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001JI\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u000b\u0010\fJy\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/a;", "", "", "itemId", "context", "jobDisclaimerPDViewed", "", "needConfirm", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/PhoneResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/z;", "inAppCallScenario", "networkType", "micAccess", "forceGsm", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/z;", "_avito-discouraged_avito-api_async-phone"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: com.avito.android.remote.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC34241a {

    /* compiled from: AsyncPhoneApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.a$a, reason: collision with other inner class name */
    public static final class C7606a {
    }

    @J81.f("1/items/{itemId}/phone")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<PhoneResponse>> a(@J81.s("itemId") @Y61.k String itemId, @Y61.l @J81.t("context") String context, @Y61.l @J81.t("jobDisclaimerPDViewed") String jobDisclaimerPDViewed, @Y61.l @J81.t("needConfirm") Boolean needConfirm);

    @J81.f("2/items/{itemId}/phone")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<PhoneResponse>> b(@J81.s("itemId") @Y61.k String itemId, @Y61.l @J81.t("context") String context, @Y61.l @J81.t("jobDisclaimerPDViewed") String jobDisclaimerPDViewed, @Y61.l @J81.t("scenario") String inAppCallScenario, @Y61.l @J81.t("networkType") String networkType, @Y61.l @J81.t("micAccess") Boolean micAccess, @Y61.l @J81.t("needConfirm") Boolean needConfirm, @Y61.l @J81.t("forceGsm") Boolean forceGsm);
}
