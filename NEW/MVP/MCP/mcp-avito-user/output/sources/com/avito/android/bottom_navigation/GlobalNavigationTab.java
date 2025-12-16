package com.avito.android.bottom_navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.R;
import j.InterfaceC42165v;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GlobalNavigationTab.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/GlobalNavigationTab;", "", "Lcom/avito/android/bottom_navigation/NavigationTabSetItem;", "Landroid/os/Parcelable;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GlobalNavigationTab implements NavigationTabSetItem, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<GlobalNavigationTab> CREATOR;

    /* renamed from: f, reason: collision with root package name */
    public static final GlobalNavigationTab f106937f;

    /* renamed from: g, reason: collision with root package name */
    public static final GlobalNavigationTab f106938g;

    /* renamed from: h, reason: collision with root package name */
    public static final GlobalNavigationTab f106939h;

    /* renamed from: i, reason: collision with root package name */
    public static final GlobalNavigationTab f106940i;

    /* renamed from: j, reason: collision with root package name */
    public static final GlobalNavigationTab f106941j;

    /* renamed from: k, reason: collision with root package name */
    public static final GlobalNavigationTab f106942k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ GlobalNavigationTab[] f106943l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f106944m;

    /* renamed from: b, reason: collision with root package name */
    public final int f106945b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106946c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f106947d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f106948e;

    static {
        GlobalNavigationTab globalNavigationTab = new GlobalNavigationTab("SEARCH", 0, R.drawable.common_ic_search, R.id.tab_search, false, true);
        f106937f = globalNavigationTab;
        GlobalNavigationTab globalNavigationTab2 = new GlobalNavigationTab("FAVORITES", 1, R.drawable.common_ic_favorites, R.id.tab_favorites, false, true);
        f106938g = globalNavigationTab2;
        GlobalNavigationTab globalNavigationTab3 = new GlobalNavigationTab("USER_ADVERTS", 2, R.drawable.global_bn_tab_user_adverts, R.id.tab_user_adverts, false, false);
        f106939h = globalNavigationTab3;
        GlobalNavigationTab globalNavigationTab4 = new GlobalNavigationTab("PUBLISH", 3, R.drawable.global_bn_tab_user_adverts, R.id.tab_publish, true, false);
        f106940i = globalNavigationTab4;
        GlobalNavigationTab globalNavigationTab5 = new GlobalNavigationTab("MESSAGE", 4, R.drawable.common_ic_chat, R.id.tab_message, true, true);
        f106941j = globalNavigationTab5;
        GlobalNavigationTab globalNavigationTab6 = new GlobalNavigationTab("PROFILE_SETTINGS", 5, R.drawable.common_ic_person, R.id.tab_profile, false, true);
        f106942k = globalNavigationTab6;
        GlobalNavigationTab[] globalNavigationTabArr = {globalNavigationTab, globalNavigationTab2, globalNavigationTab3, globalNavigationTab4, globalNavigationTab5, globalNavigationTab6};
        f106943l = globalNavigationTabArr;
        f106944m = kotlin.enums.c.a(globalNavigationTabArr);
        CREATOR = new Parcelable.Creator<GlobalNavigationTab>() { // from class: com.avito.android.bottom_navigation.GlobalNavigationTab.a
            @Override // android.os.Parcelable.Creator
            public final GlobalNavigationTab createFromParcel(Parcel parcel) {
                return GlobalNavigationTab.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GlobalNavigationTab[] newArray(int i12) {
                return new GlobalNavigationTab[i12];
            }
        };
    }

    public GlobalNavigationTab(@InterfaceC42165v String str, @j.D int i12, int i13, int i14, boolean z12, boolean z13) {
        this.f106945b = i13;
        this.f106946c = i14;
        this.f106947d = z12;
        this.f106948e = z13;
    }

    public static GlobalNavigationTab valueOf(String str) {
        return (GlobalNavigationTab) Enum.valueOf(GlobalNavigationTab.class, str);
    }

    public static GlobalNavigationTab[] values() {
        return (GlobalNavigationTab[]) f106943l.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.NavigationTabSetItem
    /* renamed from: e0, reason: from getter */
    public final boolean getF106947d() {
        return this.f106947d;
    }

    @Override // com.avito.android.bottom_navigation.NavigationTabSetItem
    /* renamed from: getIcon, reason: from getter */
    public final int getF106945b() {
        return this.f106945b;
    }

    @Override // com.avito.android.bottom_navigation.NavigationTabSetItem
    public final /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.avito.android.bottom_navigation.NavigationTabSetItem
    /* renamed from: getTitle */
    public final int getF106979b() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.NavigationTabSetItem
    /* renamed from: s4, reason: from getter */
    public final int getF106946c() {
        return this.f106946c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
