package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CoroutinesRoom.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/room/y;", "", "<init>", "()V", "a", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* renamed from: androidx.room.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23481y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f54422a = new a(null);

    /* compiled from: CoroutinesRoom.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/y$a;", "", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.y$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @X41.n
    @Y61.k
    public static final InterfaceC43160i a(@Y61.k RoomDatabase roomDatabase, @Y61.k String[] strArr, @Y61.k Callable callable) {
        f54422a.getClass();
        return C43175k.G(new C23474u(roomDatabase, strArr, callable, null));
    }

    @X41.n
    @Y61.l
    public static final Object b(@Y61.k RoomDatabase roomDatabase, @Y61.l CancellationSignal cancellationSignal, @Y61.k Callable callable, @Y61.k ContinuationImpl continuationImpl) {
        f54422a.getClass();
        if (roomDatabase.o() && roomDatabase.i().getWritableDatabase().e6()) {
            return callable.call();
        }
        R0 r02 = (R0) continuationImpl.getF411447c().get(R0.f54293d);
        CoroutineContext coroutineContextA = r02 != null ? r02.f54294b : C23482z.a(roomDatabase);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuationImpl));
        rVar.p();
        rVar.r(new C23478w(cancellationSignal, C43259k.d(kotlinx.coroutines.D0.f410691b, coroutineContextA, null, new C23480x(callable, rVar, null), 2)));
        Object objO = rVar.o();
        if (objO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objO;
        }
        DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        return objO;
    }

    @X41.n
    @Y61.l
    public static final Object c(@Y61.k RoomDatabase roomDatabase, @Y61.k Callable callable, @Y61.k Continuation continuation) {
        CoroutineContext coroutineContext;
        f54422a.getClass();
        if (roomDatabase.o() && roomDatabase.i().getWritableDatabase().e6()) {
            return callable.call();
        }
        R0 r02 = (R0) continuation.getF411447c().get(R0.f54293d);
        if (r02 != null) {
            coroutineContext = r02.f54294b;
        } else {
            Map<String, Object> map = roomDatabase.f54307k;
            Object objB = map.get("TransactionDispatcher");
            if (objB == null) {
                S0 s02 = roomDatabase.f54299c;
                if (s02 == null) {
                    s02 = null;
                }
                objB = kotlinx.coroutines.A0.b(s02);
                map.put("TransactionDispatcher", objB);
            }
            coroutineContext = (kotlinx.coroutines.M) objB;
        }
        return C43259k.g(coroutineContext, new C23476v(callable, null), continuation);
    }
}
