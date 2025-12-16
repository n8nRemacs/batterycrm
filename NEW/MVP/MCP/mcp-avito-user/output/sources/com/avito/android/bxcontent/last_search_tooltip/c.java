package com.avito.android.bxcontent.last_search_tooltip;

import Y41.p;
import com.avito.android.C36135w2;
import com.avito.android.account.E;
import com.avito.android.bxcontent.N1;
import com.avito.android.remote.model.SearchParamsConverter;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ks0.InterfaceC43493a;

/* compiled from: LastSearchTooltipInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/last_search_tooltip/c;", "Lcom/avito/android/bxcontent/last_search_tooltip/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43493a f111151a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f111152b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N1 f111153c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.timestamp_storage.domain.d f111154d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E f111155e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f111156f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f111157g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final BE0.a f111158h;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LastSearchTooltipInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.last_search_tooltip.LastSearchTooltipInteractorImpl$asFlow$1", f = "LastSearchTooltipInteractor.kt", i = {0}, l = {100, 100}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a<T> extends SuspendLambda implements p<InterfaceC43172j<? super T>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111159q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111160r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ p<b, Continuation<? super T>, Object> f111161s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f111162t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super b, ? super Continuation<? super T>, ? extends Object> pVar, c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f111161s = pVar;
            this.f111162t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f111161s, this.f111162t, continuation);
            aVar.f111160r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((a) create((InterfaceC43172j) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111159q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f111160r;
                this.f111160r = interfaceC43172j2;
                this.f111159q = 1;
                obj = this.f111161s.invoke(this.f111162t, this);
                interfaceC43172j = interfaceC43172j2;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                InterfaceC43172j interfaceC43172j3 = (InterfaceC43172j) this.f111160r;
                C42729a0.b(obj);
                interfaceC43172j = interfaceC43172j3;
            }
            if (obj != null) {
                this.f111160r = null;
                this.f111159q = 2;
                if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@Y61.k InterfaceC43493a interfaceC43493a, @Y61.k j jVar, @Y61.k N1 n12, @Y61.k com.avito.android.timestamp_storage.domain.d dVar, @Y61.k E e12, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k C36135w2 c36135w2, @Y61.k BE0.a aVar) {
        this.f111151a = interfaceC43493a;
        this.f111152b = jVar;
        this.f111153c = n12;
        this.f111154d = dVar;
        this.f111155e = e12;
        this.f111156f = searchParamsConverter;
        this.f111157g = c36135w2;
        this.f111158h = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.bxcontent.last_search_tooltip.b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.remote.model.SearchParams r12, @Y61.l java.lang.String r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.last_search_tooltip.c.a(com.avito.android.remote.model.SearchParams, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.bxcontent.last_search_tooltip.b
    @Y61.k
    public final <T> InterfaceC43160i<T> b(@Y61.k p<? super b, ? super Continuation<? super T>, ? extends Object> pVar) {
        C36135w2 c36135w2 = this.f111157g;
        c36135w2.getClass();
        n<Object> nVar = C36135w2.f327457X[40];
        return ((Boolean) c36135w2.f327468K.a().invoke()).booleanValue() ? C43175k.G(new a(pVar, this, null)) : C43175k.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r8, com.avito.android.remote.model.SearchParams r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.avito.android.bxcontent.last_search_tooltip.d
            if (r0 == 0) goto L14
            r0 = r12
            com.avito.android.bxcontent.last_search_tooltip.d r0 = (com.avito.android.bxcontent.last_search_tooltip.d) r0
            int r1 = r0.f111166t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f111166t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.bxcontent.last_search_tooltip.d r0 = new com.avito.android.bxcontent.last_search_tooltip.d
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f111164r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f111166t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.android.bxcontent.last_search_tooltip.c r8 = r6.f111163q
            kotlin.C42729a0.b(r12)
            goto L50
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r12)
            r12 = 2
            r1 = 0
            com.avito.android.remote.model.SearchParamsConverter r3 = r7.f111156f
            java.util.Map r5 = com.avito.android.remote.model.SearchParamsConverter.DefaultImpls.convertParamsToMap$default(r3, r10, r1, r12, r1)
            r6.f111163q = r7
            r6.f111166t = r2
            ks0.a r1 = r7.f111151a
            r2 = r8
            r4 = r11
            java.lang.Object r12 = r1.c(r2, r4, r5, r6)
            if (r12 != r0) goto L4f
            return r0
        L4f:
            r8 = r7
        L50:
            r0 = r12
            com.avito.android.remote.model.TypedResult r0 = (com.avito.android.remote.model.TypedResult) r0
            com.avito.android.bxcontent.last_search_tooltip.e r1 = new com.avito.android.bxcontent.last_search_tooltip.e
            r1.<init>(r8)
            com.avito.android.bxcontent.last_search_tooltip.f r2 = com.avito.android.bxcontent.last_search_tooltip.f.f111168l
            r3 = 0
            r4 = 0
            r5 = 60
            java.lang.Object r8 = com.avito.android.error.z.r(r0, r1, r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.last_search_tooltip.c.c(long, com.avito.android.remote.model.SearchParams, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
