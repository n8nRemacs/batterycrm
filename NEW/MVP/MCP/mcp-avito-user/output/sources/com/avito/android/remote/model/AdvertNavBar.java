package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertNavBar.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/AdvertNavBar;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AdvertCardNavBar;", PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD, "Lcom/avito/android/remote/model/AdvertGalleryNavBar;", AdvertDetailsBlockIdKt.GALLERY_BLOCK, "<init>", "(Lcom/avito/android/remote/model/AdvertCardNavBar;Lcom/avito/android/remote/model/AdvertGalleryNavBar;)V", "component1", "()Lcom/avito/android/remote/model/AdvertCardNavBar;", "component2", "()Lcom/avito/android/remote/model/AdvertGalleryNavBar;", "copy", "(Lcom/avito/android/remote/model/AdvertCardNavBar;Lcom/avito/android/remote/model/AdvertGalleryNavBar;)Lcom/avito/android/remote/model/AdvertNavBar;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AdvertCardNavBar;", "getCard", "Lcom/avito/android/remote/model/AdvertGalleryNavBar;", "getGallery", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertNavBar implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertNavBar> CREATOR = new Creator();

    @c(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD)
    @l
    private final AdvertCardNavBar card;

    @c(AdvertDetailsBlockIdKt.GALLERY_BLOCK)
    @l
    private final AdvertGalleryNavBar gallery;

    /* compiled from: AdvertNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertNavBar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertNavBar createFromParcel(@k Parcel parcel) {
            return new AdvertNavBar(parcel.readInt() == 0 ? null : AdvertCardNavBar.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AdvertGalleryNavBar.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertNavBar[] newArray(int i12) {
            return new AdvertNavBar[i12];
        }
    }

    public AdvertNavBar(@l AdvertCardNavBar advertCardNavBar, @l AdvertGalleryNavBar advertGalleryNavBar) {
        this.card = advertCardNavBar;
        this.gallery = advertGalleryNavBar;
    }

    public static /* synthetic */ AdvertNavBar copy$default(AdvertNavBar advertNavBar, AdvertCardNavBar advertCardNavBar, AdvertGalleryNavBar advertGalleryNavBar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            advertCardNavBar = advertNavBar.card;
        }
        if ((i12 & 2) != 0) {
            advertGalleryNavBar = advertNavBar.gallery;
        }
        return advertNavBar.copy(advertCardNavBar, advertGalleryNavBar);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AdvertCardNavBar getCard() {
        return this.card;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AdvertGalleryNavBar getGallery() {
        return this.gallery;
    }

    @k
    public final AdvertNavBar copy(@l AdvertCardNavBar card, @l AdvertGalleryNavBar gallery) {
        return new AdvertNavBar(card, gallery);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertNavBar)) {
            return false;
        }
        AdvertNavBar advertNavBar = (AdvertNavBar) other;
        return L.f(this.card, advertNavBar.card) && L.f(this.gallery, advertNavBar.gallery);
    }

    @l
    public final AdvertCardNavBar getCard() {
        return this.card;
    }

    @l
    public final AdvertGalleryNavBar getGallery() {
        return this.gallery;
    }

    public int hashCode() {
        AdvertCardNavBar advertCardNavBar = this.card;
        int iHashCode = (advertCardNavBar == null ? 0 : advertCardNavBar.hashCode()) * 31;
        AdvertGalleryNavBar advertGalleryNavBar = this.gallery;
        return iHashCode + (advertGalleryNavBar != null ? advertGalleryNavBar.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdvertNavBar(card=" + this.card + ", gallery=" + this.gallery + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AdvertCardNavBar advertCardNavBar = this.card;
        if (advertCardNavBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertCardNavBar.writeToParcel(parcel, flags);
        }
        AdvertGalleryNavBar advertGalleryNavBar = this.gallery;
        if (advertGalleryNavBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertGalleryNavBar.writeToParcel(parcel, flags);
        }
    }
}
