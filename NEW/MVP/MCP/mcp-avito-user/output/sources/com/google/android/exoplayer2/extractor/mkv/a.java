package com.google.android.exoplayer2.extractor.mkv;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* compiled from: DefaultEbmlReader.java */
/* loaded from: classes6.dex */
final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f344576a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f344577b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    public final f f344578c = new f();

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.mkv.b f344579d;

    /* renamed from: e, reason: collision with root package name */
    public int f344580e;

    /* renamed from: f, reason: collision with root package name */
    public int f344581f;

    /* renamed from: g, reason: collision with root package name */
    public long f344582g;

    /* compiled from: DefaultEbmlReader.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f344583a;

        /* renamed from: b, reason: collision with root package name */
        public final long f344584b;

        public b(int i12, long j12, C10579a c10579a) {
            this.f344583a = i12;
            this.f344584b = j12;
        }
    }

    public final long a(com.google.android.exoplayer2.extractor.f fVar, int i12) throws EOFException, InterruptedIOException {
        fVar.d(this.f344576a, 0, i12, false);
        long j12 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            j12 = (j12 << 8) | (r0[i13] & 255);
        }
        return j12;
    }
}
