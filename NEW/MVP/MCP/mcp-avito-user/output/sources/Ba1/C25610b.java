package ba1;

import Ba1.y;
import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.mts.biometry.api.dataSource.j;
import z91.s;

/* renamed from: ba1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C25610b extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f57186q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f57187r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.navigation.c f57188s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25610b(ru.mts.biometry.sdk.feature.passport.navigation.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f57188s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C25610b c25610b = new C25610b(this.f57188s, continuation);
        c25610b.f57187r = obj;
        return c25610b;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C25610b) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f57186q;
        ru.mts.biometry.sdk.feature.passport.navigation.c cVar = this.f57188s;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                int i13 = Z.f406624c;
                cVar.requireContext();
                s sVar = z91.e.f443908b;
                if (sVar == null) {
                    throw new IllegalArgumentException("DI delegate is null");
                }
                j jVar = sVar.a().f436312a;
                this.f57186q = 1;
                Object objO = jVar.f436344a.o(this);
                if (objO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objO = G0.f406611a;
                }
                if (objO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            bVar = G0.f406611a;
            int i14 = Z.f406624c;
        } catch (Throwable th2) {
            int i15 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (Z.b(bVar) != null) {
            cVar.requireContext();
            s sVar2 = z91.e.f443908b;
            if (sVar2 == null) {
                throw new IllegalArgumentException("DI delegate is null");
            }
            Aa1.b.a(sVar2.b(), y.e());
        }
        return G0.f406611a;
    }
}
