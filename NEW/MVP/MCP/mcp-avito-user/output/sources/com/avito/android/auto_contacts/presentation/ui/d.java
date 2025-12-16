package com.avito.android.auto_contacts.presentation.ui;

import androidx.compose.runtime.A;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ze.InterfaceC50551a;

/* compiled from: AutoContactsPackagesStateScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoContactsPackagesUiState f94975l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC50551a, G0> f94976m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Y41.l lVar, AutoContactsPackagesUiState autoContactsPackagesUiState) {
        super(2);
        this.f94975l = autoContactsPackagesUiState;
        this.f94976m = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r14, java.lang.Integer r15) {
        /*
            r13 = this;
            r10 = r14
            androidx.compose.runtime.A r10 = (androidx.compose.runtime.A) r10
            java.lang.Number r15 = (java.lang.Number) r15
            int r14 = r15.intValue()
            r14 = r14 & 11
            r15 = 2
            if (r14 != r15) goto L1a
            boolean r14 = r10.c()
            if (r14 != 0) goto L15
            goto L1a
        L15:
            r10.f()
            goto Lb6
        L1a:
            com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState r14 = r13.f94975l
            boolean r15 = r14 instanceof com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState.Success
            if (r15 == 0) goto Lb6
            r15 = r14
            com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState$Success r15 = (com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState.Success) r15
            com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState r0 = r15.f94957b
            com.avito.android.auto_contacts.domain.models.AutoButton r0 = r0.f94883e
            if (r0 == 0) goto Lb6
            r1 = -42593206(0xfffffffffd76144a, float:-2.0443465E37)
            r10.C(r1)
            java.lang.String r0 = r0.f94876c
            if (r0 != 0) goto L35
            r0 = 0
            goto L42
        L35:
            com.akita.compose.theme.re23.b r1 = com.akita.compose.theme.re23.b.f63983a
            r1.getClass()
            com.akita.compose.theme.re23.style.M r1 = com.akita.compose.theme.re23.b.c(r10)
            com.akita.compose.component.button.t r0 = com.akita.compose.theme.re23.style.N.a(r1, r0)
        L42:
            r10.h()
            r1 = -42593911(0xfffffffffd761189, float:-2.0442571E37)
            r10.C(r1)
            if (r0 != 0) goto L53
            com.akita.compose.theme.re23.b r0 = com.akita.compose.theme.re23.b.f63983a
            com.akita.compose.component.button.t r0 = com.avito.android.actions_sheet.a.o(r0, r10)
        L53:
            r2 = r0
            r10.h()
            androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
            r1 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.d(r0, r1)
            r1 = 2131165512(0x7f070148, float:1.7945243E38)
            float r1 = u0.f.a(r10, r1)
            r3 = 16
            float r3 = (float) r3
            androidx.compose.ui.unit.h$a r4 = androidx.compose.ui.unit.h.f42849c
            androidx.compose.ui.v r0 = androidx.compose.foundation.layout.R1.j(r0, r1, r3)
            java.lang.String r1 = "FloatingButtonTag"
            androidx.compose.ui.v r3 = androidx.compose.ui.platform.C22501m2.a(r0, r1)
            com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState r15 = r15.f94957b
            com.avito.android.auto_contacts.domain.models.AutoButton r15 = r15.f94883e
            java.lang.String r0 = r15.f94875b
            r15 = -42574844(0xfffffffffd765c04, float:-2.0466741E37)
            r10.C(r15)
            Y41.l<ze.a, kotlin.G0> r15 = r13.f94976m
            boolean r1 = r10.B(r15)
            boolean r4 = r10.B(r14)
            r1 = r1 | r4
            java.lang.Object r4 = r10.t()
            if (r1 != 0) goto L9b
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r1) goto La3
        L9b:
            com.avito.android.auto_contacts.presentation.ui.c r4 = new com.avito.android.auto_contacts.presentation.ui.c
            r4.<init>(r15, r14)
            r10.H(r4)
        La3:
            r1 = r4
            Y41.a r1 = (Y41.a) r1
            r10.h()
            r11 = 512(0x200, float:7.17E-43)
            r12 = 1008(0x3f0, float:1.413E-42)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.akita.compose.component.button.m.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        Lb6:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auto_contacts.presentation.ui.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
