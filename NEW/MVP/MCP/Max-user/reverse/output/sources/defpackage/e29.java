package defpackage;

import one.me.android.media.service.OneMeMediaSessionService;

/* loaded from: classes.dex */
public final class e29 implements nx8, r3c {
    public final OneMeMediaSessionService a;
    public final w69 b;
    public final /* synthetic */ f29 c;

    public e29(f29 f29Var, OneMeMediaSessionService oneMeMediaSessionService, w69 w69Var) {
        this.c = f29Var;
        this.a = oneMeMediaSessionService;
        this.b = w69Var;
    }

    @Override // defpackage.nx8
    public final void C(px8 px8Var) {
        OneMeMediaSessionService oneMeMediaSessionService = this.a;
        w69 w69Var = this.b;
        if (oneMeMediaSessionService.d(w69Var)) {
            oneMeMediaSessionService.l(w69Var);
        }
        oneMeMediaSessionService.k(w69Var, false);
    }

    @Override // defpackage.nx8
    public final bg7 I(aie aieVar) {
        int i;
        if (aieVar.b.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")) {
            d29 d29Var = (d29) this.c.Y.get(this.b);
            if (d29Var != null) {
                d29Var.b = true;
            }
            i = 0;
        } else {
            i = -6;
        }
        return a6a.c(new yie(i));
    }

    @Override // defpackage.r3c
    public final void f0(u3c u3cVar, p3c p3cVar) {
        if (p3cVar.a.a(4, 5, 14, 0)) {
            this.a.k(this.b, false);
        }
    }

    @Override // defpackage.nx8
    public final void v() {
        this.a.k(this.b, false);
    }

    @Override // defpackage.nx8
    public final void z() {
        this.a.k(this.b, false);
    }
}
