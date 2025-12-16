package G41;

import Y41.p;
import java.util.HashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes8.dex */
public final class f extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f6316q;

    /* renamed from: r, reason: collision with root package name */
    public i f6317r;

    /* renamed from: s, reason: collision with root package name */
    public String f6318s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6319t;

    /* renamed from: u, reason: collision with root package name */
    public int f6320u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f6321v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f6322w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f6323x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, String str, boolean z12, Continuation continuation) {
        super(2, continuation);
        this.f6321v = iVar;
        this.f6322w = str;
        this.f6323x = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f6321v, this.f6322w, this.f6323x, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlinx.coroutines.sync.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        i iVar;
        kotlinx.coroutines.sync.d dVar;
        String str;
        boolean z12;
        kotlinx.coroutines.sync.a aVar;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f6320u;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                iVar = this.f6321v;
                dVar = iVar.f6339j;
                this.f6316q = dVar;
                this.f6317r = iVar;
                String str2 = this.f6322w;
                this.f6318s = str2;
                boolean z13 = this.f6323x;
                this.f6319t = z13;
                this.f6320u = 1;
                if (dVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str2;
                z12 = z13;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.f6316q;
                    try {
                        C42729a0.b(obj);
                        G0 g02 = G0.f406611a;
                        aVar.d(null);
                        return g02;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar.d(null);
                        throw th2;
                    }
                }
                z12 = this.f6319t;
                str = this.f6318s;
                iVar = this.f6317r;
                ?? r62 = this.f6316q;
                C42729a0.b(obj);
                dVar = r62;
            }
            HashMap mapA = Dc1.a.a((HashMap) iVar.f6340k.getValue());
            if (mapA != null) {
                mapA.put(str, Boxing.boxBoolean(z12));
                Z1 z14 = iVar.f6340k;
                this.f6316q = dVar;
                this.f6317r = null;
                this.f6318s = null;
                this.f6320u = 2;
                if (z14.emit(mapA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            aVar = dVar;
            G0 g022 = G0.f406611a;
            aVar.d(null);
            return g022;
        } catch (Throwable th4) {
            aVar = dVar;
            th2 = th4;
            aVar.d(null);
            throw th2;
        }
    }
}
