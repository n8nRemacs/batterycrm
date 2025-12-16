package androidx.media3.extractor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Extractor.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface p {

    /* compiled from: Extractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(long j12, long j13);

    boolean b(q qVar);

    int h(q qVar, F f12);

    void i(r rVar);

    void release();
}
