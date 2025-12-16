package com.jakewharton.rxbinding4.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding4.recyclerview.c;
import io.reactivex.rxjava3.core.G;
import kotlin.Metadata;

/* compiled from: RecyclerAdapterDataChangeObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/b;", "Landroidx/recyclerview/widget/RecyclerView$g;", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class b extends RecyclerView.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.a f364106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f364107b;

    public b(c.a aVar, G g12) {
        this.f364106a = aVar;
        this.f364107b = g12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void a() {
        if (this.f364106a.f396996b.get()) {
            return;
        }
        this.f364107b.onNext(null);
    }
}
