package androidx.compose.material3;

import androidx.compose.animation.core.C20315s;
import androidx.compose.animation.core.C20318t;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/compose/material3/Q;", "", "Landroidx/compose/animation/core/t;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/compose/material3/Q;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {}, l = {97, 99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class Ig extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super Q<Float, C20318t>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34888q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f34889r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Lg f34890s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.G1 f34891t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ig(float f12, Lg lg2, androidx.compose.foundation.gestures.G1 g12, Continuation<? super Ig> continuation) {
        super(2, continuation);
        this.f34889r = f12;
        this.f34890s = lg2;
        this.f34891t = g12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new Ig(this.f34889r, this.f34890s, this.f34891t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super Q<Float, C20318t>> continuation) {
        return ((Ig) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34888q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return (Q) obj;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return (Q) obj;
        }
        C42729a0.b(obj);
        float f12 = this.f34889r;
        float fAbs = Math.abs(f12);
        Lg lg2 = this.f34890s;
        if (fAbs > Math.abs(lg2.f35077e)) {
            this.f34888q = 2;
            obj = Lg.c(lg2, this.f34891t, f12, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (Q) obj;
        }
        this.f34888q = 1;
        float fG2 = Lg.g(0.0f, lg2.f35073a);
        obj = lg2.e(this.f34891t, fG2, fG2, C20315s.a(0.0f, f12, 28), lg2.f35075c, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (Q) obj;
    }
}
