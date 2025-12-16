package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ParserException;
import j.P;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: ExtractorUtil.java */
/* loaded from: classes6.dex */
public final class m {
    @Pure
    public static void a(@P String str, boolean z12) throws ParserException {
        if (!z12) {
            throw ParserException.a(str, null);
        }
    }
}
