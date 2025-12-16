package androidx.room;

import android.os.Looper;
import androidx.room.Y;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: RoomTrackingLiveData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/I0;", "Landroidx/room/Y$c;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I0 extends Y.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J0<Object> f54271b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(String[] strArr, J0<Object> j02) {
        super(strArr);
        this.f54271b = j02;
    }

    @Override // androidx.room.Y.c
    public final void a(@Y61.k Set<String> set) {
        androidx.arch.core.executor.b bVarA = androidx.arch.core.executor.b.a();
        H0 h02 = this.f54271b.f54282j;
        bVarA.f22695a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            h02.run();
        } else {
            bVarA.b(h02);
        }
    }
}
