package com.avito.android.advert.item.creditinfo.buzzoola;

import com.avito.android.advert.item.creditinfo.buzzoola.a;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.CreditInfo;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: BuzzoolaCreditBannerLoader.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/CreditInfo;", "result", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/advert/item/creditinfo/buzzoola/a;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f74948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f74949c;

    public h(i iVar, AdvertDetails advertDetails) {
        this.f74948b = iVar;
        this.f74949c = advertDetails;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            return z.c0(a.C2226a.f74922b);
        }
        final CreditInfo creditInfo = (CreditInfo) ((TypedResult.Success) typedResult).getResult();
        final i iVar = this.f74948b;
        iVar.f74955f.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final BuzzoolaNetworkBannerItem creditInfoItem = creditInfo.getCreditInfoItem();
        if (creditInfoItem == null) {
            return z.c0(a.C2226a.f74922b);
        }
        final String string = UUID.randomUUID().toString();
        BannerInfo.a aVar = BannerInfo.f87863F;
        boolean samplingEnabled = creditInfo.getSamplingEnabled();
        final AdvertDetails advertDetails = this.f74949c;
        String id2 = advertDetails.getId();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Map<String, Object> analyticParams = creditInfo.getAnalyticParams();
        aVar.getClass();
        final BannerInfo bannerInfoC = BannerInfo.a.c(aVar, string, creditInfoItem, jCurrentTimeMillis, null, 0, samplingEnabled, 0L, false, false, jCurrentTimeMillis2, id2, analyticParams, null, null, null, 20928);
        iVar.f74953d.i4(bannerInfoC);
        return new C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.advert.item.creditinfo.buzzoola.e
            @Override // io.reactivex.rxjava3.core.C
            public final void f(B b12) {
                i iVar2 = iVar;
                C41982q1 c41982q1X0 = iVar2.f74952c.a(creditInfoItem).x0(iVar2.f74950a.a());
                String str = string;
                CreditInfo creditInfo2 = creditInfo;
                long j12 = jCurrentTimeMillis;
                AdvertDetails advertDetails2 = advertDetails;
                c41982q1X0.u0(new f(iVar2, b12, str, j12, creditInfo2, advertDetails2), new g(iVar2, bannerInfoC, advertDetails2, b12));
            }
        });
    }
}
