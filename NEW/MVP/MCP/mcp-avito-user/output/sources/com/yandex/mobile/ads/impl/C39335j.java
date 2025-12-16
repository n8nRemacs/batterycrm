package com.yandex.mobile.ads.impl;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.x21;
import okhttp3.internal.http2.Http2;

/* renamed from: com.yandex.mobile.ads.impl.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39335j implements ru {

    /* renamed from: a, reason: collision with root package name */
    private final C39338k f386730a = new C39338k();

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f386731b = new pr0(Http2.INITIAL_MAX_FRAME_SIZE);

    /* renamed from: c, reason: collision with root package name */
    private boolean f386732c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ru[] a() {
        return new ru[]{new C39335j()};
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        to toVar;
        int i12;
        pr0 pr0Var = new pr0(10);
        int i13 = 0;
        while (true) {
            toVar = (to) suVar;
            toVar.b(pr0Var.c(), 0, 10, false);
            pr0Var.e(0);
            if (pr0Var.w() != 4801587) {
                break;
            }
            pr0Var.f(3);
            int iS2 = pr0Var.s();
            i13 += iS2 + 10;
            toVar.a(false, iS2);
        }
        toVar.c();
        toVar.a(false, i13);
        int i14 = 0;
        int i15 = i13;
        while (true) {
            int i16 = 7;
            toVar.b(pr0Var.c(), 0, 7, false);
            pr0Var.e(0);
            int iZ2 = pr0Var.z();
            if (iZ2 == 44096 || iZ2 == 44097) {
                i14++;
                if (i14 >= 4) {
                    return true;
                }
                byte[] bArrC = pr0Var.c();
                if (bArrC.length < 7) {
                    i12 = -1;
                } else {
                    int i17 = ((bArrC[2] & 255) << 8) | (bArrC[3] & 255);
                    if (i17 == 65535) {
                        i17 = ((bArrC[4] & 255) << 16) | ((bArrC[5] & 255) << 8) | (bArrC[6] & 255);
                    } else {
                        i16 = 4;
                    }
                    if (iZ2 == 44097) {
                        i16 += 2;
                    }
                    i12 = i17 + i16;
                }
                if (i12 == -1) {
                    return false;
                }
                toVar.a(false, i12 - 7);
            } else {
                toVar.c();
                i15++;
                if (i15 - i13 >= 8192) {
                    return false;
                }
                toVar.a(false, i15);
                i14 = 0;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f386730a.a(tuVar, new fb1.d(BeduinInputModel.MIN_TEXT_VERSION, 0, 1));
        tuVar.a();
        tuVar.a(new x21.b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        this.f386732c = false;
        this.f386730a.a();
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final int a(su suVar, fu0 fu0Var) {
        int i12 = ((to) suVar).read(this.f386731b.c(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (i12 == -1) {
            return -1;
        }
        this.f386731b.e(0);
        this.f386731b.d(i12);
        if (!this.f386732c) {
            this.f386730a.a(4, 0L);
            this.f386732c = true;
        }
        this.f386730a.a(this.f386731b);
        return 0;
    }
}
