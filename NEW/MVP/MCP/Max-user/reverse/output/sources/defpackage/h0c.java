package defpackage;

import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class h0c extends dtf implements sm6 {
    public final /* synthetic */ PinBarsWidget X;
    public /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0c(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.X = pinBarsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((h0c) l(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        h0c h0cVar = new h0c(continuation, this.X);
        h0cVar.o = ((Number) obj).floatValue();
        return h0cVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        float f = this.o;
        s0a s0aVar = this.X.o;
        qqg qqgVar = qqg.a;
        if (s0aVar == null) {
            return qqgVar;
        }
        s0aVar.setProgress(f);
        return qqgVar;
    }
}
