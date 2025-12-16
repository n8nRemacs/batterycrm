package com.jakewharton.rxbinding4.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: TextViewEditorActionObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/E0;", "Lio/reactivex/rxjava3/core/z;", "", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class E0 extends io.reactivex.rxjava3.core.z<Integer> {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f364196b;

    /* renamed from: c, reason: collision with root package name */
    public final Y41.l<Integer, Boolean> f364197c;

    /* compiled from: TextViewEditorActionObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/E0$a;", "Lh41/a;", "Landroid/widget/TextView$OnEditorActionListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements TextView.OnEditorActionListener {

        /* renamed from: c, reason: collision with root package name */
        public final TextView f364198c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Integer> f364199d;

        /* renamed from: e, reason: collision with root package name */
        public final Y41.l<Integer, Boolean> f364200e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k TextView textView, @Y61.k io.reactivex.rxjava3.core.G<? super Integer> g12, @Y61.k Y41.l<? super Integer, Boolean> lVar) {
            this.f364198c = textView;
            this.f364199d = g12;
            this.f364200e = lVar;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f364198c.setOnEditorActionListener(null);
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(@Y61.k TextView textView, int i12, @Y61.l KeyEvent keyEvent) {
            io.reactivex.rxjava3.core.G<? super Integer> g12 = this.f364199d;
            try {
                if (this.f396996b.get() || !this.f364200e.invoke(Integer.valueOf(i12)).booleanValue()) {
                    return false;
                }
                g12.onNext(Integer.valueOf(i12));
                return true;
            } catch (Exception e12) {
                g12.onError(e12);
                dispose();
                return false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E0(@Y61.k TextView textView, @Y61.k Y41.l<? super Integer, Boolean> lVar) {
        this.f364196b = textView;
        this.f364197c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super Integer> g12) {
        if (Z01.b.a(g12)) {
            TextView textView = this.f364196b;
            a aVar = new a(textView, g12, this.f364197c);
            g12.b(aVar);
            textView.setOnEditorActionListener(aVar);
        }
    }
}
