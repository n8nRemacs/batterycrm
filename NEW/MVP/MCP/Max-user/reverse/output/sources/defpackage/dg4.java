package defpackage;

import ru.ok.tamtam.android.services.DbCleanUpScheduler$DbCleanUpWorker;

/* loaded from: classes2.dex */
public final class dg4 extends q44 {
    public final /* synthetic */ DbCleanUpScheduler$DbCleanUpWorker X;
    public int Y;
    public DbCleanUpScheduler$DbCleanUpWorker d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg4(DbCleanUpScheduler$DbCleanUpWorker dbCleanUpScheduler$DbCleanUpWorker, q44 q44Var) {
        super(q44Var);
        this.X = dbCleanUpScheduler$DbCleanUpWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.doWork(this);
    }
}
