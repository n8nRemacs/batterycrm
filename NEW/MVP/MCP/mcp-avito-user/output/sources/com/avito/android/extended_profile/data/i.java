package com.avito.android.extended_profile.data;

import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.extended_profile_widgets.adapter.search.tabs.SearchTabsItem;
import com.avito.android.remote.model.ActiveItemsPreview;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchDataMarker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/data/i;", "Lcom/avito/android/extended_profile/data/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class i implements c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f149490a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f149491b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Boolean f149492c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final SearchTabsItem f149493d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f149494e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ActiveItemsPreview f149495f;

    public i(@l String str, @l String str2, @l Boolean bool, @l SearchTabsItem searchTabsItem, boolean z12, @l ActiveItemsPreview activeItemsPreview) {
        this.f149490a = str;
        this.f149491b = str2;
        this.f149492c = bool;
        this.f149493d = searchTabsItem;
        this.f149494e = z12;
        this.f149495f = activeItemsPreview;
    }

    public static i a(i iVar, SearchTabsItem searchTabsItem) {
        String str = iVar.f149490a;
        String str2 = iVar.f149491b;
        Boolean bool = iVar.f149492c;
        boolean z12 = iVar.f149494e;
        ActiveItemsPreview activeItemsPreview = iVar.f149495f;
        iVar.getClass();
        return new i(str, str2, bool, searchTabsItem, z12, activeItemsPreview);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f149490a, iVar.f149490a) && L.f(this.f149491b, iVar.f149491b) && L.f(this.f149492c, iVar.f149492c) && L.f(this.f149493d, iVar.f149493d) && this.f149494e == iVar.f149494e && L.f(this.f149495f, iVar.f149495f);
    }

    public final int hashCode() {
        String str = this.f149490a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f149491b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f149492c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        SearchTabsItem searchTabsItem = this.f149493d;
        int i12 = r.i((iHashCode3 + (searchTabsItem == null ? 0 : searchTabsItem.hashCode())) * 31, 31, this.f149494e);
        ActiveItemsPreview activeItemsPreview = this.f149495f;
        return i12 + (activeItemsPreview != null ? activeItemsPreview.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "SearchDataMarker(fromPage=" + this.f149490a + ", infoModelForm=" + this.f149491b + ", hideSingleTab=" + this.f149492c + ", tabsItem=" + this.f149493d + ", showInlineFilters=" + this.f149494e + ", activeItemsPreview=" + this.f149495f + ')';
    }
}
