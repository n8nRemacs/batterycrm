package com.jakewharton.rxbinding4.widget;

import android.text.Editable;
import android.text.TextWatcher;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: TextViewTextChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/G0;", "Lcom/jakewharton/rxbinding4/a;", "Lcom/jakewharton/rxbinding4/widget/F0;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class G0 extends com.jakewharton.rxbinding4.a<F0> {
    @Override // com.jakewharton.rxbinding4.a
    public final F0 M0() {
        throw null;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k io.reactivex.rxjava3.core.G<? super F0> g12) {
        g12.b(new a(g12));
        throw null;
    }

    /* compiled from: TextViewTextChangeEventObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/G0$a;", "Lh41/a;", "Landroid/text/TextWatcher;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements TextWatcher {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super F0> f364205c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364205c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364205c.onNext(new F0(i12, i13, i14, charSequence));
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.k Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
