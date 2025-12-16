package com.avito.android.lib.deprecated_design.tab;

import com.avito.android.lib.design.tab_layout.c;
import kotlin.Metadata;

/* compiled from: TabLayouts.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/k;", "Lcom/avito/android/lib/design/tab_layout/c$f;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements c.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.deprecated_design.tab.adapter.g<?, ?> f178160a;

    public k(com.avito.android.lib.deprecated_design.tab.adapter.g<?, ?> gVar) {
        this.f178160a = gVar;
    }

    @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
    public final void a(@Y61.k c.i iVar) {
        com.avito.android.lib.deprecated_design.tab.adapter.i iVar2 = iVar.f180892a;
        if (iVar2 == null) {
            iVar2 = null;
        }
        if (iVar2 != null) {
            iVar2.b(iVar.f180895d, this.f178160a.f178152a.getCount(), false);
        }
    }

    @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
    public final void c(@Y61.k c.i iVar) {
        com.avito.android.lib.deprecated_design.tab.adapter.i iVar2 = iVar.f180892a;
        if (iVar2 == null) {
            iVar2 = null;
        }
        if (iVar2 != null) {
            iVar2.b(iVar.f180895d, this.f178160a.f178152a.getCount(), true);
        }
    }

    @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
    public final void b() {
    }
}
