package com.jakewharton.rxbinding4.view;

import android.view.View;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: ViewFocusChangeObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/K;", "Lcom/jakewharton/rxbinding4/a;", "", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class K extends com.jakewharton.rxbinding4.a<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final View f364139b;

    /* compiled from: ViewFocusChangeObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/K$a;", "Lh41/a;", "Landroid/view/View$OnFocusChangeListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements View.OnFocusChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final View f364140c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Boolean> f364141d;

        public a(@Y61.k View view, @Y61.k io.reactivex.rxjava3.core.G<? super Boolean> g12) {
            this.f364140c = view;
            this.f364141d = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f364140c.setOnFocusChangeListener(null);
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(@Y61.k View view, boolean z12) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364141d.onNext(Boolean.valueOf(z12));
        }
    }

    public K(@Y61.k View view) {
        this.f364139b = view;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final Boolean M0() {
        return Boolean.valueOf(this.f364139b.hasFocus());
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k io.reactivex.rxjava3.core.G<? super Boolean> g12) {
        View view = this.f364139b;
        a aVar = new a(view, g12);
        g12.b(aVar);
        view.setOnFocusChangeListener(aVar);
    }
}
