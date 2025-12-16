package com.avito.android.multi_message_send.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import java.util.List;
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
import ru.avito.messenger.A;
import ru.avito.messenger.F0;

/* compiled from: SendMessagesUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multi_message_send/domain/l;", "", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A20.a f206713a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A f206714b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f206715c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f206716d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final F0 f206717e;

    /* compiled from: SendMessagesUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.multi_message_send.domain.SendMessagesUseCase$invoke$1", f = "SendMessagesUseCase.kt", i = {0, 1}, l = {36, 37, 110, 46, 50}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MultiMessageSendInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f206718q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f206719r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<Long> f206721t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f206722u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Long> list, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f206721t = list;
            this.f206722u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = l.this.new a(this.f206721t, this.f206722u, continuation);
            aVar.f206719r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MultiMessageSendInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f206718q
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L36
                if (r1 == r6) goto L2e
                if (r1 == r5) goto L25
                if (r1 == r4) goto L20
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                kotlin.C42729a0.b(r13)
                goto Lb9
            L25:
                java.lang.Object r1 = r12.f206719r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
            L2c:
                r8 = r1
                goto L61
            L2e:
                java.lang.Object r1 = r12.f206719r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L4b
            L36:
                kotlin.C42729a0.b(r13)
                java.lang.Object r13 = r12.f206719r
                kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.InterfaceC43172j) r13
                com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction$OnSendStarted r1 = com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction.OnSendStarted.f206767b
                r12.f206719r = r13
                r12.f206718q = r6
                java.lang.Object r1 = r13.emit(r1, r12)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r1 = r13
            L4b:
                com.avito.android.multi_message_send.domain.l r13 = com.avito.android.multi_message_send.domain.l.this
                A20.a r13 = r13.f206713a
                com.avito.android.multi_message_send.generated.api.api_bulk_messaging_modal_action.BulkMessagingMessagesSentRequest r6 = new com.avito.android.multi_message_send.generated.api.api_bulk_messaging_modal_action.BulkMessagingMessagesSentRequest
                com.avito.android.multi_message_send.generated.api.api_bulk_messaging_modal_action.BulkMessagingMessagesSentRequest$ActionType r7 = com.avito.android.multi_message_send.generated.api.api_bulk_messaging_modal_action.BulkMessagingMessagesSentRequest.ActionType.CheckSend
                r6.<init>(r7)
                r12.f206719r = r1
                r12.f206718q = r5
                java.lang.Object r13 = r13.a(r6, r12)
                if (r13 != r0) goto L2c
                return r0
            L61:
                com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
                boolean r1 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
                r11 = 0
                if (r1 == 0) goto L9b
                com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
                java.lang.Object r13 = r13.getResult()
                com.avito.android.multi_message_send.generated.api.api_bulk_messaging_modal_action.ApiBulkMessagingModalActionResponse r13 = (com.avito.android.multi_message_send.generated.api.api_bulk_messaging_modal_action.ApiBulkMessagingModalActionResponse) r13
                boolean r13 = r13.getSuccess()
                if (r13 == 0) goto L8e
                com.avito.android.multi_message_send.domain.k r13 = new com.avito.android.multi_message_send.domain.k
                com.avito.android.multi_message_send.domain.l r7 = com.avito.android.multi_message_send.domain.l.this
                java.lang.String r9 = r12.f206722u
                java.util.List<java.lang.Long> r6 = r12.f206721t
                r10 = 0
                r5 = r13
                r5.<init>(r6, r7, r8, r9, r10)
                r12.f206719r = r11
                r12.f206718q = r4
                java.lang.Object r13 = kotlinx.coroutines.U.c(r13, r12)
                if (r13 != r0) goto Lb9
                return r0
            L8e:
                com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction$UserOnCooldown r13 = com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction.UserOnCooldown.f206770b
                r12.f206719r = r11
                r12.f206718q = r3
                java.lang.Object r13 = r8.emit(r13, r12)
                if (r13 != r0) goto Lb9
                return r0
            L9b:
                boolean r1 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r1 == 0) goto Lbc
                com.avito.android.remote.model.TypedResult$Error r13 = (com.avito.android.remote.model.TypedResult.Error) r13
                com.avito.android.remote.error.ApiError r1 = r13.getError()
                java.lang.Throwable r13 = r13.getCause()
                com.avito.android.util.C35936s.a(r1, r13)
                com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction$SendError r13 = com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction.SendError.f206768b
                r12.f206719r = r11
                r12.f206718q = r2
                java.lang.Object r13 = r8.emit(r13, r12)
                if (r13 != r0) goto Lb9
                return r0
            Lb9:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            Lbc:
                kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.multi_message_send.domain.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public l(@Y61.k A20.a aVar, @Y61.k A a12, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k R0 r02, @Y61.k F0 f02) {
        this.f206713a = aVar;
        this.f206714b = a12;
        this.f206715c = interfaceC35863o4;
        this.f206716d = r02;
        this.f206717e = f02;
    }

    @Y61.k
    public final InterfaceC43160i a(@Y61.k String str, @Y61.k List list) {
        return C43175k.I(this.f206716d.a(), C43175k.G(new a(list, str, null)));
    }
}
