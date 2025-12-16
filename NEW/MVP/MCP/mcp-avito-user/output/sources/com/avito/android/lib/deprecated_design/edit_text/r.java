package com.avito.android.lib.deprecated_design.edit_text;

import android.view.View;
import com.avito.android.lib.deprecated_design.input.TextInputView;
import com.avito.android.util.AbstractC35956u5;
import hw.InterfaceC41179d;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: EditTextSingleLine.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/edit_text/r;", "Lcom/avito/android/lib/deprecated_design/edit_text/m;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class r implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextInputView f177985b;

    /* compiled from: EditTextSingleLine.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/deprecated_design/edit_text/r$a", "Lcom/avito/android/util/u5;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC35956u5 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f177986b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super String, G0> lVar) {
            this.f177986b = lVar;
        }

        @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
        public final void onTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
            this.f177986b.invoke(charSequence.toString());
        }
    }

    public r(@Y61.k View view) {
        TextInputView textInputView = (TextInputView) view;
        this.f177985b = textInputView;
        new com.jakewharton.rxrelay3.c();
        new com.jakewharton.rxrelay3.c();
        textInputView.setMaxLines(1);
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.m
    public final void CA(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f177985b.setTextChangeListener(new a(lVar));
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.m
    public final void g0(@Y61.k CharSequence charSequence) {
        this.f177985b.setText(charSequence);
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.m
    public final void m3(@Y61.k CharSequence charSequence) {
        this.f177985b.setHint(charSequence);
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.m
    public final void t1(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f177985b.setFocusChangeListener(lVar);
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.m
    public final void w3(boolean z12) {
        this.f177985b.setHasError(z12);
    }
}
