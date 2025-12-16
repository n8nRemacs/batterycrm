package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: SampleStream.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface P {

    /* compiled from: SampleStream.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: SampleStream.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int b(long j12);

    void c();

    int e(androidx.media3.exoplayer.F f12, DecoderInputBuffer decoderInputBuffer, int i12);

    boolean n();
}
