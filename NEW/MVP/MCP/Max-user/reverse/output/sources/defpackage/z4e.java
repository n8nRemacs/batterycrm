package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* loaded from: classes2.dex */
public final class z4e extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ cu7 Y;
    public final /* synthetic */ SdkCoroutineWorker Z;
    public cu7 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4e(cu7 cu7Var, SdkCoroutineWorker sdkCoroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = cu7Var;
        this.Z = sdkCoroutineWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((z4e) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new z4e(this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        cu7 cu7Var;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            cu7Var = this.Y;
            this.o = cu7Var;
            this.X = 1;
            obj = this.Z.getForegroundInfo(this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cu7Var = this.o;
            g8j.b(obj);
        }
        cu7Var.a.i(obj);
        return qqg.a;
    }
}
