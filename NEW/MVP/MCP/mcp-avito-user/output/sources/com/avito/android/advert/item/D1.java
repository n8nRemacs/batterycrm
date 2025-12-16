package com.avito.android.advert.item;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert.item.beduin.v2.g;
import com.avito.android.util.V2;
import com.avito.beduin.v2.render.android_view.BeduinView;
import com.avito.beduin.v2.render.android_view.diff.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.C42498b;
import k4.C42501e;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk4/b;", "it", "Lkotlin/G0;", "invoke", "(Lk4/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class D1 extends kotlin.jvm.internal.N implements Y41.l<C42498b, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I1 f71611l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C42498b f71612m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(I1 i12, C42498b c42498b) {
        super(1);
        this.f71611l = i12;
        this.f71612m = c42498b;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C42498b c42498b) {
        RecyclerView recyclerViewB;
        BeduinView beduinView;
        RecyclerView recyclerViewB2;
        g.a aVar;
        I1 i12 = this.f71611l;
        i12.getClass();
        C42498b c42498b2 = this.f71612m;
        AbstractC40048c abstractC40048c = c42498b2.f406059b;
        if (abstractC40048c instanceof AbstractC40048c.d) {
            i12.f71713h1 = false;
            i12.f71710g1 = false;
        } else {
            boolean z12 = abstractC40048c instanceof AbstractC40048c.a;
            com.avito.android.advert_core.analytics.a aVar2 = i12.f71706f0;
            if (z12) {
                if (!i12.f71710g1) {
                    i12.f71710g1 = true;
                    aVar2.f1();
                }
                BeduinView beduinView2 = i12.f71648E0;
                if (beduinView2 != null) {
                    beduinView2.b(((AbstractC40048c.a) abstractC40048c).getF395211c());
                }
                BeduinView beduinView3 = i12.f71648E0;
                if (beduinView3 != null && (recyclerViewB = Z1.b(beduinView3)) != null) {
                    Parcelable parcelable = i12.f71692a1;
                    if (parcelable != null) {
                        RecyclerView.m layoutManager = recyclerViewB.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.X0(parcelable);
                        }
                        i12.f71692a1 = null;
                    }
                    if (!i12.f71713h1 && !i12.f71716i1) {
                        i12.f71713h1 = true;
                        RecyclerView recyclerView = i12.f71664M0;
                        C28217v1 c28217v1 = i12.f71707f1;
                        if (recyclerView != null) {
                            recyclerView.v0(c28217v1);
                        }
                        com.avito.android.advert.item.beduin.v2.a aVar3 = i12.f71666N0;
                        if (aVar3 != null) {
                            recyclerViewB.r0(aVar3);
                            i12.f71666N0 = null;
                        }
                        com.avito.android.advert.item.beduin.v2.a aVar4 = new com.avito.android.advert.item.beduin.v2.a(i12.f71657J.a(), i12.f71693b.getResources(), i12.f71655I);
                        recyclerViewB.l(aVar4, -1);
                        i12.f71661L.b(recyclerViewB);
                        recyclerViewB.o(c28217v1);
                        i12.f71664M0 = recyclerViewB;
                        i12.f71666N0 = aVar4;
                    }
                }
            } else if (abstractC40048c instanceof AbstractC40048c.b) {
                if (!i12.f71710g1) {
                    i12.f71710g1 = true;
                    String message = ((AbstractC40048c.b) abstractC40048c).f395216b.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    aVar2.L6("parsing", message);
                }
                V2.f318762a.f(((AbstractC40048c.b) abstractC40048c).f395216b);
            } else {
                boolean z13 = abstractC40048c instanceof AbstractC40048c.C11084c;
            }
        }
        C42501e c42501e = c42498b2.f406058a;
        List<C42501e.a> list = c42501e.f406080a;
        if (i12.f71668O0 != list) {
            i12.f71668O0 = list;
            for (C42501e.a aVar5 : list) {
                com.avito.android.advert.item.beduin.v2.i iVar = i12.f71650F0;
                if (iVar != null) {
                    String str = aVar5.f406083a;
                    Iterator it = iVar.f73358e.iterator();
                    while (it.hasNext()) {
                        com.avito.android.advert.item.beduin.v2.g gVar = (com.avito.android.advert.item.beduin.v2.g) it.next();
                        if (kotlin.jvm.internal.L.f(gVar.f73347o, str) && (aVar = gVar.f73348p) != null) {
                            e.b bVar = com.avito.beduin.v2.render.android_view.diff.e.f337969a;
                            List<com.avito.conveyor_item.a> list2 = aVar5.f406084b;
                            com.avito.beduin.v2.render.android_view.diff.h.a(e.b.a(bVar, new com.avito.android.advert.item.beduin.v2.e(aVar, list2)), new com.avito.android.advert.item.beduin.v2.f(aVar, list2));
                        }
                    }
                }
            }
        }
        if (i12.f71716i1 && (beduinView = i12.f71648E0) != null && (recyclerViewB2 = Z1.b(beduinView)) != null) {
            RecyclerView.Adapter adapter = recyclerViewB2.getAdapter();
            recyclerViewB2.F0(adapter != null ? adapter.getItemCount() : 0);
            List<C42501e.a> list3 = c42501e.f406080a;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                C42745f0.h(((C42501e.a) it2.next()).f406084b, arrayList);
            }
            i12.f71724l0.a(arrayList);
        }
        return kotlin.G0.f406611a;
    }
}
