package com.avito.android.realty_agency.checkerboard.mvi;

import Zh0.InterfaceC19561c;
import androidx.compose.runtime.internal.P;
import bi0.InterfaceC25655a;
import com.avito.android.realty_agency.checkerboard.model.LotSortingType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CheckerboardInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/mvi/z;", "Lcom/avito/android/realty_agency/checkerboard/mvi/y;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25655a f251339a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f251340b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f251341c;

    /* compiled from: CheckerboardInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZh0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardInteractorImpl$loadCheckerboard$1", f = "CheckerboardInteractor.kt", i = {0, 1}, l = {51, 57, 70, 78}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f251342q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f251343r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SearchParams f251344s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f251345t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ z f251346u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f251347v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f251348w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SearchParams searchParams, long j12, z zVar, long j13, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f251344s = searchParams;
            this.f251345t = j12;
            this.f251346u = zVar;
            this.f251347v = j13;
            this.f251348w = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f251344s, this.f251345t, this.f251346u, this.f251347v, this.f251348w, continuation);
            aVar.f251343r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r54) {
            /*
                Method dump skipped, instructions count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.checkerboard.mvi.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CheckerboardInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZh0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardInteractorImpl$loadLots$1", f = "CheckerboardInteractor.kt", i = {0, 1}, l = {92, 106, 129, 137}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f251349q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f251350r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f251351s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ LotSortingType f251352t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Long f251353u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SearchParams f251354v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ z f251355w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f251356x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j12, LotSortingType lotSortingType, Long l12, SearchParams searchParams, z zVar, boolean z12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f251351s = j12;
            this.f251352t = lotSortingType;
            this.f251353u = l12;
            this.f251354v = searchParams;
            this.f251355w = zVar;
            this.f251356x = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f251351s, this.f251352t, this.f251353u, this.f251354v, this.f251355w, this.f251356x, continuation);
            bVar.f251350r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0235  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0253  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r61) {
            /*
                Method dump skipped, instructions count: 642
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.checkerboard.mvi.z.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public z(@Y61.k InterfaceC25655a interfaceC25655a, @Y61.k R0 r02, @Y61.k SearchParamsConverter searchParamsConverter) {
        this.f251339a = interfaceC25655a;
        this.f251340b = r02;
        this.f251341c = searchParamsConverter;
    }

    @Override // com.avito.android.realty_agency.checkerboard.mvi.y
    @Y61.k
    public final InterfaceC43160i<InterfaceC19561c> a(@Y61.l Long l12, long j12, @Y61.k LotSortingType lotSortingType, boolean z12, @Y61.k SearchParams searchParams) {
        return C43175k.I(this.f251340b.a(), C43175k.G(new b(j12, lotSortingType, l12, searchParams, this, z12, null)));
    }

    @Override // com.avito.android.realty_agency.checkerboard.mvi.y
    @Y61.k
    public final InterfaceC43160i<InterfaceC19561c> b(long j12, long j13, @Y61.k String str, @Y61.k SearchParams searchParams) {
        return C43175k.G(new a(searchParams, j12, this, j13, str, null));
    }
}
