package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class x4j {
    public static hrb a;

    public static final Object a(z26 z26Var, cm6 cm6Var, um6 um6Var, Continuation continuation, x26[] x26VarArr) {
        wf3 wf3Var = new wf3(z26Var, cm6Var, um6Var, null, x26VarArr);
        d36 d36Var = new d36(continuation.getContext(), continuation);
        Object objB = sni.b(d36Var, d36Var, wf3Var);
        return objB == g84.a ? objB : qqg.a;
    }

    public static final hrb b(Context context) {
        hrb hrbVar = a;
        if (hrbVar != null) {
            return hrbVar;
        }
        hrb hrbVar2 = new hrb(context.getApplicationContext());
        a = hrbVar2;
        return hrbVar2;
    }
}
