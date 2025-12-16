package com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs;

import androidx.compose.foundation.H;
import com.avito.android.beduin.ui.screen.model.BeduinTabLayout;
import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import pi.C47093d;

/* compiled from: BottomSheetWithTabsScreenState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet_w_tabs/i;", "Lcom/avito/android/beduin/ui/screen/fragment/i;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class i implements com.avito.android.beduin.ui.screen.fragment.i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final pi.e f104240a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C47093d f104241b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final BeduinTabLayout f104242c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<BeduinModel> f104243d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@Y61.l pi.e eVar, @Y61.l C47093d c47093d, @Y61.k BeduinTabLayout beduinTabLayout, @Y61.l List<? extends BeduinModel> list) {
        this.f104240a = eVar;
        this.f104241b = c47093d;
        this.f104242c = beduinTabLayout;
        this.f104243d = list;
    }

    public static i a(i iVar, pi.e eVar, BeduinTabLayout beduinTabLayout, int i12) {
        if ((i12 & 1) != 0) {
            eVar = iVar.f104240a;
        }
        if ((i12 & 4) != 0) {
            beduinTabLayout = iVar.f104242c;
        }
        return new i(eVar, iVar.f104241b, beduinTabLayout, iVar.f104243d);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f104240a, iVar.f104240a) && L.f(this.f104241b, iVar.f104241b) && L.f(this.f104242c, iVar.f104242c) && L.f(this.f104243d, iVar.f104243d);
    }

    public final int hashCode() {
        pi.e eVar = this.f104240a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        C47093d c47093d = this.f104241b;
        int iHashCode2 = (this.f104242c.hashCode() + ((iHashCode + (c47093d == null ? 0 : c47093d.hashCode())) * 31)) * 31;
        List<BeduinModel> list = this.f104243d;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BottomSheetWithTabsScreenState(navBar=");
        sb2.append(this.f104240a);
        sb2.append(", gallery=");
        sb2.append(this.f104241b);
        sb2.append(", tabLayout=");
        sb2.append(this.f104242c);
        sb2.append(", extraContent=");
        return H.p(sb2, this.f104243d, ')');
    }
}
