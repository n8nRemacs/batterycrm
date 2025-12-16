package com.jakewharton.rxbinding4.view;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import h41.AbstractC40770a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ViewAttachesObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/H;", "Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class H extends io.reactivex.rxjava3.core.z<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final ComposeView f364132b;

    public H(@Y61.k ComposeView composeView) {
        this.f364132b = composeView;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super G0> g12) {
        if (Z01.b.a(g12)) {
            ComposeView composeView = this.f364132b;
            a aVar = new a(composeView, g12);
            g12.b(aVar);
            composeView.addOnAttachStateChangeListener(aVar);
        }
    }

    /* compiled from: ViewAttachesObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/H$a;", "Lh41/a;", "Landroid/view/View$OnAttachStateChangeListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements View.OnAttachStateChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final ComposeView f364133c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super G0> f364134d;

        public a(@Y61.k ComposeView composeView, @Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364133c = composeView;
            this.f364134d = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f364133c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364134d.onNext(G0.f406611a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
        }
    }
}
