package defpackage;

import java.util.HashSet;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes2.dex */
public final class zf0 extends q44 {
    public HashSet X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ BacklogWorker Z;
    public Object d;
    public HashSet o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf0(BacklogWorker backlogWorker, q44 q44Var) {
        super(q44Var);
        this.Z = backlogWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return BacklogWorker.b(this.Z, this);
    }
}
