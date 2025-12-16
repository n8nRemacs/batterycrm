package com.avito.android.remote;

import com.avito.android.remote.model.AdvertsHistory;
import com.avito.android.remote.model.LimitsInfo;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: PublishLimitsApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\fJ8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/K0;", "", "", "context", "itemId", "src", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/LimitsInfo;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/AdvertsHistory;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_publish-limits-info"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface K0 {

    /* compiled from: PublishLimitsApi.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/K0$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_publish-limits-info"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: PublishLimitsApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    @J81.f("1/item/limits/history")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<AdvertsHistory>> a(@J81.t("itemId") @Y61.k String itemId, @J81.t("src") @Y61.k String src);

    @J81.f("1/item/limits/getLimits")
    @Y61.l
    Object b(@Y61.l @J81.t("paymentContext") String str, @Y61.l @J81.t("itemId") String str2, @J81.t("src") @Y61.k String str3, @Y61.k Continuation<? super TypedResult<LimitsInfo>> continuation);
}
