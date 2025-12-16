package com.yandex.mobile.ads.impl;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class nf extends vn {

    /* renamed from: i, reason: collision with root package name */
    private long f388262i;

    /* renamed from: j, reason: collision with root package name */
    private int f388263j;

    /* renamed from: k, reason: collision with root package name */
    private int f388264k;

    public nf() {
        super(2);
        this.f388264k = 32;
    }

    public final boolean a(vn vnVar) {
        ByteBuffer byteBuffer;
        db.a(!vnVar.i());
        db.a(!vnVar.d());
        db.a(!vnVar.f());
        if (m()) {
            if (this.f388263j >= this.f388264k || vnVar.e() != e()) {
                return false;
            }
            ByteBuffer byteBuffer2 = vnVar.f390951c;
            if (byteBuffer2 != null && (byteBuffer = this.f390951c) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i12 = this.f388263j;
        this.f388263j = i12 + 1;
        if (i12 == 0) {
            this.f390953e = vnVar.f390953e;
            if (vnVar.g()) {
                d(1);
            }
        }
        if (vnVar.e()) {
            d(BeduinInputModel.MIN_TEXT_VERSION);
        }
        ByteBuffer byteBuffer3 = vnVar.f390951c;
        if (byteBuffer3 != null) {
            e(byteBuffer3.remaining());
            this.f390951c.put(byteBuffer3);
        }
        this.f388262i = vnVar.f390953e;
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.vn, com.yandex.mobile.ads.impl.og
    public final void b() {
        super.b();
        this.f388263j = 0;
    }

    public final void f(@j.F int i12) {
        db.a(i12 > 0);
        this.f388264k = i12;
    }

    public final long k() {
        return this.f388262i;
    }

    public final int l() {
        return this.f388263j;
    }

    public final boolean m() {
        return this.f388263j > 0;
    }
}
