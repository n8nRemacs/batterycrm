package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.corpmailru.adsession.media.MediaEvents;
import com.iab.omid.library.corpmailru.adsession.media.PlayerState;
import e11.C39865f;
import e11.C39866f0;
import e11.C39907t0;
import e11.C39913v0;
import e11.e2;
import e11.k2;
import e11.m2;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f365122a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final Y0 f365123b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public HashSet f365124c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final e2 f365125d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public Context f365126e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final String f365127f;

    /* renamed from: g, reason: collision with root package name */
    public final float f365128g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f365129h;

    public interface a {
    }

    public r1(@j.P C39913v0 c39913v0, @j.P Y0 y02, @j.P Context context) {
        this.f365129h = true;
        this.f365123b = y02;
        if (context != null) {
            this.f365126e = context.getApplicationContext();
        }
        if (c39913v0 == null) {
            return;
        }
        e2 e2Var = c39913v0.f394702a;
        this.f365125d = e2Var;
        this.f365124c = e2Var.f();
        this.f365127f = c39913v0.f394726y;
        this.f365128g = c39913v0.f394724w;
        this.f365129h = c39913v0.f394701G;
    }

    public final void a(float f12, float f13) {
        if (c()) {
            return;
        }
        if (!this.f365122a) {
            k2.a(this.f365126e, this.f365125d.e("playbackStarted"));
            this.f365122a = true;
        }
        if (!this.f365124c.isEmpty()) {
            Iterator it = this.f365124c.iterator();
            while (it.hasNext()) {
                C39865f c39865f = (C39865f) it.next();
                if (C39907t0.a(c39865f.f394592d, f12) != 1) {
                    Context context = this.f365126e;
                    k2 k2Var = k2.f394669a;
                    k2Var.getClass();
                    m2.c(new com.avito.konveyor.item_visibility_tracker.c(k2Var, c39865f, context, 11));
                    it.remove();
                }
            }
        }
        Y0 y02 = this.f365123b;
        if (y02 != null && y02.f364666h != null) {
            int i12 = -1;
            if (f13 != 0.0f) {
                float f14 = f12 / f13;
                if (C39907t0.a(f14, 0.0f) != -1) {
                    i12 = C39907t0.a(f14, 0.25f) == -1 ? 0 : C39907t0.a(f14, 0.5f) == -1 ? 1 : C39907t0.a(f14, 0.75f) == -1 ? 2 : C39907t0.a(f14, 1.0f) == -1 ? 3 : 4;
                }
            }
            int i13 = y02.f364662d;
            if (i12 != i13 && i12 > i13) {
                MediaEvents mediaEvents = y02.f364666h;
                if (mediaEvents != null) {
                    try {
                        if (i12 == 0) {
                            mediaEvents.start(f13, y02.f364663e);
                        } else if (i12 == 1) {
                            mediaEvents.firstQuartile();
                        } else if (i12 == 2) {
                            mediaEvents.midpoint();
                        } else if (i12 == 3) {
                            mediaEvents.thirdQuartile();
                        } else if (i12 == 4) {
                            mediaEvents.complete();
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                y02.f364662d = i12;
            }
        }
        if (this.f365128g <= 0.0f || f13 <= 0.0f || TextUtils.isEmpty(this.f365127f) || !this.f365129h || Math.abs(f13 - this.f365128g) <= 1.5f) {
            return;
        }
        C39866f0 c39866f0 = new C39866f0("Bad value");
        c39866f0.f394595b = "Media duration error: expected " + this.f365128g + ", but was " + f13;
        c39866f0.f394598e = this.f365127f;
        c39866f0.a(this.f365126e);
        this.f365129h = false;
    }

    public final void b(boolean z12) {
        MediaEvents mediaEvents;
        if (c()) {
            return;
        }
        k2.a(this.f365126e, this.f365125d.e(z12 ? "fullscreenOn" : "fullscreenOff"));
        Y0 y02 = this.f365123b;
        if (y02 == null || (mediaEvents = y02.f364666h) == null || z12 == y02.f364667i) {
            return;
        }
        y02.f364667i = z12;
        try {
            mediaEvents.playerStateChange(z12 ? PlayerState.FULLSCREEN : PlayerState.NORMAL);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public final boolean c() {
        return this.f365126e == null || this.f365125d == null || this.f365124c == null;
    }

    public final void d(boolean z12) {
        if (c()) {
            return;
        }
        k2.a(this.f365126e, this.f365125d.e(z12 ? "volumeOn" : "volumeOff"));
        Y0 y02 = this.f365123b;
        if (y02 != null) {
            float f12 = z12 ? 1.0f : 0.0f;
            if (y02.f364666h == null || C39907t0.a(f12, y02.f364663e) == 0) {
                return;
            }
            y02.f364663e = f12;
            try {
                y02.f364666h.volumeChange(f12);
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    public final void e() {
        if (c()) {
            return;
        }
        this.f365124c = this.f365125d.f();
        this.f365122a = false;
    }

    public final void f() {
        if (c()) {
            return;
        }
        k2.a(this.f365126e, this.f365125d.e("playbackPaused"));
        Y0 y02 = this.f365123b;
        if (y02 != null) {
            y02.b(0);
        }
    }

    public final void g() {
        if (c()) {
            return;
        }
        k2.a(this.f365126e, this.f365125d.e("playbackError"));
        Y0 y02 = this.f365123b;
        if (y02 != null) {
            y02.b(3);
        }
    }

    public final void h() {
        if (c()) {
            return;
        }
        k2.a(this.f365126e, this.f365125d.e("playbackTimeout"));
    }

    public final void i() {
        if (c()) {
            return;
        }
        k2.a(this.f365126e, this.f365125d.e("playbackResumed"));
        Y0 y02 = this.f365123b;
        if (y02 != null) {
            y02.b(1);
        }
    }
}
