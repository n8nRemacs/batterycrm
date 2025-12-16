package com.avito.android.util;

import android.text.Editable;
import android.text.Selection;
import kotlin.Metadata;
import kotlin.text.C43059p;

/* compiled from: PositionFormatterTextWatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/W3;", "Lcom/avito/android/util/u5;", "_common_formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class W3 extends AbstractC35956u5 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recall_me.presentation.items.single_input.a f318770b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f318771c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C35843m0 f318772d;

    public W3(@Y61.k com.avito.android.recall_me.presentation.items.single_input.a aVar) {
        this.f318770b = aVar;
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public void afterTextChanged(@Y61.k Editable editable) {
        C35843m0 c35843m0;
        if (this.f318771c || (c35843m0 = this.f318772d) == null) {
            return;
        }
        this.f318771c = true;
        editable.replace(0, editable.length(), c35843m0.f318924a);
        Selection.setSelection(editable, Math.max(0, Math.min(c35843m0.f318925b, editable.length())));
        this.f318771c = false;
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void onTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        C35843m0 c35843m0;
        if (this.f318771c) {
            return;
        }
        com.avito.android.recall_me.presentation.items.single_input.a aVar = this.f318770b;
        String string = charSequence.toString();
        aVar.getClass();
        if (string == null) {
            string = "";
        }
        String str = aVar.f251955a;
        if (str == null) {
            c35843m0 = new C35843m0(string, string.length());
        } else {
            String strF = new C43059p(str).f(string, "");
            c35843m0 = new C35843m0(strF, strF.length());
        }
        this.f318772d = c35843m0;
    }
}
