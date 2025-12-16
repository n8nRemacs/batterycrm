package com.avito.android.iac_dialer_ui.pub.call_screen.dtmf_buttons.keys;

import Y61.l;
import androidx.compose.runtime.H0;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacUIDtmfButtonsKey.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/dtmf_buttons/keys/k;", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f167291a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f167292b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f167293c;

    public k(String str, String str2, Integer num, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? null : str2;
        num = (i12 & 4) != 0 ? null : num;
        this.f167291a = str;
        this.f167292b = str2;
        this.f167293c = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f167291a, kVar.f167291a) && L.f(this.f167292b, kVar.f167292b) && L.f(this.f167293c, kVar.f167293c);
    }

    public final int hashCode() {
        int iHashCode = this.f167291a.hashCode() * 31;
        String str = this.f167292b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f167293c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacUIDtmfButtonsKeyState(dtmfSignal=");
        sb2.append(this.f167291a);
        sb2.append(", uiSymbol=");
        sb2.append(this.f167292b);
        sb2.append(", uiDrawable=");
        return s.j(sb2, this.f167293c, ')');
    }
}
