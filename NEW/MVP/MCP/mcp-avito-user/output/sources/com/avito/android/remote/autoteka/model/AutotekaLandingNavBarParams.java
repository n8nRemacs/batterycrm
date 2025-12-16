package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaLandingResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/autoteka/model/AutotekaLandingNavBarParams;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/autoteka/model/LandingTitle;", "screenTitle", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "<init>", "(Lcom/avito/android/remote/autoteka/model/LandingTitle;Lcom/avito/android/remote/model/UniversalColor;)V", "Lcom/avito/android/remote/autoteka/model/LandingTitle;", "c", "()Lcom/avito/android/remote/autoteka/model/LandingTitle;", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaLandingNavBarParams implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaLandingNavBarParams> CREATOR = new a();

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("screenTitle")
    @l
    private final LandingTitle screenTitle;

    /* compiled from: AutotekaLandingResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaLandingNavBarParams> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaLandingNavBarParams createFromParcel(Parcel parcel) {
            return new AutotekaLandingNavBarParams(parcel.readInt() == 0 ? null : LandingTitle.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(AutotekaLandingNavBarParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaLandingNavBarParams[] newArray(int i12) {
            return new AutotekaLandingNavBarParams[i12];
        }
    }

    public AutotekaLandingNavBarParams(@l LandingTitle landingTitle, @l UniversalColor universalColor) {
        this.screenTitle = landingTitle;
        this.backgroundColor = universalColor;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final LandingTitle getScreenTitle() {
        return this.screenTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutotekaLandingNavBarParams)) {
            return false;
        }
        AutotekaLandingNavBarParams autotekaLandingNavBarParams = (AutotekaLandingNavBarParams) obj;
        return L.f(this.screenTitle, autotekaLandingNavBarParams.screenTitle) && L.f(this.backgroundColor, autotekaLandingNavBarParams.backgroundColor);
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int hashCode() {
        LandingTitle landingTitle = this.screenTitle;
        int iHashCode = (landingTitle == null ? 0 : landingTitle.hashCode()) * 31;
        UniversalColor universalColor = this.backgroundColor;
        return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaLandingNavBarParams(screenTitle=");
        sb2.append(this.screenTitle);
        sb2.append(", backgroundColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.backgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        LandingTitle landingTitle = this.screenTitle;
        if (landingTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landingTitle.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.backgroundColor, i12);
    }
}
