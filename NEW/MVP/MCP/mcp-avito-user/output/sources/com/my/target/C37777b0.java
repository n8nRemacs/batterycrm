package com.my.target;

import android.view.View;
import e11.C39855b1;
import e11.C39907t0;
import e11.C39913v0;
import e11.W1;
import e11.e2;
import e11.k2;
import j11.InterfaceC42177b;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.b0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37777b0 implements InterfaceC42177b.a {

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public C39855b1 f364713d;

    /* renamed from: e, reason: collision with root package name */
    public int f364714e = 0;

    /* renamed from: f, reason: collision with root package name */
    public float f364715f = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final W1 f364710a = new W1(200);

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final r1 f364711b = new r1(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f f364712c = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 24);

    /* renamed from: com.my.target.b0$a */
    public interface a {
    }

    @Override // j11.InterfaceC42177b.a
    public final void a() {
        if (g(6)) {
            this.f364711b.g();
            this.f364710a.b(this.f364712c);
            i();
        }
    }

    @Override // j11.InterfaceC42177b.a
    public final void b() {
        if (g(3)) {
            this.f364711b.f();
            this.f364710a.b(this.f364712c);
        }
    }

    @Override // j11.InterfaceC42177b.a
    public final void c() {
        if (g(4)) {
            h();
            this.f364710a.b(this.f364712c);
            i();
        }
    }

    @Override // j11.InterfaceC42177b.a
    public final void d() {
        if (g(2)) {
            this.f364710a.a(this.f364712c);
        }
    }

    @Override // j11.InterfaceC42177b.a
    public final void e() {
        if (g(5)) {
            r1 r1Var = this.f364711b;
            if (!r1Var.c()) {
                k2.a(r1Var.f365126e, r1Var.f365125d.e("playbackStopped"));
            }
            this.f364710a.b(this.f364712c);
            i();
        }
    }

    @Override // j11.InterfaceC42177b.a
    public final void f() {
        if (g(2)) {
            this.f364711b.i();
            this.f364710a.a(this.f364712c);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r6) {
        /*
            r5 = this;
            int r0 = r5.f364714e
            r1 = 0
            if (r6 == r0) goto L25
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r6) {
                case 0: goto L25;
                case 1: goto L24;
                case 2: goto L20;
                case 3: goto L1b;
                case 4: goto L13;
                case 5: goto Lc;
                case 6: goto L24;
                default: goto Lb;
            }
        Lb:
            goto L25
        Lc:
            if (r0 == r4) goto L24
            if (r0 == r3) goto L24
            if (r0 != r2) goto L25
            goto L24
        L13:
            if (r0 == r4) goto L24
            if (r0 == r3) goto L24
            r2 = 5
            if (r0 != r2) goto L25
            goto L24
        L1b:
            if (r0 == r4) goto L24
            if (r0 != r3) goto L25
            goto L24
        L20:
            if (r0 == r4) goto L24
            if (r0 != r2) goto L25
        L24:
            r1 = r4
        L25:
            if (r1 == 0) goto L29
            r5.f364714e = r6
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.C37777b0.g(int):boolean");
    }

    public final void h() {
        this.f364710a.b(this.f364712c);
    }

    @j.P
    public final C39913v0<com.my.target.common.models.e> i() {
        C39855b1 c39855b1 = this.f364713d;
        if (c39855b1 != null) {
            WeakReference<View> weakReference = c39855b1.f394538c;
            if (weakReference != null) {
                weakReference.clear();
            }
            c39855b1.f394537b.clear();
            c39855b1.f394536a.clear();
            c39855b1.f394538c = null;
            this.f364713d = null;
        }
        return null;
    }

    @Override // j11.InterfaceC42177b.a
    public final void onVolumeChanged(float f12) {
        e2 e2Var;
        String str;
        float f13 = this.f364715f;
        int iA2 = C39907t0.a(f13, f12);
        r1 r1Var = this.f364711b;
        if (iA2 == 0) {
            r1Var.getClass();
        } else {
            if (!r1Var.c()) {
                if (C39907t0.a(0.0f, f13) == 0) {
                    e2Var = r1Var.f365125d;
                    str = "volumeOn";
                } else if (C39907t0.a(0.0f, f12) == 0) {
                    e2Var = r1Var.f365125d;
                    str = "volumeOff";
                }
                k2.a(r1Var.f365126e, e2Var.e(str));
            }
            Y0 y02 = r1Var.f365123b;
            if (y02 != null && y02.f364666h != null && C39907t0.a(f12, y02.f364663e) != 0) {
                y02.f364663e = f12;
                try {
                    y02.f364666h.volumeChange(f12);
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.f364715f = f12;
    }
}
