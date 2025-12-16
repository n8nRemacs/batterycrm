package defpackage;

import ru.ok.messages.services.PipWorker;

/* loaded from: classes2.dex */
public final class a2c extends q44 {
    public final /* synthetic */ PipWorker X;
    public int Y;
    public PipWorker d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2c(PipWorker pipWorker, q44 q44Var) {
        super(q44Var);
        this.X = pipWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.doWork(this);
    }
}
