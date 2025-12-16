package com.google.android.play.core.assetpacks.internal;

import java.io.InputStream;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.internal.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37144n extends AbstractC37143m {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC37143m f358376b;

    /* renamed from: c, reason: collision with root package name */
    public final long f358377c;

    /* renamed from: d, reason: collision with root package name */
    public final long f358378d;

    public C37144n(AbstractC37143m abstractC37143m, long j12, long j13) {
        this.f358376b = abstractC37143m;
        long jC2 = c(j12);
        this.f358377c = jC2;
        this.f358378d = c(jC2 + j13);
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractC37143m
    public final long a() {
        return this.f358378d - this.f358377c;
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractC37143m
    public final InputStream b(long j12, long j13) {
        long jC2 = c(this.f358377c);
        return this.f358376b.b(jC2, c(j13 + jC2) - jC2);
    }

    public final long c(long j12) {
        if (j12 < 0) {
            return 0L;
        }
        AbstractC37143m abstractC37143m = this.f358376b;
        return j12 > abstractC37143m.a() ? abstractC37143m.a() : j12;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
