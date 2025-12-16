package com.avito.android.messenger.channels.mvi.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.messenger.channels.mvi.presenter.a;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: FoldersView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/i0;", "Lcom/avito/android/messenger/channels/mvi/view/h0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i0 implements h0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f188757h = {m0.f406844a.f(new kotlin.jvm.internal.a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/channels/mvi/presenter/FoldersPresenter$State;", i0.class))};

    /* renamed from: b, reason: collision with root package name */
    public final Context f188758b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.k<CommonTab> f188759c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.c<CommonTab> f188760d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TabLayout f188761e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f188762f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C35971x f188763g;

    /* compiled from: FoldersView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
            com.avito.android.lib.design.tooltip.o oVar2 = oVar;
            i0 i0Var = i0.this;
            oVar2.i(i0Var.f188758b.getString(R.string.messenger_folder_onboarding_title));
            oVar2.b(i0Var.f188758b.getString(R.string.messenger_folder_onboarding_body));
            return G0.f406611a;
        }
    }

    public i0(@Y61.k View view) {
        this.f188758b = view.getContext();
        com.avito.android.lib.deprecated_design.tab.adapter.k<CommonTab> kVar = new com.avito.android.lib.deprecated_design.tab.adapter.k<>();
        this.f188759c = kVar;
        com.avito.android.lib.deprecated_design.tab.c<CommonTab> cVar = new com.avito.android.lib.deprecated_design.tab.c<>(kVar, view.getContext(), 0, 4, null);
        this.f188760d = cVar;
        View viewFindViewById = view.findViewById(R.id.folders_tabs);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.tabs.TabLayout");
        }
        TabLayout tabLayout = (TabLayout) viewFindViewById;
        this.f188761e = tabLayout;
        com.avito.android.lib.deprecated_design.tab.l.e(tabLayout, cVar);
        this.f188763g = new C35971x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final a.b a(com.avito.android.mvi.e<a.b> eVar) {
        kotlin.reflect.n<Object> nVar = f188757h[0];
        return (a.b) this.f188763g.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.messenger.channels.mvi.presenter.a$b] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f188757h[0];
        this.f188763g.f319122b = (a.b) obj;
    }

    public final void c() {
        View childAt = this.f188761e.getChildAt(0);
        View childAt2 = null;
        if (childAt != null) {
            if (!(childAt instanceof ViewGroup)) {
                childAt = null;
            }
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (viewGroup != null) {
                childAt2 = viewGroup.getChildAt(1);
            }
        }
        if (childAt2 == null) {
            return;
        }
        Context context = this.f188758b;
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(context, 0, 0, 6, null);
        int dimension = (int) context.getResources().getDimension(R.dimen.messenger_folder_onboarding_tooltip_width);
        int i12 = kVar.f181229o;
        kVar.f181228n = dimension;
        kVar.f181229o = i12;
        kVar.f181224j = new r.a(new i.b(new b.a()));
        com.avito.android.lib.design.tooltip.p.a(kVar, new a());
        kVar.e(childAt2);
        this.f188762f = false;
    }

    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<a.b> eVar, a.b bVar, a.b bVar2) {
        a.b bVar3 = bVar2;
        List<a.C5551a> list = bVar3.f188291a;
        boolean z12 = !list.isEmpty();
        TabLayout tabLayout = this.f188761e;
        D6.G(tabLayout, z12);
        List<a.C5551a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (a.C5551a c5551a : list2) {
            arrayList.add(new CommonTab(this.f188758b.getString(c5551a.f188286a), c5551a.f188288c));
        }
        this.f188759c.E5(arrayList);
        this.f188760d.d();
        TabLayout.i iVarH = tabLayout.h(bVar3.f188292b);
        if (iVarH != null) {
            iVarH.a();
        }
        if (!this.f188762f || tabLayout.getTabCount() <= 1) {
            return;
        }
        c();
    }
}
