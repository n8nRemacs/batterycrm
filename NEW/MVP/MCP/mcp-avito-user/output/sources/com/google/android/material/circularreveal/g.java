package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.d;
import j.InterfaceC42156l;
import j.N;
import j.P;
import vY0.C49285a;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes6.dex */
public interface g extends d.a {

    /* compiled from: CircularRevealWidget.java */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f356311b = new b();

        /* renamed from: a, reason: collision with root package name */
        public final e f356312a = new e();

        @Override // android.animation.TypeEvaluator
        @N
        public final e evaluate(float f12, @N e eVar, @N e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            float fB2 = C49285a.b(eVar3.f356315a, eVar4.f356315a, f12);
            float fB3 = C49285a.b(eVar3.f356316b, eVar4.f356316b, f12);
            float fB4 = C49285a.b(eVar3.f356317c, eVar4.f356317c, f12);
            e eVar5 = this.f356312a;
            eVar5.f356315a = fB2;
            eVar5.f356316b = fB3;
            eVar5.f356317c = fB4;
            return eVar5;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class c extends Property<g, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f356313a = new c(e.class, "circularReveal");

        @Override // android.util.Property
        @P
        public final e get(@N g gVar) {
            return gVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(@N g gVar, @P e eVar) {
            gVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class d extends Property<g, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f356314a = new d(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        @N
        public final Integer get(@N g gVar) {
            return Integer.valueOf(gVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(@N g gVar, @N Integer num) {
            gVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public float f356315a;

        /* renamed from: b, reason: collision with root package name */
        public float f356316b;

        /* renamed from: c, reason: collision with root package name */
        public float f356317c;

        public e() {
        }

        public e(float f12, float f13, float f14) {
            this.f356315a = f12;
            this.f356316b = f13;
            this.f356317c = f14;
        }
    }

    void a();

    void b();

    @InterfaceC42156l
    int getCircularRevealScrimColor();

    @P
    e getRevealInfo();

    void setCircularRevealOverlayDrawable(@P Drawable drawable);

    void setCircularRevealScrimColor(@InterfaceC42156l int i12);

    void setRevealInfo(@P e eVar);
}
