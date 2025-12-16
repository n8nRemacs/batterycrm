package com.avito.android.advertising.adapter.items.buzzoola.video;

import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.C;
import com.avito.android.advertising.ui.buzzoola.r;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialVideoAnalyticsListener.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/video/b;", "Lcom/avito/android/advertising/ui/buzzoola/r;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class b implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f87532a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BannerInfo f87533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C f87535d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f87536e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CommercialVideoState f87537f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.j f87538g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final g f87539h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f87540i;

    /* renamed from: j, reason: collision with root package name */
    public float f87541j = -1.0f;

    public b(@Y61.k String str, @Y61.k BannerInfo bannerInfo, int i12, @Y61.k C c12, @Y61.l String str2, @Y61.k CommercialVideoState commercialVideoState, @Y61.k com.avito.android.advertising.loaders.j jVar, @Y61.k g gVar, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar) {
        this.f87532a = str;
        this.f87533b = bannerInfo;
        this.f87534c = i12;
        this.f87535d = c12;
        this.f87536e = str2;
        this.f87537f = commercialVideoState;
        this.f87538g = jVar;
        this.f87539h = gVar;
        this.f87540i = cVar;
    }

    public final boolean a() {
        return !this.f87537f.f87523h;
    }

    public void b(long j12, float f12) {
        if (a()) {
            float f13 = this.f87541j;
            CommercialVideoState commercialVideoState = this.f87537f;
            if (f13 > 0.0f && f12 < f13 && commercialVideoState.f87522g) {
                d();
            } else if (f12 > 0.0f) {
                this.f87541j = f12;
            }
            C c12 = this.f87535d;
            com.avito.android.advertising.loaders.event_service.c cVar = this.f87540i;
            BannerInfo bannerInfo = this.f87533b;
            String str = this.f87532a;
            com.avito.android.advertising.loaders.j jVar = this.f87538g;
            if (f12 >= 0.25f && !commercialVideoState.f87520e) {
                jVar.k4(str, bannerInfo);
                cVar.g(c12);
                commercialVideoState.f87520e = true;
            }
            if (f12 >= 0.5f && !commercialVideoState.f87521f) {
                jVar.g5(str, bannerInfo);
                cVar.e(c12);
                commercialVideoState.f87521f = true;
            }
            if (f12 < 0.75f || commercialVideoState.f87522g) {
                return;
            }
            jVar.j6(str, bannerInfo);
            cVar.f(c12);
            commercialVideoState.f87522g = true;
        }
    }

    public void c(int i12) {
        BannerInfo bannerInfo = this.f87533b;
        g gVar = this.f87539h;
        if (i12 == 2) {
            if (a()) {
                gVar.e(bannerInfo.getF136232f());
            }
        } else if (i12 != 3) {
            if (i12 != 4) {
                return;
            }
            d();
        } else if (a()) {
            gVar.g(bannerInfo.getF136232f());
        }
    }

    public final void d() {
        if (a()) {
            com.avito.android.advertising.loaders.j jVar = this.f87538g;
            String str = this.f87532a;
            BannerInfo bannerInfo = this.f87533b;
            jVar.P3(str, bannerInfo, this.f87534c);
            this.f87540i.a(this.f87535d);
            this.f87539h.d(bannerInfo.getF136232f());
            this.f87537f.f87523h = true;
        }
    }
}
