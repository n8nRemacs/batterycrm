package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params;

import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer_models.abstract_module.IacCallTime;
import kotlin.Metadata;

/* compiled from: CallParams.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/p;", "LJK/f;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallTime;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class p extends JK.f<IacCallTime> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final p f165620b = new p();

    @Override // JK.f
    public final void a(StringBuilder sb2, String str, IacCallTime iacCallTime, IacCallTime iacCallTime2) {
        IacCallTime iacCallTime3 = iacCallTime;
        IacCallTime iacCallTime4 = iacCallTime2;
        JK.f.b(sb2, str, iacCallTime3, iacCallTime4, "createdAt", j.f165614l);
        JK.f.b(sb2, str, iacCallTime3, iacCallTime4, "screenStartedAt", k.f165615l);
        JK.f.b(sb2, str, iacCallTime3, iacCallTime4, "initializedAt", l.f165616l);
        JK.f.b(sb2, str, iacCallTime3, iacCallTime4, "ringingAt", m.f165617l);
        JK.f.b(sb2, str, iacCallTime3, iacCallTime4, "activatedAt", n.f165618l);
        JK.f.b(sb2, str, iacCallTime3, iacCallTime4, "finishedAt", o.f165619l);
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof p);
    }

    public final int hashCode() {
        return 1495104251;
    }

    @Y61.k
    public final String toString() {
        return "IacCallTimeDiffPrinter";
    }
}
