package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.authorization.confirm_3fa.mvi.entity.ConfirmEmailListInternalAction;
import ge.InterfaceC40665a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ConfirmEmailListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.confirm_3fa.mvi.ConfirmEmailListActor$process$1", f = "ConfirmEmailListActor.kt", i = {0}, l = {23, 32, 32}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ConfirmEmailListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f93595q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f93596r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40665a f93597s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f93598t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC40665a interfaceC40665a, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f93597s = interfaceC40665a;
        this.f93598t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f93597s, this.f93598t, continuation);
        aVar.f93596r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ConfirmEmailListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f93595q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r10)
            goto L80
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r1 = r9.f93596r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L74
        L25:
            java.lang.Object r1 = r9.f93596r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L45
        L2d:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f93596r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            com.avito.android.authorization.confirm_3fa.mvi.entity.ConfirmEmailListInternalAction$StartLoading r1 = new com.avito.android.authorization.confirm_3fa.mvi.entity.ConfirmEmailListInternalAction$StartLoading
            r1.<init>()
            r9.f93596r = r10
            r9.f93595q = r4
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L44
            return r0
        L44:
            r1 = r10
        L45:
            ge.a r10 = r9.f93597s
            ge.a$a r10 = (ge.InterfaceC40665a.C11215a) r10
            com.avito.android.authorization.confirm_3fa.adapter.email.EmailItem r4 = r10.f396645a
            java.lang.String r4 = r4.f93561c
            java.lang.String r5 = "no_email"
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            com.avito.android.authorization.confirm_3fa.mvi.b r5 = r9.f93598t
            if (r4 == 0) goto L65
            com.avito.android.analytics.a r4 = r5.f93600b
            com.avito.android.authorization.event.AutoRecoveryPhoneUnavailableReasonPickedEvent r6 = new com.avito.android.authorization.event.AutoRecoveryPhoneUnavailableReasonPickedEvent
            com.avito.android.authorization.event.AutoRecoveryPhoneUnavailableReasonPickedEvent$MailReason r7 = com.avito.android.authorization.event.AutoRecoveryPhoneUnavailableReasonPickedEvent.MailReason.f93842c
            java.lang.String r8 = "3fa_restore"
            r6.<init>(r7, r8)
            r4.c(r6)
        L65:
            com.avito.android.authorization.confirm_3fa.mvi.j r4 = r5.f93599a
            com.avito.android.authorization.confirm_3fa.adapter.email.EmailItem r10 = r10.f396645a
            r9.f93596r = r1
            r9.f93595q = r3
            java.lang.Object r10 = r4.a(r10, r9)
            if (r10 != r0) goto L74
            return r0
        L74:
            r3 = 0
            r9.f93596r = r3
            r9.f93595q = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L80
            return r0
        L80:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.confirm_3fa.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
