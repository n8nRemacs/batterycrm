package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public final class bq2 extends dtf implements sm6 {
    public final /* synthetic */ yq2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq2(yq2 yq2Var, Continuation continuation) {
        super(2, continuation);
        this.X = yq2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bq2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bq2(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objC = s8j.c(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        tcf tcfVar = this.X.h1;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, w54.b));
        return qqg.a;
    }
}
