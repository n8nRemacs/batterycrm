package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class df0 extends dtf implements sm6 {
    public final /* synthetic */ Context X;
    public final /* synthetic */ xyg Y;
    public final /* synthetic */ ef0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(ef0 ef0Var, Context context, xyg xygVar, Continuation continuation) {
        super(2, continuation);
        this.o = ef0Var;
        this.X = context;
        this.Y = xygVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((df0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new df0(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        ef0 ef0Var = this.o;
        if (((nv4) ef0Var.b.getValue()).a()) {
            return null;
        }
        Context context = this.X;
        xyg xygVar = this.Y;
        try {
            InputStream inputStreamOpen = context.getAssets().open(xygVar.a);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return ef0.a(ef0Var, bArr, xygVar);
        } catch (IOException e) {
            wqi.c("BackgroundDataLoader", "load assets failed: " + e, new Object[0]);
            return null;
        }
    }
}
