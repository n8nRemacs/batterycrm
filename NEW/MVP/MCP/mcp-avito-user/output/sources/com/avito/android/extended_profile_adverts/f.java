package com.avito.android.extended_profile_adverts;

import com.avito.android.error.z;
import com.avito.android.extended_profile_adverts.di.n;
import com.avito.android.remote.N;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.util.R0;
import java.util.List;
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
import pA.b;
import qA.InterfaceC47264a;

/* compiled from: ProfileAdvertsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_adverts/f;", "Lcom/avito/android/extended_profile_adverts/d;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<N> f150842a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.i f150843b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150844c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47264a f150845d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f150846e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f150847f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final n f150848g;

    /* compiled from: ProfileAdvertsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpA/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_adverts.ProfileAdvertsInteractorImpl$loadProfileAdverts$1", f = "ProfileAdvertsInteractor.kt", i = {0, 1, 2, 3, 3, 3}, l = {66, 68, 84, 100, 103}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "serpElements", ServiceTransportationWidget.DisclaimerField.TYPE}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$2"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super pA.b>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ String f150849A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ int f150850B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ String f150851C;

        /* renamed from: q, reason: collision with root package name */
        public List f150852q;

        /* renamed from: r, reason: collision with root package name */
        public String f150853r;

        /* renamed from: s, reason: collision with root package name */
        public int f150854s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f150855t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f150857v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f150858w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f150859x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f150860y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ SearchParams f150861z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, String str, int i12, String str2, SearchParams searchParams, String str3, int i13, String str4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f150857v = z12;
            this.f150858w = str;
            this.f150859x = i12;
            this.f150860y = str2;
            this.f150861z = searchParams;
            this.f150849A = str3;
            this.f150850B = i13;
            this.f150851C = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(this.f150857v, this.f150858w, this.f150859x, this.f150860y, this.f150861z, this.f150849A, this.f150850B, this.f150851C, continuation);
            aVar.f150855t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pA.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0153 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 343
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_adverts.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ProfileAdvertsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpA/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_adverts.ProfileAdvertsInteractorImpl$loadProfileAdverts$2", f = "ProfileAdvertsInteractor.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super pA.b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f150862q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f150863r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f150864s;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super pA.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = f.this.new b(continuation);
            bVar.f150863r = interfaceC43172j;
            bVar.f150864s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f150862q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f150863r;
                Throwable th2 = this.f150864s;
                f fVar = f.this;
                fVar.f150845d.i(th2);
                fVar.f150845d.f();
                b.c cVar = new b.c(z.l(th2), th2);
                this.f150863r = null;
                this.f150862q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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
    public f(@Y61.k h31.e<N> eVar, @Y61.k com.avito.android.serp.i iVar, @n.b int i12, @Y61.k InterfaceC47264a interfaceC47264a, @Y61.k R0 r02, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k n nVar) {
        this.f150842a = eVar;
        this.f150843b = iVar;
        this.f150844c = i12;
        this.f150845d = interfaceC47264a;
        this.f150846e = r02;
        this.f150847f = searchParamsConverter;
        this.f150848g = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.extended_profile_adverts.f r49, java.lang.String r50, int r51, java.lang.String r52, java.util.Map r53, kotlin.coroutines.jvm.internal.ContinuationImpl r54) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_adverts.f.b(com.avito.android.extended_profile_adverts.f, java.lang.String, int, java.lang.String, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.extended_profile_adverts.d
    @Y61.k
    public final C43152f0 E5(@Y61.k List list) {
        return new C43152f0(C43175k.G(new g(this, list, null)), new h(3, null));
    }

    @Override // com.avito.android.extended_profile_adverts.d
    @Y61.k
    public final InterfaceC43160i<pA.b> a(@Y61.k String str, @Y61.k String str2, boolean z12, int i12, int i13, @Y61.l String str3, @Y61.l String str4, @Y61.l SearchParams searchParams) {
        return C43175k.I(this.f150846e.a(), new C43152f0(C43175k.G(new a(z12, str, i13, str4, searchParams, str2, i12, str3, null)), new b(null)));
    }
}
