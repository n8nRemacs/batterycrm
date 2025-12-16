package com.yandex.mobile.ads.impl;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.x21;

/* renamed from: com.yandex.mobile.ads.impl.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39325g implements ru {

    /* renamed from: a, reason: collision with root package name */
    private final C39329h f385539a = new C39329h();

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f385540b = new pr0(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f385541c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ru[] a() {
        return new ru[]{new C39325g()};
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        to toVar;
        pr0 pr0Var = new pr0(10);
        int i12 = 0;
        while (true) {
            toVar = (to) suVar;
            toVar.b(pr0Var.c(), 0, 10, false);
            pr0Var.e(0);
            if (pr0Var.w() != 4801587) {
                break;
            }
            pr0Var.f(3);
            int iS2 = pr0Var.s();
            i12 += iS2 + 10;
            toVar.a(false, iS2);
        }
        toVar.c();
        toVar.a(false, i12);
        int i13 = 0;
        int i14 = i12;
        while (true) {
            toVar.b(pr0Var.c(), 0, 6, false);
            pr0Var.e(0);
            if (pr0Var.z() != 2935) {
                toVar.c();
                i14++;
                if (i14 - i12 >= 8192) {
                    return false;
                }
                toVar.a(false, i14);
                i13 = 0;
            } else {
                i13++;
                if (i13 >= 4) {
                    return true;
                }
                int iA2 = C39332i.a(pr0Var.c());
                if (iA2 == -1) {
                    return false;
                }
                toVar.a(false, iA2 - 6);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f385539a.a(tuVar, new fb1.d(BeduinInputModel.MIN_TEXT_VERSION, 0, 1));
        tuVar.a();
        tuVar.a(new x21.b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        this.f385541c = false;
        this.f385539a.a();
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final int a(su suVar, fu0 fu0Var) {
        int i12 = ((to) suVar).read(this.f385540b.c(), 0, 2786);
        if (i12 == -1) {
            return -1;
        }
        this.f385540b.e(0);
        this.f385540b.d(i12);
        if (!this.f385541c) {
            this.f385539a.a(4, 0L);
            this.f385541c = true;
        }
        this.f385539a.a(this.f385540b);
        return 0;
    }
}
