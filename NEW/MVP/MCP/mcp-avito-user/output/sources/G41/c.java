package G41;

import Y41.p;
import java.util.HashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes8.dex */
public final class c extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f6294q;

    /* renamed from: r, reason: collision with root package name */
    public i f6295r;

    /* renamed from: s, reason: collision with root package name */
    public String f6296s;

    /* renamed from: t, reason: collision with root package name */
    public int f6297t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f6298u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f6299v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f6298u = iVar;
        this.f6299v = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f6298u, this.f6299v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.sync.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        kotlinx.coroutines.sync.d dVar;
        String str;
        i iVar;
        ?? r02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f6297t;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                i iVar2 = this.f6298u;
                dVar = iVar2.f6342m;
                this.f6294q = dVar;
                this.f6295r = iVar2;
                str = this.f6299v;
                this.f6296s = str;
                this.f6297t = 1;
                if (dVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                iVar = iVar2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r02 = this.f6294q;
                    try {
                        C42729a0.b(obj);
                        r02 = r02;
                        G0 g02 = G0.f406611a;
                        r02.d(null);
                        return g02;
                    } catch (Throwable th2) {
                        th = th2;
                        dVar = r02;
                        dVar.d(null);
                        throw th;
                    }
                }
                String str2 = this.f6296s;
                iVar = this.f6295r;
                ?? r52 = this.f6294q;
                C42729a0.b(obj);
                str = str2;
                dVar = r52;
            }
            HashMap mapA = Dc1.a.a((HashMap) iVar.f6343n.getValue());
            if (mapA != null) {
                mapA.remove(str);
                Z1 z12 = iVar.f6343n;
                this.f6294q = dVar;
                this.f6295r = null;
                this.f6296s = null;
                this.f6297t = 2;
                if (z12.emit(mapA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            r02 = dVar;
            G0 g022 = G0.f406611a;
            r02.d(null);
            return g022;
        } catch (Throwable th3) {
            th = th3;
            dVar.d(null);
            throw th;
        }
    }
}
