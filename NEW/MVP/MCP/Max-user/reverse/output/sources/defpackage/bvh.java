package defpackage;

import android.os.VibrationEffect;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class bvh implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ em6 b;

    public /* synthetic */ bvh(int i, em6 em6Var) {
        this.a = i;
        this.b = em6Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (VibrationEffect) ((a7c) this.b).invoke(obj);
            default:
                return (pu4) ((u7g) this.b).invoke(obj);
        }
    }
}
