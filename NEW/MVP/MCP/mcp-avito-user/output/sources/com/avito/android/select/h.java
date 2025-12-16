package com.avito.android.select;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;

/* compiled from: SelectDialogInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {
    public static final String a(String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (!C43044a.d(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }
}
