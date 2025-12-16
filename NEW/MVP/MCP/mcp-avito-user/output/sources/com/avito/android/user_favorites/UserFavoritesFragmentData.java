package com.avito.android.user_favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserFavoritesFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_favorites/UserFavoritesFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/space/p;", "a", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserFavoritesFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.space.p {

    /* renamed from: b, reason: collision with root package name */
    public final int f316822b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f316823c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f316824d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final NavigationTab f316825e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f316821f = new a(null);

    @Y61.k
    public static final Parcelable.Creator<UserFavoritesFragmentData> CREATOR = new b();

    /* compiled from: UserFavoritesFragmentData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_favorites/UserFavoritesFragmentData$a;", "", "<init>", "()V", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UserFavoritesFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UserFavoritesFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final UserFavoritesFragmentData createFromParcel(Parcel parcel) {
            return new UserFavoritesFragmentData(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), null);
        }

        @Override // android.os.Parcelable.Creator
        public final UserFavoritesFragmentData[] newArray(int i12) {
            return new UserFavoritesFragmentData[i12];
        }
    }

    public /* synthetic */ UserFavoritesFragmentData(int i12, String str, Integer num, C42822w c42822w) {
        this(i12, num, str);
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.l
    public final BottomNavigationSpace U() {
        int i12 = this.f316822b;
        if (i12 == -1 || i12 == 1 || i12 == 2) {
            return null;
        }
        return BottomNavigationSpace.f107065b;
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final Set<NavigationTabSetItem> W() {
        return Collections.singleton(NavigationTab.f106971g);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2 */
    public final NavigationTabSetItem getF115291c() {
        return this.f316825e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF186714d() {
        return false;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f316822b);
        parcel.writeString(this.f316823c);
        Integer num = this.f316824d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public UserFavoritesFragmentData(int i12, Integer num, String str) {
        this.f316822b = i12;
        this.f316823c = str;
        this.f316824d = num;
        this.f316825e = NavigationTab.f106971g;
    }

    public /* synthetic */ UserFavoritesFragmentData(int i12, String str, Integer num, int i13, C42822w c42822w) {
        this(i12, (i13 & 4) != 0 ? null : num, (i13 & 2) != 0 ? null : str);
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @Y61.k
    public final com.avito.android.bottom_navigation.space.p g0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return this;
    }
}
