package kotlinx.coroutines.rx3;

import com.avito.android.photo_cache.q;
import io.reactivex.rxjava3.core.AbstractC41768a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.s0;

/* compiled from: RxAwait.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-rx3"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.rx3.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43292o {
    @Y61.l
    public static final Object a(@Y61.k AbstractC41768a abstractC41768a, @Y61.k Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        abstractC41768a.a(new C43284g(rVar));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
    }

    @Y61.l
    public static final Object b(@Y61.k io.reactivex.rxjava3.core.I i12, @Y61.k Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        i12.a(new C43285h(rVar));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }

    @Y61.l
    public static final Object c(@Y61.k io.reactivex.rxjava3.core.z zVar, @Y61.k Continuation continuation) {
        Object objF = f(zVar, EnumC43283f.f412090c, null, continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objF;
    }

    @Y61.l
    public static final Object d(@Y61.k io.reactivex.rxjava3.core.z zVar, q.a aVar, @Y61.k Continuation continuation) {
        Object objF = f(zVar, EnumC43283f.f412091d, aVar, continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objF;
    }

    @Y61.l
    public static final Object e(@Y61.k io.reactivex.rxjava3.core.z zVar, @Y61.k Continuation continuation) {
        return f(zVar, EnumC43283f.f412091d, null, continuation);
    }

    public static final Object f(io.reactivex.rxjava3.core.z zVar, EnumC43283f enumC43283f, q.a aVar, Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        zVar.c(new C43287j(rVar, enumC43283f, aVar));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }

    @Y61.l
    public static final Object g(@Y61.k io.reactivex.rxjava3.core.q qVar, @Y61.k ContinuationImpl continuationImpl) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuationImpl));
        rVar.p();
        qVar.a(new C43290m(rVar));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return objO;
    }
}
