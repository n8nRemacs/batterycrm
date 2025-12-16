package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GallerySection.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/GalleryContent;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/Image;", "images", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GalleryContent implements Parcelable {

    @k
    public static final Parcelable.Creator<GalleryContent> CREATOR = new a();

    @c("images")
    @l
    private final List<Image> images;

    /* compiled from: GallerySection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryContent> {
        @Override // android.os.Parcelable.Creator
        public final GalleryContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(GalleryContent.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new GalleryContent(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryContent[] newArray(int i12) {
            return new GalleryContent[i12];
        }
    }

    public GalleryContent(@l List<Image> list) {
        this.images = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GalleryContent) && L.f(this.images, ((GalleryContent) obj).images);
    }

    @l
    public final List<Image> getImages() {
        return this.images;
    }

    public final int hashCode() {
        List<Image> list = this.images;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("GalleryContent(images="), this.images, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<Image> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
