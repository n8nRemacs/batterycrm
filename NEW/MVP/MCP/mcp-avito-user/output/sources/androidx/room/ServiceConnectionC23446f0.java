package androidx.room;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.room.U;
import kotlin.Metadata;

/* compiled from: MultiInstanceInvalidationClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/f0;", "Landroid/content/ServiceConnection;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.f0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC23446f0 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@Y61.k ComponentName componentName, @Y61.k IBinder iBinder) {
        int i12 = U.b.f54338a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(U.f54337l);
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof U)) {
            new U.b.a().f54339a = iBinder;
        }
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@Y61.k ComponentName componentName) {
        throw null;
    }
}
