package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state;

import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallMeta;
import kotlin.Metadata;

/* compiled from: CallMeta.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/s;", "LJK/f;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$User;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class s extends JK.f<CallMeta.User> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final s f165564b = new s();

    @Override // JK.f
    public final void a(StringBuilder sb2, String str, CallMeta.User user, CallMeta.User user2) {
        CallMeta.User user3 = user;
        CallMeta.User user4 = user2;
        JK.f.b(sb2, str, user3, user4, "name", o.f165560l);
        JK.f.b(sb2, str, user3, user4, "avatarUrls", p.f165561l);
        JK.f.b(sb2, str, user3, user4, "rating", q.f165562l);
        JK.f.b(sb2, str, user3, user4, "callerReviewCount", r.f165563l);
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof s);
    }

    public final int hashCode() {
        return -14127435;
    }

    @Y61.k
    public final String toString() {
        return "CallMetaUserDiffPrinter";
    }
}
