package com.avito.android.auto_loans_cabinet;

import Ke.InterfaceC14305a;
import androidx.compose.foundation.layout.T1;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoLoanCabinetScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.auto_loans_cabinet.n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28709n extends kotlin.jvm.internal.N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoLoansCabinetState f95505l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC14305a, G0> f95506m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28709n(Y41.l lVar, AutoLoansCabinetState autoLoansCabinetState) {
        super(3);
        this.f95505l = autoLoansCabinetState;
        this.f95506m = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    @Override // Y41.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r4, androidx.compose.runtime.A r5, java.lang.Integer r6) {
        /*
            r3 = this;
            androidx.compose.foundation.layout.T1 r4 = (androidx.compose.foundation.layout.T1) r4
            androidx.compose.runtime.A r5 = (androidx.compose.runtime.A) r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            r4 = r4 & 81
            r6 = 16
            if (r4 != r6) goto L1c
            boolean r4 = r5.c()
            if (r4 != 0) goto L17
            goto L1c
        L17:
            r5.f()
            goto La6
        L1c:
            com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState r4 = r3.f95505l
            com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState$BlanksState r6 = r4.f95450b
            boolean r0 = r6 instanceof com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success
            Y41.l<Ke.a, kotlin.G0> r1 = r3.f95506m
            r2 = 0
            if (r0 == 0) goto L4d
            r6 = 373047323(0x163c401b, float:1.5206747E-25)
            r5.C(r6)
            r6 = -1650533607(0xffffffff9d9edb19, float:-4.2048793E-21)
            r5.C(r6)
            com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState$BlanksState r4 = r4.f95450b
            com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState$BlanksState$Success r4 = (com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Success) r4
            boolean r6 = r4.getF95455d()
            if (r6 == 0) goto L41
            r6 = 0
            com.avito.android.auto_loans_cabinet.I.a(r1, r6, r5, r2)
        L41:
            r5.h()
            r6 = 8
            com.avito.android.auto_loans_cabinet.C28710o.f(r4, r1, r5, r6)
            r5.h()
            goto La6
        L4d:
            boolean r4 = r6 instanceof com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Loading
            if (r4 == 0) goto L66
            r4 = 373516849(0x16436a31, float:1.5785483E-25)
            r5.C(r4)
            androidx.compose.ui.v$a r4 = androidx.compose.ui.v.f42878y1
            androidx.compose.foundation.layout.FillElement r6 = androidx.compose.foundation.layout.C20588k2.f28682c
            r4.getClass()
            r4 = 6
            com.avito.android.auto_loans_cabinet.C28710o.e(r6, r5, r4)
            r5.h()
            goto La6
        L66:
            boolean r4 = r6 instanceof com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState.BlanksState.Error
            if (r4 == 0) goto L9d
            r4 = 373748481(0x1646f301, float:1.6070991E-25)
            r5.C(r4)
            r4 = -1650509962(0xffffffff9d9f3776, float:-4.2144295E-21)
            r5.C(r4)
            boolean r4 = r5.B(r1)
            java.lang.Object r6 = r5.t()
            if (r4 != 0) goto L89
            androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
            r4.getClass()
            androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r4) goto L91
        L89:
            com.avito.android.auto_loans_cabinet.m r6 = new com.avito.android.auto_loans_cabinet.m
            r6.<init>(r1)
            r5.H(r6)
        L91:
            Y41.a r6 = (Y41.a) r6
            r5.h()
            com.avito.android.auto_loans_cabinet.C28710o.d(r6, r5, r2)
            r5.h()
            goto La6
        L9d:
            r4 = 373940278(0x1649e036, float:1.6307399E-25)
            r5.C(r4)
            r5.h()
        La6:
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auto_loans_cabinet.C28709n.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
