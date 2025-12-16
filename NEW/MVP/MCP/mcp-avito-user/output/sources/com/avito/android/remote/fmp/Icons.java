package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpProductsUtil.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/fmp/Icons;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Icons implements Parcelable {

    @k
    public static final Parcelable.Creator<Icons> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f253459b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f253460c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<UniversalImage> f253461d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final IconBackground f253462e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Size f253463f;

    /* compiled from: FmpProductsUtil.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Icons> {
        @Override // android.os.Parcelable.Creator
        public final Icons createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Icons.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Icons.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new Icons(string, universalImage, arrayList, parcel.readInt() == 0 ? null : IconBackground.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Size.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Icons[] newArray(int i12) {
            return new Icons[i12];
        }
    }

    public Icons(@l String str, @l UniversalImage universalImage, @l List<UniversalImage> list, @l IconBackground iconBackground, @l Size size) {
        this.f253459b = str;
        this.f253460c = universalImage;
        this.f253461d = list;
        this.f253462e = iconBackground;
        this.f253463f = size;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icons)) {
            return false;
        }
        Icons icons = (Icons) obj;
        return L.f(this.f253459b, icons.f253459b) && L.f(this.f253460c, icons.f253460c) && L.f(this.f253461d, icons.f253461d) && L.f(this.f253462e, icons.f253462e) && L.f(this.f253463f, icons.f253463f);
    }

    public final int hashCode() {
        String str = this.f253459b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UniversalImage universalImage = this.f253460c;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        List<UniversalImage> list = this.f253461d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        IconBackground iconBackground = this.f253462e;
        int iHashCode4 = (iHashCode3 + (iconBackground == null ? 0 : iconBackground.hashCode())) * 31;
        Size size = this.f253463f;
        return iHashCode4 + (size != null ? size.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "Icons(textImage=" + this.f253459b + ", universalImage=" + this.f253460c + ", overlaidImagesUrls=" + this.f253461d + ", background=" + this.f253462e + ", size=" + this.f253463f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f253459b);
        parcel.writeParcelable(this.f253460c, i12);
        List<UniversalImage> list = this.f253461d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        IconBackground iconBackground = this.f253462e;
        if (iconBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconBackground.writeToParcel(parcel, i12);
        }
        Size size = this.f253463f;
        if (size == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            size.writeToParcel(parcel, i12);
        }
    }
}
