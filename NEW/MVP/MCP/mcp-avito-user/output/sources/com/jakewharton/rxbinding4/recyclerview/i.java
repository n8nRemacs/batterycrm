package com.jakewharton.rxbinding4.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding4.recyclerview.j;
import io.reactivex.rxjava3.core.G;
import kotlin.Metadata;

/* compiled from: RecyclerViewFlingEventObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/i;", "Landroidx/recyclerview/widget/RecyclerView$p;", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class i extends RecyclerView.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j.a f364113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f364114b;

    public i(j.a aVar, G g12) {
        this.f364113a = aVar;
        this.f364114b = g12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean a(int i12, int i13) {
        if (this.f364113a.f396996b.get()) {
            return false;
        }
        this.f364114b.onNext(new h(i12, i13));
        return false;
    }
}
