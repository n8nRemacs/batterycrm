package com.avito.android.lib.design.input;

import android.text.Editable;
import android.text.TextWatcher;
import h41.AbstractC40770a;
import io.reactivex.rxjava3.core.G;
import kotlin.Metadata;

/* compiled from: InputExtensions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/input/p;", "Lcom/jakewharton/rxbinding4/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class p extends com.jakewharton.rxbinding4.a<CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f179411b;

    public p(@Y61.k Input input) {
        this.f179411b = input;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final CharSequence M0() {
        Editable editableM53getText = this.f179411b.m53getText();
        return editableM53getText != null ? editableM53getText : "";
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k G<? super CharSequence> g12) {
        Input input = this.f179411b;
        a aVar = new a(input, g12);
        g12.b(aVar);
        input.b(aVar);
    }

    /* compiled from: InputExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/input/p$a;", "Lh41/a;", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC40770a implements TextWatcher {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Input f179412c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final G<? super CharSequence> f179413d;

        public a(@Y61.k Input input, @Y61.k G<? super CharSequence> g12) {
            this.f179412c = input;
            this.f179413d = g12;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.k Editable editable) {
            if (this.f396996b.get()) {
                return;
            }
            this.f179413d.onNext(editable);
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f179412c.h(this);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
