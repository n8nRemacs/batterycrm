package com.jakewharton.rxbinding4.view;

import android.view.MotionEvent;
import android.view.View;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: ViewTouchObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/Z;", "Lio/reactivex/rxjava3/core/z;", "Landroid/view/MotionEvent;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class Z extends io.reactivex.rxjava3.core.z<MotionEvent> {

    /* compiled from: ViewTouchObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/Z$a;", "Lh41/a;", "Landroid/view/View$OnTouchListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements View.OnTouchListener {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super MotionEvent> f364170c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364170c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(@Y61.k View view, @Y61.k MotionEvent motionEvent) {
            if (this.f396996b.get()) {
                return false;
            }
            try {
                throw null;
            } catch (Exception e12) {
                this.f364170c.onError(e12);
                dispose();
                return false;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super MotionEvent> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new a(g12));
            throw null;
        }
    }
}
