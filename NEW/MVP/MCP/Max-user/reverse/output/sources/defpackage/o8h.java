package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o8h extends dtf implements sm6 {
    public final /* synthetic */ q8h X;
    public final /* synthetic */ Bitmap Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8h(q8h q8hVar, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.X = q8hVar;
        this.Y = bitmap;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((o8h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new o8h(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            q8h q8hVar = this.X;
            kue kueVar = q8hVar.k;
            Bitmap bitmap = this.Y;
            File fileK = ((iz5) ((qx5) q8hVar.b.getValue())).k();
            this.o = 1;
            obj = kueVar.a(bitmap, fileK, this);
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        String str = (String) obj;
        String str2 = this.X.h;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, "VideoMessage Recording. Save placeholder", null);
            }
        }
        tcf tcfVar = this.X.q;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, f8h.a((f8h) value, null, null, str, 3)));
        return qqg.a;
    }
}
