package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class y7j {
    public static final void a(int i, RecyclerView recyclerView, Runnable runnable, Runnable runnable2) {
        if (recyclerView == null) {
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        Handler handler = recyclerView.getHandler();
        if (handler != null && handler.hasMessages(61453)) {
            recyclerView.getHandler().removeMessages(61453, runnable);
        }
        if (!recyclerView.Z() && Looper.getMainLooper().isCurrentThread()) {
            runnable.run();
            return;
        }
        if (i == 5) {
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        qe5 qe5Var = new qe5(recyclerView, i, runnable, runnable2, 4);
        Message messageObtain = Message.obtain(recyclerView.getHandler(), qe5Var);
        messageObtain.what = 61453;
        messageObtain.obj = runnable;
        Handler handler2 = recyclerView.getHandler();
        if (handler2 != null) {
            handler2.sendMessageAtFrontOfQueue(messageObtain);
        } else {
            recyclerView.post(qe5Var);
        }
    }

    public static void b(qe4 qe4Var) {
        if (qe4Var != null) {
            try {
                qe4Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void c(int i, RecyclerView recyclerView, Runnable runnable, Runnable runnable2) {
        if ((i & 4) != 0) {
            runnable2 = null;
        }
        a(0, recyclerView, runnable, runnable2);
    }
}
