package com.google.android.exoplayer2.text;

import j.P;
import java.util.List;

/* compiled from: SubtitleOutputBuffer.java */
/* loaded from: classes6.dex */
public abstract class m extends com.google.android.exoplayer2.decoder.g implements h {

    /* renamed from: e, reason: collision with root package name */
    @P
    public h f346916e;

    /* renamed from: f, reason: collision with root package name */
    public long f346917f;

    @Override // com.google.android.exoplayer2.text.h
    public final long a(int i12) {
        h hVar = this.f346916e;
        hVar.getClass();
        return hVar.a(i12) + this.f346917f;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int b() {
        h hVar = this.f346916e;
        hVar.getClass();
        return hVar.b();
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int c(long j12) {
        h hVar = this.f346916e;
        hVar.getClass();
        return hVar.c(j12 - this.f346917f);
    }

    @Override // com.google.android.exoplayer2.text.h
    public final List<a> d(long j12) {
        h hVar = this.f346916e;
        hVar.getClass();
        return hVar.d(j12 - this.f346917f);
    }

    public final void i(long j12, h hVar, long j13) {
        this.f344235c = j12;
        this.f346916e = hVar;
        if (j13 != Long.MAX_VALUE) {
            j12 = j13;
        }
        this.f346917f = j12;
    }
}
