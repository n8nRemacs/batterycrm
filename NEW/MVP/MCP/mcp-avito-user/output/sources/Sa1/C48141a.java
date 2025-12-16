package sa1;

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
import z91.e;
import z91.s;

/* renamed from: sa1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48141a extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f437726q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f437727r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.navigation.b f437728s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48141a(ru.mts.biometry.sdk.feature.selfie.navigation.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f437728s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C48141a c48141a = new C48141a(this.f437728s, continuation);
        c48141a.f437727r = obj;
        return c48141a;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C48141a) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        ru.mts.biometry.sdk.feature.selfie.navigation.b bVar2;
        s sVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f437726q;
        ru.mts.biometry.sdk.feature.selfie.navigation.b bVar3 = this.f437728s;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                int i13 = Z.f406624c;
                bVar3.requireContext();
                s sVar2 = e.f443908b;
                if (sVar2 == null) {
                    throw new IllegalArgumentException("DI delegate is null");
                }
                j jVar = sVar2.a().f436312a;
                this.f437727r = bVar3;
                this.f437726q = 1;
                Object objJ = jVar.f436344a.j(this);
                if (objJ != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objJ = G0.f406611a;
                }
                if (objJ == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar2 = bVar3;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (ru.mts.biometry.sdk.feature.selfie.navigation.b) this.f437727r;
                C42729a0.b(obj);
            }
            bVar2.requireContext();
            sVar = e.f443908b;
        } catch (Throwable th2) {
            int i14 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        sVar.b().b(new C48142b());
        bVar = G0.f406611a;
        int i15 = Z.f406624c;
        if (Z.b(bVar) != null) {
            bVar3.requireContext();
            s sVar3 = e.f443908b;
            if (sVar3 == null) {
                throw new IllegalArgumentException("DI delegate is null");
            }
            Aa1.b.a(sVar3.b(), y.e());
        }
        return G0.f406611a;
    }
}
