package leakcanary;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import leakcanary.M;

/* compiled from: ServiceWatcher.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "msg", "Landroid/os/Message;", "handleMessage"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class P implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M.e f414025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handler.Callback f414026c;

    public P(M.e eVar, Handler.Callback callback) {
        this.f414025b = eVar;
        this.f414026c = callback;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@Y61.k Message message) {
        Object obj = message.obj;
        if (!(obj instanceof IBinder)) {
            return false;
        }
        if (message.what == 116) {
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.os.IBinder");
            }
            IBinder iBinder = (IBinder) obj;
            M.e eVar = this.f414025b;
            Service service = (Service) ((Map) M.this.f414013d.getValue()).get(iBinder);
            if (service != null) {
                M.this.f414010a.put(iBinder, new WeakReference<>(service));
            }
        }
        Handler.Callback callback = this.f414026c;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }
}
