package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import v61.InterfaceC49173d;

/* loaded from: classes8.dex */
public class vn extends og {

    /* renamed from: b, reason: collision with root package name */
    public final um f390950b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public ByteBuffer f390951c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f390952d;

    /* renamed from: e, reason: collision with root package name */
    public long f390953e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public ByteBuffer f390954f;

    /* renamed from: g, reason: collision with root package name */
    private final int f390955g;

    /* renamed from: h, reason: collision with root package name */
    private final int f390956h;

    public static final class a extends IllegalStateException {
        public a(int i12, int i13) {
            super(androidx.appcompat.app.r.l(i12, i13, "Buffer too small (", " < ", ")"));
        }
    }

    static {
        st.a("goog.exo.decoder");
    }

    public vn(int i12) {
        this(i12, 0);
    }

    public static vn j() {
        return new vn(0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.og
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f390951c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f390954f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f390952d = false;
    }

    @InterfaceC49173d
    public final void e(int i12) {
        ByteBuffer byteBufferAllocateDirect;
        ByteBuffer byteBufferAllocateDirect2;
        int i13 = i12 + this.f390956h;
        ByteBuffer byteBuffer = this.f390951c;
        if (byteBuffer == null) {
            int i14 = this.f390955g;
            if (i14 == 1) {
                byteBufferAllocateDirect2 = ByteBuffer.allocate(i13);
            } else {
                if (i14 != 2) {
                    throw new a(byteBuffer != null ? byteBuffer.capacity() : 0, i13);
                }
                byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i13);
            }
            this.f390951c = byteBufferAllocateDirect2;
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i15 = i13 + iPosition;
        if (iCapacity >= i15) {
            this.f390951c = byteBuffer;
            return;
        }
        int i16 = this.f390955g;
        if (i16 == 1) {
            byteBufferAllocateDirect = ByteBuffer.allocate(i15);
        } else {
            if (i16 != 2) {
                ByteBuffer byteBuffer2 = this.f390951c;
                throw new a(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i15);
            }
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(i15);
        }
        byteBufferAllocateDirect.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferAllocateDirect.put(byteBuffer);
        }
        this.f390951c = byteBufferAllocateDirect;
    }

    public final void h() {
        ByteBuffer byteBuffer = this.f390951c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f390954f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean i() {
        return c(1073741824);
    }

    public vn(int i12, int i13) {
        this.f390950b = new um();
        this.f390955g = i12;
        this.f390956h = 0;
    }
}
