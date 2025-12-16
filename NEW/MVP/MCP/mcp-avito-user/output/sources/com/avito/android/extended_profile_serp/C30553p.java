package com.avito.android.extended_profile_serp;

import com.avito.android.extended_profile_serp.di.C30538h;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSerpInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/p;", "Lcom/avito/android/extended_profile_serp/o;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_serp.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30553p implements InterfaceC30552o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.remote.N> f153073a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f153074b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f153075c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ZA.a f153076d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSerpConfig f153077e;

    /* renamed from: f, reason: collision with root package name */
    public final int f153078f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f153079g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f153080h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public volatile Map<String, String> f153081i = P0.c();

    /* compiled from: ExtendedProfileSerpInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpInteractorImpl$loadAdverts$1", f = "ExtendedProfileSerpInteractor.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 4, 4, 4, 4, 5, 5, 5, 5}, l = {67, 72, 73, 77, 95, 108, 129}, m = "invokeSuspend", n = {"$this$flow", "requestSearchParams", "isFirstPage", "$this$flow", "requestSearchParams", "isFirstPage", "$this$flow", "requestSearchParams", "isFirstPage", "$this$flow", "requestSearchParams", "params", "isFirstPage", "$this$flow", "requestSearchParams", "pageParams", "isFirstPage"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
    /* renamed from: com.avito.android.extended_profile_serp.p$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSerpInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public SearchParams f153082q;

        /* renamed from: r, reason: collision with root package name */
        public C30558v f153083r;

        /* renamed from: s, reason: collision with root package name */
        public int f153084s;

        /* renamed from: t, reason: collision with root package name */
        public int f153085t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f153086u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f153087v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ C30553p f153088w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SearchParams f153089x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ C30558v f153090y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f153091z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, C30553p c30553p, SearchParams searchParams, C30558v c30558v, boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f153087v = i12;
            this.f153088w = c30553p;
            this.f153089x = searchParams;
            this.f153090y = c30558v;
            this.f153091z = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f153087v, this.f153088w, this.f153089x, this.f153090y, this.f153091z, continuation);
            aVar.f153086u = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSerpInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0295  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x02a4  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x02a9  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x02af  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x02c4 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0317  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0351 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0352  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0361  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x052c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0157 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0249  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0293  */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r57) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 1376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_serp.C30553p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileSerpInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpInteractorImpl$loadAdverts$2", f = "ExtendedProfileSerpInteractor.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile_serp.p$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileSerpInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f153092q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f153093r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f153094s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f153095t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f153095t = i12;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSerpInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(this.f153095t, continuation);
            bVar.f153093r = interfaceC43172j;
            bVar.f153094s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f153092q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f153093r;
                ExtendedProfileSerpInternalAction.AdvertsLoadingError advertsLoadingError = new ExtendedProfileSerpInternalAction.AdvertsLoadingError(this.f153094s, this.f153095t == 1);
                this.f153093r = null;
                this.f153092q = 1;
                if (interfaceC43172j.emit(advertsLoadingError, this) == coroutine_suspended) {
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

    @Inject
    public C30553p(@Y61.k h31.e eVar, @Y61.k R0 r02, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k ZA.a aVar, @Y61.k ExtendedProfileSerpConfig extendedProfileSerpConfig, @C30538h.b int i12, @Y61.k com.avito.android.location.r rVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f153073a = eVar;
        this.f153074b = r02;
        this.f153075c = searchParamsConverter;
        this.f153076d = aVar;
        this.f153077e = extendedProfileSerpConfig;
        this.f153078f = i12;
        this.f153079g = rVar;
        this.f153080h = interfaceC35745a5;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.extended_profile_serp.C30553p r7, java.util.Map r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws com.avito.android.util.ApiException {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof com.avito.android.extended_profile_serp.C30554q
            if (r0 == 0) goto L17
            r0 = r9
            com.avito.android.extended_profile_serp.q r0 = (com.avito.android.extended_profile_serp.C30554q) r0
            int r1 = r0.f153098s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f153098s = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            com.avito.android.extended_profile_serp.q r0 = new com.avito.android.extended_profile_serp.q
            r0.<init>(r7, r9)
            goto L15
        L1d:
            java.lang.Object r9 = r6.f153096q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f153098s
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            kotlin.C42729a0.b(r9)
            goto L55
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.C42729a0.b(r9)
            h31.e<com.avito.android.remote.N> r9 = r7.f153073a
            java.lang.Object r9 = r9.get()
            r1 = r9
            com.avito.android.remote.N r1 = (com.avito.android.remote.N) r1
            com.avito.android.extended_profile_serp.ExtendedProfileSerpConfig r7 = r7.f153077e
            java.lang.String r9 = r7.f152442b
            r6.f153098s = r2
            java.lang.String r3 = r7.f152443c
            java.lang.String r4 = r7.f152445e
            r2 = r9
            r5 = r8
            java.lang.Object r9 = r1.b(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L55
            goto L64
        L55:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r7 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r7 == 0) goto L65
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r7 = r9.getResult()
            r0 = r7
            com.avito.android.remote.model.ExtendedProfileSearchPageResult r0 = (com.avito.android.remote.model.ExtendedProfileSearchPageResult) r0
        L64:
            return r0
        L65:
            boolean r7 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r7 == 0) goto L78
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
            com.avito.android.remote.error.ApiError r7 = r9.getError()
            java.lang.Throwable r8 = r9.getCause()
            com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r7, r8)
            throw r7
        L78:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_serp.C30553p.b(com.avito.android.extended_profile_serp.p, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.extended_profile_serp.InterfaceC30552o
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileSerpInternalAction> a(int i12, @Y61.k SearchParams searchParams, boolean z12, @Y61.l C30558v c30558v) {
        return C43175k.I(this.f153074b.a(), new C43152f0(C43175k.G(new a(i12, this, searchParams, c30558v, z12, null)), new b(i12, null)));
    }
}
