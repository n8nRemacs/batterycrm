package kotlinx.coroutines.android;

import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import j.k0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.r;

/* compiled from: HandlerDispatcher.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f410768a = 0;

    @l
    private static volatile Choreographer choreographer;

    static {
        Object bVar;
        try {
            int i12 = Z.f406624c;
            bVar = new f(b(Looper.getMainLooper()), null, 2, null);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
    }

    public static final void a(r rVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new h(rVar));
    }

    @k0
    @k
    public static final Handler b(@k Looper looper) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 28) {
            return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    @l
    public static final Object c(@k Continuation<? super Long> continuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
            rVar.p();
            choreographer2.postFrameCallback(new h(rVar));
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objO;
        }
        r rVar2 = new r(1, IntrinsicsKt.intercepted(continuation));
        rVar2.p();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(rVar2);
        } else {
            kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
            K.f411877a.h(rVar2.f411960f, new i(rVar2));
        }
        Object objO2 = rVar2.o();
        if (objO2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO2;
    }
}
