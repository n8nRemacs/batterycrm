package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;

/* compiled from: IOContext.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final d f341160a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public final Object f341161b;

    /* renamed from: c, reason: collision with root package name */
    public JsonEncoding f341162c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f341163d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.core.util.a f341164e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f341165f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f341166g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f341167h;

    /* renamed from: i, reason: collision with root package name */
    public char[] f341168i;

    /* renamed from: j, reason: collision with root package name */
    public char[] f341169j;

    /* renamed from: k, reason: collision with root package name */
    public char[] f341170k;

    public f(com.fasterxml.jackson.core.util.a aVar, d dVar, boolean z12) {
        this.f341164e = aVar;
        this.f341160a = dVar;
        this.f341161b = dVar.f341156b;
        this.f341163d = z12;
    }

    public static void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public final byte[] b() {
        a(this.f341167h);
        byte[] bArrA = this.f341164e.a(3);
        this.f341167h = bArrA;
        return bArrA;
    }

    public final char[] c(int i12) {
        a(this.f341170k);
        char[] cArrB = this.f341164e.b(3, i12);
        this.f341170k = cArrB;
        return cArrB;
    }

    public final void d(byte[] bArr) {
        byte[] bArr2 = this.f341167h;
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        this.f341167h = null;
        this.f341164e.f341279a.set(3, bArr);
    }

    public final void e(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = this.f341165f;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            this.f341165f = null;
            this.f341164e.f341279a.set(0, bArr);
        }
    }
}
