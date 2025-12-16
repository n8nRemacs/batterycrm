package com.avito.android.lib.beduin_v2.component.input.compose;

import androidx.compose.runtime.internal.P;
import bU.InterfaceC25559c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputComposeStyle.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/input/compose/v;", "LbU/c;", "Lcom/akita/compose/component/input/v;", "_design-modules_beduin-v2_renderer-compose_component_input"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class v implements InterfaceC25559c<com.akita.compose.component.input.v> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25559c<com.akita.compose.component.input.v> f175707b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.avito.component.input.state.c f175708c;

    public v(@Y61.k InterfaceC25559c<com.akita.compose.component.input.v> interfaceC25559c, @Y61.l com.avito.beduin.v2.avito.component.input.state.c cVar) {
        this.f175707b = interfaceC25559c;
        this.f175708c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // bU.InterfaceC25559c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(androidx.compose.runtime.A r25) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.input.compose.v.a(androidx.compose.runtime.A):java.lang.Object");
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return L.f(this.f175707b, vVar.f175707b) && L.f(this.f175708c, vVar.f175708c);
    }

    public final int hashCode() {
        int iHashCode = this.f175707b.hashCode() * 31;
        com.avito.beduin.v2.avito.component.input.state.c cVar = this.f175708c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "InputStyleResolver(defStyleProvider=" + this.f175707b + ", patch=" + this.f175708c + ')';
    }
}
