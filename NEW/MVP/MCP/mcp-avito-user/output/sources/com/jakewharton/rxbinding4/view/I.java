package com.jakewharton.rxbinding4.view;

import android.view.View;
import h41.AbstractC40770a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ViewClickObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/I;", "Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class I extends io.reactivex.rxjava3.core.z<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final View f364135b;

    /* compiled from: ViewClickObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/I$a;", "Lh41/a;", "Landroid/view/View$OnClickListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements View.OnClickListener {

        /* renamed from: c, reason: collision with root package name */
        public final View f364136c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super G0> f364137d;

        public a(@Y61.k View view, @Y61.k io.reactivex.rxjava3.core.G<? super G0> g12) {
            this.f364136c = view;
            this.f364137d = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f364136c.setOnClickListener(null);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@Y61.k View view) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364137d.onNext(G0.f406611a);
        }
    }

    public I(@Y61.k View view) {
        this.f364135b = view;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super G0> g12) {
        if (Z01.b.a(g12)) {
            View view = this.f364135b;
            a aVar = new a(view, g12);
            g12.b(aVar);
            view.setOnClickListener(aVar);
        }
    }
}
