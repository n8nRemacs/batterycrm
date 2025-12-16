package ua1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.n;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* renamed from: ua1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49011b extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f440097q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.intro.e f440098r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49011b(ru.mts.biometry.sdk.feature.selfie.ui.intro.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f440098r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C49011b(this.f440098r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C49011b) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f440097q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ru.mts.biometry.sdk.feature.selfie.ui.intro.e eVar = this.f440098r;
            n nVar = ru.mts.biometry.sdk.feature.selfie.ui.intro.e.f436525i0[0];
            InterfaceC43160i interfaceC43160iR = C43175k.r(((g) eVar.f436526h0.a(eVar)).f440103E);
            C49010a c49010a = new C49010a();
            this.f440097q = 1;
            if (interfaceC43160iR.collect(c49010a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
