package com.avito.android.constructor_advert.ui.serp.constructor;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* compiled from: ConstructorAdvertSpanLookup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/q;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final m f125827e;

    public q(@Y61.k m mVar) {
        this.f125827e = mVar;
        this.f53672b.clear();
        this.f53673c = false;
        this.f53672b.clear();
        this.f53674d = false;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        UV0.c cVar = this.f125827e.f125825b;
        if (cVar != null) {
            return ((ConstructorAdvertItem) cVar.f16399b.get(i12)).getF270468o();
        }
        throw new IllegalStateException("Data source should be provided");
    }
}
