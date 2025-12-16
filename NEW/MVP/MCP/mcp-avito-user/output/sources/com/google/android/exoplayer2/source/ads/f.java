package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.AbstractC36552o;
import com.google.android.exoplayer2.util.C36585a;
import j.k0;

/* compiled from: SinglePeriodAdTimeline.java */
@k0
/* loaded from: classes6.dex */
public final class f extends AbstractC36552o {

    /* renamed from: d, reason: collision with root package name */
    public final a f346200d;

    public f(s0 s0Var, a aVar) {
        super(s0Var);
        C36585a.d(s0Var.h() == 1);
        C36585a.d(s0Var.o() == 1);
        this.f346200d = aVar;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
    public final s0.b f(int i12, s0.b bVar, boolean z12) {
        this.f346655c.f(i12, bVar, z12);
        long j12 = bVar.f345873e;
        if (j12 == -9223372036854775807L) {
            j12 = this.f346200d.f346185e;
        }
        bVar.h(bVar.f345870b, bVar.f345871c, bVar.f345872d, j12, bVar.f345874f, this.f346200d, bVar.f345875g);
        return bVar;
    }
}
