package ha1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* renamed from: ha1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40905c extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f397228q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.i f397229r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40905c(ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f397229r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40905c(this.f397229r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C40905c) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f397228q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar = this.f397229r;
            n2 n2Var = iVar.i5().f397274O;
            C40904b c40904b = new C40904b(iVar);
            this.f397228q = 1;
            if (n2Var.collect(c40904b, this) == coroutine_suspended) {
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
