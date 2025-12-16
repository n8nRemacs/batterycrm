package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q5h extends dtf implements sm6 {
    public final /* synthetic */ t5h X;
    public final /* synthetic */ Float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5h(Float f, t5h t5hVar, Continuation continuation) {
        super(2, continuation);
        this.o = f;
        this.X = t5hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        q5h q5hVar = (q5h) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        q5hVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new q5h(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        t5h t5hVar = this.X;
        Float f = this.o;
        if (f == null) {
            cbh cbhVar = ((v7h) t5hVar.b.getValue()).f;
            if (cbhVar != null) {
                cbhVar.play();
            }
        } else {
            v7h v7hVar = (v7h) t5hVar.b.getValue();
            float fFloatValue = f.floatValue();
            w8h w8hVar = (w8h) ue3.I(v7hVar.h.a.b());
            if ((w8hVar != null ? w8hVar.d : null) == null) {
                wqi.q(v7hVar.a, "We cannot seek a videoContent because is null", new Object[0]);
            } else {
                long duration = (long) ((fFloatValue / 100.0f) * r1.getDuration());
                cbh cbhVar2 = v7hVar.f;
                if (cbhVar2 != null) {
                    cbhVar2.seekTo(duration);
                }
            }
        }
        return qqg.a;
    }
}
