package com.jakewharton.rxbinding4.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import h41.AbstractC40770a;
import io.reactivex.rxjava3.core.G;
import kotlin.Metadata;

/* compiled from: RecyclerAdapterDataChangeObservable.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0010\b\u0000\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/c;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$C;", "T", "Lcom/jakewharton/rxbinding4/a;", "a", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class c<T extends RecyclerView.Adapter<? extends RecyclerView.C>> extends com.jakewharton.rxbinding4.a<T> {

    /* compiled from: RecyclerAdapterDataChangeObservable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/c$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$C;", "T", "Lh41/a;", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
    public static final class a<T extends RecyclerView.Adapter<? extends RecyclerView.C>> extends AbstractC40770a {
        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }
    }

    @Override // com.jakewharton.rxbinding4.a
    public final /* bridge */ /* synthetic */ Object M0() {
        return null;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k G<? super T> g12) {
        if (Z01.b.a(g12)) {
            a aVar = new a();
            new b(aVar, g12);
            g12.b(aVar);
            throw null;
        }
    }
}
