package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Preconditions.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/f;", "LJK/f;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/OutgoingPreconditions;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class f extends JK.f<OutgoingPreconditions> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final f f165626b = new f();

    @Override // JK.f
    public final void a(StringBuilder sb2, String str, OutgoingPreconditions outgoingPreconditions, OutgoingPreconditions outgoingPreconditions2) {
        OutgoingPreconditions outgoingPreconditions3 = outgoingPreconditions;
        OutgoingPreconditions outgoingPreconditions4 = outgoingPreconditions2;
        JK.f.b(sb2, str, outgoingPreconditions3, outgoingPreconditions4, "step", d.f165624l);
        JK.f.b(sb2, str, outgoingPreconditions3, outgoingPreconditions4, "screenId", e.f165625l);
    }

    public final boolean equals(@l Object obj) {
        return this == obj || (obj instanceof f);
    }

    public final int hashCode() {
        return 1075199781;
    }

    @k
    public final String toString() {
        return "OutgoingPreconditionsDiffPrinter";
    }
}
