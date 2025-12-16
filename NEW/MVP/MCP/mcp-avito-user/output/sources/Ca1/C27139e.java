package ca1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* renamed from: ca1.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27139e extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f57939q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.address.f f57940r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27139e(ru.mts.biometry.sdk.feature.passport.ui.address.f fVar, Continuation continuation) {
        super(2, continuation);
        this.f57940r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C27139e(this.f57940r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C27139e) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f57939q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ru.mts.biometry.sdk.feature.passport.ui.address.f fVar = this.f57940r;
            C27154t c27154t = fVar.f436483f0;
            if (c27154t == null) {
                c27154t = null;
            }
            Z1 z12 = c27154t.f57967K;
            C27138d c27138d = new C27138d(fVar);
            this.f57939q = 1;
            if (z12.collect(c27138d, this) == coroutine_suspended) {
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
