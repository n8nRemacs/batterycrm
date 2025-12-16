package com.avito.android.beduin.common.shared.tabs;

import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.a;
import com.avito.android.lib.deprecated_design.tab.adapter.g;
import com.avito.android.lib.deprecated_design.tab.adapter.i;
import com.avito.android.lib.deprecated_design.tab.adapter.j;
import com.avito.android.lib.deprecated_design.tab.m;
import com.avito.android.lib.deprecated_design.tab.o;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinTabLayoutWrapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/shared/tabs/b;", "Lcom/avito/android/lib/deprecated_design/tab/a;", "T", "Lcom/avito/android/lib/deprecated_design/tab/adapter/g;", "Lcom/avito/android/lib/deprecated_design/tab/m;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class b<T extends com.avito.android.lib.deprecated_design.tab.a> extends g<T, m> {
    public b() {
        throw null;
    }

    public b(j jVar, Context context, int i12, int i13, C42822w c42822w) {
        super(jVar, context, (i13 & 4) != 0 ? R.layout.tab_shortcut : i12);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final void a(i iVar, Object obj) {
        com.avito.android.lib.deprecated_design.tab.a aVar = (com.avito.android.lib.deprecated_design.tab.a) obj;
        ((m) iVar).a(aVar.getF178135b(), aVar.getF178136c());
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final i b(View view) {
        return new o(view);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    @k
    public final i e(@k i iVar, int i12) {
        o oVar = iVar instanceof o ? (o) iVar : null;
        if (oVar == null) {
            return c(i12);
        }
        T item = this.f178152a.getItem(i12);
        oVar.a(item.getF178135b(), item.getF178136c());
        return oVar;
    }
}
