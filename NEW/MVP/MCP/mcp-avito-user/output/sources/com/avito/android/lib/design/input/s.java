package com.avito.android.lib.design.input;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InputExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/input/s;", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f179420b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public String f179421c;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@Y61.l CharSequence charSequence, @Y61.k Y41.l<? super String, G0> lVar) {
        String string;
        this.f179420b = lVar;
        this.f179421c = (charSequence == null || (string = charSequence.toString()) == null) ? "" : string;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.l Editable editable) {
        String string;
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        if (string.equals(this.f179421c)) {
            return;
        }
        this.f179420b.invoke(string);
        this.f179421c = string;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
