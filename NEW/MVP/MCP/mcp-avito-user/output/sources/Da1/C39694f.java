package da1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.d2;

/* renamed from: da1.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C39694f extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f393919q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393920r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39694f(ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar, Continuation continuation) {
        super(2, continuation);
        this.f393920r = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39694f(this.f393920r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C39694f) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f393919q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C39689a c39689a = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0;
            ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar = this.f393920r;
            d2 d2Var = mVar.g5().f20930d;
            C39693e c39693e = new C39693e(mVar);
            this.f393919q = 1;
            if (d2Var.collect(c39693e, this) == coroutine_suspended) {
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
