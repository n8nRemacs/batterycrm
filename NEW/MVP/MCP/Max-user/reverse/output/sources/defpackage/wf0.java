package defpackage;

import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes2.dex */
public final class wf0 extends q44 {
    public final /* synthetic */ BacklogWorker X;
    public int Y;
    public BacklogWorker d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf0(BacklogWorker backlogWorker, q44 q44Var) {
        super(q44Var);
        this.X = backlogWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.doWork(this);
    }
}
