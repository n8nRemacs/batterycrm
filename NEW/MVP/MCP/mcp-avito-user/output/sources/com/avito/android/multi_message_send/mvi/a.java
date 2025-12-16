package com.avito.android.multi_message_send.mvi;

import com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MultiMessageSendActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.multi_message_send.mvi.MultiMessageSendActor$process$1", f = "MultiMessageSendActor.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MultiMessageSendInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206740q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f206741r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G20.b f206742s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G20.d f206743t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(G20.b bVar, G20.d dVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f206742s = bVar;
        this.f206743t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f206742s, this.f206743t, continuation);
        aVar.f206741r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MultiMessageSendInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
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
            int r1 = r7.f206740q
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.C42729a0.b(r8)
            goto L47
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f206741r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction$ItemClicked r1 = new com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction$ItemClicked
            G20.b r3 = r7.f206742s
            G20.b$e r3 = (G20.b.e) r3
            long r3 = r3.f6234a
            G20.d r5 = r7.f206743t
            boolean r6 = r5.f6257k
            if (r6 == 0) goto L3a
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            java.util.List<java.lang.Long> r5 = r5.f6254h
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L3a
            r5 = r2
            goto L3b
        L3a:
            r5 = 0
        L3b:
            r1.<init>(r3, r5)
            r7.f206740q = r2
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L47
            return r0
        L47:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.multi_message_send.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
