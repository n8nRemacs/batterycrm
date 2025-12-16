package com.yandex.mobile.ads.impl;

import android.view.TextureView;

/* loaded from: classes8.dex */
public final class ai1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final jo0 f383573a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final xu0 f383574b;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final ho0 f383575b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final jo0 f383576c;

        public a(@j.N ho0 ho0Var, @j.N jo0 jo0Var) {
            this.f383575b = ho0Var;
            this.f383576c = jo0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f383576c.a(this.f383575b.a().a());
        }
    }

    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final ho0 f383577b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final xu0 f383578c;

        public b(@j.N ho0 ho0Var, @j.N xu0 xu0Var) {
            this.f383577b = ho0Var;
            this.f383578c = xu0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            rh1 rh1VarB = this.f383577b.b();
            this.f383578c.getClass();
            rh1VarB.a().setVisibility(8);
            this.f383577b.c().setVisibility(0);
        }
    }

    public ai1(@j.N jo0 jo0Var, @j.N xu0 xu0Var) {
        this.f383573a = jo0Var;
        this.f383574b = xu0Var;
    }

    public final void a(@j.N ho0 ho0Var) {
        TextureView textureViewC = ho0Var.c();
        textureViewC.setAlpha(0.0f);
        textureViewC.animate().setDuration(500L).alpha(1.0f).withStartAction(new b(ho0Var, this.f383574b)).withEndAction(new a(ho0Var, this.f383573a)).start();
    }
}
