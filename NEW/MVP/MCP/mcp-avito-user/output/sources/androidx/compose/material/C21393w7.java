package androidx.compose.material;

import androidx.compose.foundation.interaction.a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.RangeSliderLogic$captureThumb$1", f = "Slider.kt", i = {}, l = {1170}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21393w7 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34325q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C21406x7 f34326r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f34327s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.b f34328t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21393w7(C21406x7 c21406x7, boolean z12, a.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f34326r = c21406x7;
        this.f34327s = z12;
        this.f34328t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C21393w7(this.f34326r, this.f34327s, this.f34328t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21393w7) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34325q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C21406x7 c21406x7 = this.f34326r;
            androidx.compose.foundation.interaction.m mVar = this.f34327s ? c21406x7.f34391a : c21406x7.f34392b;
            this.f34325q = 1;
            if (mVar.b(this.f34328t, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
