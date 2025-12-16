package com.avito.android.lib.deprecated_design.edit_text;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.input.TextInputView;
import com.avito.android.util.C35835l0;
import hw.InterfaceC41179d;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EditTextPhone.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/edit_text/l;", "Lcom/avito/android/lib/deprecated_design/edit_text/e;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class l implements InterfaceC31492e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextInputView f177980b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final w f177981c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f177982d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final t f177983e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f177984f;

    public l(View view, String str, char c12, int i12, C42822w c42822w) {
        str = (i12 & 2) != 0 ? "+7 ### ###-##-##" : str;
        c12 = (i12 & 4) != 0 ? '#' : c12;
        TextInputView textInputView = (TextInputView) view;
        this.f177980b = textInputView;
        int iD2 = C35835l0.d(R.attr.gray48, view.getContext());
        this.f177981c = new w(str, c12);
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f177982d = cVar;
        B0 b0D0 = cVar.d0(new i(this));
        E e12 = new E(str, c12);
        t tVar = new t(new C31489b(str, c12, new F(iD2), e12), new H(str, c12, e12));
        this.f177983e = tVar;
        this.f177984f = new com.jakewharton.rxrelay3.c<>();
        textInputView.setMaxLines(1);
        textInputView.setInputType(3);
        textInputView.setFocusChangeListener(new C31493f(this));
        textInputView.setImeOptions(268435462);
        textInputView.setTextChangeListener(new C31488a(tVar, new C31494g(this)));
        b0D0.t0(new C31495h(this));
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.InterfaceC31492e
    @Y61.k
    public final io.reactivex.rxjava3.internal.observers.y Vz(@Y61.k Y41.l lVar) {
        return (io.reactivex.rxjava3.internal.observers.y) this.f177982d.t0(new k(lVar));
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.InterfaceC31492e
    public final void g0(@Y61.k CharSequence charSequence) {
        this.f177980b.setText(charSequence);
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.InterfaceC31492e
    public final void m3(@Y61.k CharSequence charSequence) {
        this.f177980b.setHint(charSequence);
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.InterfaceC31492e
    @Y61.k
    public final io.reactivex.rxjava3.internal.observers.y t1(@Y61.k Y41.l lVar) {
        return (io.reactivex.rxjava3.internal.observers.y) this.f177984f.t0(new j(lVar));
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.InterfaceC31492e
    public final void w3(boolean z12) {
        this.f177980b.setHasError(z12);
    }
}
