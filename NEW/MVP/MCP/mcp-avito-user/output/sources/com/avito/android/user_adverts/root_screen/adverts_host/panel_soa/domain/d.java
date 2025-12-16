package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.IncomeInfo;
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

/* compiled from: SoaInfoDialogInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/domain/d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/domain/c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC48055a> f313457a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f313458b;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<TypedResult<KI0.a>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f313459b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.d$a$a, reason: collision with other inner class name */
        public static final class C9632a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f313460b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.SoaInfoDialogSharingInteractor$soaInfoDialog$$inlined$map$1$2", f = "SoaInfoDialogInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.d$a$a$a, reason: collision with other inner class name */
            public static final class C9633a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f313461q;

                /* renamed from: r, reason: collision with root package name */
                public int f313462r;

                public C9633a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f313461q = obj;
                    this.f313462r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9632a.this.emit(null, this);
                }
            }

            public C9632a(InterfaceC43172j interfaceC43172j) {
                this.f313460b = interfaceC43172j;
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
                    boolean r0 = r8 instanceof com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.d.a.C9632a.C9633a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.d$a$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.d.a.C9632a.C9633a) r0
                    int r1 = r0.f313462r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f313462r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.d$a$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.d$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f313461q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f313462r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r8)
                    goto L6c
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    kotlin.C42729a0.b(r8)
                    com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                    boolean r8 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r8 == 0) goto L5d
                    com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                    java.lang.Object r7 = r7.getResult()
                    com.avito.android.remote.model.IncomeInfo r7 = (com.avito.android.remote.model.IncomeInfo) r7
                    KI0.a r8 = new KI0.a
                    java.lang.String r2 = r7.getTitle()
                    com.avito.android.remote.model.text.AttributedText r4 = r7.getAttributedText()
                    java.lang.String r5 = r7.getConfirmTitle()
                    com.avito.android.remote.model.Image r7 = r7.getImage()
                    r8.<init>(r2, r4, r5, r7)
                    com.avito.android.remote.model.TypedResult$Success r7 = new com.avito.android.remote.model.TypedResult$Success
                    r7.<init>(r8)
                    goto L61
                L5d:
                    boolean r8 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r8 == 0) goto L6f
                L61:
                    r0.f313462r = r3
                    kotlinx.coroutines.flow.j r8 = r6.f313460b
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                L6f:
                    kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                    r7.<init>()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.d.a.C9632a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f313459b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super TypedResult<KI0.a>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f313459b.collect(new C9632a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SoaInfoDialogInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/IncomeInfo;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.SoaInfoDialogSharingInteractor$soaInfoDialog$1", f = "SoaInfoDialogInteractor.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<IncomeInfo>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313464q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f313465r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = d.this.new b(continuation);
            bVar.f313465r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<IncomeInfo>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313464q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f313465r;
                InterfaceC48055a interfaceC48055a = d.this.f313457a.get();
                this.f313465r = interfaceC43172j;
                this.f313464q = 1;
                obj = interfaceC48055a.c(this);
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
                interfaceC43172j = (InterfaceC43172j) this.f313465r;
                C42729a0.b(obj);
            }
            this.f313465r = null;
            this.f313464q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f313457a = eVar;
        this.f313458b = r02;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.c
    @Y61.k
    public final InterfaceC43160i<TypedResult<KI0.a>> a() {
        return C43175k.I(this.f313458b.a(), new a(C43175k.G(new b(null))));
    }
}
