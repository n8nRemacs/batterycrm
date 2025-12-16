package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NewDesignGallery.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/AutotekaImage;", "Landroid/os/Parcelable;", "", "iconPhoto", "Lcom/avito/android/remote/model/UniversalImage;", "illustration", "<init>", "(Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/autotekateaser/AutotekaImage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getIconPhoto", "Lcom/avito/android/remote/model/UniversalImage;", "getIllustration", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaImage implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaImage> CREATOR = new Creator();

    @c("iconPhoto")
    @l
    private final Boolean iconPhoto;

    @c("illustration")
    @l
    private final UniversalImage illustration;

    /* compiled from: NewDesignGallery.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaImage createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutotekaImage(boolValueOf, (UniversalImage) parcel.readParcelable(AutotekaImage.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaImage[] newArray(int i12) {
            return new AutotekaImage[i12];
        }
    }

    public AutotekaImage(@l Boolean bool, @l UniversalImage universalImage) {
        this.iconPhoto = bool;
        this.illustration = universalImage;
    }

    public static /* synthetic */ AutotekaImage copy$default(AutotekaImage autotekaImage, Boolean bool, UniversalImage universalImage, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = autotekaImage.iconPhoto;
        }
        if ((i12 & 2) != 0) {
            universalImage = autotekaImage.illustration;
        }
        return autotekaImage.copy(bool, universalImage);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getIconPhoto() {
        return this.iconPhoto;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalImage getIllustration() {
        return this.illustration;
    }

    @k
    public final AutotekaImage copy(@l Boolean iconPhoto, @l UniversalImage illustration) {
        return new AutotekaImage(iconPhoto, illustration);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaImage)) {
            return false;
        }
        AutotekaImage autotekaImage = (AutotekaImage) other;
        return L.f(this.iconPhoto, autotekaImage.iconPhoto) && L.f(this.illustration, autotekaImage.illustration);
    }

    @l
    public final Boolean getIconPhoto() {
        return this.iconPhoto;
    }

    @l
    public final UniversalImage getIllustration() {
        return this.illustration;
    }

    public int hashCode() {
        Boolean bool = this.iconPhoto;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        UniversalImage universalImage = this.illustration;
        return iHashCode + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaImage(iconPhoto=");
        sb2.append(this.iconPhoto);
        sb2.append(", illustration=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.illustration, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.iconPhoto;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.illustration, flags);
    }
}
