package com.jakewharton.rxbinding4.widget;

import android.view.View;
import android.widget.AdapterView;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: AdapterViewItemSelectionObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/l;", "Lcom/jakewharton/rxbinding4/a;", "", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37760l extends com.jakewharton.rxbinding4.a<Integer> {

    /* compiled from: AdapterViewItemSelectionObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/l$a;", "Lh41/a;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.widget.l$a */
    public static final class a extends AbstractC40770a implements AdapterView.OnItemSelectedListener {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Integer> f364231c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364231c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(@Y61.k AdapterView<?> adapterView, @Y61.l View view, int i12, long j12) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364231c.onNext(Integer.valueOf(i12));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(@Y61.k AdapterView<?> adapterView) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364231c.onNext(-1);
        }
    }

    @Override // com.jakewharton.rxbinding4.a
    public final Integer M0() {
        throw null;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k io.reactivex.rxjava3.core.G<? super Integer> g12) {
        if (Z01.b.a(g12)) {
            new a(g12);
            throw null;
        }
    }
}
