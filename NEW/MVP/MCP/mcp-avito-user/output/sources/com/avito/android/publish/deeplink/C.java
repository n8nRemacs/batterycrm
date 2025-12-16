package com.avito.android.publish.deeplink;

import Ju.AbstractC14250d;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: JobEnrichmentFeedbackDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.deeplink.JobEnrichmentFeedbackDeeplinkHandler$sendFeedback$1", f = "JobEnrichmentFeedbackDeeplinkHandler.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class C extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f232521q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f232522r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f232523s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.enrichment_feedback.b f232524t;

    /* compiled from: JobEnrichmentFeedbackDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ D f232525l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.enrichment_feedback.b f232526m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(D d12, com.avito.android.publish.enrichment_feedback.b bVar) {
            super(1);
            this.f232525l = d12;
            this.f232526m = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            D d12 = this.f232525l;
            com.avito.android.publish.enrichment_feedback.b bVar = this.f232526m;
            com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, bVar, com.avito.android.printable_text.b.f(bVar.getContext().getString(R.string.job_enrichment_feedback_success)), null, null, 0, null, 1022);
            bVar.r();
            d12.j(AbstractC14250d.c.f9171c);
            return G0.f406611a;
        }
    }

    /* compiled from: JobEnrichmentFeedbackDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.enrichment_feedback.b f232527l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D d12, com.avito.android.publish.enrichment_feedback.b bVar) {
            super(1);
            this.f232527l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            com.avito.android.publish.enrichment_feedback.b bVar = this.f232527l;
            String string = bVar.getContext().getString(R.string.job_enrichment_feedback_default_error);
            Input.f179303W.getClass();
            bVar.V(Input.f179305b0, true, string, false);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d12, String str, com.avito.android.publish.enrichment_feedback.b bVar, Continuation<? super C> continuation) {
        super(2, continuation);
        this.f232522r = d12;
        this.f232523s = str;
        this.f232524t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C(this.f232522r, this.f232523s, this.f232524t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f232521q;
        D d12 = this.f232522r;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f232521q = 1;
            obj = d12.f232529g.h(this.f232523s, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        com.avito.android.publish.enrichment_feedback.b bVar = this.f232524t;
        com.avito.android.error.z.o((TypedResult) obj, new a(d12, bVar), new b(d12, bVar), null, 60);
        return G0.f406611a;
    }
}
