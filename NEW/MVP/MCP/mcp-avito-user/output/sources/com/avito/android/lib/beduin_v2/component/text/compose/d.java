package com.avito.android.lib.beduin_v2.component.text.compose;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bU.InterfaceC25559c;
import com.akita.compose.foundation.r;
import com.avito.beduin.v2.avito.component.text.state.j;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TextComposeStyle.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/text/compose/d;", "LbU/c;", "Lcom/akita/compose/foundation/r;", "_design-modules_beduin-v2_renderer-compose_component_text"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d implements InterfaceC25559c<r> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25559c<r> f175947b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final j f175948c;

    public d(@k InterfaceC25559c<r> interfaceC25559c, @l j jVar) {
        this.f175947b = interfaceC25559c;
        this.f175948c = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // bU.InterfaceC25559c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(androidx.compose.runtime.A r14) {
        /*
            r13 = this;
            r0 = -1884902121(0xffffffff8fa6ad17, float:-1.6435536E-29)
            r14.C(r0)
            bU.c<com.akita.compose.foundation.r> r0 = r13.f175947b
            java.lang.Object r0 = r0.a(r14)
            r1 = r0
            com.akita.compose.foundation.r r1 = (com.akita.compose.foundation.r) r1
            com.avito.beduin.v2.avito.component.text.state.j r0 = r13.f175948c
            if (r0 != 0) goto L18
            r14.h()
            goto Lba
        L18:
            androidx.compose.runtime.J3 r2 = com.avito.beduin.v2.render.compose.C36345b.f338051b
            java.lang.Object r2 = r14.o(r2)
            com.avito.beduin.v2.theme.k r2 = (com.avito.beduin.v2.theme.k) r2
            r3 = -503803038(0xffffffffe1f89362, float:-5.7317657E20)
            r14.C(r3)
            boolean r3 = r14.B(r0)
            boolean r4 = r14.B(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r14.t()
            if (r3 != 0) goto L3e
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r3) goto Lb1
        L3e:
            com.avito.beduin.v2.theme.f<java.lang.Integer> r3 = r0.f335354d
            java.lang.Object r3 = r3.a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L52
            int r3 = r3.intValue()
            long r3 = androidx.compose.ui.unit.z.e(r3)
        L50:
            r5 = r3
            goto L55
        L52:
            long r3 = r1.f63647d
            goto L50
        L55:
            com.avito.beduin.v2.theme.f<java.lang.Integer> r3 = r0.f335353c
            java.lang.Object r3 = r3.a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L68
            int r3 = r3.intValue()
            long r3 = androidx.compose.ui.unit.z.e(r3)
            goto L6a
        L68:
            long r3 = r1.f63646c
        L6a:
            com.avito.beduin.v2.theme.f<com.avito.beduin.v2.theme.r$b> r7 = r0.f335356f
            com.akita.compose.foundation.p r2 = bU.j.a(r7, r2)
            if (r2 != 0) goto L74
            com.akita.compose.foundation.p r2 = r1.f63644a
        L74:
            com.avito.beduin.v2.theme.f<java.lang.String> r0 = r0.f335355e
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L9e
            java.lang.String r7 = "bold"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L92
            com.akita.compose.theme.re23.b r0 = com.akita.compose.theme.re23.b.f63983a
            r0.getClass()
            com.akita.compose.theme.re23.i r0 = com.akita.compose.theme.re23.b.f63988f
            com.akita.compose.foundation.r r0 = r0.f65239j
            androidx.compose.ui.text.font.e0 r0 = r0.f63648e
            goto L9f
        L92:
            com.akita.compose.theme.re23.b r0 = com.akita.compose.theme.re23.b.f63983a
            r0.getClass()
            com.akita.compose.theme.re23.i r0 = com.akita.compose.theme.re23.b.f63988f
            com.akita.compose.foundation.r r0 = r0.f65241l
            androidx.compose.ui.text.font.e0 r0 = r0.f63648e
            goto L9f
        L9e:
            r0 = 0
        L9f:
            if (r0 != 0) goto La3
            androidx.compose.ui.text.font.e0 r0 = r1.f63648e
        La3:
            r7 = r0
            r10 = 0
            r12 = 994(0x3e2, float:1.393E-42)
            r8 = 0
            com.akita.compose.foundation.r r4 = com.akita.compose.foundation.r.a(r1, r2, r3, r5, r7, r8, r10, r12)
            r14.H(r4)
        Lb1:
            r1 = r4
            com.akita.compose.foundation.r r1 = (com.akita.compose.foundation.r) r1
            r14.h()
            r14.h()
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.text.compose.d.a(androidx.compose.runtime.A):java.lang.Object");
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f175947b, dVar.f175947b) && L.f(this.f175948c, dVar.f175948c);
    }

    public final int hashCode() {
        int iHashCode = this.f175947b.hashCode() * 31;
        j jVar = this.f175948c;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    @k
    public final String toString() {
        return "TextStyleResolver(base=" + this.f175947b + ", patch=" + this.f175948c + ')';
    }
}
