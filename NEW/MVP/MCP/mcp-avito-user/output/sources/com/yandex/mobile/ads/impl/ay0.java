package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes8.dex */
public final class ay0 {

    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final ho0 f383689b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final dy0 f383690c;

        public a(@j.N ho0 ho0Var, @j.N dy0 dy0Var) {
            this.f383689b = ho0Var;
            this.f383690c = dy0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f383689b.c().setVisibility(4);
            this.f383690c.a().setVisibility(0);
        }
    }

    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final dy0 f383691b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final Bitmap f383692c;

        public b(@j.N dy0 dy0Var, @j.N Bitmap bitmap) {
            this.f383691b = dy0Var;
            this.f383692c = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f383691b.setBackground(new BitmapDrawable(this.f383691b.getResources(), this.f383692c));
            this.f383691b.setVisibility(0);
        }
    }

    public static void a(@j.N ho0 ho0Var, @j.N dy0 dy0Var, @j.N Bitmap bitmap) {
        dy0Var.setAlpha(0.0f);
        dy0Var.animate().alpha(1.0f).setDuration(700L).withStartAction(new b(dy0Var, bitmap)).withEndAction(new a(ho0Var, dy0Var)).start();
    }
}
