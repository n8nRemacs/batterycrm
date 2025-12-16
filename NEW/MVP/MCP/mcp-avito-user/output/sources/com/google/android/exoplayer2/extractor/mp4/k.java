package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.I;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Track.java */
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f344868a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344869b;

    /* renamed from: c, reason: collision with root package name */
    public final long f344870c;

    /* renamed from: d, reason: collision with root package name */
    public final long f344871d;

    /* renamed from: e, reason: collision with root package name */
    public final long f344872e;

    /* renamed from: f, reason: collision with root package name */
    public final I f344873f;

    /* renamed from: g, reason: collision with root package name */
    public final int f344874g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final long[] f344875h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final long[] f344876i;

    /* renamed from: j, reason: collision with root package name */
    public final int f344877j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public final l[] f344878k;

    /* compiled from: Track.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public k(int i12, int i13, long j12, long j13, long j14, I i14, int i15, @P l[] lVarArr, int i16, @P long[] jArr, @P long[] jArr2) {
        this.f344868a = i12;
        this.f344869b = i13;
        this.f344870c = j12;
        this.f344871d = j13;
        this.f344872e = j14;
        this.f344873f = i14;
        this.f344874g = i15;
        this.f344878k = lVarArr;
        this.f344877j = i16;
        this.f344875h = jArr;
        this.f344876i = jArr2;
    }
}
