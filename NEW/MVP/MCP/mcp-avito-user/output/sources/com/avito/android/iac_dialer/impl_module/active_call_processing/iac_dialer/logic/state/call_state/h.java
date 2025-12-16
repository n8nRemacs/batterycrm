package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: CallMeta.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/h;", "LJK/f;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class h extends JK.f<CallMeta> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final h f165553b = new h();

    @Override // JK.f
    public final void a(StringBuilder sb2, String str, CallMeta callMeta, CallMeta callMeta2) {
        CallMeta callMeta3 = callMeta;
        CallMeta callMeta4 = callMeta2;
        JK.f.c(sb2, str, n.f165559b, callMeta3, callMeta4, "item", a.f165546l);
        JK.f.c(sb2, str, s.f165564b, callMeta3, callMeta4, "peer", b.f165547l);
        JK.f.b(sb2, str, callMeta3, callMeta4, "scenario", c.f165548l);
        JK.f.b(sb2, str, callMeta3, callMeta4, "gsmLink", d.f165549l);
        JK.f.b(sb2, str, callMeta3, callMeta4, "msgLink", e.f165550l);
        JK.f.b(sb2, str, callMeta3, callMeta4, "startCallDelayMs", f.f165551l);
        JK.f.b(sb2, str, callMeta3, callMeta4, "extraInfo", g.f165552l);
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof h);
    }

    public final int hashCode() {
        return 1214430464;
    }

    @Y61.k
    public final String toString() {
        return "CallMetaDiffPrinter";
    }
}
