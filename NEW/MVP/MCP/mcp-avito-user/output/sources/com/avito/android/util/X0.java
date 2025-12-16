package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: EditTexts.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/X0;", "Lcom/avito/android/util/u5;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class X0 extends AbstractC35956u5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, kotlin.G0> f318774b;

    /* JADX WARN: Multi-variable type inference failed */
    public X0(Y41.l<? super String, kotlin.G0> lVar) {
        this.f318774b = lVar;
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void onTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        this.f318774b.invoke(charSequence.toString());
    }
}
