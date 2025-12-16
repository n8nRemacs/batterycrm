package com.avito.android.mortgage.api.model.landing;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingBottomUsp.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/mortgage/api/model/landing/LandingBottomUspItem;", "Landroid/os/Parcelable;", "", "iconName", "title", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getIconName", "()Ljava/lang/String;", "getTitle", "getDescription", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LandingBottomUspItem implements Parcelable {

    @k
    public static final Parcelable.Creator<LandingBottomUspItem> CREATOR = new a();

    @c("description")
    @k
    private final String description;

    @c("iconName")
    @k
    private final String iconName;

    @c("title")
    @k
    private final String title;

    /* compiled from: LandingBottomUsp.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LandingBottomUspItem> {
        @Override // android.os.Parcelable.Creator
        public final LandingBottomUspItem createFromParcel(Parcel parcel) {
            return new LandingBottomUspItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LandingBottomUspItem[] newArray(int i12) {
            return new LandingBottomUspItem[i12];
        }
    }

    public LandingBottomUspItem(@k String str, @k String str2, @k String str3) {
        this.iconName = str;
        this.title = str2;
        this.description = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingBottomUspItem)) {
            return false;
        }
        LandingBottomUspItem landingBottomUspItem = (LandingBottomUspItem) obj;
        return L.f(this.iconName, landingBottomUspItem.iconName) && L.f(this.title, landingBottomUspItem.title) && L.f(this.description, landingBottomUspItem.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + H.d(this.iconName.hashCode() * 31, 31, this.title);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LandingBottomUspItem(iconName=");
        sb2.append(this.iconName);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        return C22026a.c(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.iconName);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}
