package com.jakewharton.rxbinding4.widget;

import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.ui.view.BackPressedNotifyingEditText;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: TextViewAfterTextChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/z0;", "Lcom/jakewharton/rxbinding4/a;", "Lcom/jakewharton/rxbinding4/widget/y0;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class z0 extends com.jakewharton.rxbinding4.a<y0> {

    /* renamed from: b, reason: collision with root package name */
    public final BackPressedNotifyingEditText f364258b;

    public z0(@Y61.k BackPressedNotifyingEditText backPressedNotifyingEditText) {
        this.f364258b = backPressedNotifyingEditText;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final y0 M0() {
        BackPressedNotifyingEditText backPressedNotifyingEditText = this.f364258b;
        return new y0(backPressedNotifyingEditText, backPressedNotifyingEditText.getEditableText());
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k io.reactivex.rxjava3.core.G<? super y0> g12) {
        BackPressedNotifyingEditText backPressedNotifyingEditText = this.f364258b;
        a aVar = new a(backPressedNotifyingEditText, g12);
        g12.b(aVar);
        backPressedNotifyingEditText.addTextChangedListener(aVar);
    }

    /* compiled from: TextViewAfterTextChangeEventObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/z0$a;", "Lh41/a;", "Landroid/text/TextWatcher;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements TextWatcher {

        /* renamed from: c, reason: collision with root package name */
        public final BackPressedNotifyingEditText f364259c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super y0> f364260d;

        public a(@Y61.k BackPressedNotifyingEditText backPressedNotifyingEditText, @Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364259c = backPressedNotifyingEditText;
            this.f364260d = g12;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.k Editable editable) {
            this.f364260d.onNext(new y0(this.f364259c, editable));
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f364259c.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
