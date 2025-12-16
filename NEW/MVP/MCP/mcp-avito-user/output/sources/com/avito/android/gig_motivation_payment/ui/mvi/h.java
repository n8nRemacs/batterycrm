package com.avito.android.gig_motivation_payment.ui.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_motivation_payment.ui.MotivationPaymentOpenParams;
import com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rH.InterfaceC47543a;
import vH.InterfaceC49211a;

/* compiled from: MotivationPaymentActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/h;", "Lcom/avito/android/arch/mvi/a;", "LvH/a;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "LvH/c;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements com.avito.android.arch.mvi.a<InterfaceC49211a, MotivationPaymentInternalAction, vH.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MotivationPaymentOpenParams f160240a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f160241b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47543a f160242c;

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k MotivationPaymentOpenParams motivationPaymentOpenParams, @Y61.k InterfaceC47543a interfaceC47543a) {
        this.f160240a = motivationPaymentOpenParams;
        this.f160241b = aVar;
        this.f160242c = interfaceC47543a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.gig_motivation_payment.ui.mvi.h r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof com.avito.android.gig_motivation_payment.ui.mvi.a
            if (r0 == 0) goto L17
            r0 = r10
            com.avito.android.gig_motivation_payment.ui.mvi.a r0 = (com.avito.android.gig_motivation_payment.ui.mvi.a) r0
            int r1 = r0.f160218s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f160218s = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            com.avito.android.gig_motivation_payment.ui.mvi.a r0 = new com.avito.android.gig_motivation_payment.ui.mvi.a
            r0.<init>(r8, r10)
            goto L15
        L1d:
            java.lang.Object r10 = r6.f160216q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f160218s
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L39
            if (r1 != r3) goto L31
            kotlin.C42729a0.b(r10)
            goto L67
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.C42729a0.b(r10)
            goto L4b
        L3d:
            kotlin.C42729a0.b(r10)
            r6.f160218s = r2
            rH.a r8 = r8.f160242c
            java.lang.Object r10 = r8.a(r9, r6)
            if (r10 != r0) goto L4b
            goto L68
        L4b:
            r1 = r10
            com.avito.android.remote.model.TypedResult r1 = (com.avito.android.remote.model.TypedResult) r1
            com.avito.android.gig_motivation_payment.ui.mvi.b r2 = new com.avito.android.gig_motivation_payment.ui.mvi.b
            r8 = 0
            r2.<init>(r3, r8)
            com.avito.android.gig_motivation_payment.ui.mvi.c r9 = new com.avito.android.gig_motivation_payment.ui.mvi.c
            r9.<init>(r3, r8)
            r6.f160218s = r3
            r4 = 0
            r5 = 0
            r7 = 60
            r3 = r9
            java.lang.Object r10 = com.avito.android.error.z.s(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L67
            goto L68
        L67:
            r0 = r10
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_motivation_payment.ui.mvi.h.c(com.avito.android.gig_motivation_payment.ui.mvi.h, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<MotivationPaymentInternalAction> b(InterfaceC49211a interfaceC49211a, vH.c cVar) {
        InterfaceC49211a interfaceC49211a2 = interfaceC49211a;
        boolean z12 = interfaceC49211a2 instanceof InterfaceC49211a.d;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f160241b;
        if (z12) {
            b.a.a(aVar, ((InterfaceC49211a.d) interfaceC49211a2).f440629a, null, null, 6);
            return C43175k.w();
        }
        if (interfaceC49211a2 instanceof InterfaceC49211a.e) {
            return C43175k.G(new d(interfaceC49211a2, this, null));
        }
        if (interfaceC49211a2 instanceof InterfaceC49211a.b) {
            b.a.a(aVar, ((InterfaceC49211a.b) interfaceC49211a2).f440627a, null, null, 6);
            return C43175k.w();
        }
        if (interfaceC49211a2.equals(InterfaceC49211a.C12758a.f440626a)) {
            return C43175k.G(new e(2, null));
        }
        if (interfaceC49211a2.equals(InterfaceC49211a.c.f440628a)) {
            return C43175k.G(new f(this, null));
        }
        if (interfaceC49211a2.equals(InterfaceC49211a.f.f440632a)) {
            return C43175k.G(new g(this, null));
        }
        if (interfaceC49211a2 instanceof InterfaceC49211a.g) {
            b.a.a(aVar, ((InterfaceC49211a.g) interfaceC49211a2).f440633a, null, null, 6);
            return C43175k.w();
        }
        if (!(interfaceC49211a2 instanceof InterfaceC49211a.h)) {
            throw new NoWhenBranchMatchedException();
        }
        b.a.a(aVar, ((InterfaceC49211a.h) interfaceC49211a2).f440634a, null, null, 6);
        return C43175k.w();
    }
}
