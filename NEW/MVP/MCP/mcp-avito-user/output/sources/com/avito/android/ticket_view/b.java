package com.avito.android.ticket_view;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.ticket_view.mvi.k;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TicketMenuIconInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ticket_view/b;", "", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f301390a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f301391b;

    /* compiled from: TicketMenuIconInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ticket_view/mvi/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ticket_view.TicketMenuIconInteractor$getTicketQuantityInfo$1", f = "TicketMenuIconInteractor.kt", i = {0}, l = {20, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super com.avito.android.ticket_view.mvi.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f301392q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f301393r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f301393r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super com.avito.android.ticket_view.mvi.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f301392q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f301393r;
                this.f301393r = interfaceC43172j;
                this.f301392q = 1;
                obj = b.this.f301390a.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f301393r;
                C42729a0.b(obj);
            }
            TypedResult success = (TypedResult) obj;
            if (success instanceof TypedResult.Success) {
                success = new TypedResult.Success(Boxing.boxInt((int) ((Number) ((TypedResult.Success) success).getResult()).longValue()));
            } else if (!(success instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            if (success instanceof TypedResult.Success) {
                k.b bVar = new k.b(((Number) ((TypedResult.Success) success).getResult()).intValue());
                this.f301393r = null;
                this.f301392q = 2;
                if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(success instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) success;
                k.a aVar = new k.a(C35936s.a(error.getError(), error.getCause()));
                this.f301393r = null;
                this.f301392q = 3;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k e eVar, @Y61.k R0 r02) {
        this.f301390a = eVar;
        this.f301391b = r02;
    }

    @Y61.k
    public final InterfaceC43160i<com.avito.android.ticket_view.mvi.k> a() {
        return C43175k.I(this.f301391b.a(), C43175k.G(new a(null)));
    }
}
