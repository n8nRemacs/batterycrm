package com.avito.android.review.report;

import Y41.p;
import Y61.k;
import Y61.l;
import cn0.AbstractC27229b;
import com.avito.android.review.report.mvi.m;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: ComfortableDealReviewsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.review.report.ComfortableDealReviewsActivity$HandleEvents$1", f = "ComfortableDealReviewsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f255381q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ComfortableDealReviewsActivity f255382r;

    /* compiled from: ComfortableDealReviewsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcn0/b;", "event", "Lkotlin/G0;", "<anonymous>", "(Lcn0/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.review.report.ComfortableDealReviewsActivity$HandleEvents$1$1", f = "ComfortableDealReviewsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.review.report.a$a, reason: collision with other inner class name */
    public static final class C7644a extends SuspendLambda implements p<AbstractC27229b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f255383q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ComfortableDealReviewsActivity f255384r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7644a(ComfortableDealReviewsActivity comfortableDealReviewsActivity, Continuation<? super C7644a> continuation) {
            super(2, continuation);
            this.f255384r = comfortableDealReviewsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7644a c7644a = new C7644a(this.f255384r, continuation);
            c7644a.f255383q = obj;
            return c7644a;
        }

        @Override // Y41.p
        public final Object invoke(AbstractC27229b abstractC27229b, Continuation<? super G0> continuation) {
            return ((C7644a) create(abstractC27229b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (L.f((AbstractC27229b) this.f255383q, AbstractC27229b.a.f58137a)) {
                this.f255384r.finish();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ComfortableDealReviewsActivity comfortableDealReviewsActivity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f255382r = comfortableDealReviewsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f255382r, continuation);
        aVar.f255381q = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f255381q;
        ComfortableDealReviewsActivity comfortableDealReviewsActivity = this.f255382r;
        C43175k.K(new C43197r1(new C7644a(comfortableDealReviewsActivity, null), ((m) comfortableDealReviewsActivity.f255369n.getValue()).getEvents()), t12);
        return G0.f406611a;
    }
}
