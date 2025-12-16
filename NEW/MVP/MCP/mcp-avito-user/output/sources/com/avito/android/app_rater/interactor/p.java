package com.avito.android.app_rater.interactor;

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

/* compiled from: InAppReviewInteractorGooglePlay.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.app_rater.interactor.InAppReviewInteractorGooglePlay$start$1", f = "InAppReviewInteractorGooglePlay.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class p extends SuspendLambda implements Y41.p<I0<? super G0>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f91828q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f91829r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f91830s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f91831t;

    /* compiled from: InAppReviewInteractorGooglePlay.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<G0> f91832l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(I0<? super G0> i02) {
            super(0);
            this.f91832l = i02;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f91832l.r().h(null);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ActivityC22955m activityC22955m, Continuation continuation) {
        super(2, continuation);
        this.f91830s = qVar;
        this.f91831t = activityC22955m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f91830s, this.f91831t, continuation);
        pVar.f91829r = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super G0> i02, Continuation<? super G0> continuation) {
        return ((p) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f91828q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f91829r;
            if (!this.f91830s.f91833a.f91801a) {
                i02.h(new Exception("Google play services are not available"));
            }
            ActivityC22955m activityC22955m = this.f91831t;
            Context applicationContext = activityC22955m.getApplicationContext();
            Context applicationContext2 = applicationContext.getApplicationContext();
            if (applicationContext2 != null) {
                applicationContext = applicationContext2;
            }
            com.google.android.play.core.review.d dVar = new com.google.android.play.core.review.d(new com.google.android.play.core.review.i(applicationContext));
            dVar.b().c(new FX0.b(dVar, activityC22955m, i02, 5));
            a aVar = new a(i02);
            this.f91828q = 1;
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
