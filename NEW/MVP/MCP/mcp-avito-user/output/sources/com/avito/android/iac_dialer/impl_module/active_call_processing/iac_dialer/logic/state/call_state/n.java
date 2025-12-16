package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state;

import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallMeta;
import kotlin.Metadata;

/* compiled from: CallMeta.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/n;", "LJK/f;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$Item;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class n extends JK.f<CallMeta.Item> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final n f165559b = new n();

    @Override // JK.f
    public final void a(StringBuilder sb2, String str, CallMeta.Item item, CallMeta.Item item2) {
        CallMeta.Item item3 = item;
        CallMeta.Item item4 = item2;
        JK.f.b(sb2, str, item3, item4, "id", i.f165554l);
        JK.f.b(sb2, str, item3, item4, "title", j.f165555l);
        JK.f.b(sb2, str, item3, item4, "price", k.f165556l);
        JK.f.b(sb2, str, item3, item4, "imageUrls", l.f165557l);
        JK.f.b(sb2, str, item3, item4, "itemLink", m.f165558l);
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof n);
    }

    public final int hashCode() {
        return -2075852179;
    }

    @Y61.k
    public final String toString() {
        return "CallMetaItemDiffPrinter";
    }
}
