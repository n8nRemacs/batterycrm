package d;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* renamed from: d.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39449h extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j f393134q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f393135r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39449h(j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f393134q = jVar;
        this.f393135r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39449h(this.f393134q, this.f393135r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C39449h) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        j jVar = this.f393134q;
        ConcurrentHashMap concurrentHashMap = jVar.f393142e;
        String str = this.f393135r;
        concurrentHashMap.remove(str);
        ((G41.i) jVar.f393140c).c(str, false);
        return G0.f406611a;
    }
}
