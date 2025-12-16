package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSearchBar.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/BuyerGeoAddress;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "geoPageDeeplink", "Lcom/avito/android/remote/model/text/AttributedText;", "richTitle", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/BuyerGeoAddress;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getGeoPageDeeplink", "Lcom/avito/android/remote/model/text/AttributedText;", "getRichTitle", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BuyerGeoAddress implements Parcelable {

    @k
    public static final Parcelable.Creator<BuyerGeoAddress> CREATOR = new Creator();

    @c("geoPageDeeplink")
    @k
    private final DeepLink geoPageDeeplink;

    @c("richTitle")
    @k
    private final AttributedText richTitle;

    /* compiled from: ExtendedProfileSearchBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuyerGeoAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerGeoAddress createFromParcel(@k Parcel parcel) {
            return new BuyerGeoAddress((DeepLink) parcel.readParcelable(BuyerGeoAddress.class.getClassLoader()), (AttributedText) parcel.readParcelable(BuyerGeoAddress.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerGeoAddress[] newArray(int i12) {
            return new BuyerGeoAddress[i12];
        }
    }

    public BuyerGeoAddress(@k DeepLink deepLink, @k AttributedText attributedText) {
        this.geoPageDeeplink = deepLink;
        this.richTitle = attributedText;
    }

    public static /* synthetic */ BuyerGeoAddress copy$default(BuyerGeoAddress buyerGeoAddress, DeepLink deepLink, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            deepLink = buyerGeoAddress.geoPageDeeplink;
        }
        if ((i12 & 2) != 0) {
            attributedText = buyerGeoAddress.richTitle;
        }
        return buyerGeoAddress.copy(deepLink, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final DeepLink getGeoPageDeeplink() {
        return this.geoPageDeeplink;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getRichTitle() {
        return this.richTitle;
    }

    @k
    public final BuyerGeoAddress copy(@k DeepLink geoPageDeeplink, @k AttributedText richTitle) {
        return new BuyerGeoAddress(geoPageDeeplink, richTitle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyerGeoAddress)) {
            return false;
        }
        BuyerGeoAddress buyerGeoAddress = (BuyerGeoAddress) other;
        return L.f(this.geoPageDeeplink, buyerGeoAddress.geoPageDeeplink) && L.f(this.richTitle, buyerGeoAddress.richTitle);
    }

    @k
    public final DeepLink getGeoPageDeeplink() {
        return this.geoPageDeeplink;
    }

    @k
    public final AttributedText getRichTitle() {
        return this.richTitle;
    }

    public int hashCode() {
        return this.richTitle.hashCode() + (this.geoPageDeeplink.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BuyerGeoAddress(geoPageDeeplink=");
        sb2.append(this.geoPageDeeplink);
        sb2.append(", richTitle=");
        return a.w(sb2, this.richTitle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.geoPageDeeplink, flags);
        parcel.writeParcelable(this.richTitle, flags);
    }
}
