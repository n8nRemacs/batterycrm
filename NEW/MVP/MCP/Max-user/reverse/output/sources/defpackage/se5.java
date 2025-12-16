package defpackage;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class se5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ se5(ke5 ke5Var, int i, String str, Throwable th) {
        this.a = 0;
        this.b = ke5Var;
        this.c = str;
        this.d = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARN: Type inference failed for: r6v14, types: [qy1, z76] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se5.run():void");
    }

    public /* synthetic */ se5(ye5 ye5Var, Executor executor, ke5 ke5Var) {
        this.a = 3;
        this.c = ye5Var;
        this.d = executor;
        this.b = ke5Var;
    }

    public /* synthetic */ se5(f29 f29Var, px8 px8Var, String str, Bundle bundle) {
        this.a = 17;
        this.b = px8Var;
        this.c = str;
        this.d = bundle;
    }

    public /* synthetic */ se5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
