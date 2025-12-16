package com.bumptech.glide.gifdecoder;

import android.util.Log;
import j.N;
import j.P;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: GifHeaderParser.java */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f338778b;

    /* renamed from: c, reason: collision with root package name */
    public c f338779c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f338777a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f338780d = 0;

    public final boolean a() {
        return this.f338779c.f338767b != 0;
    }

    @N
    public final c b() {
        byte[] bArr;
        if (this.f338778b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f338779c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < 6; i12++) {
            sb2.append((char) c());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f338779c.f338771f = this.f338778b.getShort();
            this.f338779c.f338772g = this.f338778b.getShort();
            int iC2 = c();
            c cVar = this.f338779c;
            cVar.f338773h = (iC2 & 128) != 0;
            cVar.f338774i = (int) Math.pow(2.0d, (iC2 & 7) + 1);
            this.f338779c.f338775j = c();
            c cVar2 = this.f338779c;
            c();
            cVar2.getClass();
            if (this.f338779c.f338773h && !a()) {
                c cVar3 = this.f338779c;
                cVar3.f338766a = e(cVar3.f338774i);
                c cVar4 = this.f338779c;
                cVar4.f338776k = cVar4.f338766a[cVar4.f338775j];
            }
        } else {
            this.f338779c.f338767b = 1;
        }
        if (!a()) {
            boolean z12 = false;
            while (!z12 && !a() && this.f338779c.f338768c <= Integer.MAX_VALUE) {
                int iC3 = c();
                if (iC3 == 33) {
                    int iC4 = c();
                    if (iC4 == 1) {
                        f();
                    } else if (iC4 == 249) {
                        this.f338779c.f338769d = new b();
                        c();
                        int iC5 = c();
                        b bVar = this.f338779c.f338769d;
                        int i13 = (iC5 & 28) >> 2;
                        bVar.f338761g = i13;
                        if (i13 == 0) {
                            bVar.f338761g = 1;
                        }
                        bVar.f338760f = (iC5 & 1) != 0;
                        short s5 = this.f338778b.getShort();
                        if (s5 < 2) {
                            s5 = 10;
                        }
                        b bVar2 = this.f338779c.f338769d;
                        bVar2.f338763i = s5 * 10;
                        bVar2.f338762h = c();
                        c();
                    } else if (iC4 == 254) {
                        f();
                    } else if (iC4 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb3 = new StringBuilder();
                        int i14 = 0;
                        while (true) {
                            bArr = this.f338777a;
                            if (i14 >= 11) {
                                break;
                            }
                            sb3.append((char) bArr[i14]);
                            i14++;
                        }
                        if (sb3.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b12 = bArr[1];
                                    byte b13 = bArr[2];
                                    this.f338779c.getClass();
                                }
                                if (this.f338780d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC3 == 44) {
                    c cVar5 = this.f338779c;
                    if (cVar5.f338769d == null) {
                        cVar5.f338769d = new b();
                    }
                    this.f338779c.f338769d.f338755a = this.f338778b.getShort();
                    this.f338779c.f338769d.f338756b = this.f338778b.getShort();
                    this.f338779c.f338769d.f338757c = this.f338778b.getShort();
                    this.f338779c.f338769d.f338758d = this.f338778b.getShort();
                    int iC6 = c();
                    boolean z13 = (iC6 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC6 & 7) + 1);
                    b bVar3 = this.f338779c.f338769d;
                    bVar3.f338759e = (iC6 & 64) != 0;
                    if (z13) {
                        bVar3.f338765k = e(iPow);
                    } else {
                        bVar3.f338765k = null;
                    }
                    this.f338779c.f338769d.f338764j = this.f338778b.position();
                    c();
                    f();
                    if (!a()) {
                        c cVar6 = this.f338779c;
                        cVar6.f338768c++;
                        cVar6.f338770e.add(cVar6.f338769d);
                    }
                } else if (iC3 != 59) {
                    this.f338779c.f338767b = 1;
                } else {
                    z12 = true;
                }
            }
            c cVar7 = this.f338779c;
            if (cVar7.f338768c < 0) {
                cVar7.f338767b = 1;
            }
        }
        return this.f338779c;
    }

    public final int c() {
        try {
            return this.f338778b.get() & 255;
        } catch (Exception unused) {
            this.f338779c.f338767b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC2 = c();
        this.f338780d = iC2;
        if (iC2 <= 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            try {
                int i13 = this.f338780d;
                if (i12 >= i13) {
                    return;
                }
                int i14 = i13 - i12;
                this.f338778b.get(this.f338777a, i12, i14);
                i12 += i14;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f338779c.f338767b = 1;
                return;
            }
        }
    }

    @P
    public final int[] e(int i12) {
        byte[] bArr = new byte[i12 * 3];
        int[] iArr = null;
        try {
            this.f338778b.get(bArr);
            iArr = new int[256];
            int i13 = 0;
            int i14 = 0;
            while (i13 < i12) {
                int i15 = bArr[i14] & 255;
                int i16 = i14 + 2;
                int i17 = bArr[i14 + 1] & 255;
                i14 += 3;
                int i18 = i13 + 1;
                iArr[i13] = (i17 << 8) | (i15 << 16) | (-16777216) | (bArr[i16] & 255);
                i13 = i18;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f338779c.f338767b = 1;
        }
        return iArr;
    }

    public final void f() {
        int iC2;
        do {
            iC2 = c();
            this.f338778b.position(Math.min(this.f338778b.position() + iC2, this.f338778b.limit()));
        } while (iC2 > 0);
    }
}
