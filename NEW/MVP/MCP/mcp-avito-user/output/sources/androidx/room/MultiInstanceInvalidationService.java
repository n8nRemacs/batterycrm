package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.room.U;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: MultiInstanceInvalidationService.kt */
@O
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public int f54283b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f54284c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final b f54285d = new b();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f54286e = new a();

    /* compiled from: MultiInstanceInvalidationService.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/MultiInstanceInvalidationService$a", "Landroidx/room/U$b;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends U.b {
        public a() {
        }

        @Override // androidx.room.U
        public final void N1(@Y61.k T t12, int i12) {
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f54285d) {
                multiInstanceInvalidationService.f54285d.unregister(t12);
            }
        }

        @Override // androidx.room.U
        public final void v3(int i12, @Y61.k String[] strArr) {
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f54285d) {
                try {
                    String str = (String) multiInstanceInvalidationService.f54284c.get(Integer.valueOf(i12));
                    if (str == null) {
                        return;
                    }
                    int iBeginBroadcast = multiInstanceInvalidationService.f54285d.beginBroadcast();
                    for (int i13 = 0; i13 < iBeginBroadcast; i13++) {
                        try {
                            Integer num = (Integer) multiInstanceInvalidationService.f54285d.getBroadcastCookie(i13);
                            int iIntValue = num.intValue();
                            String str2 = (String) multiInstanceInvalidationService.f54284c.get(num);
                            if (i12 != iIntValue && str.equals(str2)) {
                                try {
                                    multiInstanceInvalidationService.f54285d.getBroadcastItem(i13).X1(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService.f54285d.finishBroadcast();
                            throw th2;
                        }
                    }
                    multiInstanceInvalidationService.f54285d.finishBroadcast();
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationService.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/room/MultiInstanceInvalidationService$b", "Landroid/os/RemoteCallbackList;", "Landroidx/room/T;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends RemoteCallbackList<T> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object obj) {
            MultiInstanceInvalidationService.this.f54284c.remove((Integer) obj);
        }
    }

    @Override // android.app.Service
    @Y61.k
    public final IBinder onBind(@Y61.k Intent intent) {
        return this.f54286e;
    }
}
