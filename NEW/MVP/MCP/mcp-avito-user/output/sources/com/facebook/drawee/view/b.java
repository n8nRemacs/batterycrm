package com.facebook.drawee.view;

import I41.h;
import IW0.b;
import com.facebook.common.internal.n;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.drawable.w;

/* compiled from: DraweeHolder.java */
/* loaded from: classes10.dex */
public class b<DH extends IW0.b> implements w {

    /* renamed from: d, reason: collision with root package name */
    @h
    public DH f340169d;

    /* renamed from: f, reason: collision with root package name */
    public final DraweeEventTracker f340171f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f340166a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f340167b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f340168c = true;

    /* renamed from: e, reason: collision with root package name */
    public IW0.a f340170e = null;

    public b() {
        this.f340171f = DraweeEventTracker.f339951c ? new DraweeEventTracker() : DraweeEventTracker.f339950b;
    }

    public final void a() {
        if (this.f340166a) {
            return;
        }
        this.f340171f.a(DraweeEventTracker.Event.f339959h);
        this.f340166a = true;
        IW0.a aVar = this.f340170e;
        if (aVar == null || aVar.j2() == null) {
            return;
        }
        this.f340170e.h2();
    }

    public final void b() {
        if (this.f340167b && this.f340168c) {
            a();
            return;
        }
        if (this.f340166a) {
            this.f340171f.a(DraweeEventTracker.Event.f339960i);
            this.f340166a = false;
            if (c()) {
                this.f340170e.f2();
            }
        }
    }

    public final boolean c() {
        IW0.a aVar = this.f340170e;
        return aVar != null && aVar.j2() == this.f340169d;
    }

    public final void d(boolean z12) {
        if (this.f340168c == z12) {
            return;
        }
        this.f340171f.a(z12 ? DraweeEventTracker.Event.f339969r : DraweeEventTracker.Event.f339970s);
        this.f340168c = z12;
        b();
    }

    public final void e(@h IW0.a aVar) {
        boolean z12 = this.f340166a;
        DraweeEventTracker draweeEventTracker = this.f340171f;
        if (z12 && z12) {
            draweeEventTracker.a(DraweeEventTracker.Event.f339960i);
            this.f340166a = false;
            if (c()) {
                this.f340170e.f2();
            }
        }
        if (c()) {
            draweeEventTracker.a(DraweeEventTracker.Event.f339956e);
            this.f340170e.i2(null);
        }
        this.f340170e = aVar;
        if (aVar != null) {
            draweeEventTracker.a(DraweeEventTracker.Event.f339955d);
            this.f340170e.i2(this.f340169d);
        } else {
            draweeEventTracker.a(DraweeEventTracker.Event.f339957f);
        }
        if (z12) {
            a();
        }
    }

    public final String toString() {
        n.b bVarB = n.b(this);
        bVarB.a("controllerAttached", this.f340166a);
        bVarB.a("holderAttached", this.f340167b);
        bVarB.a("drawableVisible", this.f340168c);
        bVarB.b(this.f340171f.f339952a.toString(), "events");
        return bVarB.toString();
    }
}
