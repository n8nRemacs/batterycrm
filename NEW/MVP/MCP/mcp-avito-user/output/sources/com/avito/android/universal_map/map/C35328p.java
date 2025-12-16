package com.avito.android.universal_map.map;

import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.universal_map.map.AbstractC35317e;
import com.avito.android.universal_map.map.UniversalMapFragment;
import kotlin.G0;
import kotlin.Metadata;
import qG0.C47293d;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/universal_map/map/e;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.universal_map.map.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35328p extends kotlin.jvm.internal.N implements Y41.l<AbstractC35317e, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f305698l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35328p(UniversalMapFragment universalMapFragment) {
        super(1);
        this.f305698l = universalMapFragment;
    }

    @Override // Y41.l
    public final G0 invoke(AbstractC35317e abstractC35317e) {
        AbstractC35317e abstractC35317e2 = abstractC35317e;
        boolean z12 = abstractC35317e2 instanceof AbstractC35317e.b;
        UniversalMapFragment universalMapFragment = this.f305698l;
        if (z12) {
            C47293d c47293d = ((AbstractC35317e.b) abstractC35317e2).f305171a;
            Button button = universalMapFragment.f304854P0;
            if (button != null) {
                if (button != null) {
                    button.removeCallbacks(universalMapFragment.f304857S0);
                    com.avito.android.lib.design.tooltip.k kVar = universalMapFragment.f304855Q0;
                    if (kVar != null) {
                        kVar.dismiss();
                    }
                    universalMapFragment.f304855Q0 = null;
                }
                com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(button.getContext(), 0, 0, 6, null);
                kVar2.f181224j = new r.b(null, 1, null);
                com.avito.android.lib.design.tooltip.p.a(kVar2, new G(c47293d));
                universalMapFragment.f304855Q0 = kVar2;
                button.postDelayed(universalMapFragment.f304857S0, c47293d.f429149c);
            }
        } else if (abstractC35317e2 instanceof AbstractC35317e.a) {
            UniversalMapFragment.a aVar = UniversalMapFragment.f304838X0;
            Button button2 = universalMapFragment.f304854P0;
            if (button2 != null) {
                button2.removeCallbacks(universalMapFragment.f304857S0);
                com.avito.android.lib.design.tooltip.k kVar3 = universalMapFragment.f304855Q0;
                if (kVar3 != null) {
                    kVar3.dismiss();
                }
                universalMapFragment.f304855Q0 = null;
            }
        }
        return G0.f406611a;
    }
}
