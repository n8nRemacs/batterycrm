package com.avito.android.phone_reverification_info.mvi;

import Y41.p;
import com.avito.android.phone_reverification_info.PhoneReverificationInfo;
import com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhoneReverificationInfoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.phone_reverification_info.mvi.PhoneReverificationInfoActor$actionDisallowClicked$1", f = "PhoneReverificationInfoActor.kt", i = {0, 1}, l = {57, 61, 63, 63}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super PhoneReverificationInfoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f216143q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f216144r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f216145s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PhoneReverificationInfo.Disallow f216146t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, PhoneReverificationInfo.Disallow disallow, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f216145s = bVar;
        this.f216146t = disallow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f216145s, this.f216146t, continuation);
        aVar.f216144r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhoneReverificationInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.flow.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f216143q
            com.avito.android.phone_reverification_info.PhoneReverificationInfo$Disallow r2 = r10.f216146t
            r3 = 4
            r4 = 3
            r5 = 2
            com.avito.android.phone_reverification_info.mvi.b r6 = r10.f216145s
            r7 = 1
            if (r1 == 0) goto L40
            if (r1 == r7) goto L38
            if (r1 == r5) goto L2e
            if (r1 == r4) goto L29
            if (r1 == r3) goto L20
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            java.lang.Object r0 = r10.f216144r
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.C42729a0.b(r11)
            goto Lb2
        L29:
            kotlin.C42729a0.b(r11)
            goto La1
        L2e:
            java.lang.Object r1 = r10.f216144r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L36
            goto L93
        L36:
            r11 = move-exception
            goto La4
        L38:
            java.lang.Object r1 = r10.f216144r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L68
        L40:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f216144r
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            com.avito.android.phone_reverification_info.events.PhoneReverificationButtonName r1 = com.avito.android.phone_reverification_info.events.PhoneReverificationButtonName.f216101d
            r6.getClass()
            w70.a r8 = new w70.a
            r2.getClass()
            r9 = 0
            r8.<init>(r9, r1)
            com.avito.android.analytics.a r1 = r6.f216147a
            r1.c(r8)
            com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction$LogoutLoading r1 = com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction.LogoutLoading.f216167b
            r10.f216144r = r11
            r10.f216143q = r7
            java.lang.Object r1 = r11.emit(r1, r10)
            if (r1 != r0) goto L67
            return r0
        L67:
            r1 = r11
        L68:
            A70.a r11 = r6.f216148b
            java.util.ArrayList r11 = r11.f121a
            java.util.Iterator r11 = r11.iterator()
        L70:
            boolean r8 = r11.hasNext()
            if (r8 == 0) goto L80
            java.lang.Object r8 = r11.next()
            com.avito.android.social.D r8 = (com.avito.android.social.D) r8
            r8.a()
            goto L70
        L80:
            com.avito.android.account.a r11 = r6.f216149c     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r2.f216040e     // Catch: java.lang.Throwable -> L36
            io.reactivex.rxjava3.internal.operators.completable.K r11 = r11.a(r2, r7)     // Catch: java.lang.Throwable -> L36
            r10.f216144r = r1     // Catch: java.lang.Throwable -> L36
            r10.f216143q = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r11 = kotlinx.coroutines.rx3.C43292o.a(r11, r10)     // Catch: java.lang.Throwable -> L36
            if (r11 != r0) goto L93
            return r0
        L93:
            com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction$FinishWithRouteToProfile r11 = com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction.FinishWithRouteToProfile.f216163b
            r2 = 0
            r10.f216144r = r2
            r10.f216143q = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto La1
            return r0
        La1:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        La4:
            com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction$FinishWithRouteToProfile r2 = com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction.FinishWithRouteToProfile.f216163b
            r10.f216144r = r11
            r10.f216143q = r3
            java.lang.Object r1 = r1.emit(r2, r10)
            if (r1 != r0) goto Lb1
            return r0
        Lb1:
            r0 = r11
        Lb2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.phone_reverification_info.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
