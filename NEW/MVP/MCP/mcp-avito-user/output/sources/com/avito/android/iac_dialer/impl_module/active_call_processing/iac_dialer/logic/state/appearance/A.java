package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import androidx.compose.runtime.internal.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CallInit.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/A;", "LJK/f;", "", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class A extends JK.f<Map<String, ? extends CallInit>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final A f165509b = new A();

    @Override // JK.f
    public final void a(StringBuilder sb2, String str, Map<String, ? extends CallInit> map, Map<String, ? extends CallInit> map2) {
        Map<String, ? extends CallInit> map3 = map;
        Map<String, ? extends CallInit> map4 = map2;
        for (String str2 : b1.h(map3.keySet(), map4.keySet())) {
            JK.f.c(sb2, str, y.f165543b, map3, map4, C43066x.u0(3, str2), new z(str2));
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof A);
    }

    public final int hashCode() {
        return -1934918514;
    }

    @Y61.k
    public final String toString() {
        return "CallInitsDiffPrinter";
    }
}
