package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.a;
import j.InterfaceC42156l;
import j.N;
import j.P;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: StandardGifDecoder.java */
/* loaded from: classes5.dex */
public class f implements a {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC42156l
    public int[] f338781a;

    /* renamed from: c, reason: collision with root package name */
    public final a.InterfaceC10499a f338783c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f338784d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f338785e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f338786f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f338787g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f338788h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f338789i;

    /* renamed from: j, reason: collision with root package name */
    @InterfaceC42156l
    public final int[] f338790j;

    /* renamed from: k, reason: collision with root package name */
    public int f338791k;

    /* renamed from: l, reason: collision with root package name */
    public c f338792l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f338793m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f338794n;

    /* renamed from: o, reason: collision with root package name */
    public int f338795o;

    /* renamed from: p, reason: collision with root package name */
    public final int f338796p;

    /* renamed from: q, reason: collision with root package name */
    public final int f338797q;

    /* renamed from: r, reason: collision with root package name */
    public final int f338798r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public Boolean f338799s;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC42156l
    public final int[] f338782b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    @N
    public Bitmap.Config f338800t = Bitmap.Config.ARGB_8888;

    public f(@N a.InterfaceC10499a interfaceC10499a, c cVar, ByteBuffer byteBuffer, int i12) {
        this.f338783c = interfaceC10499a;
        this.f338792l = new c();
        synchronized (this) {
            try {
                if (i12 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i12);
                }
                int iHighestOneBit = Integer.highestOneBit(i12);
                this.f338795o = 0;
                this.f338792l = cVar;
                this.f338791k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f338784d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f338784d.order(ByteOrder.LITTLE_ENDIAN);
                this.f338794n = false;
                Iterator it = cVar.f338770e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f338761g == 3) {
                        this.f338794n = true;
                        break;
                    }
                }
                this.f338796p = iHighestOneBit;
                int i13 = cVar.f338771f;
                this.f338798r = i13 / iHighestOneBit;
                int i14 = cVar.f338772g;
                this.f338797q = i14 / iHighestOneBit;
                this.f338789i = this.f338783c.a(i13 * i14);
                this.f338790j = this.f338783c.b(this.f338798r * this.f338797q);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        this.f338791k = (this.f338791k + 1) % this.f338792l.f338768c;
    }

    public final Bitmap b() {
        Boolean bool = this.f338799s;
        Bitmap bitmapE = this.f338783c.e(this.f338798r, this.f338797q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f338800t);
        bitmapE.setHasAlpha(true);
        return bitmapE;
    }

    public final int c() {
        int i12;
        c cVar = this.f338792l;
        int i13 = cVar.f338768c;
        if (i13 <= 0 || (i12 = this.f338791k) < 0) {
            return 0;
        }
        if (i12 < 0 || i12 >= i13) {
            return -1;
        }
        return ((b) cVar.f338770e.get(i12)).f338763i;
    }

    public final void d(@N Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f338800t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap e(com.bumptech.glide.gifdecoder.b r34, com.bumptech.glide.gifdecoder.b r35) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.f.e(com.bumptech.glide.gifdecoder.b, com.bumptech.glide.gifdecoder.b):android.graphics.Bitmap");
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @P
    public final synchronized Bitmap getNextFrame() {
        try {
            if (this.f338792l.f338768c <= 0 || this.f338791k < 0) {
                if (Log.isLoggable("f", 3)) {
                    int i12 = this.f338792l.f338768c;
                }
                this.f338795o = 1;
            }
            int i13 = this.f338795o;
            if (i13 != 1 && i13 != 2) {
                this.f338795o = 0;
                if (this.f338785e == null) {
                    this.f338785e = this.f338783c.a(255);
                }
                b bVar = (b) this.f338792l.f338770e.get(this.f338791k);
                int i14 = this.f338791k - 1;
                b bVar2 = i14 >= 0 ? (b) this.f338792l.f338770e.get(i14) : null;
                int[] iArr = bVar.f338765k;
                if (iArr == null) {
                    iArr = this.f338792l.f338766a;
                }
                this.f338781a = iArr;
                if (iArr == null) {
                    Log.isLoggable("f", 3);
                    this.f338795o = 1;
                    return null;
                }
                if (bVar.f338760f) {
                    System.arraycopy(iArr, 0, this.f338782b, 0, iArr.length);
                    int[] iArr2 = this.f338782b;
                    this.f338781a = iArr2;
                    iArr2[bVar.f338762h] = 0;
                    if (bVar.f338761g == 2 && this.f338791k == 0) {
                        this.f338799s = Boolean.TRUE;
                    }
                }
                return e(bVar, bVar2);
            }
            Log.isLoggable("f", 3);
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
