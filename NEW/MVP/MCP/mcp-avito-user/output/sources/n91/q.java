package N91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* loaded from: classes9.dex */
public final class q extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f11284q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u f11285r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u uVar, Continuation continuation) {
        super(2, continuation);
        this.f11285r = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f11285r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f11284q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u uVar = this.f11285r;
            n2 n2Var = ((O91.o) uVar.f436435i0.getValue()).f12066O;
            p pVar = new p(uVar);
            this.f11284q = 1;
            if (n2Var.collect(pVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
