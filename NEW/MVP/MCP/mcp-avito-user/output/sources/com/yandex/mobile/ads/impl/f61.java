package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oc;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes8.dex */
public final class f61 implements oc {

    /* renamed from: b, reason: collision with root package name */
    private int f385193b;

    /* renamed from: c, reason: collision with root package name */
    private float f385194c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f385195d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private oc.a f385196e;

    /* renamed from: f, reason: collision with root package name */
    private oc.a f385197f;

    /* renamed from: g, reason: collision with root package name */
    private oc.a f385198g;

    /* renamed from: h, reason: collision with root package name */
    private oc.a f385199h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f385200i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private e61 f385201j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f385202k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f385203l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f385204m;

    /* renamed from: n, reason: collision with root package name */
    private long f385205n;

    /* renamed from: o, reason: collision with root package name */
    private long f385206o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f385207p;

    public f61() {
        oc.a aVar = oc.a.f388485e;
        this.f385196e = aVar;
        this.f385197f = aVar;
        this.f385198g = aVar;
        this.f385199h = aVar;
        ByteBuffer byteBuffer = oc.f388484a;
        this.f385202k = byteBuffer;
        this.f385203l = byteBuffer.asShortBuffer();
        this.f385204m = byteBuffer;
        this.f385193b = -1;
    }

    public final void a(float f12) {
        if (this.f385195d != f12) {
            this.f385195d = f12;
            this.f385200i = true;
        }
    }

    public final void b(float f12) {
        if (this.f385194c != f12) {
            this.f385194c = f12;
            this.f385200i = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final void c() {
        e61 e61Var = this.f385201j;
        if (e61Var != null) {
            e61Var.e();
        }
        this.f385207p = true;
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final boolean d() {
        return this.f385197f.f388486a != -1 && (Math.abs(this.f385194c - 1.0f) >= 1.0E-4f || Math.abs(this.f385195d - 1.0f) >= 1.0E-4f || this.f385197f.f388486a != this.f385196e.f388486a);
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final void flush() {
        if (d()) {
            oc.a aVar = this.f385196e;
            this.f385198g = aVar;
            oc.a aVar2 = this.f385197f;
            this.f385199h = aVar2;
            if (this.f385200i) {
                this.f385201j = new e61(aVar.f388486a, aVar.f388487b, this.f385194c, this.f385195d, aVar2.f388486a);
            } else {
                e61 e61Var = this.f385201j;
                if (e61Var != null) {
                    e61Var.a();
                }
            }
        }
        this.f385204m = oc.f388484a;
        this.f385205n = 0L;
        this.f385206o = 0L;
        this.f385207p = false;
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final void reset() {
        this.f385194c = 1.0f;
        this.f385195d = 1.0f;
        oc.a aVar = oc.a.f388485e;
        this.f385196e = aVar;
        this.f385197f = aVar;
        this.f385198g = aVar;
        this.f385199h = aVar;
        ByteBuffer byteBuffer = oc.f388484a;
        this.f385202k = byteBuffer;
        this.f385203l = byteBuffer.asShortBuffer();
        this.f385204m = byteBuffer;
        this.f385193b = -1;
        this.f385200i = false;
        this.f385201j = null;
        this.f385205n = 0L;
        this.f385206o = 0L;
        this.f385207p = false;
    }

    public final long a(long j12) {
        if (this.f385206o >= 1024) {
            long j13 = this.f385205n;
            this.f385201j.getClass();
            long jC2 = j13 - r3.c();
            int i12 = this.f385199h.f388486a;
            int i13 = this.f385198g.f388486a;
            if (i12 == i13) {
                return pc1.a(j12, jC2, this.f385206o);
            }
            return pc1.a(j12, jC2 * i12, this.f385206o * i13);
        }
        return (long) (this.f385194c * j12);
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final ByteBuffer b() {
        int iB2;
        e61 e61Var = this.f385201j;
        if (e61Var != null && (iB2 = e61Var.b()) > 0) {
            if (this.f385202k.capacity() < iB2) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iB2).order(ByteOrder.nativeOrder());
                this.f385202k = byteBufferOrder;
                this.f385203l = byteBufferOrder.asShortBuffer();
            } else {
                this.f385202k.clear();
                this.f385203l.clear();
            }
            e61Var.a(this.f385203l);
            this.f385206o += iB2;
            this.f385202k.limit(iB2);
            this.f385204m = this.f385202k;
        }
        ByteBuffer byteBuffer = this.f385204m;
        this.f385204m = oc.f388484a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final oc.a a(oc.a aVar) throws oc.b {
        if (aVar.f388488c == 2) {
            int i12 = this.f385193b;
            if (i12 == -1) {
                i12 = aVar.f388486a;
            }
            this.f385196e = aVar;
            oc.a aVar2 = new oc.a(i12, aVar.f388487b, 2);
            this.f385197f = aVar2;
            this.f385200i = true;
            return aVar2;
        }
        throw new oc.b(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            e61 e61Var = this.f385201j;
            e61Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f385205n += iRemaining;
            e61Var.b(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final boolean a() {
        e61 e61Var;
        return this.f385207p && ((e61Var = this.f385201j) == null || e61Var.b() == 0);
    }
}
