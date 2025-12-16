package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s5h extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ t5h o;
    public final /* synthetic */ g2h s0;
    public final /* synthetic */ bbh t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5h(t5h t5hVar, long j, long j2, String str, g2h g2hVar, bbh bbhVar, Continuation continuation) {
        super(2, continuation);
        this.o = t5hVar;
        this.X = j;
        this.Y = j2;
        this.Z = str;
        this.s0 = g2hVar;
        this.t0 = bbhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        s5h s5hVar = (s5h) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        s5hVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s5h(this.o, this.X, this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        v7h v7hVar = (v7h) this.o.b.getValue();
        cbh cbhVar = ((z2f) v7hVar.d.getValue()).get();
        v7hVar.f = cbhVar;
        jve jveVar = v7hVar.g;
        if (cbhVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        z2f z2fVar = (z2f) v7hVar.d.getValue();
        g2h g2hVar = this.s0;
        jveVar.h(new w8h(this.X, this.Y, this.Z, g2hVar, g2hVar.getDuration(), cbhVar, z2fVar));
        cbh cbhVar2 = v7hVar.f;
        if (cbhVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        cbhVar2.b(1.0f);
        cbhVar2.Q(false);
        cbhVar2.X(v7hVar);
        cbhVar2.I0(g2hVar, ((tih) v7hVar.e.getValue()).d(), this.t0, (16 & 8) != 0 ? 1 : 4, (16 & 16) != 0);
        return qqg.a;
    }
}
