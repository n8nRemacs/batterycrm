package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.IncomeResultV2;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sI0.InterfaceC48055a;

/* compiled from: SoaStatsInfoInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/domain/j;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/domain/i;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC48055a> f313474a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f313475b;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<TypedResult<KI0.b>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f313476b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.j$a$a, reason: collision with other inner class name */
        public static final class C9634a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f313477b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.SoaStatsRemoteInfoInteractor$soaStatsInfo$$inlined$map$1$2", f = "SoaStatsInfoInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.j$a$a$a, reason: collision with other inner class name */
            public static final class C9635a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f313478q;

                /* renamed from: r, reason: collision with root package name */
                public int f313479r;

                public C9635a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f313478q = obj;
                    this.f313479r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9634a.this.emit(null, this);
                }
            }

            public C9634a(InterfaceC43172j interfaceC43172j) {
                this.f313477b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.j.a.C9634a.C9635a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.j$a$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.j.a.C9634a.C9635a) r0
                    int r1 = r0.f313479r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f313479r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.j$a$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.j$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f313478q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f313479r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r8)
                    goto L88
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    kotlin.C42729a0.b(r8)
                    com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                    boolean r8 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r8 == 0) goto L79
                    com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                    java.lang.Object r7 = r7.getResult()
                    com.avito.android.remote.model.IncomeResultV2 r7 = (com.avito.android.remote.model.IncomeResultV2) r7
                    KI0.b r8 = new KI0.b
                    com.avito.android.remote.model.IncomeResultV2$Income r2 = r7.getIncome()
                    r4 = 0
                    if (r2 == 0) goto L56
                    com.avito.android.remote.model.IncomeResultV2$Income$Amount r2 = r2.getAmount()
                    if (r2 == 0) goto L56
                    java.lang.String r2 = r2.getValue()
                    goto L57
                L56:
                    r2 = r4
                L57:
                    java.lang.String r5 = ""
                    if (r2 != 0) goto L5c
                    r2 = r5
                L5c:
                    com.avito.android.remote.model.IncomeResultV2$Income r7 = r7.getIncome()
                    if (r7 == 0) goto L6c
                    com.avito.android.remote.model.IncomeResultV2$Income$Amount r7 = r7.getAmount()
                    if (r7 == 0) goto L6c
                    java.lang.String r4 = r7.getCurrency()
                L6c:
                    if (r4 != 0) goto L6f
                    goto L70
                L6f:
                    r5 = r4
                L70:
                    r8.<init>(r2, r5)
                    com.avito.android.remote.model.TypedResult$Success r7 = new com.avito.android.remote.model.TypedResult$Success
                    r7.<init>(r8)
                    goto L7d
                L79:
                    boolean r8 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r8 == 0) goto L8b
                L7d:
                    r0.f313479r = r3
                    kotlinx.coroutines.flow.j r8 = r6.f313477b
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L88
                    return r1
                L88:
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                L8b:
                    kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                    r7.<init>()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.j.a.C9634a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f313476b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super TypedResult<KI0.b>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f313476b.collect(new C9634a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SoaStatsInfoInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/IncomeResultV2;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.SoaStatsRemoteInfoInteractor$soaStatsInfo$1", f = "SoaStatsInfoInteractor.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<IncomeResultV2>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313481q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f313482r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = j.this.new b(continuation);
            bVar.f313482r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<IncomeResultV2>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313481q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f313482r;
                InterfaceC48055a interfaceC48055a = j.this.f313474a.get();
                this.f313482r = interfaceC43172j;
                this.f313481q = 1;
                obj = interfaceC48055a.f(this);
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
                interfaceC43172j = (InterfaceC43172j) this.f313482r;
                C42729a0.b(obj);
            }
            this.f313482r = null;
            this.f313481q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public j(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f313474a = eVar;
        this.f313475b = r02;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.i
    @Y61.k
    public final InterfaceC43160i<TypedResult<KI0.b>> a() {
        return C43175k.I(this.f313475b.a(), new a(C43175k.G(new b(null))));
    }
}
