package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import com.yandex.mobile.ads.impl.gt0;

/* loaded from: classes8.dex */
public final class du implements in0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final mt f384672a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final nd0 f384673b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final yh1 f384674c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final hn0 f384675d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final a f384676e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final gi1 f384677f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final vt f384678g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private yn0 f384679h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private dg1 f384680i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f384681j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f384682k;

    public du(@j.N mt mtVar, @j.N nd0 nd0Var, @j.N yh1 yh1Var) {
        this.f384672a = mtVar;
        this.f384673b = nd0Var;
        this.f384674c = yh1Var;
        a aVar = new a(this, 0);
        this.f384676e = aVar;
        mtVar.b(aVar);
        gi1 gi1Var = new gi1();
        this.f384677f = gi1Var;
        this.f384678g = new vt(aVar);
        mtVar.b(gi1Var);
        this.f384675d = new hn0();
    }

    public final boolean g() {
        return this.f384681j;
    }

    public final boolean h() {
        return ((ef) this.f384672a).b();
    }

    public final void i() {
        if (this.f384681j) {
            return;
        }
        this.f384672a.setPlayWhenReady(false);
    }

    public final void j() {
        if (!this.f384681j) {
            this.f384672a.setPlayWhenReady(true);
        }
        if (this.f384682k) {
            i();
        }
    }

    public final void k() {
        if (this.f384681j || this.f384682k) {
            return;
        }
        this.f384672a.setPlayWhenReady(true);
    }

    public final void l() {
        if (this.f384681j) {
            return;
        }
        dg1 dg1Var = this.f384680i;
        if (dg1Var != null && this.f384679h != null) {
            dg1Var.e();
        }
        this.f384681j = true;
        this.f384682k = false;
        this.f384678g.b();
        this.f384672a.setVideoTextureView(null);
        this.f384677f.a((TextureView) null);
        this.f384672a.a(this.f384676e);
        this.f384672a.a(this.f384677f);
        this.f384672a.release();
    }

    public final void a(@j.P TextureView textureView) {
        if (this.f384681j) {
            return;
        }
        this.f384677f.a(textureView);
        this.f384672a.setVideoTextureView(textureView);
    }

    public final void b() {
        this.f384682k = false;
    }

    public final long c() {
        return this.f384672a.getDuration();
    }

    public final long d() {
        return this.f384672a.getCurrentPosition();
    }

    public final float e() {
        return this.f384672a.getVolume();
    }

    public final void f() {
        if (this.f384681j) {
            return;
        }
        this.f384681j = true;
        this.f384682k = false;
        this.f384678g.b();
        this.f384672a.setVideoTextureView(null);
        this.f384677f.a((TextureView) null);
        this.f384672a.a(this.f384676e);
        this.f384672a.a(this.f384677f);
        this.f384672a.release();
    }

    public class a implements gt0.b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f384683a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f384684b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f384685c;

        private a() {
            this.f384684b = false;
            this.f384685c = false;
        }

        @Override // com.yandex.mobile.ads.impl.gt0.b
        public final void b(@j.P lt ltVar) {
            cg1 cg1Var;
            this.f384683a = false;
            du.this.f384678g.b();
            du.this.f384672a.stop();
            du.this.f384674c.a(ltVar != null ? ltVar.getMessage() : null);
            if (du.this.f384680i == null || du.this.f384679h == null) {
                return;
            }
            if (ltVar != null) {
                du.this.f384675d.getClass();
                cg1Var = hn0.a(ltVar);
            } else {
                cg1Var = new cg1(29, new op());
            }
            dg1 dg1Var = du.this.f384680i;
            sf1 unused = du.this.f384679h;
            dg1Var.a(cg1Var);
        }

        @Override // com.yandex.mobile.ads.impl.gt0.b
        public final void onIsPlayingChanged(boolean z12) {
            if (!z12) {
                if (this.f384684b) {
                    return;
                }
                this.f384685c = true;
                if (du.this.f384680i == null || du.this.f384679h == null) {
                    return;
                }
                dg1 dg1Var = du.this.f384680i;
                sf1 unused = du.this.f384679h;
                dg1Var.i();
                return;
            }
            if (!this.f384683a) {
                if (du.this.f384680i == null || du.this.f384679h == null) {
                    return;
                }
                this.f384683a = true;
                dg1 dg1Var2 = du.this.f384680i;
                sf1 unused2 = du.this.f384679h;
                dg1Var2.c();
                return;
            }
            if (this.f384685c) {
                this.f384685c = false;
                if (du.this.f384680i == null || du.this.f384679h == null) {
                    return;
                }
                dg1 dg1Var3 = du.this.f384680i;
                sf1 unused3 = du.this.f384679h;
                dg1Var3.f();
            }
        }

        @Override // com.yandex.mobile.ads.impl.gt0.b
        public final void onPlaybackStateChanged(int i12) {
            if (i12 == 3) {
                du.this.f384678g.b();
                if (du.this.f384680i != null && du.this.f384679h != null) {
                    dg1 dg1Var = du.this.f384680i;
                    sf1 unused = du.this.f384679h;
                    dg1Var.h();
                }
                if (this.f384684b) {
                    this.f384684b = false;
                    if (du.this.f384680i == null || du.this.f384679h == null) {
                        return;
                    }
                    dg1 dg1Var2 = du.this.f384680i;
                    sf1 unused2 = du.this.f384679h;
                    dg1Var2.a();
                    return;
                }
                return;
            }
            if (i12 == 2) {
                this.f384684b = true;
                if (du.this.f384680i == null || du.this.f384679h == null) {
                    return;
                }
                dg1 dg1Var3 = du.this.f384680i;
                sf1 unused3 = du.this.f384679h;
                dg1Var3.b();
                return;
            }
            if (i12 == 4) {
                this.f384683a = false;
                if (du.this.f384680i == null || du.this.f384679h == null) {
                    return;
                }
                dg1 dg1Var4 = du.this.f384680i;
                sf1 unused4 = du.this.f384679h;
                dg1Var4.d();
            }
        }

        public /* synthetic */ a(du duVar, int i12) {
            this();
        }
    }

    public final void a(float f12) {
        if (this.f384681j) {
            return;
        }
        this.f384672a.setVolume(f12);
        dg1 dg1Var = this.f384680i;
        if (dg1Var == null || this.f384679h == null) {
            return;
        }
        dg1Var.onVolumeChanged(f12);
    }

    public final void a(@j.N yn0 yn0Var) {
        this.f384679h = yn0Var;
        if (this.f384681j) {
            return;
        }
        nv0 nv0VarA = this.f384673b.a(yn0Var);
        this.f384672a.setPlayWhenReady(false);
        this.f384672a.a(nv0VarA);
        this.f384672a.prepare();
        this.f384678g.a();
    }

    public final void a() {
        this.f384682k = true;
        i();
    }

    public final void a(@j.P dg1 dg1Var) {
        this.f384680i = dg1Var;
    }

    public final void a(@j.P int i12) {
        if (this.f384681j) {
            return;
        }
        this.f384677f.b(i12);
    }
}
