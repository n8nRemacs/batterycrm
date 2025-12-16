package com.avito.android.lib.deprecated_design.tab;

import android.view.View;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.lib.design.tab_layout.c;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TabLayouts.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_deprecated-components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l {
    public static final void a(AvitoTabLayout avitoTabLayout) {
        com.avito.android.lib.deprecated_design.tab.adapter.i iVarC;
        com.avito.android.lib.deprecated_design.tab.adapter.g<?, ?> gVarC = c(avitoTabLayout);
        if (gVarC == null) {
            return;
        }
        com.avito.android.lib.deprecated_design.tab.adapter.j<?> jVar = gVarC.f178152a;
        int tabCount = avitoTabLayout.getTabCount();
        for (int count = jVar.getCount(); count < tabCount; count++) {
            if (avitoTabLayout.j(count) != null) {
                avitoTabLayout.o(count);
            }
        }
        int count2 = jVar.getCount();
        for (int i12 = 0; i12 < count2; i12++) {
            c.i iVarJ = avitoTabLayout.j(i12);
            View viewFindViewById = null;
            com.avito.android.lib.deprecated_design.tab.adapter.i iVar = iVarJ != null ? iVarJ.f180892a : null;
            if (iVar == null) {
                iVar = null;
            }
            if (iVar == null || (iVarC = gVarC.e(iVar, i12)) == null) {
                iVarC = gVarC.c(i12);
            }
            if (!L.f(iVarC, iVar)) {
                if (iVarJ != null) {
                    if (iVarJ.f180897f != avitoTabLayout) {
                        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
                    }
                    avitoTabLayout.o(iVarJ.f180895d);
                }
                AvitoTabLayout.a aVarV = avitoTabLayout.k();
                View f183521a = iVarC.getF19977a();
                com.avito.android.lib.deprecated_design.tab.adapter.h hVar = iVarC instanceof com.avito.android.lib.deprecated_design.tab.adapter.h ? (com.avito.android.lib.deprecated_design.tab.adapter.h) iVarC : null;
                Integer numC = hVar != null ? hVar.c() : null;
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    if (f183521a != null) {
                        viewFindViewById = f183521a.findViewById(iIntValue);
                    }
                }
                aVarV.f180822h = viewFindViewById;
                aVarV.f180896e = f183521a;
                c.m mVar = aVarV.f180898g;
                if (mVar != null) {
                    mVar.e();
                }
                aVarV.f180892a = iVarC;
                avitoTabLayout.b(aVarV, i12, avitoTabLayout.f180847b.isEmpty());
            }
        }
    }

    public static final void b(TabLayout tabLayout) {
        com.avito.android.lib.deprecated_design.tab.adapter.i iVarC;
        com.avito.android.lib.deprecated_design.tab.adapter.g gVar = (com.avito.android.lib.deprecated_design.tab.adapter.g) tabLayout.getTag();
        com.avito.android.lib.deprecated_design.tab.adapter.j<T> jVar = gVar.f178152a;
        int tabCount = tabLayout.getTabCount();
        for (int count = jVar.getCount(); count < tabCount; count++) {
            try {
                tabLayout.l(count);
            } catch (NullPointerException unused) {
            }
        }
        int count2 = jVar.getCount();
        for (int i12 = 0; i12 < count2; i12++) {
            TabLayout.i iVarH = tabLayout.h(i12);
            com.avito.android.lib.deprecated_design.tab.adapter.i iVar = iVarH != null ? iVarH.f357409a : null;
            com.avito.android.lib.deprecated_design.tab.adapter.i iVar2 = iVar != null ? iVar : null;
            if (iVar2 == null || (iVarC = gVar.e(iVar2, i12)) == null) {
                iVarC = gVar.c(i12);
            }
            if (!L.f(iVarC, iVar2)) {
                if (iVarH != null) {
                    if (iVarH.f357414f != tabLayout) {
                        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
                    }
                    tabLayout.l(iVarH.f357412d);
                }
                TabLayout.i iVarI = tabLayout.i();
                iVarI.f357413e = iVarC.getF19977a();
                TabLayout.n nVar = iVarI.f357415g;
                if (nVar != null) {
                    nVar.d();
                }
                iVarI.f357409a = iVarC;
                tabLayout.b(iVarI, i12, tabLayout.f357375c.isEmpty());
            }
        }
    }

    @Y61.l
    public static final com.avito.android.lib.deprecated_design.tab.adapter.g<?, ?> c(@Y61.k AvitoTabLayout avitoTabLayout) {
        Object tag = avitoTabLayout.getTag();
        if (tag instanceof com.avito.android.lib.deprecated_design.tab.adapter.g) {
            return (com.avito.android.lib.deprecated_design.tab.adapter.g) tag;
        }
        return null;
    }

    public static final void d(@Y61.k AvitoTabLayout avitoTabLayout, @Y61.l com.avito.android.lib.deprecated_design.tab.adapter.g<?, ?> gVar) {
        avitoTabLayout.setTag(gVar);
        com.avito.android.lib.deprecated_design.tab.adapter.g<?, ?> gVarC = c(avitoTabLayout);
        if (gVarC == null) {
            return;
        }
        gVarC.f178155d.registerObserver(new j(avitoTabLayout));
        avitoTabLayout.a(new k(gVarC));
        avitoTabLayout.m();
        a(avitoTabLayout);
    }

    public static final void e(@Y61.k TabLayout tabLayout, @Y61.l com.avito.android.lib.deprecated_design.tab.adapter.g<?, ?> gVar) {
        tabLayout.setTag(gVar);
        com.avito.android.lib.deprecated_design.tab.adapter.g gVar2 = (com.avito.android.lib.deprecated_design.tab.adapter.g) tabLayout.getTag();
        gVar2.f178155d.registerObserver(new h(tabLayout));
        tabLayout.a(new i(gVar2));
        tabLayout.k();
        b(tabLayout);
    }
}
