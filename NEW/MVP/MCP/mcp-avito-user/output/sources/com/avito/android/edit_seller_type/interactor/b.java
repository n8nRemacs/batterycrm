package com.avito.android.edit_seller_type.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import Za0.InterfaceC19524a;
import androidx.compose.runtime.internal.P;
import com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import h31.e;
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
import wy.InterfaceC49701a;

/* compiled from: EditSellerTypeInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/interactor/b;", "Lcom/avito/android/edit_seller_type/interactor/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.edit_seller_type.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49701a f146752a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f146753b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e<InterfaceC19524a> f146754c;

    /* compiled from: EditSellerTypeInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_seller_type.interactor.EditSellerTypeInteractorImpl$loadEditSellerTypeInitialState$1", f = "EditSellerTypeInteractor.kt", i = {0, 1}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF, 30}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super EditSellerTypeInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146755q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f146756r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f146756r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditSellerTypeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f146755q
                com.avito.android.edit_seller_type.interactor.b r2 = com.avito.android.edit_seller_type.interactor.b.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.C42729a0.b(r8)
                goto La7
            L24:
                java.lang.Object r1 = r7.f146756r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5c
            L2c:
                java.lang.Object r1 = r7.f146756r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L49
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f146756r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction$Loading r1 = com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction.Loading.f146786b
                r7.f146756r = r8
                r7.f146755q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L48
                return r0
            L48:
                r1 = r8
            L49:
                h31.e<Za0.a> r8 = r2.f146754c
                java.lang.Object r8 = r8.get()
                Za0.a r8 = (Za0.InterfaceC19524a) r8
                r7.f146756r = r1
                r7.f146755q = r5
                java.lang.Object r8 = r8.d(r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L81
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                cb0.h r8 = (cb0.h) r8
                com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction$ShowContent r3 = new com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction$ShowContent
                wy.a r2 = r2.f146752a
                com.avito.android.edit_seller_type.mvi.entity.c$g r8 = r2.a(r8)
                r3.<init>(r8)
                r7.f146756r = r6
                r7.f146755q = r4
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto La7
                return r0
            L81:
                boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Laa
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r2 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r2, r8)
                com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction$Error r2 = new com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction$Error
                java.lang.String r8 = com.avito.android.error.z.l(r8)
                r2.<init>(r8)
                r7.f146756r = r6
                r7.f146755q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto La7
                return r0
            La7:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            Laa:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_seller_type.interactor.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k InterfaceC49701a interfaceC49701a, @k R0 r02, @k e<InterfaceC19524a> eVar) {
        this.f146752a = interfaceC49701a;
        this.f146753b = r02;
        this.f146754c = eVar;
    }

    @Override // com.avito.android.edit_seller_type.interactor.a
    @k
    public final InterfaceC43160i<EditSellerTypeInternalAction> a() {
        return C43175k.I(this.f146753b.a(), C43175k.G(new a(null)));
    }
}
