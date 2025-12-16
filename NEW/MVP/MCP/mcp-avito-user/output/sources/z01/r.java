package z01;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: CommonHandler.java */
/* loaded from: classes7.dex */
public class r extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<a> f443743a;

    /* compiled from: CommonHandler.java */
    public interface a {
        void handleMessage(Message message);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        a aVar = this.f443743a.get();
        if (aVar != null) {
            aVar.handleMessage(message);
        }
    }
}
