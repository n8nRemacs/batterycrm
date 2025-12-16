package com.jakewharton.rxbinding4.widget;

import android.view.View;
import android.widget.AdapterView;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: AdapterViewItemClickEventObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/f;", "Lio/reactivex/rxjava3/core/z;", "Lcom/jakewharton/rxbinding4/widget/e;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37749f extends io.reactivex.rxjava3.core.z<C37747e> {

    /* compiled from: AdapterViewItemClickEventObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/f$a;", "Lh41/a;", "Landroid/widget/AdapterView$OnItemClickListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.widget.f$a */
    public static final class a extends AbstractC40770a implements AdapterView.OnItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super C37747e> f364223c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364223c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(@Y61.k AdapterView<?> adapterView, @Y61.l View view, int i12, long j12) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364223c.onNext(new C37747e(adapterView, view, i12, j12));
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super C37747e> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new a(g12));
            throw null;
        }
    }
}
