package com.my.target;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import e11.AbstractC39860d0;
import e11.C39846A;
import e11.C39857c0;
import e11.C39894o1;
import e11.C39900q1;
import e11.C39924z;
import e11.E0;
import e11.S1;
import e11.Y1;
import e11.m2;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class T extends AbstractC39860d0 {

    /* renamed from: o, reason: collision with root package name */
    @j.N
    public static final T f364598o = new T();

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public p1 f364610m;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final Y1 f364599b = new Y1();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C37800n f364600c = new C37800n();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final e11.N f364601d = new e11.N();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final e11.V0 f364602e = new e11.V0();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C39894o1 f364603f = new C39894o1();

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final S1 f364604g = new S1();

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final C39857c0 f364605h = new C39857c0();

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final e11.H f364606i = new e11.H();

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final C39846A f364607j = new C39846A();

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final C39900q1 f364608k = new C39900q1();

    /* renamed from: l, reason: collision with root package name */
    @j.N
    public final e11.E0 f364609l = new e11.E0();

    /* renamed from: n, reason: collision with root package name */
    public boolean f364611n = true;

    public final long g(int i12, long j12) {
        if (this.f364610m == null) {
            return 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f364610m.a(i12, jCurrentTimeMillis - j12);
        return jCurrentTimeMillis;
    }

    @j.l0
    public final synchronized void h(@j.N Context context) {
        try {
            if (m2.b()) {
                return;
            }
            e();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f364599b.g(context);
            g(23, jCurrentTimeMillis);
            this.f364600c.h(context);
            long jG2 = g(10, jCurrentTimeMillis);
            C39900q1 c39900q1 = this.f364608k;
            synchronized (c39900q1) {
                try {
                    Point pointK = C39924z.k(context);
                    int i12 = pointK.x;
                    int i13 = pointK.y;
                    if (i12 != 0 && i13 != 0) {
                        c39900q1.a("vpw", String.valueOf(i12));
                        c39900q1.a("vph", String.valueOf(i13));
                    }
                } finally {
                }
            }
            g(21, jG2);
            this.f364607j.g(context);
            long jG3 = g(16, jG2);
            e11.E0 e02 = this.f364609l;
            e02.getClass();
            String str = E0.a.f394329a;
            if (str != null) {
                e02.a("mtr_id", str);
            }
            g(22, jG3);
            if (this.f364611n) {
                e11.N n12 = this.f364601d;
                n12.getClass();
                m2.c(new com.vk.id.captcha.web.h(14, n12, context));
                long jG4 = g(15, jG3);
                this.f364602e.h(context);
                long jG5 = g(11, jG4);
                this.f364603f.g(context);
                long jG6 = g(14, jG5);
                this.f364604g.h(context);
                long jG7 = g(13, jG6);
                this.f364606i.g(context);
                long jG8 = g(17, jG7);
                C39857c0 c39857c0 = this.f364605h;
                c39857c0.getClass();
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                c39857c0.a("isc", (uiModeManager == null || uiModeManager.getCurrentModeType() != 3) ? null : "1");
                g(18, jG8);
            }
            this.f364610m = null;
            synchronized (this) {
                HashMap map = this.f394564a;
                this.f364599b.d(map);
                this.f364600c.d(map);
                this.f364608k.d(map);
                this.f364607j.d(map);
                this.f364609l.d(map);
                if (this.f364611n) {
                    this.f364601d.d(map);
                    this.f364602e.d(map);
                    this.f364603f.d(map);
                    this.f364604g.d(map);
                    this.f364606i.d(map);
                    this.f364605h.d(map);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
