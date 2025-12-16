package com.avito.android.lib.beduin_v2.component.button.compose;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bU.InterfaceC25559c;
import com.akita.compose.component.button.t;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ButtonComposeStyle.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/button/compose/g;", "LbU/c;", "Lcom/akita/compose/component/button/t;", "_design-modules_beduin-v2_renderer-compose_component_button"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g implements InterfaceC25559c<t> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25559c<t> f175524b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final com.avito.beduin.v2.avito.component.button.state.l f175525c;

    public g(@k InterfaceC25559c<t> interfaceC25559c, @l com.avito.beduin.v2.avito.component.button.state.l lVar) {
        this.f175524b = interfaceC25559c;
        this.f175525c = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    @Override // bU.InterfaceC25559c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(androidx.compose.runtime.A r28) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.button.compose.g.a(androidx.compose.runtime.A):java.lang.Object");
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f175524b, gVar.f175524b) && L.f(this.f175525c, gVar.f175525c);
    }

    public final int hashCode() {
        int iHashCode = this.f175524b.hashCode() * 31;
        com.avito.beduin.v2.avito.component.button.state.l lVar = this.f175525c;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    @k
    public final String toString() {
        return "ButtonStyleResolver(defStyleProvider=" + this.f175524b + ", patch=" + this.f175525c + ')';
    }
}
