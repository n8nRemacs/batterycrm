package com.google.android.exoplayer2.extractor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Extractor.java */
/* loaded from: classes6.dex */
public interface j {

    /* compiled from: Extractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(long j12, long j13);

    void b(l lVar);

    boolean h(k kVar);

    int i(k kVar, w wVar);

    void release();
}
