package androidx.media3.decoder;

import androidx.media3.common.util.J;
import androidx.media3.decoder.DecoderException;
import j.P;

/* compiled from: Decoder.java */
@J
/* loaded from: classes.dex */
public interface e<I, O, E extends DecoderException> {
    @P
    I a();

    @P
    O b();

    void d(I i12);

    void flush();

    String getName();

    void release();
}
