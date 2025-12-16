package androidx.credentials;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.s0;

/* compiled from: CredentialManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/credentials/k;", "", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: androidx.credentials.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22858k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f45223a = a.f45224a;

    /* compiled from: CredentialManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/k$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.k$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f45224a = new a();
    }

    @Y61.l
    default Object a(@Y61.k Context context, @Y61.k K k12, @Y61.k Continuation<? super L> continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        CancellationSignal cancellationSignal = new CancellationSignal();
        rVar.r(new C22863p(cancellationSignal));
        b(context, k12, cancellationSignal, new androidx.arch.core.executor.a(1), new C22868q(rVar));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }

    void b(@Y61.k Context context, @Y61.k K k12, @Y61.l CancellationSignal cancellationSignal, @Y61.k androidx.arch.core.executor.a aVar, @Y61.k C22868q c22868q);

    @Y61.l
    default Object c(@Y61.k Context context, @Y61.k C22853f c22853f, @Y61.k Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        CancellationSignal cancellationSignal = new CancellationSignal();
        rVar.r(new C22861n(cancellationSignal));
        d(context, c22853f, cancellationSignal, new androidx.arch.core.executor.a(1), new C22862o(rVar));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }

    void d(@Y61.k Context context, @Y61.k C22853f c22853f, @Y61.l CancellationSignal cancellationSignal, @Y61.k androidx.arch.core.executor.a aVar, @Y61.k C22862o c22862o);
}
