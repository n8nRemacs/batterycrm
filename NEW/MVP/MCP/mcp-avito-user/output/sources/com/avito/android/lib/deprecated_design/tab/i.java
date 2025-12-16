package com.avito.android.lib.deprecated_design.tab;

import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;

/* compiled from: TabLayouts.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/i;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/b;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.android.lib.deprecated_design.tab.adapter.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.deprecated_design.tab.adapter.g<?, ?> f178158a;

    public i(com.avito.android.lib.deprecated_design.tab.adapter.g<?, ?> gVar) {
        this.f178158a = gVar;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.b, com.google.android.material.tabs.TabLayout.c
    public final void a(@Y61.k TabLayout.i iVar) {
        com.avito.android.lib.deprecated_design.tab.adapter.i iVar2 = iVar.f357409a;
        if (iVar2 == null) {
            iVar2 = null;
        }
        if (iVar2 != null) {
            iVar2.b(iVar.f357412d, this.f178158a.f178152a.getCount(), false);
        }
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.b, com.google.android.material.tabs.TabLayout.c
    public final void b(@Y61.k TabLayout.i iVar) {
        com.avito.android.lib.deprecated_design.tab.adapter.i iVar2 = iVar.f357409a;
        if (iVar2 == null) {
            iVar2 = null;
        }
        if (iVar2 != null) {
            iVar2.b(iVar.f357412d, this.f178158a.f178152a.getCount(), true);
        }
    }
}
