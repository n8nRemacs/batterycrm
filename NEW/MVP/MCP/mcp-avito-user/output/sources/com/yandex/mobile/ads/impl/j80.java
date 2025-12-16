package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.mp4.MotionPhotoMetadata;

/* loaded from: classes8.dex */
public final class j80 implements ru {

    /* renamed from: b, reason: collision with root package name */
    private tu f386779b;

    /* renamed from: c, reason: collision with root package name */
    private int f386780c;

    /* renamed from: d, reason: collision with root package name */
    private int f386781d;

    /* renamed from: e, reason: collision with root package name */
    private int f386782e;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private MotionPhotoMetadata f386784g;

    /* renamed from: h, reason: collision with root package name */
    private su f386785h;

    /* renamed from: i, reason: collision with root package name */
    private y61 f386786i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private kh0 f386787j;

    /* renamed from: a, reason: collision with root package name */
    private final pr0 f386778a = new pr0(6);

    /* renamed from: f, reason: collision with root package name */
    private long f386783f = -1;

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        to toVar = (to) suVar;
        this.f386778a.c(2);
        toVar.b(this.f386778a.c(), 0, 2, false);
        if (this.f386778a.z() != 65496) {
            return false;
        }
        this.f386778a.c(2);
        toVar.b(this.f386778a.c(), 0, 2, false);
        int iZ2 = this.f386778a.z();
        this.f386781d = iZ2;
        if (iZ2 == 65504) {
            this.f386778a.c(2);
            toVar.b(this.f386778a.c(), 0, 2, false);
            toVar.a(false, this.f386778a.z() - 2);
            this.f386778a.c(2);
            toVar.b(this.f386778a.c(), 0, 2, false);
            this.f386781d = this.f386778a.z();
        }
        if (this.f386781d != 65505) {
            return false;
        }
        toVar.a(false, 2);
        this.f386778a.c(6);
        toVar.b(this.f386778a.c(), 0, 6, false);
        return this.f386778a.v() == 1165519206 && this.f386778a.z() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f386779b = tuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    @Override // com.yandex.mobile.ads.impl.ru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.yandex.mobile.ads.impl.su r32, com.yandex.mobile.ads.impl.fu0 r33) throws com.yandex.mobile.ads.impl.tr0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.j80.a(com.yandex.mobile.ads.impl.su, com.yandex.mobile.ads.impl.fu0):int");
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        if (j12 == 0) {
            this.f386780c = 0;
            this.f386787j = null;
        } else if (this.f386780c == 5) {
            kh0 kh0Var = this.f386787j;
            kh0Var.getClass();
            kh0Var.a(j12, j13);
        }
    }
}
