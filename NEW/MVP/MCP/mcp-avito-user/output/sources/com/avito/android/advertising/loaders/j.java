package com.avito.android.advertising.loaders;

import com.avito.android.advertising.analytics.events.BannerEvent;
import kotlin.Metadata;

/* compiled from: CommercialBannersAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/j;", "Lcom/avito/android/advertising/adapter/items/buzzoola/premium/q;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface j extends com.avito.android.advertising.adapter.items.buzzoola.premium.q {

    /* compiled from: CommercialBannersAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(j jVar, BannerInfo bannerInfo, Integer num, boolean z12, Throwable th2, String str, int i12) {
            BannerEvent.Type type = BannerEvent.Type.f87774c;
            Throwable th3 = (i12 & 8) != 0 ? null : th2;
            String str2 = (i12 & 16) != 0 ? null : str;
            if ((i12 & 64) != 0) {
                type = BannerEvent.Type.f87773b;
            }
            jVar.o6(bannerInfo, num, z12, th3, str2, null, type);
        }

        public static /* synthetic */ void b(j jVar, BannerInfo bannerInfo, int i12) {
            BannerEvent.Type type = BannerEvent.Type.f87773b;
            jVar.u3(bannerInfo, i12);
        }

        public static /* synthetic */ void c(j jVar, BannerInfo bannerInfo, int i12, String str, int i13) {
            if ((i13 & 4) != 0) {
                str = null;
            }
            jVar.X3(bannerInfo, i12, str, BannerEvent.Type.f87773b);
        }
    }

    void K0(@Y61.k BannerInfo bannerInfo, @Y61.l Integer num, @Y61.k BannerEvent.Type type);

    void M4(@Y61.k String str, @Y61.k BannerInfo bannerInfo);

    void M6(@Y61.k BannerInfo bannerInfo, int i12, @Y61.k BannerEvent.Type type);

    void N3(@Y61.k String str, @Y61.k BannerInfo bannerInfo);

    void P3(@Y61.k String str, @Y61.k BannerInfo bannerInfo, int i12);

    void T6(@Y61.k String str, @Y61.k BannerInfo bannerInfo);

    void V4(@Y61.k String str, @Y61.k BannerInfo bannerInfo);

    void X3(@Y61.k BannerInfo bannerInfo, int i12, @Y61.l String str, @Y61.k BannerEvent.Type type);

    void d5(@Y61.k String str, @Y61.k BannerInfo bannerInfo);

    void g5(@Y61.k String str, @Y61.k BannerInfo bannerInfo);

    void j6(@Y61.k String str, @Y61.k BannerInfo bannerInfo);

    void k4(@Y61.k String str, @Y61.k BannerInfo bannerInfo);

    void m4(@Y61.k BannerInfo bannerInfo, @Y61.l com.avito.android.advertising.b bVar, @Y61.l Integer num, @Y61.k BannerEvent.Type type);

    void n5(@Y61.k BannerInfo bannerInfo, @Y61.l Integer num, @Y61.l String str);

    void o0(int i12, @Y61.k BannerInfo bannerInfo, @Y61.k String str, @Y61.k String str2, @Y61.l String str3);

    void o6(@Y61.k BannerInfo bannerInfo, @Y61.l Integer num, boolean z12, @Y61.l Throwable th2, @Y61.l String str, @Y61.l Integer num2, @Y61.k BannerEvent.Type type);

    void r3(@Y61.k BannerInfo bannerInfo, int i12, @Y61.k BannerEvent.Type type);

    void u3(@Y61.k BannerInfo bannerInfo, int i12);

    void z0(@Y61.k BannerInfo bannerInfo, @Y61.l Integer num, @Y61.k BannerEvent.Type type);
}
