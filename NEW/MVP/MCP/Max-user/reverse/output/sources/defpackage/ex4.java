package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ex4 implements Executor {
    public static volatile ex4 b;
    public static final /* synthetic */ ex4 c = new ex4(1);
    public static final /* synthetic */ ex4 d = new ex4(2);
    public final /* synthetic */ int a;

    public /* synthetic */ ex4(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                new Handler(Looper.getMainLooper()).post(runnable);
                break;
            case 4:
                new Thread(runnable).start();
                break;
            case 5:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
