package com.avito.android.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.Metadata;

/* compiled from: Floats.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_lang_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.n1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35852n1 {
    public static String a(float f12) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(',');
        return new DecimalFormat("0.0", decimalFormatSymbols).format(Float.valueOf(f12));
    }
}
