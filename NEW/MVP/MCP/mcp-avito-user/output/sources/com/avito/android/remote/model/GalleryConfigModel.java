package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorAdvertNetworkModel.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/GalleryConfigModel;", "Landroid/os/Parcelable;", "", "ratioWidth", "ratioHeight", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/GalleryConfigModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getRatioWidth", "getRatioHeight", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GalleryConfigModel implements Parcelable {

    @k
    public static final Parcelable.Creator<GalleryConfigModel> CREATOR = new Creator();

    @c("ratioHeight")
    @l
    private final Integer ratioHeight;

    @c("ratioWidth")
    @l
    private final Integer ratioWidth;

    /* compiled from: ConstructorAdvertNetworkModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GalleryConfigModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GalleryConfigModel createFromParcel(@k Parcel parcel) {
            return new GalleryConfigModel(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GalleryConfigModel[] newArray(int i12) {
            return new GalleryConfigModel[i12];
        }
    }

    public GalleryConfigModel(@l Integer num, @l Integer num2) {
        this.ratioWidth = num;
        this.ratioHeight = num2;
    }

    public static /* synthetic */ GalleryConfigModel copy$default(GalleryConfigModel galleryConfigModel, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = galleryConfigModel.ratioWidth;
        }
        if ((i12 & 2) != 0) {
            num2 = galleryConfigModel.ratioHeight;
        }
        return galleryConfigModel.copy(num, num2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getRatioWidth() {
        return this.ratioWidth;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getRatioHeight() {
        return this.ratioHeight;
    }

    @k
    public final GalleryConfigModel copy(@l Integer ratioWidth, @l Integer ratioHeight) {
        return new GalleryConfigModel(ratioWidth, ratioHeight);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryConfigModel)) {
            return false;
        }
        GalleryConfigModel galleryConfigModel = (GalleryConfigModel) other;
        return L.f(this.ratioWidth, galleryConfigModel.ratioWidth) && L.f(this.ratioHeight, galleryConfigModel.ratioHeight);
    }

    @l
    public final Integer getRatioHeight() {
        return this.ratioHeight;
    }

    @l
    public final Integer getRatioWidth() {
        return this.ratioWidth;
    }

    public int hashCode() {
        Integer num = this.ratioWidth;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.ratioHeight;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryConfigModel(ratioWidth=");
        sb2.append(this.ratioWidth);
        sb2.append(", ratioHeight=");
        return s.j(sb2, this.ratioHeight, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.ratioWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.ratioHeight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
    }
}
