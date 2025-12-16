package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import j.P;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: ExtractorUtil.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class s {
    @Pure
    public static void a(@P String str, boolean z12) throws ParserException {
        if (!z12) {
            throw ParserException.a(str, null);
        }
    }
}
