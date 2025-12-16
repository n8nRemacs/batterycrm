package com.avito.android.profile_settings_extended.entity;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.universal.create.UniversalWidgetCreateItem;
import com.avito.android.profile_settings_extended.adapter.universal.header.UniversalWidgetHeaderItem;
import com.avito.android.profile_settings_extended.adapter.universal.section.UniversalWidgetSectionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;

/* compiled from: SettingsListItemGroup.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/x;", "Lcom/avito/android/profile_settings_extended/entity/v;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class x implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230364a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final UniversalWidgetHeaderItem f230365b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final UniversalWidgetCreateItem f230366c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<UniversalWidgetSectionItem> f230367d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f230368e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f230369f;

    public x(@Y61.k String str, @Y61.l UniversalWidgetHeaderItem universalWidgetHeaderItem, @Y61.l UniversalWidgetCreateItem universalWidgetCreateItem, @Y61.k List<UniversalWidgetSectionItem> list, @Y61.k String str2) {
        this.f230364a = str;
        this.f230365b = universalWidgetHeaderItem;
        this.f230366c = universalWidgetCreateItem;
        this.f230367d = list;
        this.f230368e = str2;
        t0 t0Var = new t0(3);
        t0Var.a(universalWidgetHeaderItem);
        t0Var.a(universalWidgetCreateItem);
        t0Var.b(list.toArray(new UniversalWidgetSectionItem[0]));
        ArrayList<Object> arrayList = t0Var.f406850a;
        this.f230369f = C42756l.B(arrayList.toArray(new QH.a[arrayList.size()]));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return L.f(this.f230364a, xVar.f230364a) && L.f(this.f230365b, xVar.f230365b) && L.f(this.f230366c, xVar.f230366c) && L.f(this.f230367d, xVar.f230367d) && L.f(this.f230368e, xVar.f230368e);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230361a() {
        return this.f230364a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<QH.a> getItems() {
        return this.f230369f;
    }

    public final int hashCode() {
        int iHashCode = this.f230364a.hashCode() * 31;
        UniversalWidgetHeaderItem universalWidgetHeaderItem = this.f230365b;
        int iHashCode2 = (iHashCode + (universalWidgetHeaderItem == null ? 0 : universalWidgetHeaderItem.hashCode())) * 31;
        UniversalWidgetCreateItem universalWidgetCreateItem = this.f230366c;
        return this.f230368e.hashCode() + H.e((iHashCode2 + (universalWidgetCreateItem != null ? universalWidgetCreateItem.hashCode() : 0)) * 31, 31, this.f230367d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetWidgetItemsGroup(widgetName=");
        sb2.append(this.f230364a);
        sb2.append(", header=");
        sb2.append(this.f230365b);
        sb2.append(", createButton=");
        sb2.append(this.f230366c);
        sb2.append(", sections=");
        sb2.append(this.f230367d);
        sb2.append(", fieldName=");
        return C22026a.c(sb2, this.f230368e, ')');
    }
}
