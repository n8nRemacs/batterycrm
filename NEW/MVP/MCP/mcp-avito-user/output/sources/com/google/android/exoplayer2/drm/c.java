package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.util.U;
import j.B;

/* compiled from: DefaultDrmSessionManagerProvider.java */
/* loaded from: classes6.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f344331a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @B
    public O.f f344332b;

    public final f a(O o12) {
        o12.f343529c.getClass();
        O.f fVar = o12.f343529c.f343573c;
        if (fVar == null || U.f348106a < 18) {
            return f.f344341a;
        }
        synchronized (this.f344331a) {
            if (fVar.equals(this.f344332b)) {
                throw null;
            }
            this.f344332b = fVar;
            v.b bVar = new v.b();
            bVar.f348012b = null;
            fVar.getClass();
            new o(null, bVar);
            throw null;
        }
    }
}
