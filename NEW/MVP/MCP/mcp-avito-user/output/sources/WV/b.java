package Wv;

import Ov.n;
import Sv.h;
import Uv.InterfaceC15572a;
import Y61.k;
import com.avito.android.R;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext.c;
import com.avito.android.delivery_tarifikator.presentation.region_screen.RegionScreenParams;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RegionScreenItemsMapper.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWv/b;", "LWv/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h
/* loaded from: classes12.dex */
public final class b implements InterfaceC15801a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RegionScreenParams f18081a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC15572a f18082b;

    @Inject
    public b(@k RegionScreenParams regionScreenParams, @k InterfaceC15572a interfaceC15572a) {
        this.f18081a = regionScreenParams;
        this.f18082b = interfaceC15572a;
    }

    @Override // Wv.InterfaceC15801a
    @k
    public final ArrayList a(@k List list, boolean z12) {
        List<TV0.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (TV0.a aVarA : list2) {
            com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d dVar = aVarA instanceof com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d ? (com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d) aVarA : null;
            if (dVar != null) {
                aVarA = com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d.a(dVar, z12);
            }
            arrayList.add(aVarA);
        }
        return arrayList;
    }

    @Override // Wv.InterfaceC15801a
    @k
    public final kotlin.collections.builders.b b(@k n nVar) {
        kotlin.collections.builders.b bVarT = C42745f0.t();
        String str = this.f18081a.f135742b;
        InterfaceC15572a interfaceC15572a = this.f18082b;
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d dVarB = interfaceC15572a.b(str, nVar);
        if (dVarB != null) {
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace.c(10, null, 2, null));
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext.d("RegionTitle", new c.b(com.avito.android.printable_text.a.a(R.string.region_master_setting_title))));
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace.c(4, null, 2, null));
            bVarT.add(dVarB);
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace.c(4, null, 2, null));
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext.d("LocationSettingsTitle", new c.b(com.avito.android.printable_text.a.a(R.string.region_settings_title))));
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace.c(8, null, 2, null));
            bVarT.addAll(interfaceC15572a.a(dVarB.f135417j, nVar));
            bVarT.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace.c(8, null, 2, null));
        }
        return C42745f0.p(bVarT);
    }
}
