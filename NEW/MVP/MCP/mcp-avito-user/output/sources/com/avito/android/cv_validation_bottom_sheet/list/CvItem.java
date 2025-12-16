package com.avito.android.cv_validation_bottom_sheet.list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: CvItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/list/CvItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<CvItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f131855b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f131856c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f131857d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f131858e;

    /* compiled from: CvItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvItem> {
        @Override // android.os.Parcelable.Creator
        public final CvItem createFromParcel(Parcel parcel) {
            return new CvItem((Image) parcel.readParcelable(CvItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CvItem[] newArray(int i12) {
            return new CvItem[i12];
        }
    }

    public CvItem(@l Image image, @k String str, @k String str2, @k String str3) {
        this.f131855b = str;
        this.f131856c = str2;
        this.f131857d = image;
        this.f131858e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124046b() {
        return getF131855b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF131855b() {
        return this.f131855b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f131855b);
        parcel.writeString(this.f131856c);
        parcel.writeParcelable(this.f131857d, i12);
        parcel.writeString(this.f131858e);
    }
}
