package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r17 extends dtf implements sm6 {
    public final /* synthetic */ File X;
    public final /* synthetic */ t17 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r17(t17 t17Var, File file, Continuation continuation) {
        super(2, continuation);
        this.o = t17Var;
        this.X = file;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r17) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new r17(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ccb ccbVar = (ccb) this.o.d.getValue();
        ccbVar.h("Дамп памяти закончился");
        ccbVar.b("Если что файл можно будет найти по этому пути: " + this.X.getAbsolutePath());
        return ccbVar.i();
    }
}
