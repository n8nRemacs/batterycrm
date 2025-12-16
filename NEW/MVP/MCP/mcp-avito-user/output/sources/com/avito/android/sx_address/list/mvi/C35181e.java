package com.avito.android.sx_address.list.mvi;

import com.avito.android.sx_address.list.domain.ScreenData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.list.mvi.SxAddressListActor$invoke$14", f = "SxAddressListActor.kt", i = {0, 1, 2, 2}, l = {180, 181, 183, 184}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "data"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* renamed from: com.avito.android.sx_address.list.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35181e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public ScreenData f293239q;

    /* renamed from: r, reason: collision with root package name */
    public int f293240r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f293241s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f293242t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35181e(x xVar, Continuation<? super C35181e> continuation) {
        super(2, continuation);
        this.f293242t = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35181e c35181e = new C35181e(this.f293242t, continuation);
        c35181e.f293241s = obj;
        return c35181e;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35181e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[RETURN] */
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
            int r1 = r8.f293240r
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L33
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            kotlin.C42729a0.b(r9)
            goto L8d
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            com.avito.android.sx_address.list.domain.ScreenData r1 = r8.f293239q
            java.lang.Object r3 = r8.f293241s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r9)
            goto L7a
        L2b:
            java.lang.Object r1 = r8.f293241s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L63
        L33:
            java.lang.Object r1 = r8.f293241s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L50
        L3b:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f293241s
            r1 = r9
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.sx_address.list.mvi.entity.b$q r9 = com.avito.android.sx_address.list.mvi.entity.b.q.f293297a
            r8.f293241s = r1
            r8.f293240r = r5
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L50
            return r0
        L50:
            com.avito.android.sx_address.list.mvi.x r9 = r8.f293242t
            com.avito.android.sx_address.list.domain.b r5 = r9.f293376a
            com.avito.android.sx_address.SxAddressListParams r9 = r9.f293377b
            long r6 = r9.f292541b
            r8.f293241s = r1
            r8.f293240r = r4
            java.lang.Object r9 = r5.a(r6, r8)
            if (r9 != r0) goto L63
            return r0
        L63:
            RA0.e r9 = (RA0.e) r9
            com.avito.android.sx_address.list.domain.ScreenData r9 = com.avito.android.sx_address.list.domain.a.a(r9)
            r8.f293241s = r1
            r8.f293239q = r9
            r8.f293240r = r3
            r3 = 300(0x12c, double:1.48E-321)
            java.lang.Object r3 = kotlinx.coroutines.C43131e0.b(r3, r8)
            if (r3 != r0) goto L78
            return r0
        L78:
            r3 = r1
            r1 = r9
        L7a:
            com.avito.android.sx_address.list.mvi.entity.b$m r9 = new com.avito.android.sx_address.list.mvi.entity.b$m
            r9.<init>(r1)
            r1 = 0
            r8.f293241s = r1
            r8.f293239q = r1
            r8.f293240r = r2
            java.lang.Object r9 = r3.emit(r9, r8)
            if (r9 != r0) goto L8d
            return r0
        L8d:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.list.mvi.C35181e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
