package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VinConfig.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ManualVin;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "", "Lcom/avito/android/remote/model/category_parameters/DescriptionItem;", "descriptionList", "", "closeButtonTitle", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/util/List;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Ljava/util/List;", "getDescriptionList", "()Ljava/util/List;", "Ljava/lang/String;", "getCloseButtonTitle", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ManualVin implements Parcelable {

    @k
    public static final Parcelable.Creator<ManualVin> CREATOR = new Creator();

    @c("closeButtonTitle")
    @l
    private final String closeButtonTitle;

    @c("descriptionList")
    @k
    private final List<DescriptionItem> descriptionList;

    @c("image")
    @l
    private final Image image;

    /* compiled from: VinConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ManualVin> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ManualVin createFromParcel(@k Parcel parcel) {
            Image image = (Image) parcel.readParcelable(ManualVin.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(DescriptionItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ManualVin(image, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ManualVin[] newArray(int i12) {
            return new ManualVin[i12];
        }
    }

    public ManualVin(@l Image image, @k List<DescriptionItem> list, @l String str) {
        this.image = image;
        this.descriptionList = list;
        this.closeButtonTitle = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getCloseButtonTitle() {
        return this.closeButtonTitle;
    }

    @k
    public final List<DescriptionItem> getDescriptionList() {
        return this.descriptionList;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        Iterator itJ = C0.j(this.descriptionList, parcel);
        while (itJ.hasNext()) {
            ((DescriptionItem) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.closeButtonTitle);
    }
}
