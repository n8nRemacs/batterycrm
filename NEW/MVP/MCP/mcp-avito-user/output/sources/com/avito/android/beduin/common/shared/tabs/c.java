package com.avito.android.beduin.common.shared.tabs;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.shared.tabs.d;
import com.avito.android.lib.deprecated_design.tab.adapter.g;
import com.google.android.material.tabs.TabLayout;
import j.I;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTabLayoutWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/shared/tabs/c;", "Lcom/avito/android/beduin/common/shared/tabs/d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.tab.adapter.k<com.avito.android.lib.deprecated_design.tab.a> f103472a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public N f103473b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TabLayout f103474c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f103475d;

    /* compiled from: BeduinTabLayoutWrapper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/common/shared/tabs/c$a", "Lcom/avito/android/lib/deprecated_design/tab/adapter/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.android.lib.deprecated_design.tab.adapter.b {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.lib.deprecated_design.tab.adapter.b, com.google.android.material.tabs.TabLayout.c
        public final void b(@k TabLayout.i iVar) {
            c cVar = c.this;
            ?? r02 = cVar.f103473b;
            if (r02 != 0) {
                r02.invoke(Integer.valueOf(cVar.f103474c.getSelectedTabPosition()));
            }
        }
    }

    public c(@k Context context, @I @l Integer num) {
        this.f103472a = new com.avito.android.lib.deprecated_design.tab.adapter.k<>();
        TabLayout tabLayout = (TabLayout) LayoutInflater.from(context).inflate(R.layout.beduin_component_tabs, (ViewGroup) null);
        this.f103474c = tabLayout;
        this.f103475d = num;
        tabLayout.a(new a());
        tabLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // com.avito.android.beduin.common.shared.tabs.d
    public final void Qa(int i12) {
        TabLayout.i iVarH = this.f103474c.h(i12);
        if (iVarH != null) {
            iVarH.a();
        }
    }

    @Override // com.avito.android.beduin.common.shared.tabs.d
    public final ViewGroup getView() {
        return this.f103474c;
    }

    @Override // com.avito.android.beduin.common.shared.tabs.d
    public final void mc(@k List<? extends com.avito.android.lib.deprecated_design.tab.a> list) {
        TabLayout tabLayout = this.f103474c;
        if (tabLayout.getTag() == null || !d.a.a((g) tabLayout.getTag(), list)) {
            UV0.c cVar = new UV0.c(list);
            com.avito.android.lib.deprecated_design.tab.adapter.k<com.avito.android.lib.deprecated_design.tab.a> kVar = this.f103472a;
            kVar.f178156a = cVar;
            Context context = tabLayout.getContext();
            Integer num = this.f103475d;
            com.avito.android.lib.deprecated_design.tab.l.e(tabLayout, new b(kVar, context, num != null ? num.intValue() : R.layout.tab_shortcut));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.beduin.common.shared.tabs.d
    public final void nc(@l Y41.l<? super Integer, G0> lVar) {
        this.f103473b = (N) lVar;
    }

    public /* synthetic */ c(Context context, Integer num, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : num);
    }
}
