package com.avito.android.extended_profile;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/s;", "Lcom/avito/android/extended_profile/r;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30480s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.remote.N> f150450a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile.converter.g f150451b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f150452c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile.location.a f150453d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f150454e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ux_feedback.b f150455f;

    /* compiled from: ExtendedProfileInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileInteractorImpl$loadExtendedProfile$1", f = "ExtendedProfileInteractor.kt", i = {0, 1, 2, 3, 3, 3, 4, 4, 4, 5}, l = {53, 59, 56, 71, 72, 74, 81}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "result", "data", "$this$flow", "result", "data", "result"}, s = {"L$0", "L$0", "L$0", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$1"})
    /* renamed from: com.avito.android.extended_profile.s$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ FloatingBuyBlock f150456A;

        /* renamed from: q, reason: collision with root package name */
        public Object f150457q;

        /* renamed from: r, reason: collision with root package name */
        public Object f150458r;

        /* renamed from: s, reason: collision with root package name */
        public Object f150459s;

        /* renamed from: t, reason: collision with root package name */
        public int f150460t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f150461u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f150462v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ C30480s f150463w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f150464x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f150465y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ SearchParams f150466z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, C30480s c30480s, String str, String str2, SearchParams searchParams, FloatingBuyBlock floatingBuyBlock, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f150462v = z12;
            this.f150463w = c30480s;
            this.f150464x = str;
            this.f150465y = str2;
            this.f150466z = searchParams;
            this.f150456A = floatingBuyBlock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f150462v, this.f150463w, this.f150464x, this.f150465y, this.f150466z, this.f150456A, continuation);
            aVar.f150461u = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ed A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x013e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01be  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r22) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 492
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.C30480s.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileInteractorImpl$loadExtendedProfile$2", f = "ExtendedProfileInteractor.kt", i = {0}, l = {99, 100}, m = "invokeSuspend", n = {"$this$catch"}, s = {"L$0"})
    /* renamed from: com.avito.android.extended_profile.s$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f150467q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f150468r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f150469s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f150468r = interfaceC43172j;
            bVar.f150469s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f150467q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = this.f150468r;
                ExtendedProfileInternalAction.LoadingError loadingError = new ExtendedProfileInternalAction.LoadingError(this.f150469s);
                this.f150468r = interfaceC43172j;
                this.f150467q = 1;
                if (interfaceC43172j.emit(loadingError, this) == coroutine_suspended) {
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
                interfaceC43172j = this.f150468r;
                C42729a0.b(obj);
            }
            ExtendedProfileInternalAction.UpdateShareMenuVisibility updateShareMenuVisibility = new ExtendedProfileInternalAction.UpdateShareMenuVisibility(false);
            this.f150468r = null;
            this.f150467q = 2;
            if (interfaceC43172j.emit(updateShareMenuVisibility, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C30480s(@Y61.k h31.e<com.avito.android.remote.N> eVar, @Y61.k com.avito.android.extended_profile.converter.g gVar, @Y61.k R0 r02, @Y61.k com.avito.android.extended_profile.location.a aVar, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k com.avito.android.extended_profile_ux_feedback.b bVar) {
        this.f150450a = eVar;
        this.f150451b = gVar;
        this.f150452c = r02;
        this.f150453d = aVar;
        this.f150454e = searchParamsConverter;
        this.f150455f = bVar;
    }

    @Override // com.avito.android.extended_profile.r
    @Y61.k
    public final InterfaceC43160i a(@Y61.l FloatingBuyBlock floatingBuyBlock, @Y61.l SearchParams searchParams, @Y61.k String str, @Y61.l String str2, boolean z12) {
        return C43175k.I(this.f150452c.a(), new C43152f0(C43175k.G(new a(z12, this, str, str2, searchParams, floatingBuyBlock, null)), new b(3, null)));
    }
}
