package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.k;
import com.google.android.exoplayer2.util.I;
import j.P;
import java.io.IOException;

/* compiled from: ProgressiveDownloader.java */
/* loaded from: classes6.dex */
public final class o implements k {

    /* renamed from: a, reason: collision with root package name */
    @P
    public k.a f345823a;

    /* renamed from: b, reason: collision with root package name */
    public volatile I<Void, IOException> f345824b;

    /* compiled from: ProgressiveDownloader.java */
    public class a extends I<Void, IOException> {
        public a() {
        }

        @Override // com.google.android.exoplayer2.util.I
        public final void b() {
            o.this.getClass();
            throw null;
        }

        @Override // com.google.android.exoplayer2.util.I
        public final Void c() {
            o.this.getClass();
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.offline.k
    public final void a(@P k.a aVar) {
        this.f345823a = aVar;
        this.f345824b = new a();
        try {
            throw null;
        } catch (Throwable th2) {
            this.f345824b.a();
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.offline.k
    public final void remove() {
        throw null;
    }
}
