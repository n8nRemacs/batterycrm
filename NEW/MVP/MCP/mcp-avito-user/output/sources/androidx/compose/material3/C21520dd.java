package androidx.compose.material3;

import androidx.compose.foundation.interaction.a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", f = "Slider.kt", i = {}, l = {1580}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21520dd extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f36211q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C21543ed f36212r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f36213s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.b f36214t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21520dd(C21543ed c21543ed, boolean z12, a.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f36212r = c21543ed;
        this.f36213s = z12;
        this.f36214t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C21520dd(this.f36212r, this.f36213s, this.f36214t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21520dd) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f36211q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C21543ed c21543ed = this.f36212r;
            androidx.compose.foundation.interaction.m mVar = this.f36213s ? c21543ed.f36293b : c21543ed.f36294c;
            this.f36211q = 1;
            if (mVar.b(this.f36214t, this) == coroutine_suspended) {
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
