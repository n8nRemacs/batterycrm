package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ee6 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ qt6 d;
    public final /* synthetic */ int o;

    public /* synthetic */ ee6(String str, Context context, qt6 qt6Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.d = qt6Var;
        this.o = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return ge6.a(this.b, this.c, this.d, this.o);
            default:
                try {
                    return ge6.a(this.b, this.c, this.d, this.o);
                } catch (Throwable unused) {
                    return new fe6(-3);
                }
        }
    }
}
