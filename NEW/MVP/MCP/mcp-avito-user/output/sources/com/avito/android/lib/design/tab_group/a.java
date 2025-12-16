package com.avito.android.lib.design.tab_group;

import Y61.l;
import com.avito.android.lib.design.tab_group.layout.d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TabGroup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_group/a;", "Lcom/avito/android/lib/design/tab_group/layout/b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.lib.design.tab_group.layout.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabGroup f180721a;

    public a(TabGroup tabGroup) {
        this.f180721a = tabGroup;
    }

    @Override // com.avito.android.lib.design.tab_group.layout.b
    public final void a(@l d.c cVar) {
        d dVar;
        Y41.l<Integer, G0> lVar;
        if (cVar == null || (dVar = this.f180721a.f180717w) == null || (lVar = dVar.f180738c) == null) {
            return;
        }
        lVar.invoke(Integer.valueOf(cVar.f180792b));
    }
}
