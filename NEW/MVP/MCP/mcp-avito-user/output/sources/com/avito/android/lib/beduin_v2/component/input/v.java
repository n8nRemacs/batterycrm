package com.avito.android.lib.beduin_v2.component.input;

import androidx.compose.foundation.layout.InterfaceC20640y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputCompose.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class v extends N implements Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f175758l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(F f12) {
        super(3);
        this.f175758l = f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    @Override // Y41.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.InterfaceC20640y r7, androidx.compose.runtime.A r8, java.lang.Integer r9) {
        /*
            r6 = this;
            androidx.compose.foundation.layout.y r7 = (androidx.compose.foundation.layout.InterfaceC20640y) r7
            androidx.compose.runtime.A r8 = (androidx.compose.runtime.A) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0 = r9 & 14
            if (r0 != 0) goto L18
            boolean r0 = r8.B(r7)
            if (r0 == 0) goto L16
            r0 = 4
            goto L17
        L16:
            r0 = 2
        L17:
            r9 = r9 | r0
        L18:
            r9 = r9 & 91
            r0 = 18
            if (r9 != r0) goto L2a
            boolean r9 = r8.c()
            if (r9 != 0) goto L25
            goto L2a
        L25:
            r8.f()
            goto Lcf
        L2a:
            com.akita.compose.component.input.v$a$a r9 = com.akita.compose.component.input.v.a.f61852e
            com.avito.android.lib.beduin_v2.component.input.F r9 = r6.f175758l
            r9.getClass()
            r0 = -1747386505(0xffffffff97d8ff77, float:-1.4023161E-24)
            r8.C(r0)
            java.lang.String r0 = r9.f175651a
            java.lang.String r1 = "Large"
            r2 = 0
            boolean r1 = kotlin.text.C43066x.q(r0, r1, r2)
            if (r1 == 0) goto L59
            r0 = 352456864(0x150210a0, float:2.6266406E-26)
            r8.C(r0)
            com.akita.compose.theme.re23.b r0 = com.akita.compose.theme.re23.b.f63983a
            r0.getClass()
            com.akita.compose.theme.re23.style.w3 r0 = com.akita.compose.theme.re23.b.r(r8)
            com.akita.compose.component.spinner.h r0 = r0.getF66694c()
            r8.h()
            goto L8e
        L59:
            java.lang.String r1 = "Small"
            boolean r0 = kotlin.text.C43066x.q(r0, r1, r2)
            if (r0 == 0) goto L78
            r0 = 352459456(0x15021ac0, float:2.6274393E-26)
            r8.C(r0)
            com.akita.compose.theme.re23.b r0 = com.akita.compose.theme.re23.b.f63983a
            r0.getClass()
            com.akita.compose.theme.re23.style.w3 r0 = com.akita.compose.theme.re23.b.r(r8)
            com.akita.compose.component.spinner.h r0 = r0.getF66692a()
            r8.h()
            goto L8e
        L78:
            r0 = 352461281(0x150221e1, float:2.6280017E-26)
            r8.C(r0)
            com.akita.compose.theme.re23.b r0 = com.akita.compose.theme.re23.b.f63983a
            r0.getClass()
            com.akita.compose.theme.re23.style.w3 r0 = com.akita.compose.theme.re23.b.r(r8)
            com.akita.compose.component.spinner.h r0 = r0.getF66693b()
            r8.h()
        L8e:
            com.akita.compose.component.spinner.h r9 = r9.f175661k
            if (r9 == 0) goto L9b
            float r1 = r9.f62822a
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 != 0) goto L9b
            goto L9d
        L9b:
            float r1 = r0.f62822a
        L9d:
            com.akita.compose.foundation.p r3 = r0.f62823b
            r4 = 0
            if (r9 == 0) goto La5
            com.akita.compose.foundation.p r5 = r9.f62823b
            goto La6
        La5:
            r5 = r4
        La6:
            com.akita.compose.foundation.p r3 = r3.d(r5)
            float r0 = r0.f62824c
            if (r9 == 0) goto Lb7
            float r9 = r9.f62824c
            boolean r5 = java.lang.Float.isNaN(r9)
            if (r5 != 0) goto Lb7
            r0 = r9
        Lb7:
            com.akita.compose.component.spinner.h r9 = new com.akita.compose.component.spinner.h
            r9.<init>(r1, r3, r0, r4)
            r8.h()
            androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
            androidx.compose.ui.f$a r1 = androidx.compose.ui.InterfaceC22215f.f39074a
            r1.getClass()
            androidx.compose.ui.i r1 = androidx.compose.ui.InterfaceC22215f.a.f39080f
            androidx.compose.ui.v r7 = r7.d(r0, r1)
            com.akita.compose.component.spinner.b.a(r9, r7, r8, r2, r2)
        Lcf:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.input.v.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
