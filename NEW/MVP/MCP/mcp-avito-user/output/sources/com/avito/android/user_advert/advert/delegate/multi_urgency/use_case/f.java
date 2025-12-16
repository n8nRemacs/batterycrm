package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MultiUrgencyToggleUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/e;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.MultiUrgencyToggleUseCaseImpl$toggle$1", f = "MultiUrgencyToggleUseCase.kt", i = {0, 1, 2}, l = {32, 33, 42, 43}, m = "invokeSuspend", n = {"$this$flow", "remoteResult", "deepLinkAttr"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes4.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.user_advert.advert.delegate.multi_urgency.e>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f308714q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f308715r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f308716s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_advert.advert.items.multi_urgency.c f308717t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_advert.advert.items.multi_urgency.c f308718u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f308719v;

    /* compiled from: MultiUrgencyToggleUseCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.MultiUrgencyToggleUseCaseImpl$toggle$1$1", f = "MultiUrgencyToggleUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ h f308720q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ DeepLinkAttribute f308721r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, DeepLinkAttribute deepLinkAttribute, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f308720q = hVar;
            this.f308721r = deepLinkAttribute;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f308720q, this.f308721r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.a.a(this.f308720q.f308727c, this.f308721r.getDeepLink(), null, null, 6);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, com.avito.android.user_advert.advert.items.multi_urgency.c cVar, com.avito.android.user_advert.advert.items.multi_urgency.c cVar2, boolean z12, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f308716s = hVar;
        this.f308717t = cVar;
        this.f308718u = cVar2;
        this.f308719v = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f308716s, this.f308717t, this.f308718u, this.f308719v, continuation);
        fVar.f308715r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.user_advert.advert.delegate.multi_urgency.e> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
