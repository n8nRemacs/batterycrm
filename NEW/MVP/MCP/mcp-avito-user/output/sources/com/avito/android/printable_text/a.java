package com.avito.android.printable_text;

import Y61.k;
import Y61.l;
import android.widget.TextView;
import j.e0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Extensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_printable-text_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {
    @k
    public static final PrintableText a(@e0 int i12) {
        return b.c(i12, new Serializable[0]);
    }

    @k
    public static final PrintableText b(@e0 int i12, @l String str) {
        return str != null ? new RawPrintableText(str) : a(i12);
    }

    public static final void c(@k TextView textView, @k PrintableText printableText) {
        textView.setText(printableText.k0(textView.getContext()));
    }
}
