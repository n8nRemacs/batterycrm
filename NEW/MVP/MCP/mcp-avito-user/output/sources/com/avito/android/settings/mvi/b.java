package com.avito.android.settings.mvi;

import Nv0.InterfaceC14617b;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LNv0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.settings.mvi.SettingsActor$loadData$1", f = "SettingsActor.kt", i = {1, 2}, l = {97, UpdateStatusCode.DialogButton.CONFIRM, 103, 104, 105}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14617b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f280901q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f280902r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f280903s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f280903s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f280903s, continuation);
        bVar.f280902r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14617b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[RETURN] */
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
            int r1 = r9.f280901q
            com.avito.android.settings.mvi.d r2 = r9.f280903s
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L3c
            if (r1 == r7) goto L38
            if (r1 == r6) goto L30
            if (r1 == r5) goto L28
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            goto L23
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            kotlin.C42729a0.b(r10)
            goto La6
        L28:
            java.lang.Object r1 = r9.f280902r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L77
        L30:
            java.lang.Object r1 = r9.f280902r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L6a
        L38:
            kotlin.C42729a0.b(r10)
            goto L59
        L3c:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f280902r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            U20.d r1 = r2.f280910d
            boolean r1 = r1.a()
            if (r1 != 0) goto L5c
            Nv0.b$g r1 = new Nv0.b$g
            r1.<init>(r8)
            r9.f280901q = r7
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto L59
            return r0
        L59:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        L5c:
            Nv0.b$f r1 = Nv0.InterfaceC14617b.f.f11822a
            r9.f280902r = r10
            r9.f280901q = r6
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L69
            return r0
        L69:
            r1 = r10
        L6a:
            com.avito.android.replace_main.toggle.m r10 = r2.f280911e
            r9.f280902r = r1
            r9.f280901q = r5
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L77
            return r0
        L77:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r2 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto L8a
            Nv0.b$e r10 = Nv0.InterfaceC14617b.e.f11821a
            r9.f280902r = r8
            r9.f280901q = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto La6
            return r0
        L8a:
            boolean r2 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r2 == 0) goto La6
            Nv0.b$g r2 = new Nv0.b$g
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r10 = r10.getResult()
            com.avito.android.replace_main.toggle.d r10 = (com.avito.android.replace_main.toggle.d) r10
            r2.<init>(r10)
            r9.f280902r = r8
            r9.f280901q = r3
            java.lang.Object r10 = r1.emit(r2, r9)
            if (r10 != r0) goto La6
            return r0
        La6:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.settings.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
