package com.avito.android.bottom_navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.R;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NavigationTab.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/NavigationTab;", "", "Lcom/avito/android/bottom_navigation/NavigationTabSetItem;", "Landroid/os/Parcelable;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NavigationTab implements NavigationTabSetItem, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<NavigationTab> CREATOR;

    /* renamed from: f, reason: collision with root package name */
    public static final NavigationTab f106970f;

    /* renamed from: g, reason: collision with root package name */
    public static final NavigationTab f106971g;

    /* renamed from: h, reason: collision with root package name */
    public static final NavigationTab f106972h;

    /* renamed from: i, reason: collision with root package name */
    public static final NavigationTab f106973i;

    /* renamed from: j, reason: collision with root package name */
    public static final NavigationTab f106974j;

    /* renamed from: k, reason: collision with root package name */
    public static final NavigationTab f106975k;

    /* renamed from: l, reason: collision with root package name */
    public static final NavigationTab f106976l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ NavigationTab[] f106977m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f106978n;

    /* renamed from: b, reason: collision with root package name */
    public final int f106979b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106980c;

    /* renamed from: d, reason: collision with root package name */
    public final int f106981d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f106982e;

    static {
        NavigationTab navigationTab = new NavigationTab(0, R.string.tab_search, R.drawable.bg_bn_tab_search, R.id.tab_search, "SEARCH", false);
        f106970f = navigationTab;
        NavigationTab navigationTab2 = new NavigationTab(1, R.string.tab_favorites, R.drawable.bg_bn_tab_favorites, R.id.tab_favorites, "FAVORITES", false);
        f106971g = navigationTab2;
        NavigationTab navigationTab3 = new NavigationTab(2, R.string.tab_user_adverts, R.drawable.bg_bn_tab_user_adverts_selector, R.id.tab_user_adverts, "USER_ADVERTS", false);
        f106972h = navigationTab3;
        NavigationTab navigationTab4 = new NavigationTab(3, R.string.tab_message, R.drawable.bg_bn_tab_message, R.id.tab_message, "MESSAGE", true);
        f106973i = navigationTab4;
        NavigationTab navigationTab5 = new NavigationTab(4, R.string.tab_profile, 0, R.id.tab_profile, "PROFILE_SETTINGS", false);
        f106974j = navigationTab5;
        NavigationTab navigationTab6 = new NavigationTab(5, R.string.tab_avito_for_business, R.drawable.bg_bn_tab_afb, R.id.tab_avito_for_business, "AVITO_FOR_BUSINESS", false);
        f106975k = navigationTab6;
        NavigationTab navigationTab7 = new NavigationTab(6, R.string.tab_ai_assistant, R.drawable.bg_bn_tab_ai_assistant, R.id.tab_ai_assistant, "AI_ASSISTANT", false);
        f106976l = navigationTab7;
        NavigationTab[] navigationTabArr = {navigationTab, navigationTab2, navigationTab3, navigationTab4, navigationTab5, navigationTab6, navigationTab7};
        f106977m = navigationTabArr;
        f106978n = kotlin.enums.c.a(navigationTabArr);
        CREATOR = new Parcelable.Creator<NavigationTab>() { // from class: com.avito.android.bottom_navigation.NavigationTab.a
            @Override // android.os.Parcelable.Creator
            public final NavigationTab createFromParcel(Parcel parcel) {
                return NavigationTab.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NavigationTab[] newArray(int i12) {
                return new NavigationTab[i12];
            }
        };
    }

    public NavigationTab(int i12, int i13, int i14, int i15, String str, boolean z12) {
        this.f106979b = i13;
        this.f106980c = i14;
        this.f106981d = i15;
        this.f106982e = z12;
    }

    public static NavigationTab valueOf(String str) {
        return (NavigationTab) Enum.valueOf(NavigationTab.class, str);
    }

    public static NavigationTab[] values() {
        return (NavigationTab[]) f106977m.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.NavigationTabSetItem
    /* renamed from: e0, reason: from getter */
    public final boolean getF106982e() {
        return this.f106982e;
    }

    @Override // com.avito.android.bottom_navigation.NavigationTabSetItem
    /* renamed from: getIcon, reason: from getter */
    public final int getF106980c() {
        return this.f106980c;
    }

    @Override // com.avito.android.bottom_navigation.NavigationTabSetItem
    public final /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.avito.android.bottom_navigation.NavigationTabSetItem
    /* renamed from: getTitle, reason: from getter */
    public final int getF106979b() {
        return this.f106979b;
    }

    @Override // com.avito.android.bottom_navigation.NavigationTabSetItem
    /* renamed from: s4, reason: from getter */
    public final int getF106981d() {
        return this.f106981d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
