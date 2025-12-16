package com.avito.android.lib.deprecated_design.input;

import Y61.k;
import com.avito.android.util.AbstractC35956u5;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: TextInputView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/input/d;", "Lcom/avito/android/util/u5;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends AbstractC35956u5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputView f178030b;

    public d(TextInputView textInputView) {
        this.f178030b = textInputView;
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void onTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) {
        n<Object>[] nVarArr = TextInputView.f178012o;
        this.f178030b.f();
    }
}
