package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.AbstractC36523f;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.text.j;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.util.z;
import j.P;
import java.util.Collections;
import java.util.List;

/* compiled from: TextRenderer.java */
/* loaded from: classes6.dex */
public final class o extends AbstractC36523f implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public int f346918A;

    /* renamed from: B, reason: collision with root package name */
    public long f346919B;

    /* renamed from: n, reason: collision with root package name */
    @P
    public final Handler f346920n;

    /* renamed from: o, reason: collision with root package name */
    public final n f346921o;

    /* renamed from: p, reason: collision with root package name */
    public final j f346922p;

    /* renamed from: q, reason: collision with root package name */
    public final J f346923q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f346924r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f346925s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f346926t;

    /* renamed from: u, reason: collision with root package name */
    public int f346927u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public I f346928v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public i f346929w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public l f346930x;

    /* renamed from: y, reason: collision with root package name */
    @P
    public m f346931y;

    /* renamed from: z, reason: collision with root package name */
    @P
    public m f346932z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, @P Looper looper) {
        Handler handler;
        super(3);
        j jVar = j.f346910a;
        this.f346921o = nVar;
        if (looper == null) {
            handler = null;
        } else {
            int i12 = U.f348106a;
            handler = new Handler(looper, this);
        }
        this.f346920n = handler;
        this.f346922p = jVar;
        this.f346923q = new J();
        this.f346919B = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void B() {
        this.f346928v = null;
        this.f346919B = -9223372036854775807L;
        List<a> listEmptyList = Collections.emptyList();
        Handler handler = this.f346920n;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            n nVar = this.f346921o;
            nVar.onCues(listEmptyList);
            nVar.onCues(new d(listEmptyList));
        }
        K();
        i iVar = this.f346929w;
        iVar.getClass();
        iVar.release();
        this.f346929w = null;
        this.f346927u = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    @Override // com.google.android.exoplayer2.AbstractC36523f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(long r5, boolean r7) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.o.D(long, boolean):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // com.google.android.exoplayer2.AbstractC36523f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(com.google.android.exoplayer2.I[] r3, long r4, long r6) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.o.H(com.google.android.exoplayer2.I[], long, long):void");
    }

    public final long J() {
        if (this.f346918A == -1) {
            return Long.MAX_VALUE;
        }
        this.f346931y.getClass();
        if (this.f346918A >= this.f346931y.b()) {
            return Long.MAX_VALUE;
        }
        return this.f346931y.a(this.f346918A);
    }

    public final void K() {
        this.f346930x = null;
        this.f346918A = -1;
        m mVar = this.f346931y;
        if (mVar != null) {
            mVar.h();
            this.f346931y = null;
        }
        m mVar2 = this.f346932z;
        if (mVar2 != null) {
            mVar2.h();
            this.f346932z = null;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.h0
    public final boolean a() {
        return this.f346925s;
    }

    @Override // com.google.android.exoplayer2.h0, com.google.android.exoplayer2.i0
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List<a> list = (List) message.obj;
        n nVar = this.f346921o;
        nVar.onCues(list);
        nVar.onCues(new d(list));
        return true;
    }

    @Override // com.google.android.exoplayer2.h0
    public final boolean n() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    @Override // com.google.android.exoplayer2.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(long r33, long r35) {
        /*
            Method dump skipped, instructions count: 1656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.o.o(long, long):void");
    }

    @Override // com.google.android.exoplayer2.i0
    public final int y(I i12) {
        ((j.a) this.f346922p).getClass();
        String str = i12.f343476m;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return i0.e(i12.f343463F == 0 ? 4 : 2, 0, 0);
        }
        return z.l(i12.f343476m) ? i0.e(1, 0, 0) : i0.e(0, 0, 0);
    }
}
