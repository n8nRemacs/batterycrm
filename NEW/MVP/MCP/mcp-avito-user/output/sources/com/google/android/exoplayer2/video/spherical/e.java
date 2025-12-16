package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.C36585a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Projection.java */
/* loaded from: classes6.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b f348341a;

    /* renamed from: b, reason: collision with root package name */
    public final b f348342b;

    /* renamed from: c, reason: collision with root package name */
    public final int f348343c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f348344d;

    /* compiled from: Projection.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: Projection.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final c[] f348345a;

        public b(c... cVarArr) {
            this.f348345a = cVarArr;
        }
    }

    /* compiled from: Projection.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f348346a;

        /* renamed from: b, reason: collision with root package name */
        public final int f348347b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f348348c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f348349d;

        public c(int i12, float[] fArr, float[] fArr2, int i13) {
            this.f348346a = i12;
            C36585a.b(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f348348c = fArr;
            this.f348349d = fArr2;
            this.f348347b = i13;
        }
    }

    public e(b bVar, b bVar2, int i12) {
        this.f348341a = bVar;
        this.f348342b = bVar2;
        this.f348343c = i12;
        this.f348344d = bVar == bVar2;
    }
}
