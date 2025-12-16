package com.avito.android.suggest_addresses.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements InterfaceC43160i<SuggestAddressesInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f291905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.suggest_addresses.domain.adapter.addresses.c f291906c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f291907b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.suggest_addresses.domain.adapter.addresses.c f291908c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.suggest_addresses.mvi.SuggestAddressesActor$process$$inlined$map$3$2", f = "SuggestAddressesActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.suggest_addresses.mvi.c$a$a, reason: collision with other inner class name */
        public static final class C8847a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f291909q;

            /* renamed from: r, reason: collision with root package name */
            public int f291910r;

            public C8847a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f291909q = obj;
                this.f291910r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, com.avito.android.suggest_addresses.domain.adapter.addresses.c cVar) {
            this.f291907b = interfaceC43172j;
            this.f291908c = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r12, @Y61.k kotlin.coroutines.Continuation r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.avito.android.suggest_addresses.mvi.c.a.C8847a
                if (r0 == 0) goto L13
                r0 = r13
                com.avito.android.suggest_addresses.mvi.c$a$a r0 = (com.avito.android.suggest_addresses.mvi.c.a.C8847a) r0
                int r1 = r0.f291910r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f291910r = r1
                goto L18
            L13:
                com.avito.android.suggest_addresses.mvi.c$a$a r0 = new com.avito.android.suggest_addresses.mvi.c$a$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f291909q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f291910r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r13)
                goto L7f
            L29:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L31:
                kotlin.C42729a0.b(r13)
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
                boolean r13 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r13 == 0) goto L61
                com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
                java.lang.Object r12 = r12.getResult()
                com.avito.android.suggest_addresses.model.ResolvedAddressResult r12 = (com.avito.android.suggest_addresses.model.ResolvedAddressResult) r12
                com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction$SelectSuggestion r13 = new com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction$SelectSuggestion
                com.avito.android.suggest_addresses.domain.adapter.addresses.c r2 = r11.f291908c
                java.lang.String r6 = r12.getAddressId()
                com.avito.android.remote.model.SuggestAddress$Kind r9 = r12.getKind()
                java.lang.String r7 = r12.getParamId()
                java.lang.String r8 = r12.getAddress()
                java.lang.String r10 = r12.getLocality()
                java.lang.String r5 = r2.f291829c
                r4 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10)
                goto L74
            L61:
                boolean r13 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r13 == 0) goto L82
                com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
                com.avito.android.remote.error.ApiError r13 = r12.getError()
                java.lang.Throwable r12 = r12.getCause()
                com.avito.android.util.C35936s.a(r13, r12)
                com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction$ResolveAddressError r13 = com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction.ResolveAddressError.f291924b
            L74:
                r0.f291910r = r3
                kotlinx.coroutines.flow.j r12 = r11.f291907b
                java.lang.Object r12 = r12.emit(r13, r0)
                if (r12 != r1) goto L7f
                return r1
            L7f:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            L82:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.suggest_addresses.mvi.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public c(InterfaceC43160i interfaceC43160i, com.avito.android.suggest_addresses.domain.adapter.addresses.c cVar) {
        this.f291905b = interfaceC43160i;
        this.f291906c = cVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super SuggestAddressesInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f291905b.collect(new a(interfaceC43172j, this.f291906c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
