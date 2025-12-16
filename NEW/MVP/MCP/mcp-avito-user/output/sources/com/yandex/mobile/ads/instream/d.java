package com.yandex.mobile.ads.instream;

import com.yandex.mobile.ads.impl.li1;
import com.yandex.mobile.ads.impl.n6;
import com.yandex.mobile.ads.impl.th1;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class d implements VideoPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final e f392498a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final li1 f392499b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final b f392500c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private th1 f392501d;

    public d(@N e eVar, @N b bVar) {
        this.f392498a = eVar;
        this.f392499b = eVar.a();
        this.f392500c = bVar;
    }

    public final void a(@P th1 th1Var) {
        this.f392501d = th1Var;
    }

    public final void b() {
        int iA2 = n6.a(this.f392499b.a());
        if (iA2 == 1 || iA2 == 2 || iA2 == 3 || iA2 == 4 || iA2 == 6 || iA2 == 7) {
            this.f392499b.a(1);
            th1 th1Var = this.f392501d;
            if (th1Var != null) {
                th1Var.a();
            }
        }
    }

    public final void c() {
        int iA2 = n6.a(this.f392499b.a());
        if (iA2 == 2 || iA2 == 3) {
            this.f392498a.d();
        }
    }

    public final void d() {
        this.f392499b.a(2);
        this.f392498a.e();
    }

    public final void e() {
        int iA2 = n6.a(this.f392499b.a());
        if (iA2 == 2 || iA2 == 6) {
            this.f392498a.f();
        }
    }

    public final void f() {
        int iA2 = n6.a(this.f392499b.a());
        if (iA2 == 1) {
            this.f392499b.a(1);
        } else if (iA2 == 2 || iA2 == 3 || iA2 == 6) {
            this.f392499b.a(5);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        this.f392499b.a(6);
        th1 th1Var = this.f392501d;
        if (th1Var != null) {
            th1Var.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        this.f392499b.a(8);
        th1 th1Var = this.f392501d;
        if (th1Var != null) {
            th1Var.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        this.f392499b.a(7);
        th1 th1Var = this.f392501d;
        if (th1Var != null) {
            th1Var.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        if (n6.a(2, this.f392499b.a())) {
            this.f392499b.a(3);
            this.f392500c.f();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        this.f392499b.a(4);
        th1 th1Var = this.f392501d;
        if (th1Var != null) {
            th1Var.onVideoResumed();
        }
    }

    public final void a() {
        int iA2 = n6.a(this.f392499b.a());
        if (iA2 == 0) {
            this.f392500c.g();
            return;
        }
        if (iA2 == 7) {
            this.f392500c.e();
            return;
        }
        if (iA2 == 4) {
            this.f392498a.d();
            this.f392500c.i();
        } else {
            if (iA2 != 5) {
                return;
            }
            this.f392500c.b();
        }
    }
}
