package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes2.dex */
public final class uxf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vxf Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxf(vxf vxfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vxfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uxf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uxf uxfVar = new uxf(this.Y, continuation);
        uxfVar.X = obj;
        return uxfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        vxf vxfVar = this.Y;
        String str = vxfVar.b;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                txf txfVar = new txf((f84) this.X, null, vxfVar);
                this.o = 1;
                obj = yei.f(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, txfVar, this);
                g84 g84Var = g84.a;
                if (obj == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
        } catch (Throwable th) {
            obj = new ipd(th);
        }
        if (!(obj instanceof ipd)) {
            wqi.h(str, "deleted push token", null);
        }
        Throwable thA = kpd.a(obj);
        if (thA != null) {
            wqi.e(str, "failed to delete push token", thA);
        }
        return new kpd(obj);
    }
}
