package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p4b extends dtf implements sm6 {
    public final /* synthetic */ File[] X;
    public final /* synthetic */ x4b Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4b(File[] fileArr, x4b x4bVar, Continuation continuation) {
        super(2, continuation);
        this.X = fileArr;
        this.Y = x4bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p4b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p4b(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            x4b x4bVar = this.Y;
            File[] fileArr = this.X;
            if (fileArr != null) {
                for (File file : fileArr) {
                    x4b.c(x4bVar, file.toPath());
                }
            }
            this.o = 1;
            Object objA = x4b.a(x4bVar, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
