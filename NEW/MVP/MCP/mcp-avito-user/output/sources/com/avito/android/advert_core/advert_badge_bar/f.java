package com.avito.android.advert_core.advert_badge_bar;

import com.avito.android.advert_core.advert_badge_bar.e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.advert_badge_bar.BadgeBarOrientation;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertBadgeBarPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert_badge_bar/f;", "Lcom/avito/android/advert_core/advert_badge_bar/e;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f82722b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Object f82723c;

    /* compiled from: AdvertBadgeBarPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82724a;

        static {
            int[] iArr = new int[BadgeBarOrientation.values().length];
            try {
                iArr[BadgeBarOrientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeBarOrientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f82724a = iArr;
        }
    }

    @Inject
    public f(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f82722b = interfaceC28373a;
    }

    @Override // com.avito.android.advert_core.advert_badge_bar.e
    public final void M2(@Y61.k e.a aVar) {
        this.f82723c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        AdvertBadgeBarItem advertBadgeBarItem = (AdvertBadgeBarItem) aVar;
        cVar.s00(advertBadgeBarItem.f82711g, advertBadgeBarItem.f82712h, advertBadgeBarItem.f82709e);
        cVar.s2(advertBadgeBarItem.f82713i);
        int i13 = a.f82724a[advertBadgeBarItem.f82710f.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            i14 = 0;
        } else if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        cVar.Rv(i14);
        cVar.iG(new g(advertBadgeBarItem, this));
        cVar.hk(new h(advertBadgeBarItem, this));
    }

    @Override // com.avito.android.advert_core.advert_badge_bar.e
    public final void c0() {
        this.f82723c = null;
    }
}
