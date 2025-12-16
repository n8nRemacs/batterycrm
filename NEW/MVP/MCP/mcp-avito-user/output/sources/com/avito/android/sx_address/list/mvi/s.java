package com.avito.android.sx_address.list.mvi;

import com.avito.android.sx_address.list.domain.ScreenData;
import com.avito.android.sx_address.list.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: SxAddressListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.list.mvi.SxAddressListActor$invoke$5", f = "SxAddressListActor.kt", i = {0, 2, 3, 4, 4}, l = {123, WebSocketProtocol.PAYLOAD_SHORT, 130, 131, 133, 134}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "data"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public ScreenData f293359q;

    /* renamed from: r, reason: collision with root package name */
    public int f293360r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f293361s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.o f293362t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f293363u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a.o oVar, x xVar, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f293362t = oVar;
        this.f293363u = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f293362t, this.f293363u, continuation);
        sVar.f293361s = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((s) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f293360r
            com.avito.android.sx_address.list.mvi.entity.a$o r2 = r6.f293362t
            r3 = 0
            switch(r1) {
                case 0: goto L3e;
                case 1: goto L36;
                case 2: goto L31;
                case 3: goto L29;
                case 4: goto L1f;
                case 5: goto L14;
                case 6: goto L31;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L14:
            com.avito.android.sx_address.list.domain.ScreenData r1 = r6.f293359q
            java.lang.Object r2 = r6.f293361s
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r7)
            goto Lb0
        L1f:
            java.lang.Object r1 = r6.f293361s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
        L26:
            r2 = r1
            goto L9a
        L29:
            java.lang.Object r1 = r6.f293361s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L86
        L31:
            kotlin.C42729a0.b(r7)
            goto Lc3
        L36:
            java.lang.Object r1 = r6.f293361s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L59
        L3e:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f293361s
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.sx_address.list.mvi.entity.b$k r1 = new com.avito.android.sx_address.list.mvi.entity.b$k
            com.avito.android.sx_address.SxAddressEditResult r4 = r2.f293271a
            r1.<init>(r4)
            r6.f293361s = r7
            r4 = 1
            r6.f293360r = r4
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L58
            return r0
        L58:
            r1 = r7
        L59:
            com.avito.android.sx_address.SxAddressEditResult r7 = r2.f293271a
            boolean r2 = r7 instanceof com.avito.android.sx_address.SxAddressEditResult.Failure
            if (r2 == 0) goto L74
            com.avito.android.sx_address.list.mvi.entity.b$c r2 = new com.avito.android.sx_address.list.mvi.entity.b$c
            com.avito.android.sx_address.SxAddressEditResult$Failure r7 = (com.avito.android.sx_address.SxAddressEditResult.Failure) r7
            java.lang.Throwable r7 = r7.f292537b
            r2.<init>(r7)
            r6.f293361s = r3
            r7 = 2
            r6.f293360r = r7
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto Lc3
            return r0
        L74:
            boolean r7 = r7 instanceof com.avito.android.sx_address.SxAddressEditResult.Success
            if (r7 == 0) goto Lc3
            com.avito.android.sx_address.list.mvi.entity.b$q r7 = com.avito.android.sx_address.list.mvi.entity.b.q.f293297a
            r6.f293361s = r1
            r2 = 3
            r6.f293360r = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L86
            return r0
        L86:
            com.avito.android.sx_address.list.mvi.x r7 = r6.f293363u
            com.avito.android.sx_address.list.domain.b r2 = r7.f293376a
            com.avito.android.sx_address.SxAddressListParams r7 = r7.f293377b
            long r4 = r7.f292541b
            r6.f293361s = r1
            r7 = 4
            r6.f293360r = r7
            java.lang.Object r7 = r2.a(r4, r6)
            if (r7 != r0) goto L26
            return r0
        L9a:
            RA0.e r7 = (RA0.e) r7
            com.avito.android.sx_address.list.domain.ScreenData r1 = com.avito.android.sx_address.list.domain.a.a(r7)
            r6.f293361s = r2
            r6.f293359q = r1
            r7 = 5
            r6.f293360r = r7
            r4 = 300(0x12c, double:1.48E-321)
            java.lang.Object r7 = kotlinx.coroutines.C43131e0.b(r4, r6)
            if (r7 != r0) goto Lb0
            return r0
        Lb0:
            com.avito.android.sx_address.list.mvi.entity.b$m r7 = new com.avito.android.sx_address.list.mvi.entity.b$m
            r7.<init>(r1)
            r6.f293361s = r3
            r6.f293359q = r3
            r1 = 6
            r6.f293360r = r1
            java.lang.Object r7 = r2.emit(r7, r6)
            if (r7 != r0) goto Lc3
            return r0
        Lc3:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.list.mvi.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
