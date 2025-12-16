package com.avito.android.bxcontent.search_bar_promo_widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UdfToolbarAndStatusBarConfig.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/UdfToolbarAndStatusBarConfig;", "Landroid/os/Parcelable;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UdfToolbarAndStatusBarConfig implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UdfToolbarAndStatusBarConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final UdfToolbarColors f112857b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ThemeAppearance f112858c;

    /* compiled from: UdfToolbarAndStatusBarConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UdfToolbarAndStatusBarConfig> {
        @Override // android.os.Parcelable.Creator
        public final UdfToolbarAndStatusBarConfig createFromParcel(Parcel parcel) {
            return new UdfToolbarAndStatusBarConfig((UdfToolbarColors) parcel.readParcelable(UdfToolbarAndStatusBarConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : ThemeAppearance.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final UdfToolbarAndStatusBarConfig[] newArray(int i12) {
            return new UdfToolbarAndStatusBarConfig[i12];
        }
    }

    public UdfToolbarAndStatusBarConfig(@Y61.l UdfToolbarColors udfToolbarColors, @Y61.l ThemeAppearance themeAppearance) {
        this.f112857b = udfToolbarColors;
        this.f112858c = themeAppearance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UdfToolbarAndStatusBarConfig)) {
            return false;
        }
        UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig = (UdfToolbarAndStatusBarConfig) obj;
        return L.f(this.f112857b, udfToolbarAndStatusBarConfig.f112857b) && this.f112858c == udfToolbarAndStatusBarConfig.f112858c;
    }

    public final int hashCode() {
        UdfToolbarColors udfToolbarColors = this.f112857b;
        int iHashCode = (udfToolbarColors == null ? 0 : udfToolbarColors.hashCode()) * 31;
        ThemeAppearance themeAppearance = this.f112858c;
        return iHashCode + (themeAppearance != null ? themeAppearance.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "UdfToolbarAndStatusBarConfig(udfToolbarColor=" + this.f112857b + ", themeAppearance=" + this.f112858c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f112857b, i12);
        ThemeAppearance themeAppearance = this.f112858c;
        if (themeAppearance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(themeAppearance.name());
        }
    }
}
