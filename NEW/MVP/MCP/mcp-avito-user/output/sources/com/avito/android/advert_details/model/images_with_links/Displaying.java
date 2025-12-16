package com.avito.android.advert_details.model.images_with_links;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ImagesWithLinksElement.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/advert_details/model/images_with_links/Displaying;", "Landroid/os/Parcelable;", "Lcom/avito/android/advert_details/model/images_with_links/SimpleViewType;", "listViewType", "<init>", "(Lcom/avito/android/advert_details/model/images_with_links/SimpleViewType;)V", "Lcom/avito/android/advert_details/model/images_with_links/SimpleViewType;", "c", "()Lcom/avito/android/advert_details/model/images_with_links/SimpleViewType;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Displaying implements Parcelable {

    @k
    public static final Parcelable.Creator<Displaying> CREATOR = new a();

    @c("listViewType")
    @l
    private final SimpleViewType listViewType;

    /* compiled from: ImagesWithLinksElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Displaying> {
        @Override // android.os.Parcelable.Creator
        public final Displaying createFromParcel(Parcel parcel) {
            return new Displaying(parcel.readInt() == 0 ? null : SimpleViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Displaying[] newArray(int i12) {
            return new Displaying[i12];
        }
    }

    public Displaying(@l SimpleViewType simpleViewType) {
        this.listViewType = simpleViewType;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final SimpleViewType getListViewType() {
        return this.listViewType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        SimpleViewType simpleViewType = this.listViewType;
        if (simpleViewType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(simpleViewType.name());
        }
    }
}
