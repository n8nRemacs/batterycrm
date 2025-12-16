package defpackage;

import java.util.Map;
import java.util.function.ToLongFunction;
import one.me.android.OneMeApplication;

/* loaded from: classes2.dex */
public final /* synthetic */ class p93 implements ToLongFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((jf2) obj).a;
            case 1:
                return ((sia) ((Map.Entry) obj).getValue()).a;
            default:
                dxa dxaVar = dxa.a;
                rwa rwaVar = OneMeApplication.s0;
                return ((Number) dxaVar.get(obj)).longValue();
        }
    }
}
