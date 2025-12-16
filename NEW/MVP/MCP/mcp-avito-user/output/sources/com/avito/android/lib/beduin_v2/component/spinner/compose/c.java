package com.avito.android.lib.beduin_v2.component.spinner.compose;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bU.InterfaceC25559c;
import com.akita.compose.component.spinner.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SpinnerComposeStyle.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/spinner/compose/c;", "LbU/c;", "Lcom/akita/compose/component/spinner/h;", "_design-modules_beduin-v2_renderer-compose_component_spinner"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c implements InterfaceC25559c<h> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25559c<h> f175925b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final com.avito.beduin.v2.avito.component.spinner.state.h f175926c;

    public c(@k InterfaceC25559c<h> interfaceC25559c, @l com.avito.beduin.v2.avito.component.spinner.state.h hVar) {
        this.f175925b = interfaceC25559c;
        this.f175926c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    @Override // bU.InterfaceC25559c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(androidx.compose.runtime.A r7) {
        /*
            r6 = this;
            r0 = -2144193016(0xffffffff80323608, float:-4.611158E-39)
            r7.C(r0)
            bU.c<com.akita.compose.component.spinner.h> r0 = r6.f175925b
            java.lang.Object r0 = r0.a(r7)
            com.akita.compose.component.spinner.h r0 = (com.akita.compose.component.spinner.h) r0
            com.avito.beduin.v2.avito.component.spinner.state.h r1 = r6.f175926c
            if (r1 != 0) goto L16
            r7.h()
            goto L83
        L16:
            androidx.compose.runtime.J3 r2 = com.avito.beduin.v2.render.compose.C36345b.f338051b
            java.lang.Object r2 = r7.o(r2)
            com.avito.beduin.v2.theme.k r2 = (com.avito.beduin.v2.theme.k) r2
            r3 = 190153319(0xb558267, float:4.1120412E-32)
            r7.C(r3)
            boolean r3 = r7.B(r0)
            boolean r4 = r7.B(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r7.t()
            if (r3 != 0) goto L3c
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r3) goto L7a
        L3c:
            com.avito.beduin.v2.theme.f<java.lang.Integer> r3 = r1.f335146c
            java.lang.Object r3 = r3.a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L4e
            int r3 = r3.intValue()
            float r3 = (float) r3
            androidx.compose.ui.unit.h$a r4 = androidx.compose.ui.unit.h.f42849c
            goto L50
        L4e:
            float r3 = r0.f62822a
        L50:
            com.avito.beduin.v2.theme.f<java.lang.Integer> r4 = r1.f335147d
            java.lang.Object r4 = r4.a()
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L62
            int r4 = r4.intValue()
            float r4 = (float) r4
            androidx.compose.ui.unit.h$a r5 = androidx.compose.ui.unit.h.f42849c
            goto L64
        L62:
            float r4 = r0.f62824c
        L64:
            com.akita.compose.foundation.p r0 = r0.f62823b
            com.avito.beduin.v2.theme.f<com.avito.beduin.v2.theme.r$b> r1 = r1.f335148e
            com.akita.compose.foundation.p r1 = bU.j.a(r1, r2)
            com.akita.compose.foundation.p r0 = r0.d(r1)
            com.akita.compose.component.spinner.h r1 = new com.akita.compose.component.spinner.h
            r2 = 0
            r1.<init>(r3, r0, r4, r2)
            r7.H(r1)
            r4 = r1
        L7a:
            r0 = r4
            com.akita.compose.component.spinner.h r0 = (com.akita.compose.component.spinner.h) r0
            r7.h()
            r7.h()
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.spinner.compose.c.a(androidx.compose.runtime.A):java.lang.Object");
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f175925b, cVar.f175925b) && L.f(this.f175926c, cVar.f175926c);
    }

    public final int hashCode() {
        int iHashCode = this.f175925b.hashCode() * 31;
        com.avito.beduin.v2.avito.component.spinner.state.h hVar = this.f175926c;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    @k
    public final String toString() {
        return "SpinnerStyleResolver(base=" + this.f175925b + ", patch=" + this.f175926c + ')';
    }
}
