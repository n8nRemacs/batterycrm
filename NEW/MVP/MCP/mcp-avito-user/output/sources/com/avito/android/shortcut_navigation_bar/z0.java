package com.avito.android.shortcut_navigation_bar;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: TabNavigationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/z0;", "Lcom/avito/conveyor_item/a;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class z0 implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f283593b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f283594c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f283595d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f283596e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f283597f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f283598g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f283599h;

    public z0(@Y61.l String str, @Y61.l DeepLink deepLink, boolean z12, @Y61.l String str2, @Y61.l String str3, @Y61.l Integer num, @Y61.k String str4) {
        this.f283593b = str;
        this.f283594c = deepLink;
        this.f283595d = z12;
        this.f283596e = str2;
        this.f283597f = str3;
        this.f283598g = num;
        this.f283599h = str4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return kotlin.jvm.internal.L.f(this.f283593b, z0Var.f283593b) && kotlin.jvm.internal.L.f(this.f283594c, z0Var.f283594c) && this.f283595d == z0Var.f283595d && kotlin.jvm.internal.L.f(this.f283596e, z0Var.f283596e) && kotlin.jvm.internal.L.f(this.f283597f, z0Var.f283597f) && kotlin.jvm.internal.L.f(this.f283598g, z0Var.f283598g) && kotlin.jvm.internal.L.f(this.f283599h, z0Var.f283599h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84654b() {
        return getF275368b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF275368b() {
        return this.f283599h;
    }

    public final int hashCode() {
        String str = this.f283593b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLink deepLink = this.f283594c;
        int i12 = androidx.appcompat.app.r.i((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f283595d);
        String str2 = this.f283596e;
        int iHashCode2 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f283597f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f283598g;
        return this.f283599h.hashCode() + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabNavigationItem(text=");
        sb2.append(this.f283593b);
        sb2.append(", deepLink=");
        sb2.append(this.f283594c);
        sb2.append(", selected=");
        sb2.append(this.f283595d);
        sb2.append(", badgeText=");
        sb2.append(this.f283596e);
        sb2.append(", badgeShowId=");
        sb2.append(this.f283597f);
        sb2.append(", badgeShowCount=");
        sb2.append(this.f283598g);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f283599h, ')');
    }
}
