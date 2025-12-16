package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.M;
import com.google.android.exoplayer2.source.hls.q;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: HlsSampleStream.java */
/* loaded from: classes6.dex */
final class o implements M {

    /* renamed from: b, reason: collision with root package name */
    public final int f346375b;

    /* renamed from: c, reason: collision with root package name */
    public final q f346376c;

    /* renamed from: d, reason: collision with root package name */
    public int f346377d = -1;

    public o(q qVar, int i12) {
        this.f346376c = qVar;
        this.f346375b = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            int r0 = r6.f346377d
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.exoplayer2.util.C36585a.b(r0)
            com.google.android.exoplayer2.source.hls.q r0 = r6.f346376c
            r0.k()
            int[] r3 = r0.f346545L
            r3.getClass()
            int[] r3 = r0.f346545L
            int r4 = r6.f346375b
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L30
            java.util.Set<com.google.android.exoplayer2.source.V> r1 = r0.f346544K
            com.google.android.exoplayer2.source.W r0 = r0.f346543J
            com.google.android.exoplayer2.source.V r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L36
            r0 = -3
            r3 = r0
            goto L3a
        L30:
            boolean[] r0 = r0.f346548O
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
        L36:
            r3 = r5
            goto L3a
        L38:
            r0[r3] = r1
        L3a:
            r6.f346377d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.o.a():void");
    }

    @Override // com.google.android.exoplayer2.source.M
    public final int b(long j12) {
        if (!d()) {
            return 0;
        }
        int i12 = this.f346377d;
        q qVar = this.f346376c;
        if (qVar.r()) {
            return 0;
        }
        q.d dVar = qVar.f346580w[i12];
        int iQ2 = dVar.q(j12, qVar.f346554U);
        ArrayList<l> arrayList = qVar.f346572o;
        l next = null;
        if (arrayList == null) {
            Iterator<l> it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            next = arrayList.get(arrayList.size() - 1);
        }
        l lVar = next;
        if (lVar != null && !lVar.f346335L) {
            iQ2 = Math.min(iQ2, lVar.d(i12) - dVar.o());
        }
        dVar.A(iQ2);
        return iQ2;
    }

    @Override // com.google.android.exoplayer2.source.M
    public final void c() throws DrmSession.DrmSessionException, SampleQueueMappingException {
        int i12 = this.f346377d;
        q qVar = this.f346376c;
        if (i12 == -2) {
            qVar.k();
            throw new SampleQueueMappingException(AK.c.k("Unable to bind a sample queue to TrackGroup with mime type ", qVar.f346543J.a(this.f346375b).f346151e[0].f343476m, "."));
        }
        if (i12 == -1) {
            qVar.t();
            return;
        }
        if (i12 != -3) {
            qVar.t();
            q.d dVar = qVar.f346580w[i12];
            DrmSession drmSession = dVar.f346050h;
            if (drmSession == null || drmSession.getState() != 1) {
                return;
            }
            DrmSession.DrmSessionException error = dVar.f346050h.getError();
            error.getClass();
            throw error;
        }
    }

    public final boolean d() {
        int i12 = this.f346377d;
        return (i12 == -1 || i12 == -3 || i12 == -2) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r6.get(0).f346335L == false) goto L53;
     */
    @Override // com.google.android.exoplayer2.source.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(com.google.android.exoplayer2.J r22, com.google.android.exoplayer2.decoder.DecoderInputBuffer r23, int r24) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.o.g(com.google.android.exoplayer2.J, com.google.android.exoplayer2.decoder.DecoderInputBuffer, int):int");
    }

    @Override // com.google.android.exoplayer2.source.M
    public final boolean n() {
        if (this.f346377d != -3) {
            if (d()) {
                int i12 = this.f346377d;
                q qVar = this.f346376c;
                if (qVar.r() || !qVar.f346580w[i12].t(qVar.f346554U)) {
                }
            }
            return false;
        }
        return true;
    }
}
