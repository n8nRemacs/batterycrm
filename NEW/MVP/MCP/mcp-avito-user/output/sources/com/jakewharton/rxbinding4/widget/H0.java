package com.jakewharton.rxbinding4.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: TextViewTextChangesObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/H0;", "Lcom/jakewharton/rxbinding4/a;", "", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class H0 extends com.jakewharton.rxbinding4.a<CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f364206b;

    public H0(@Y61.k TextView textView) {
        this.f364206b = textView;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final CharSequence M0() {
        return this.f364206b.getText();
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k io.reactivex.rxjava3.core.G<? super CharSequence> g12) {
        TextView textView = this.f364206b;
        a aVar = new a(textView, g12);
        g12.b(aVar);
        textView.addTextChangedListener(aVar);
    }

    /* compiled from: TextViewTextChangesObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/H0$a;", "Lh41/a;", "Landroid/text/TextWatcher;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements TextWatcher {

        /* renamed from: c, reason: collision with root package name */
        public final TextView f364207c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super CharSequence> f364208d;

        public a(@Y61.k TextView textView, @Y61.k io.reactivex.rxjava3.core.G<? super CharSequence> g12) {
            this.f364207c = textView;
            this.f364208d = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f364207c.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364208d.onNext(charSequence);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.k Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
