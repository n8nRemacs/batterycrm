package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.annotation.RestrictTo;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import j.B;
import j.N;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes10.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    @B
    public SidecarDeviceState f55271b;

    /* renamed from: d, reason: collision with root package name */
    public final b f55273d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f55274e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f55270a = new Object();

    /* renamed from: c, reason: collision with root package name */
    @B
    public final WeakHashMap f55272c = new WeakHashMap();

    public DistinctElementSidecarCallback(@N b bVar, @N SidecarInterface.SidecarCallback sidecarCallback) {
        this.f55273d = bVar;
        this.f55274e = sidecarCallback;
    }

    public void onDeviceStateChanged(@N SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f55270a) {
            try {
                b bVar = this.f55273d;
                SidecarDeviceState sidecarDeviceState2 = this.f55271b;
                bVar.getClass();
                if (b.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f55271b = sidecarDeviceState;
                this.f55274e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onWindowLayoutChanged(@N IBinder iBinder, @N SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f55270a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f55272c.get(iBinder);
                this.f55273d.getClass();
                if (b.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f55272c.put(iBinder, sidecarWindowLayoutInfo);
                this.f55274e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
