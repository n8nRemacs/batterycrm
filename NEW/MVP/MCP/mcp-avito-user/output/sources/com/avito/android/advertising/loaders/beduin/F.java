package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.loaders.beduin.H;
import com.avito.android.remote.model.SerpDisplayType;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import kotlin.Metadata;

/* compiled from: CommercialLoadedAdHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/F;", "Lio/reactivex/rxjava3/core/F;", "Lcom/avito/android/advertising/CommercialBanner;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class F implements io.reactivex.rxjava3.core.F<CommercialBanner, CommercialBanner> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f88069b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f88070c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final H f88071d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SerpDisplayType f88072e;

    /* compiled from: CommercialLoadedAdHolder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/reactivex/rxjava3/core/y;", "Lcom/avito/android/advertising/CommercialBanner;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/core/y;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable thB;
            CommercialBanner commercialBanner;
            io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) obj;
            boolean zE2 = yVar.e();
            F f12 = F.this;
            if (zE2 && (commercialBanner = (CommercialBanner) yVar.c()) != null && commercialBanner.d()) {
                CommercialBanner commercialBanner2 = (CommercialBanner) yVar.c();
                if (commercialBanner2 != null) {
                    f12.f88071d.f(f12.f88069b, f12.f88070c, new H.c.C2608c(com.avito.android.advertising.g.a(commercialBanner2, 2, f12.f88072e)), false);
                    return;
                }
                return;
            }
            if (!NotificationLite.i(yVar.f401975a) || (thB = yVar.b()) == null) {
                return;
            }
            f12.f88071d.f(f12.f88069b, f12.f88070c, new H.c.b(thB), false);
        }
    }

    public F(@Y61.k String str, @Y61.k String str2, @Y61.l H h12, @Y61.k SerpDisplayType serpDisplayType) {
        this.f88069b = str;
        this.f88070c = str2;
        this.f88071d = h12;
        this.f88072e = serpDisplayType;
    }

    @Override // io.reactivex.rxjava3.core.F
    @Y61.k
    public final io.reactivex.rxjava3.core.E<CommercialBanner> a(@Y61.k io.reactivex.rxjava3.core.z<CommercialBanner> zVar) {
        return this.f88071d == null ? zVar : zVar.G(new a());
    }
}
