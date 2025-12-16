package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.C36585a;
import j.P;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: LoadErrorHandlingPolicy.java */
/* loaded from: classes6.dex */
public interface z {

    /* compiled from: LoadErrorHandlingPolicy.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f348020a;

        /* renamed from: b, reason: collision with root package name */
        public final int f348021b;

        public a(int i12, int i13) {
            this.f348020a = i12;
            this.f348021b = i13;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f348022a;

        /* renamed from: b, reason: collision with root package name */
        public final long f348023b;

        public b(int i12, long j12) {
            C36585a.b(j12 >= 0);
            this.f348022a = i12;
            this.f348023b = j12;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final IOException f348024a;

        /* renamed from: b, reason: collision with root package name */
        public final int f348025b;

        public d(IOException iOException, int i12) {
            this.f348024a = iOException;
            this.f348025b = i12;
        }
    }

    int a(int i12);

    long b(d dVar);

    @P
    b c(a aVar, d dVar);
}
