package com.avito.android.bundles.vas_union.item.tabs;

import Y61.l;
import android.view.View;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.lib.design.tab_layout.c;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: TabsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/tabs/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/bundles/vas_union/item/tabs/j;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f108681b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AvitoTabLayout f108682c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.k<CommonTab> f108683d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.c<CommonTab> f108684e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f108685f;

    /* compiled from: TabsItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<View, com.avito.android.lib.deprecated_design.tab.adapter.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f108687b = new b();

        public b() {
            super(1, com.avito.android.lib.deprecated_design.tab.adapter.e.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // Y41.l
        public final com.avito.android.lib.deprecated_design.tab.adapter.e invoke(View view) {
            return new com.avito.android.lib.deprecated_design.tab.adapter.e(view);
        }
    }

    public k(@Y61.k View view) {
        super(view);
        this.f108681b = view;
        AvitoTabLayout avitoTabLayout = (AvitoTabLayout) view;
        this.f108682c = avitoTabLayout;
        com.avito.android.lib.deprecated_design.tab.adapter.k<CommonTab> kVar = new com.avito.android.lib.deprecated_design.tab.adapter.k<>();
        this.f108683d = kVar;
        com.avito.android.lib.deprecated_design.tab.adapter.c<CommonTab> cVar = new com.avito.android.lib.deprecated_design.tab.adapter.c<>(kVar, view.getContext(), 0, b.f108687b, 4, null);
        this.f108684e = cVar;
        com.avito.android.lib.deprecated_design.tab.l.d(avitoTabLayout, cVar);
        avitoTabLayout.a(new a());
    }

    @Override // com.avito.android.bundles.vas_union.item.tabs.j
    public final void Ba() {
        this.f108685f = null;
    }

    @Override // com.avito.android.bundles.vas_union.item.tabs.j
    public final void N1(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f108685f = lVar;
    }

    @Override // com.avito.android.bundles.vas_union.item.tabs.j
    public final void d8(int i12) {
        c.i iVarJ = this.f108682c.j(i12);
        if (iVarJ != null) {
            iVarJ.b();
        }
    }

    @Override // com.avito.android.bundles.vas_union.item.tabs.j
    public final void u4(@Y61.k List<? extends CommonTab> list) {
        this.f108683d.f178156a = new UV0.c(list);
        this.f108684e.d();
    }

    /* compiled from: TabsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bundles/vas_union/item/tabs/k$a", "Lcom/avito/android/lib/design/tab_layout/c$f;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c.f {
        public a() {
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void c(@Y61.k c.i iVar) {
            Y41.l<? super Integer, G0> lVar = k.this.f108685f;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(iVar.f180895d));
            }
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void b() {
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void a(@l c.i iVar) {
        }
    }
}
