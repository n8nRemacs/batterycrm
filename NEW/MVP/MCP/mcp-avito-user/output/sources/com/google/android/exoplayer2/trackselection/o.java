package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.source.V;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: TrackSelection.java */
/* loaded from: classes6.dex */
public interface o {

    /* compiled from: TrackSelection.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    int b(int i12);

    I d(int i12);

    int h(int i12);

    V i();

    int length();
}
