package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousByteChannel;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kag extends dtf implements sm6 {
    public final /* synthetic */ yag X;
    public final /* synthetic */ ByteBuffer Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kag(yag yagVar, ByteBuffer byteBuffer, Continuation continuation) {
        super(2, continuation);
        this.X = yagVar;
        this.Y = byteBuffer;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kag) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kag(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        AsynchronousByteChannel asynchronousByteChannel = this.X.b;
        this.o = 1;
        l42 l42Var = new l42(1, hni.f(this));
        l42Var.o();
        asynchronousByteChannel.write(this.Y, l42Var, fv.b);
        Object objN = l42Var.n();
        g84 g84Var = g84.a;
        return objN == g84Var ? g84Var : objN;
    }
}
