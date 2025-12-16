package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.rating;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIRatingPanel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/finished_call_screens/feedback_screen/rating/i;", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f167682a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f167683b;

    public i(boolean z12, @l Integer num) {
        this.f167682a = z12;
        this.f167683b = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f167682a == iVar.f167682a && L.f(this.f167683b, iVar.f167683b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f167682a) * 31;
        Integer num = this.f167683b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacUIRatingPanelState(isClickable=");
        sb2.append(this.f167682a);
        sb2.append(", selected=");
        return s.j(sb2, this.f167683b, ')');
    }
}
