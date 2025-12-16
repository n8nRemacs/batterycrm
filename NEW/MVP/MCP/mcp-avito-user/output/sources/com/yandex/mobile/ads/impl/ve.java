package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oc;
import j.InterfaceC42153i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes8.dex */
public abstract class ve implements oc {

    /* renamed from: b, reason: collision with root package name */
    protected oc.a f390850b;

    /* renamed from: c, reason: collision with root package name */
    protected oc.a f390851c;

    /* renamed from: d, reason: collision with root package name */
    private oc.a f390852d;

    /* renamed from: e, reason: collision with root package name */
    private oc.a f390853e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f390854f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f390855g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f390856h;

    public ve() {
        ByteBuffer byteBuffer = oc.f388484a;
        this.f390854f = byteBuffer;
        this.f390855g = byteBuffer;
        oc.a aVar = oc.a.f388485e;
        this.f390852d = aVar;
        this.f390853e = aVar;
        this.f390850b = aVar;
        this.f390851c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final oc.a a(oc.a aVar) {
        this.f390852d = aVar;
        this.f390853e = b(aVar);
        return d() ? this.f390853e : oc.a.f388485e;
    }

    public abstract oc.a b(oc.a aVar);

    @Override // com.yandex.mobile.ads.impl.oc
    @InterfaceC42153i
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f390855g;
        this.f390855g = oc.f388484a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final void c() {
        this.f390856h = true;
        g();
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public boolean d() {
        return this.f390853e != oc.a.f388485e;
    }

    public final boolean e() {
        return this.f390855g.hasRemaining();
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final void flush() {
        this.f390855g = oc.f388484a;
        this.f390856h = false;
        this.f390850b = this.f390852d;
        this.f390851c = this.f390853e;
        f();
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final void reset() {
        flush();
        this.f390854f = oc.f388484a;
        oc.a aVar = oc.a.f388485e;
        this.f390852d = aVar;
        this.f390853e = aVar;
        this.f390850b = aVar;
        this.f390851c = aVar;
        h();
    }

    @Override // com.yandex.mobile.ads.impl.oc
    @InterfaceC42153i
    public boolean a() {
        return this.f390856h && this.f390855g == oc.f388484a;
    }

    public final ByteBuffer a(int i12) {
        if (this.f390854f.capacity() < i12) {
            this.f390854f = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
        } else {
            this.f390854f.clear();
        }
        ByteBuffer byteBuffer = this.f390854f;
        this.f390855g = byteBuffer;
        return byteBuffer;
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }
}
