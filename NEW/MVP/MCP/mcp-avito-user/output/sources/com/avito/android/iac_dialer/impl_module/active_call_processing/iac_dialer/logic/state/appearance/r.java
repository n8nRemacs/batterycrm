package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Navigation;
import kotlin.Metadata;

/* compiled from: Appearance.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/r;", "LJK/f;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class r extends JK.f<Appearance> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final r f165536b = new r();

    @Override // JK.f
    public final void a(StringBuilder sb2, String str, Appearance appearance, Appearance appearance2) {
        Appearance appearance3 = appearance;
        Appearance appearance4 = appearance2;
        JK.f.c(sb2, str, A.f165509b, appearance3, appearance4, "callInits", i.f165527l);
        JK.f.b(sb2, str, appearance3, appearance4, "service", j.f165528l);
        JK.f.b(sb2, str, appearance3, appearance4, "screen", k.f165529l);
        JK.f.b(sb2, str, appearance3, appearance4, "app", l.f165530l);
        JK.f.b(sb2, str, appearance3, appearance4, "micPerm", m.f165531l);
        JK.f.b(sb2, str, appearance3, appearance4, "cameraPerm", n.f165532l);
        JK.f.b(sb2, str, appearance3, appearance4, "notifications", o.f165533l);
        JK.f.b(sb2, str, appearance3, appearance4, "ringingMode", p.f165534l);
        JK.f.b(sb2, str, appearance3, appearance4, "camera", q.f165535l);
        JK.f.b(sb2, str, appearance3, appearance4, "isGsmBusy", C30858a.f165519l);
        JK.f.b(sb2, str, appearance3, appearance4, "network", C30859b.f165520l);
        JK.f.b(sb2, str, appearance3, appearance4, "connectionQuality", c.f165521l);
        JK.f.b(sb2, str, appearance3, appearance4, "power", d.f165522l);
        JK.f.b(sb2, str, appearance3, appearance4, "storage", e.f165523l);
        JK.f.b(sb2, str, appearance3, appearance4, "splitter", f.f165524l);
        JK.f.b(sb2, str, appearance3, appearance4, Navigation.CONFIG, g.f165525l);
        JK.f.b(sb2, str, appearance3, appearance4, "stringResources", h.f165526l);
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof r);
    }

    public final int hashCode() {
        return -1203939853;
    }

    @Y61.k
    public final String toString() {
        return "AppearanceDiffPrinter";
    }
}
