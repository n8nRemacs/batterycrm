package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: TabsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/tabs/b;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f136886b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Tab f136887c;

    public b(@k ArrayList arrayList, @k Tab tab) {
        this.f136886b = arrayList;
        this.f136887c = tab;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return this.f136886b.equals(bVar.f136886b) && this.f136887c == bVar.f136887c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return 3552126;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF121306b() {
        return "tabs";
    }

    public final int hashCode() {
        return Integer.hashCode(R.style.Re23_TabGroup_Xxl) + ((this.f136887c.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f136886b, 110115906, 31)) * 31);
    }

    @k
    public final String toString() {
        return "TabsItem(stringId=tabs, tabs=" + this.f136886b + ", selectedTab=" + this.f136887c + ", tabGroupStyle=2132024041)";
    }
}
