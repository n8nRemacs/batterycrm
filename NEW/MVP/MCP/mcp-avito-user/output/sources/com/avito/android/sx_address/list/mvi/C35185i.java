package com.avito.android.sx_address.list.mvi;

import com.avito.android.sx_address.list.domain.ScreenData;
import com.avito.android.sx_address.list.mvi.entity.a;
import com.facebook.imageutils.JfifUtil;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.list.mvi.SxAddressListActor$invoke$18", f = "SxAddressListActor.kt", i = {0, 1, 2, 3, 3}, l = {224, JfifUtil.MARKER_APP1, 226, 228, 229}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "data"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1"})
/* renamed from: com.avito.android.sx_address.list.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35185i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public ScreenData f293328q;

    /* renamed from: r, reason: collision with root package name */
    public int f293329r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f293330s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.t f293331t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f293332u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35185i(a.t tVar, x xVar, Continuation<? super C35185i> continuation) {
        super(2, continuation);
        this.f293331t = tVar;
        this.f293332u = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35185i c35185i = new C35185i(this.f293331t, this.f293332u, continuation);
        c35185i.f293330s = obj;
        return c35185i;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35185i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f293329r
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L46
            if (r1 == r6) goto L3e
            if (r1 == r5) goto L36
            if (r1 == r4) goto L2e
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            kotlin.C42729a0.b(r11)
            goto Lab
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            com.avito.android.sx_address.list.domain.ScreenData r1 = r10.f293328q
            java.lang.Object r3 = r10.f293330s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r11)
            goto L98
        L2e:
            java.lang.Object r1 = r10.f293330s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L81
        L36:
            java.lang.Object r1 = r10.f293330s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L6e
        L3e:
            java.lang.Object r1 = r10.f293330s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L5b
        L46:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f293330s
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            com.avito.android.sx_address.list.mvi.entity.b$q r1 = com.avito.android.sx_address.list.mvi.entity.b.q.f293297a
            r10.f293330s = r11
            r10.f293329r = r6
            java.lang.Object r1 = r11.emit(r1, r10)
            if (r1 != r0) goto L5a
            return r0
        L5a:
            r1 = r11
        L5b:
            com.avito.android.sx_address.list.mvi.entity.a$t r11 = r10.f293331t
            long r6 = r11.f293276a
            r11 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r11
            long r6 = r6 * r8
            r10.f293330s = r1
            r10.f293329r = r5
            java.lang.Object r11 = kotlinx.coroutines.C43131e0.b(r6, r10)
            if (r11 != r0) goto L6e
            return r0
        L6e:
            com.avito.android.sx_address.list.mvi.x r11 = r10.f293332u
            com.avito.android.sx_address.list.domain.b r5 = r11.f293376a
            com.avito.android.sx_address.SxAddressListParams r11 = r11.f293377b
            long r6 = r11.f292541b
            r10.f293330s = r1
            r10.f293329r = r4
            java.lang.Object r11 = r5.a(r6, r10)
            if (r11 != r0) goto L81
            return r0
        L81:
            RA0.e r11 = (RA0.e) r11
            com.avito.android.sx_address.list.domain.ScreenData r11 = com.avito.android.sx_address.list.domain.a.a(r11)
            r10.f293330s = r1
            r10.f293328q = r11
            r10.f293329r = r3
            r3 = 300(0x12c, double:1.48E-321)
            java.lang.Object r3 = kotlinx.coroutines.C43131e0.b(r3, r10)
            if (r3 != r0) goto L96
            return r0
        L96:
            r3 = r1
            r1 = r11
        L98:
            com.avito.android.sx_address.list.mvi.entity.b$m r11 = new com.avito.android.sx_address.list.mvi.entity.b$m
            r11.<init>(r1)
            r1 = 0
            r10.f293330s = r1
            r10.f293328q = r1
            r10.f293329r = r2
            java.lang.Object r11 = r3.emit(r11, r10)
            if (r11 != r0) goto Lab
            return r0
        Lab:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.list.mvi.C35185i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
