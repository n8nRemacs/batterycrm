package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ile extends dtf implements sm6 {
    public final /* synthetic */ sle o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ile(sle sleVar, Continuation continuation) {
        super(2, continuation);
        this.o = sleVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ile ileVar = (ile) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ileVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ile(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        g8j.b(obj);
        o98 o98VarD = ve3.d();
        yy7[] yy7VarArr = sle.A0;
        o98VarD.add(new k8e(0, hbb.f, new n5g(ibb.q)));
        long j = hbb.c;
        n5g n5gVar = new n5g(ibb.n);
        sle sleVar = this.o;
        o98VarD.add(new l8e(1, n5gVar, 0, j, new boe(sle.w(sleVar.u().g.getInt("app.media.load.photo", 0), false), null)));
        o98VarD.add(new l8e(2, new n5g(ibb.j), 0, hbb.a, new boe(sle.w(sleVar.u().g.getInt("app.media.load.gif", 0), false), null)));
        o98VarD.add(new l8e(2, new n5g(ibb.v), 0, hbb.e, new boe(sle.w(sleVar.u().g.getInt("app.media.load.video_messages", 0), false), null)));
        o98VarD.add(new l8e(3, new n5g(ibb.m), 0, hbb.b, new doe(sleVar.u().g.getBoolean("app.media.load.roaming", false), true)));
        o98VarD.add(new k8e(1, gbb.w, new n5g(ibb.r)));
        o98VarD.add(new l8e(1, new n5g(ibb.u), 1, gbb.m, new boe(sle.w(sleVar.u().g.getInt("app.video.auto.play", 1), true), null)));
        boolean zX = ((gu5) ((rt5) sleVar.o.getValue())).x();
        o98VarD.add(new l8e(2, new n5g(ibb.k), 1, gbb.i, new doe(sleVar.u().g.getBoolean("app.media.autoplay.gif", true), true)));
        o98VarD.add(new l8e(zX ? 2 : 3, new n5g(ibb.h), 1, gbb.g, new doe(((gk) sleVar.d.getValue()).a(), true)));
        if (zX) {
            o98VarD.add(new l8e(3, new n5g(ibb.p), 1, hbb.d, new doe(sleVar.u().g.getBoolean("app.media.autoplay.playlist", true), true)));
        }
        o98VarD.add(new k8e(2, gbb.x, new n5g(ibb.s)));
        o98VarD.add(new l8e(4, new n5g(ibb.x), 2, gbb.p, new boe(new r5g(sleVar.u().o().a.a), null)));
        o98VarD.add(new l8e(4, new n5g(ibb.i), 3, gbb.n, yne.a));
        o98 o98VarA = ve3.a(o98VarD);
        tcf tcfVar = sleVar.X;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, o98VarA));
        return qqg.a;
    }
}
