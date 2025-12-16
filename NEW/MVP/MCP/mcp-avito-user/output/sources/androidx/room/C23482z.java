package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: CoroutinesRoom.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23482z {
    @Y61.k
    @RestrictTo
    public static final kotlinx.coroutines.M a(@Y61.k RoomDatabase roomDatabase) {
        Map<String, Object> map = roomDatabase.f54307k;
        Object objB = map.get("QueryDispatcher");
        if (objB == null) {
            Executor executor = roomDatabase.f54298b;
            if (executor == null) {
                executor = null;
            }
            objB = kotlinx.coroutines.A0.b(executor);
            map.put("QueryDispatcher", objB);
        }
        return (kotlinx.coroutines.M) objB;
    }
}
