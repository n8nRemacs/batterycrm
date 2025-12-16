package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.ForegroundWorker;

/* loaded from: classes2.dex */
public final class we6 extends q44 {
    public final /* synthetic */ ForegroundWorker X;
    public int Y;
    public ForegroundWorker d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we6(ForegroundWorker foregroundWorker, Continuation continuation) {
        super(continuation);
        this.X = foregroundWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.getForegroundInfo(this);
    }
}
