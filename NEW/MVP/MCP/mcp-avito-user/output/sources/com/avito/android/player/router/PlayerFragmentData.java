package com.avito.android.player.router;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.bottom_navigation.ui.fragment.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PlayerFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/router/PlayerFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PlayerFragmentData implements TabFragmentFactory.Data, h {

    @k
    public static final Parcelable.Creator<PlayerFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PlayerArguments f220225b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f220226c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f220227d;

    /* compiled from: PlayerFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PlayerFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final PlayerFragmentData createFromParcel(Parcel parcel) {
            return new PlayerFragmentData(PlayerArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(PlayerFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PlayerFragmentData[] newArray(int i12) {
            return new PlayerFragmentData[i12];
        }
    }

    public PlayerFragmentData(@k PlayerArguments playerArguments, @k NavigationTabSetItem navigationTabSetItem) {
        this.f220225b = playerArguments;
        this.f220226c = navigationTabSetItem;
        this.f220227d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return new PlayerFragmentData(this.f220225b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF173268d() {
        return this.f220227d;
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

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerFragmentData)) {
            return false;
        }
        PlayerFragmentData playerFragmentData = (PlayerFragmentData) obj;
        return L.f(this.f220225b, playerFragmentData.f220225b) && L.f(this.f220226c, playerFragmentData.f220226c);
    }

    public final int hashCode() {
        return this.f220226c.hashCode() + (this.f220225b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayerFragmentData(arguments=");
        sb2.append(this.f220225b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f220226c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f220225b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f220226c, i12);
    }
}
