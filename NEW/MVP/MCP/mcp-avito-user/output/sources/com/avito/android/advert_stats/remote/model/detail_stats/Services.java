package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/Services;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "", "price", "title", "description", "dateFormatted", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/UniversalImage;", "d", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "getPrice", "()Ljava/lang/String;", "getTitle", "getDescription", "c", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Services implements Parcelable {

    @k
    public static final Parcelable.Creator<Services> CREATOR = new a();

    @c("dateFormatted")
    @l
    private final String dateFormatted;

    @c("description")
    @l
    private final String description;

    @c("icon")
    @l
    private final UniversalImage icon;

    @c("price")
    @k
    private final String price;

    @c("title")
    @k
    private final String title;

    /* compiled from: DetailAdvertStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Services> {
        @Override // android.os.Parcelable.Creator
        public final Services createFromParcel(Parcel parcel) {
            return new Services((UniversalImage) parcel.readParcelable(Services.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Services[] newArray(int i12) {
            return new Services[i12];
        }
    }

    public Services(@l UniversalImage universalImage, @k String str, @k String str2, @l String str3, @l String str4) {
        this.icon = universalImage;
        this.price = str;
        this.title = str2;
        this.description = str3;
        this.dateFormatted = str4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDateFormatted() {
        return this.dateFormatted;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Services)) {
            return false;
        }
        Services services = (Services) obj;
        return L.f(this.icon, services.icon) && L.f(this.price, services.price) && L.f(this.title, services.title) && L.f(this.description, services.description) && L.f(this.dateFormatted, services.dateFormatted);
    }

    @k
    public final String getPrice() {
        return this.price;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        UniversalImage universalImage = this.icon;
        int iD2 = H.d(H.d((universalImage == null ? 0 : universalImage.hashCode()) * 31, 31, this.price), 31, this.title);
        String str = this.description;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dateFormatted;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Services(icon=");
        sb2.append(this.icon);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", dateFormatted=");
        return C22026a.c(sb2, this.dateFormatted, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.icon, i12);
        parcel.writeString(this.price);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.dateFormatted);
    }

    public /* synthetic */ Services(UniversalImage universalImage, String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : universalImage, str, str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4);
    }
}
