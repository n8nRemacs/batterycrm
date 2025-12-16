package com.avito.android.personal_banner.feature.mvi;

import Y60.b;
import Z60.c;
import com.avito.android.personal_banner.feature.domain.model.BannerContext;
import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: BannerReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/v;", "Lcom/avito/android/arch/mvi/u;", "LZ60/c;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState;", "<init>", "()V", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v implements com.avito.android.arch.mvi.u<Z60.c, BannerState> {
    @Inject
    public v() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final BannerState a(Z60.c cVar, BannerState bannerState) {
        BannerState bannerStateA;
        Z60.c cVar2 = cVar;
        BannerState bannerState2 = bannerState;
        if (cVar2 instanceof c.a) {
            ((c.a) cVar2).getClass();
            BannerState.BannerData bannerData = bannerState2.f215641e;
            BannerState.BannerData.Content content = bannerData instanceof BannerState.BannerData.Content ? (BannerState.BannerData.Content) bannerData : null;
            return !L.f(content != null ? content.f215643c : null, null) ? bannerState2 : BannerState.a(bannerState2, null, BannerState.BannerData.Empty.f215646b, 7);
        }
        if (cVar2 instanceof c.C1421c) {
            Y60.b bVar = ((c.C1421c) cVar2).f19922a;
            if (bVar instanceof b.a) {
                b.a aVar = (b.a) bVar;
                bannerStateA = BannerState.a(bannerState2, null, new BannerState.BannerData.Content(aVar.f19308a.getJson(), aVar.f19309b, bannerState2.f215639c), 7);
            } else if (bVar instanceof b.C1365b) {
                bannerStateA = BannerState.a(bannerState2, null, BannerState.BannerData.Empty.f215646b, 7);
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                b.c cVar3 = (b.c) bVar;
                bannerStateA = BannerState.a(bannerState2, null, new BannerState.BannerData.Error(cVar3.f19312a, cVar3.f19313b), 7);
            }
        } else {
            if (cVar2 instanceof c.d) {
                return BannerState.a(bannerState2, null, BannerState.BannerData.Loading.f215649b, 7);
            }
            if (!(cVar2 instanceof c.b)) {
                if (cVar2 instanceof c.e) {
                    return bannerState2;
                }
                throw new NoWhenBranchMatchedException();
            }
            BannerContext bannerContext = ((c.b) cVar2).f19921a;
            if (bannerContext instanceof BannerContext.Info) {
                bannerStateA = BannerState.a(bannerState2, bannerContext, null, 11);
            } else {
                if (!(bannerContext instanceof BannerContext.None)) {
                    throw new NoWhenBranchMatchedException();
                }
                bannerStateA = BannerState.a(bannerState2, bannerContext, BannerState.BannerData.Empty.f215646b, 3);
            }
        }
        return bannerStateA;
    }
}
