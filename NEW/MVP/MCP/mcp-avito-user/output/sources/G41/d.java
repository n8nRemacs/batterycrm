package G41;

import Y41.p;
import gc1.InterfaceC40658b;
import java.util.HashMap;
import java.util.Objects;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes8.dex */
public final class d extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f6300q;

    /* renamed from: r, reason: collision with root package name */
    public i f6301r;

    /* renamed from: s, reason: collision with root package name */
    public String f6302s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC40658b f6303t;

    /* renamed from: u, reason: collision with root package name */
    public int f6304u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f6305v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f6306w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b f6307x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, String str, InterfaceC40658b interfaceC40658b, Continuation continuation) {
        super(2, continuation);
        this.f6305v = iVar;
        this.f6306w = str;
        this.f6307x = interfaceC40658b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f6305v, this.f6306w, this.f6307x, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        i iVar;
        kotlinx.coroutines.sync.d dVar;
        String str;
        InterfaceC40658b interfaceC40658b;
        kotlinx.coroutines.sync.a aVar;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f6304u;
        InterfaceC40658b interfaceC40658b2 = this.f6307x;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                iVar = this.f6305v;
                dVar = iVar.f6337h;
                this.f6300q = dVar;
                this.f6301r = iVar;
                String str2 = this.f6306w;
                this.f6302s = str2;
                this.f6303t = interfaceC40658b2;
                this.f6304u = 1;
                if (dVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str2;
                interfaceC40658b = interfaceC40658b2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.f6300q;
                    try {
                        C42729a0.b(obj);
                        G0 g02 = G0.f406611a;
                        aVar.d(null);
                        Objects.toString(interfaceC40658b2);
                        return g02;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar.d(null);
                        throw th2;
                    }
                }
                interfaceC40658b = this.f6303t;
                str = this.f6302s;
                iVar = this.f6301r;
                ?? r72 = this.f6300q;
                C42729a0.b(obj);
                dVar = r72;
            }
            HashMap mapA = Dc1.a.a((HashMap) iVar.f6336g.getValue());
            if (mapA != null) {
                mapA.put(str, interfaceC40658b);
                Z1 z12 = iVar.f6336g;
                this.f6300q = dVar;
                this.f6301r = null;
                this.f6302s = null;
                this.f6303t = null;
                this.f6304u = 2;
                if (z12.emit(mapA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            aVar = dVar;
            G0 g022 = G0.f406611a;
            aVar.d(null);
            Objects.toString(interfaceC40658b2);
            return g022;
        } catch (Throwable th4) {
            aVar = dVar;
            th2 = th4;
            aVar.d(null);
            throw th2;
        }
    }
}
