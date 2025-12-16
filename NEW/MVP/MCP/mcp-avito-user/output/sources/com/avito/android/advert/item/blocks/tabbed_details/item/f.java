package com.avito.android.advert.item.blocks.tabbed_details.item;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.lib.design.tab_layout.c;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.konveyor.adapter.h;
import com.avito.konveyor.adapter.j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: TabbedDetailsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/blocks/tabbed_details/item/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/blocks/tabbed_details/item/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f74110g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final G4.a f74111b;

    /* renamed from: c, reason: collision with root package name */
    public final AvitoTabLayout f74112c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h f74113d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f74114e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public y f74115f;

    /* compiled from: TabbedDetailsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_core/expand_items_button/ExpandItemsButtonItem;", "expandItemsButtonItem", "Lkotlin/G0;", "accept", "(Lcom/avito/android/advert_core/expand_items_button/ExpandItemsButtonItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TabbedDetailsItem f74118b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f74119c;

        public b(TabbedDetailsItem tabbedDetailsItem, f fVar) {
            this.f74118b = tabbedDetailsItem;
            this.f74119c = fVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ExpandItemsButtonItem expandItemsButtonItem = (ExpandItemsButtonItem) obj;
            List<PersistableSpannedItem> list = expandItemsButtonItem.f83565i;
            int iF2 = P0.f(C42745f0.q(list, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (T t12 : list) {
                linkedHashMap.put(((PersistableSpannedItem) t12).getF245148b(), t12);
            }
            TabbedDetailsItem tabbedDetailsItem = this.f74118b;
            for (TabData tabData : tabbedDetailsItem.f74096c) {
                List<? extends PersistableSpannedItem> list2 = tabData.f74094c;
                ArrayList arrayList = new ArrayList();
                for (PersistableSpannedItem persistableSpannedItem : list2) {
                    PersistableSpannedItem persistableSpannedItem2 = L.f(persistableSpannedItem, expandItemsButtonItem) ? null : (PersistableSpannedItem) linkedHashMap.getOrDefault(persistableSpannedItem.getF245148b(), persistableSpannedItem);
                    if (persistableSpannedItem2 != null) {
                        arrayList.add(persistableSpannedItem2);
                    }
                }
                tabData.f74094c = arrayList;
                int i12 = tabbedDetailsItem.f74097d;
                int i13 = f.f74110g;
                this.f74119c.B80(tabbedDetailsItem, i12);
            }
        }
    }

    public f(@k View view, @k com.avito.konveyor.a aVar, @k G4.a aVar2) {
        super(view);
        this.f74111b = aVar2;
        this.f74112c = (AvitoTabLayout) view.findViewById(R.id.tab_layout);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        h hVar = new h(aVar, aVar, null, 4, null);
        this.f74113d = hVar;
        j jVar = new j(hVar, aVar);
        this.f74114e = jVar;
        recyclerView.setAdapter(jVar);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void B80(TabbedDetailsItem tabbedDetailsItem, int i12) {
        TabData tabData = (TabData) C42745f0.K(i12, tabbedDetailsItem.f74096c);
        List<? extends PersistableSpannedItem> list = tabData != null ? tabData.f74094c : null;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        this.f74113d.f338510e = new UV0.c(list);
        this.f74114e.notifyDataSetChanged();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        y yVar = this.f74115f;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.advert.item.blocks.tabbed_details.item.e
    public final void wr(@k TabbedDetailsItem tabbedDetailsItem) {
        AvitoTabLayout avitoTabLayout = this.f74112c;
        avitoTabLayout.f180837F.clear();
        avitoTabLayout.m();
        for (TabData tabData : tabbedDetailsItem.f74096c) {
            AvitoTabLayout.a aVarK = avitoTabLayout.k();
            aVarK.c(tabData.f74093b);
            ArrayList<c.i> arrayList = avitoTabLayout.f180847b;
            avitoTabLayout.b(aVarK, arrayList.size(), arrayList.isEmpty());
        }
        avitoTabLayout.q(avitoTabLayout.j(tabbedDetailsItem.f74097d), true);
        B80(tabbedDetailsItem, tabbedDetailsItem.f74097d);
        avitoTabLayout.a(new a(tabbedDetailsItem, this));
        y yVar = this.f74115f;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f74115f = (y) this.f74111b.f6276d.t0(new b(tabbedDetailsItem, this));
    }

    /* compiled from: TabbedDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/blocks/tabbed_details/item/f$a", "Lcom/avito/android/lib/design/tab_layout/c$f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TabbedDetailsItem f74116a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f74117b;

        public a(TabbedDetailsItem tabbedDetailsItem, f fVar) {
            this.f74116a = tabbedDetailsItem;
            this.f74117b = fVar;
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void c(@l c.i iVar) {
            int i12 = iVar != null ? iVar.f180895d : 0;
            TabbedDetailsItem tabbedDetailsItem = this.f74116a;
            tabbedDetailsItem.f74097d = i12;
            int i13 = f.f74110g;
            this.f74117b.B80(tabbedDetailsItem, i12);
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void b() {
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void a(@l c.i iVar) {
        }
    }
}
