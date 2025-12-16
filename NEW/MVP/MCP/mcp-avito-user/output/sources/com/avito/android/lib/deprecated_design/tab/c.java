package com.avito.android.lib.deprecated_design.tab;

import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TabLayoutAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/c;", "Lcom/avito/android/lib/deprecated_design/tab/a;", "T", "Lcom/avito/android/lib/deprecated_design/tab/adapter/g;", "Lcom/avito/android/lib/deprecated_design/tab/m;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c<T extends a> extends com.avito.android.lib.deprecated_design.tab.adapter.g<T, m> {
    public c() {
        throw null;
    }

    public c(com.avito.android.lib.deprecated_design.tab.adapter.j jVar, Context context, int i12, int i13, C42822w c42822w) {
        super(jVar, context, (i13 & 4) != 0 ? R.layout.tab_shortcut : i12);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final void a(com.avito.android.lib.deprecated_design.tab.adapter.i iVar, Object obj) {
        a aVar = (a) obj;
        ((m) iVar).a(aVar.getF316856g(), aVar.getF316857h());
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final com.avito.android.lib.deprecated_design.tab.adapter.i b(View view) {
        return new o(view);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.i e(@Y61.k com.avito.android.lib.deprecated_design.tab.adapter.i iVar, int i12) {
        o oVar = iVar instanceof o ? (o) iVar : null;
        if (oVar == null) {
            return c(i12);
        }
        T item = this.f178152a.getItem(i12);
        oVar.a(item.getF316856g(), item.getF316857h());
        return oVar;
    }
}
