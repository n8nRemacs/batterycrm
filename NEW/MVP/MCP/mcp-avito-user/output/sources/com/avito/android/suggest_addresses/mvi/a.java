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
public final class a implements InterfaceC43160i<SuggestAddressesInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f291893b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.suggest_addresses.mvi.a$a, reason: collision with other inner class name */
    public static final class C8844a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f291894b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.suggest_addresses.mvi.SuggestAddressesActor$process$$inlined$map$1$2", f = "SuggestAddressesActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.suggest_addresses.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C8845a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f291895q;

            /* renamed from: r, reason: collision with root package name */
            public int f291896r;

            public C8845a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f291895q = obj;
                this.f291896r |= BeduinInputModel.MIN_TEXT_VERSION;
                return C8844a.this.emit(null, this);
            }
        }

        public C8844a(InterfaceC43172j interfaceC43172j) {
            this.f291894b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r14, @Y61.k kotlin.coroutines.Continuation r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof com.avito.android.suggest_addresses.mvi.a.C8844a.C8845a
                if (r0 == 0) goto L13
                r0 = r15
                com.avito.android.suggest_addresses.mvi.a$a$a r0 = (com.avito.android.suggest_addresses.mvi.a.C8844a.C8845a) r0
                int r1 = r0.f291896r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f291896r = r1
                goto L18
            L13:
                com.avito.android.suggest_addresses.mvi.a$a$a r0 = new com.avito.android.suggest_addresses.mvi.a$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f291895q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f291896r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r15)
                goto L8c
            L29:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L31:
                kotlin.C42729a0.b(r15)
                com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
                boolean r15 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r15 == 0) goto L6e
                com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
                java.lang.Object r14 = r14.getResult()
                com.avito.android.suggest_addresses.model.ResolvedAddressResult r14 = (com.avito.android.suggest_addresses.model.ResolvedAddressResult) r14
                com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction$FinishScreenWithResult r15 = new com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction$FinishScreenWithResult
                java.lang.String r5 = r14.getAddressId()
                java.lang.String r6 = r14.getAddress()
                java.lang.String r7 = r14.getLocality()
                com.avito.android.remote.model.SuggestAddress$Kind r9 = r14.getKind()
                java.lang.String r8 = r14.getParamId()
                com.avito.android.remote.model.SuggestAddress r14 = new com.avito.android.remote.model.SuggestAddress
                r10 = 0
                r11 = 32
                r12 = 0
                r4 = r14
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                com.avito.android.remote.model.SuggestAddress[] r14 = new com.avito.android.remote.model.SuggestAddress[]{r14}
                java.util.ArrayList r14 = kotlin.collections.C42745f0.j(r14)
                r15.<init>(r14)
                goto L81
            L6e:
                boolean r15 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r15 == 0) goto L8f
                com.avito.android.remote.model.TypedResult$Error r14 = (com.avito.android.remote.model.TypedResult.Error) r14
                com.avito.android.remote.error.ApiError r15 = r14.getError()
                java.lang.Throwable r14 = r14.getCause()
                com.avito.android.util.C35936s.a(r15, r14)
                com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction$ResolveAddressError r15 = com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction.ResolveAddressError.f291924b
            L81:
                r0.f291896r = r3
                kotlinx.coroutines.flow.j r14 = r13.f291894b
                java.lang.Object r14 = r14.emit(r15, r0)
                if (r14 != r1) goto L8c
                return r1
            L8c:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            L8f:
                kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                r14.<init>()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.suggest_addresses.mvi.a.C8844a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public a(InterfaceC43160i interfaceC43160i) {
        this.f291893b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super SuggestAddressesInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f291893b.collect(new C8844a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
