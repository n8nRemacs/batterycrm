package com.avito.android.app_rater.interactor;

import Ba1.B;
import android.content.Context;
import androidx.fragment.app.ActivityC22955m;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import ru.rustore.sdk.reactive.single.AbstractC47905a;
import ru.rustore.sdk.reactive.single.C47909e;
import ru.rustore.sdk.reactive.single.H;
import ub1.C49017A;
import ub1.C49023e;
import ub1.C49024f;
import ub1.E;

/* compiled from: InAppReviewInteractorRustore.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.app_rater.interactor.InAppReviewInteractorRustore$start$1", f = "InAppReviewInteractorRustore.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class s extends SuspendLambda implements Y41.p<I0<? super G0>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f91835q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f91836r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f91837s;

    /* compiled from: InAppReviewInteractorRustore.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<G0> f91838l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(I0<? super G0> i02) {
            super(0);
            this.f91838l = i02;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f91838l.r().h(null);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ActivityC22955m activityC22955m, Continuation continuation) {
        super(2, continuation);
        this.f91837s = activityC22955m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f91837s, continuation);
        sVar.f91836r = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super G0> i02, Continuation<? super G0> continuation) {
        return ((s) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f91835q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f91836r;
            C49024f c49024f = C49024f.f440149a;
            Context applicationContext = this.f91837s.getApplicationContext();
            c49024f.getClass();
            C49023e c49023e = new C49023e(applicationContext.getApplicationContext(), null);
            E e12 = c49023e.f440147a;
            e12.getClass();
            AbstractC47905a.C12588a c12588a = AbstractC47905a.f436968a;
            C49017A c49017a = new C49017A(e12);
            c12588a.getClass();
            C47909e c47909e = new C47909e(c49017a);
            ru.rustore.sdk.reactive.core.d.f436864a.getClass();
            ru.rustore.sdk.core.tasks.f fVarA = ub1.j.a(H.a(c47909e, ru.rustore.sdk.reactive.core.d.a()));
            fVarA.b(null, new o(i02, 1), null);
            fVarA.b(new B(22, c49023e, i02), null, null);
            a aVar = new a(i02);
            this.f91835q = 1;
            if (F0.a(i02, aVar, this) == coroutine_suspended) {
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
