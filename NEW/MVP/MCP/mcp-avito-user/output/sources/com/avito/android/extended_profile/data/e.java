package com.avito.android.extended_profile.data;

import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.TabsWithWidgetsItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetGroup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/data/e;", "Lcom/avito/android/extended_profile/data/g;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class e extends g {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f149481c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TabsWithWidgetsItem f149482d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<QH.a> f149483e;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k String str, @Y61.k TabsWithWidgetsItem tabsWithWidgetsItem, @Y61.k List<? extends QH.a> list) {
        super(str, list, null);
        this.f149481c = str;
        this.f149482d = tabsWithWidgetsItem;
        this.f149483e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e a(e eVar, TabsWithWidgetsItem tabsWithWidgetsItem, ArrayList arrayList, int i12) {
        String str = eVar.f149481c;
        if ((i12 & 2) != 0) {
            tabsWithWidgetsItem = eVar.f149482d;
        }
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = eVar.f149483e;
        }
        eVar.getClass();
        return new e(str, tabsWithWidgetsItem, list);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f149481c, eVar.f149481c) && L.f(this.f149482d, eVar.f149482d) && L.f(this.f149483e, eVar.f149483e);
    }

    @Override // com.avito.android.extended_profile.data.g, com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF149496c() {
        return this.f149481c;
    }

    @Override // com.avito.android.extended_profile.data.g, com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<QH.a> getItems() {
        return this.f149483e;
    }

    public final int hashCode() {
        return this.f149483e.hashCode() + ((this.f149482d.hashCode() + (this.f149481c.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileTabWidgetGroup(widgetName=");
        sb2.append(this.f149481c);
        sb2.append(", tabsWithWidgetsItem=");
        sb2.append(this.f149482d);
        sb2.append(", items=");
        return H.p(sb2, this.f149483e, ')');
    }
}
