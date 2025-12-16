package com.avito.android.serp.adapter.developments_catalog.filters.tabs_with_image;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.deprecated_design.tab.TabWithImage;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.lib.design.tab_layout.c;
import com.avito.android.remote.model.developments_catalog.serp.Tab;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersTabsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/filters/tabs_with_image/h;", "Lcom/avito/android/serp/adapter/developments_catalog/filters/tabs_with_image/g;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.android.serp.c implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AvitoTabLayout f269890b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Integer f269891c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f269892d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f269893e;

    public h(@k View view) {
        super(view);
        this.f269890b = (AvitoTabLayout) view;
        this.f269892d = new a();
    }

    @Override // com.avito.android.serp.adapter.developments_catalog.filters.tabs_with_image.g
    public final void K2(@k Y41.l lVar, @k List list) {
        AvitoTabLayout avitoTabLayout = this.f269890b;
        D6.w(avitoTabLayout);
        avitoTabLayout.m();
        a aVar = this.f269892d;
        avitoTabLayout.n(aVar);
        if (list.isEmpty()) {
            return;
        }
        this.f269893e = lVar;
        com.avito.android.lib.deprecated_design.tab.adapter.k kVar = new com.avito.android.lib.deprecated_design.tab.adapter.k();
        List<Tab> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (Tab tab : list2) {
            arrayList.add(new TabWithImage(tab.getTitle(), null, tab.getImage(), tab.isSelected(), null, 16, null));
        }
        kVar.f178156a = new UV0.c(arrayList);
        com.avito.android.lib.deprecated_design.tab.l.d(avitoTabLayout, new com.avito.android.serp.adapter.developments_catalog.filters.tabs_with_image.a(kVar, avitoTabLayout.getContext(), 0, null, 12, null));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (((Tab) obj).isSelected()) {
                avitoTabLayout.q(avitoTabLayout.j(i12), true);
                this.f269891c = Integer.valueOf(i12);
            }
            i12 = i13;
        }
        avitoTabLayout.a(aVar);
        D6.H(avitoTabLayout);
    }

    /* compiled from: FiltersTabsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/developments_catalog/filters/tabs_with_image/h$a", "Lcom/avito/android/lib/design/tab_layout/c$f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c.f {
        public a() {
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void c(@k c.i iVar) {
            int i12 = iVar.f180895d;
            h hVar = h.this;
            Integer num = hVar.f269891c;
            if (num != null && i12 == num.intValue()) {
                return;
            }
            Y41.l<? super Integer, G0> lVar = hVar.f269893e;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(iVar.f180895d));
            }
            hVar.f269891c = Integer.valueOf(iVar.f180895d);
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void b() {
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void a(@k c.i iVar) {
        }
    }
}
