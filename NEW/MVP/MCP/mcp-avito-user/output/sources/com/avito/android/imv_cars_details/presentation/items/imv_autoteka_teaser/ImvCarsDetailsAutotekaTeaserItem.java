package com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.imv_cars_details.models.ImvCarsDetailsAutotekaTeaser;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsAutotekaTeaserItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_autoteka_teaser/ImvCarsDetailsAutotekaTeaserItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImvCarsDetailsAutotekaTeaserItem implements com.avito.conveyor_item.a, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ImvCarsDetailsAutotekaTeaserItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f170076b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImvCarsDetailsAutotekaTeaser f170077c;

    /* compiled from: ImvCarsDetailsAutotekaTeaserItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsDetailsAutotekaTeaserItem> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsAutotekaTeaserItem createFromParcel(Parcel parcel) {
            return new ImvCarsDetailsAutotekaTeaserItem(parcel.readString(), (ImvCarsDetailsAutotekaTeaser) parcel.readParcelable(ImvCarsDetailsAutotekaTeaserItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsAutotekaTeaserItem[] newArray(int i12) {
            return new ImvCarsDetailsAutotekaTeaserItem[i12];
        }
    }

    public ImvCarsDetailsAutotekaTeaserItem(@Y61.k String str, @Y61.k ImvCarsDetailsAutotekaTeaser imvCarsDetailsAutotekaTeaser) {
        this.f170076b = str;
        this.f170077c = imvCarsDetailsAutotekaTeaser;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvCarsDetailsAutotekaTeaserItem)) {
            return false;
        }
        ImvCarsDetailsAutotekaTeaserItem imvCarsDetailsAutotekaTeaserItem = (ImvCarsDetailsAutotekaTeaserItem) obj;
        return L.f(this.f170076b, imvCarsDetailsAutotekaTeaserItem.f170076b) && L.f(this.f170077c, imvCarsDetailsAutotekaTeaserItem.f170077c);
    }

    @Override // TV0.a
    public final long getId() {
        return getF170139b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170139b() {
        return this.f170076b;
    }

    public final int hashCode() {
        return this.f170077c.hashCode() + (this.f170076b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ImvCarsDetailsAutotekaTeaserItem(stringId=" + this.f170076b + ", teaser=" + this.f170077c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f170076b);
        parcel.writeParcelable(this.f170077c, i12);
    }
}
