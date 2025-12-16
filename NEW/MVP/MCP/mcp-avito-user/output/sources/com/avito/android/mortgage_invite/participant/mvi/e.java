package com.avito.android.mortgage_invite.participant.mvi;

import com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import p20.C46879d;
import p20.InterfaceC46876a;

/* compiled from: ParticipantActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.participant.mvi.ParticipantActor$process$5", f = "ParticipantActor.kt", i = {0}, l = {69, 80, 82}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ParticipantInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206184q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f206185r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f206186s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC46876a f206187t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C46879d f206188u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Continuation continuation, InterfaceC46876a interfaceC46876a, C46879d c46879d) {
        super(2, continuation);
        this.f206186s = iVar;
        this.f206187t = interfaceC46876a;
        this.f206188u = c46879d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f206186s, continuation, this.f206187t, this.f206188u);
        eVar.f206185r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ParticipantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f206184q
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            kotlin.C42729a0.b(r9)
            goto Lc7
        L20:
            java.lang.Object r1 = r8.f206185r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L5f
        L28:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f206185r
            r1 = r9
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.mortgage_invite.participant.mvi.i r9 = r8.f206186s
            com.avito.android.mortgage_invite.participant.interactor.a r9 = r9.f206223c
            p20.a r6 = r8.f206187t
            p20.a$e r6 = (p20.InterfaceC46876a.e) r6
            com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId r7 = r6.f428130a
            r9.a(r7)
            java.util.Set<com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId> r9 = com.avito.android.mortgage_invite.participant.domain.mapper.d.f206098c
            com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId r7 = r6.f428130a
            boolean r9 = r9.contains(r7)
            if (r9 == 0) goto Lb5
            java.lang.String r9 = r6.f428131b
            int r9 = r9.length()
            if (r9 != 0) goto Lb5
            com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction$ClientSelected r9 = new com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction$ClientSelected
            r9.<init>(r5)
            r8.f206185r = r1
            r8.f206184q = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L5f
            return r0
        L5f:
            p20.d r9 = r8.f206188u
            o20.c r9 = r9.f428146b
            if (r9 == 0) goto L8b
            o20.a r9 = r9.f419325e
            if (r9 == 0) goto L8b
            java.util.List<o20.d> r9 = r9.f419315b
            if (r9 == 0) goto L8b
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L73:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L87
            java.lang.Object r2 = r9.next()
            r4 = r2
            o20.d r4 = (o20.d) r4
            com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId r4 = r4.f419328a
            com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId r6 = com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId.f206099b
            if (r4 != r6) goto L73
            goto L88
        L87:
            r2 = r5
        L88:
            o20.d r2 = (o20.d) r2
            goto L8c
        L8b:
            r2 = r5
        L8c:
            com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments r9 = new com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments
            if (r2 == 0) goto L93
            java.lang.String r4 = r2.f419330c
            goto L94
        L93:
            r4 = r5
        L94:
            java.lang.String r6 = ""
            if (r4 != 0) goto L99
            r4 = r6
        L99:
            if (r2 == 0) goto L9e
            java.lang.String r2 = r2.f419331d
            goto L9f
        L9e:
            r2 = r5
        L9f:
            if (r2 != 0) goto La2
            r2 = r6
        La2:
            r9.<init>(r6, r4, r2)
            com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction$OpenClientSearch r2 = new com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction$OpenClientSearch
            r2.<init>(r9)
            r8.f206185r = r5
            r8.f206184q = r3
            java.lang.Object r9 = r1.emit(r2, r8)
            if (r9 != r0) goto Lc7
            return r0
        Lb5:
            com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction$ClientFieldUpdated r9 = new com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction$ClientFieldUpdated
            com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId r3 = r6.f428130a
            java.lang.String r4 = r6.f428131b
            r9.<init>(r3, r4)
            r8.f206184q = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto Lc7
            return r0
        Lc7:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.participant.mvi.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
