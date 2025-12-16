package com.avito.android.lib.design.input;

import android.text.Editable;
import android.text.TextWatcher;
import h41.AbstractC40770a;
import io.reactivex.rxjava3.core.G;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: InputExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/input/q;", "Lcom/jakewharton/rxbinding4/a;", "Lkotlin/Q;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class q extends com.jakewharton.rxbinding4.a<Q<? extends String, ? extends String>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f179414b;

    public q(@Y61.k Input input) {
        this.f179414b = input;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final Q<? extends String, ? extends String> M0() {
        Input input = this.f179414b;
        return new Q<>(String.valueOf(input.m53getText()), input.getDeformattedText());
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k G<? super Q<? extends String, ? extends String>> g12) {
        Input input = this.f179414b;
        a aVar = new a(input, g12);
        g12.b(aVar);
        input.b(aVar);
    }

    /* compiled from: InputExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/input/q$a;", "Lh41/a;", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC40770a implements TextWatcher {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Input f179415c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final G<? super Q<String, String>> f179416d;

        public a(@Y61.k Input input, @Y61.k G<? super Q<String, String>> g12) {
            this.f179415c = input;
            this.f179416d = g12;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.k Editable editable) {
            if (this.f396996b.get()) {
                return;
            }
            Input input = this.f179415c;
            this.f179416d.onNext(new Q(String.valueOf(input.m53getText()), input.getDeformattedText()));
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f179415c.h(this);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
