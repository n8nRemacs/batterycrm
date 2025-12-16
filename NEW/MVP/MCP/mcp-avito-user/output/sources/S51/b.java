package S51;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class b extends Handler implements a {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14820b;

    public b(Looper looper) {
        super(looper);
        this.f14820b = new LinkedHashMap();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i12 = message.what;
        LinkedHashMap linkedHashMap = this.f14820b;
        if (!linkedHashMap.containsKey(Integer.valueOf(i12))) {
            super.handleMessage(message);
            return;
        }
        Runnable runnable = (Runnable) linkedHashMap.get(Integer.valueOf(i12));
        if (runnable != null) {
            runnable.run();
        }
    }
}
