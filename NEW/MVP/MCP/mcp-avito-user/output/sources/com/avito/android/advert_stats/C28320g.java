package com.avito.android.advert_stats;

import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertStatsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert_stats.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28320g extends N implements Y41.l<P2<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertStatsFragment f86669l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28320g(AdvertStatsFragment advertStatsFragment) {
        super(1);
        this.f86669l = advertStatsFragment;
    }

    @Override // Y41.l
    public final G0 invoke(P2<?> p22) {
        P2<?> p23 = p22;
        boolean z12 = p23 instanceof P2.c;
        AdvertStatsFragment advertStatsFragment = this.f86669l;
        if (z12) {
            com.avito.android.progress_overlay.l lVar = advertStatsFragment.f86002u0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
        } else if (p23 instanceof P2.b) {
            com.avito.android.progress_overlay.l lVar2 = advertStatsFragment.f86002u0;
            (lVar2 != null ? lVar2 : null).j();
        } else if (p23 instanceof P2.a) {
            com.avito.android.progress_overlay.l lVar3 = advertStatsFragment.f86002u0;
            (lVar3 != null ? lVar3 : null).a("");
        }
        return G0.f406611a;
    }
}
