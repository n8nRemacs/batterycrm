package com.avito.android.sx_address.address_video_verification.mvi;

import Y41.p;
import com.avito.android.sx_address.address_video_verification.mvi.entity.SxAddressVideoVerificationState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressVideoVerificationActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBA0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.address_video_verification.mvi.SxAddressVideoVerificationActor$process$1", f = "SxAddressVideoVerificationActor.kt", i = {}, l = {44, 47, 47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super BA0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f292677q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f292678r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BA0.a f292679s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f292680t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SxAddressVideoVerificationState f292681u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BA0.a aVar, a aVar2, SxAddressVideoVerificationState sxAddressVideoVerificationState, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f292679s = aVar;
        this.f292680t = aVar2;
        this.f292681u = sxAddressVideoVerificationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f292679s, this.f292680t, this.f292681u, continuation);
        bVar.f292678r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BA0.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[RETURN] */
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
            int r1 = r12.f292677q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r13)
            goto L7d
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            java.lang.Object r1 = r12.f292678r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r13)
            goto L6f
        L25:
            kotlin.C42729a0.b(r13)
            goto L56
        L29:
            kotlin.C42729a0.b(r13)
            java.lang.Object r13 = r12.f292678r
            r1 = r13
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            BA0.a r13 = r12.f292679s
            BA0.a$e r13 = (BA0.a.e) r13
            java.util.ArrayList r13 = r13.f1211a
            java.lang.Object r13 = kotlin.collections.C42745f0.G(r13)
            r6 = r13
            android.net.Uri r6 = (android.net.Uri) r6
            com.avito.android.sx_address.address_video_verification.mvi.a r13 = r12.f292680t
            if (r6 != 0) goto L59
            BA0.b$h r2 = new BA0.b$h
            com.avito.android.sx_address.address_video_verification.view.d r13 = r13.f292675e
            java.lang.String r13 = r13.getF292734c()
            r2.<init>(r13)
            r12.f292677q = r4
            java.lang.Object r13 = r1.emit(r2, r12)
            if (r13 != r0) goto L56
            return r0
        L56:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        L59:
            com.avito.android.sx_address.address_video_verification.domain.d r5 = r13.f292671a
            com.avito.android.sx_address.address_video_verification.mvi.entity.SxAddressVideoVerificationState r4 = r12.f292681u
            long r7 = r4.f292698d
            com.avito.android.sx_address.SxAddressVideoVerificationParams r13 = r13.f292673c
            long r9 = r13.f292545b
            r12.f292678r = r1
            r12.f292677q = r3
            r11 = r12
            java.lang.Object r13 = r5.a(r6, r7, r9, r11)
            if (r13 != r0) goto L6f
            return r0
        L6f:
            kotlinx.coroutines.flow.i r13 = (kotlinx.coroutines.flow.InterfaceC43160i) r13
            r3 = 0
            r12.f292678r = r3
            r12.f292677q = r2
            java.lang.Object r13 = kotlinx.coroutines.flow.C43175k.u(r12, r13, r1)
            if (r13 != r0) goto L7d
            return r0
        L7d:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.address_video_verification.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
