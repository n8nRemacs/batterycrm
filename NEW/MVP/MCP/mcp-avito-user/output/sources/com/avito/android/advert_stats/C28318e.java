package com.avito.android.advert_stats;

import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.advert_stats.AdvertStatsFragment;
import com.avito.android.remote.model.Action;
import com.avito.android.util.architecture_components.C35748b;
import com.avito.android.util.architecture_components.C35751e;
import com.avito.android.util.architecture_components.C35752f;
import ib.C41375b;
import ib.C41376c;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.advert_stats.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C28318e implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdvertStatsFragment f86667c;

    public /* synthetic */ C28318e(AdvertStatsFragment advertStatsFragment, int i12) {
        this.f86666b = i12;
        this.f86667c = advertStatsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(Object obj) {
        AdvertStatsFragment advertStatsFragment = this.f86667c;
        switch (this.f86666b) {
            case 0:
                Action action = (Action) obj;
                if (action != null) {
                    RecyclerView recyclerView = advertStatsFragment.f86003v0;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    C41375b c41375b = advertStatsFragment.f86004w0;
                    recyclerView.r0(c41375b != null ? c41375b : null);
                    ((InterfaceC28296a) advertStatsFragment.requireActivity()).b0(action, new C28321h(advertStatsFragment, action));
                    break;
                } else {
                    AdvertStatsFragment.a aVar = AdvertStatsFragment.f85994z0;
                    break;
                }
            case 1:
                C41376c c41376c = (C41376c) obj;
                if (c41376c != null) {
                    com.avito.konveyor.adapter.a aVar2 = advertStatsFragment.f85999r0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    aVar2.c(new UV0.c(c41376c.f398574a));
                    RecyclerView recyclerView2 = advertStatsFragment.f86003v0;
                    if (recyclerView2 == null) {
                        recyclerView2 = null;
                    }
                    RecyclerView.Adapter adapter = recyclerView2.getAdapter();
                    if (adapter != null) {
                        c41376c.f398575b.b(adapter);
                        break;
                    } else {
                        com.avito.konveyor.adapter.a aVar3 = advertStatsFragment.f85999r0;
                        if (aVar3 == null) {
                            aVar3 = null;
                        }
                        com.avito.konveyor.a aVar4 = advertStatsFragment.f85998q0;
                        if (aVar4 == null) {
                            aVar4 = null;
                        }
                        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar3, aVar4);
                        RecyclerView recyclerView3 = advertStatsFragment.f86003v0;
                        (recyclerView3 != null ? recyclerView3 : null).setAdapter(jVar);
                        break;
                    }
                } else {
                    AdvertStatsFragment.a aVar5 = AdvertStatsFragment.f85994z0;
                    break;
                }
            case 2:
                Boolean bool = (Boolean) obj;
                AdvertStatsFragment.a aVar6 = AdvertStatsFragment.f85994z0;
                if (bool != null) {
                    ((H) advertStatsFragment.requireActivity()).E0(bool.booleanValue());
                    break;
                }
                break;
            default:
                AdvertStatsFragment.a aVar7 = AdvertStatsFragment.f85994z0;
                Object objA = ((C35748b) obj).a();
                if (objA != null) {
                    if (!(objA instanceof C35751e)) {
                        if (objA instanceof C35752f) {
                            advertStatsFragment.startActivityForResult(null, 0);
                            break;
                        }
                    } else {
                        advertStatsFragment.requireActivity().finish();
                        advertStatsFragment.startActivity(((C35751e) objA).f318812a);
                        break;
                    }
                }
                break;
        }
    }
}
