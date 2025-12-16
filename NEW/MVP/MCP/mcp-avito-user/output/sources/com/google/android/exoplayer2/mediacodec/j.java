package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.b;
import com.google.android.exoplayer2.mediacodec.l;
import com.google.android.exoplayer2.mediacodec.r;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.util.z;

/* compiled from: DefaultMediaCodecAdapterFactory.java */
/* loaded from: classes6.dex */
public final class j implements l.b {
    @Override // com.google.android.exoplayer2.mediacodec.l.b
    public final l a(l.a aVar) {
        int i12 = U.f348106a;
        return (i12 < 23 || i12 < 31) ? new r.b().a(aVar) : new b.C10586b(z.i(aVar.f345605c.f343476m)).a(aVar);
    }
}
