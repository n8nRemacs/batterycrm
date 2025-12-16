package com.avito.android.bottom_navigation.ui;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NavigationScreenAction.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/NavigationScreenAction;", "", "Landroid/os/Parcelable;", "_avito_bottom-navigation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NavigationScreenAction implements Parcelable {

    @k
    public static final Parcelable.Creator<NavigationScreenAction> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final NavigationScreenAction f107100b;

    /* renamed from: c, reason: collision with root package name */
    public static final NavigationScreenAction f107101c;

    /* renamed from: d, reason: collision with root package name */
    public static final NavigationScreenAction f107102d;

    /* renamed from: e, reason: collision with root package name */
    public static final NavigationScreenAction f107103e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ NavigationScreenAction[] f107104f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f107105g;

    static {
        NavigationScreenAction navigationScreenAction = new NavigationScreenAction("KEEP", 0);
        f107100b = navigationScreenAction;
        NavigationScreenAction navigationScreenAction2 = new NavigationScreenAction("CLOSE", 1);
        f107101c = navigationScreenAction2;
        NavigationScreenAction navigationScreenAction3 = new NavigationScreenAction("CLOSE_IMMEDIATE", 2);
        f107102d = navigationScreenAction3;
        NavigationScreenAction navigationScreenAction4 = new NavigationScreenAction("CLEAR_TOP", 3);
        f107103e = navigationScreenAction4;
        NavigationScreenAction[] navigationScreenActionArr = {navigationScreenAction, navigationScreenAction2, navigationScreenAction3, navigationScreenAction4};
        f107104f = navigationScreenActionArr;
        f107105g = c.a(navigationScreenActionArr);
        CREATOR = new Parcelable.Creator<NavigationScreenAction>() { // from class: com.avito.android.bottom_navigation.ui.NavigationScreenAction.a
            @Override // android.os.Parcelable.Creator
            public final NavigationScreenAction createFromParcel(Parcel parcel) {
                return NavigationScreenAction.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NavigationScreenAction[] newArray(int i12) {
                return new NavigationScreenAction[i12];
            }
        };
    }

    public NavigationScreenAction() {
        throw null;
    }

    public static NavigationScreenAction valueOf(String str) {
        return (NavigationScreenAction) Enum.valueOf(NavigationScreenAction.class, str);
    }

    public static NavigationScreenAction[] values() {
        return (NavigationScreenAction[]) f107104f.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
