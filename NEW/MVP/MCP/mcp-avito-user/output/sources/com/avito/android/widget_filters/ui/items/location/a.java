package com.avito.android.widget_filters.ui.items.location;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersLocationWidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/location/a;", "Lcom/avito/android/widget_filters/ui/items/c;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.android.widget_filters.ui.items.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f330467a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f330468b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f330469c;

    public a(@Y61.l String str, @Y61.l String str2, boolean z12) {
        this.f330467a = str;
        this.f330468b = str2;
        this.f330469c = z12;
    }

    public static a a(a aVar, String str, boolean z12) {
        String str2 = aVar.f330468b;
        aVar.getClass();
        return new a(str, str2, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f330467a, aVar.f330467a) && L.f(this.f330468b, aVar.f330468b) && this.f330469c == aVar.f330469c;
    }

    public final int hashCode() {
        String str = this.f330467a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f330468b;
        return Boolean.hashCode(this.f330469c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationPlaceholder(text=");
        sb2.append(this.f330467a);
        sb2.append(", defaultText=");
        sb2.append(this.f330468b);
        sb2.append(", isDefault=");
        return r.x(sb2, this.f330469c, ')');
    }
}
