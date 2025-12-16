package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailsSection.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/DetailsContentItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/text/AttributedText;", "value", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DetailsContentItem implements Parcelable {

    @k
    public static final Parcelable.Creator<DetailsContentItem> CREATOR = new a();

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("value")
    @l
    private final AttributedText value;

    /* compiled from: DetailsSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DetailsContentItem> {
        @Override // android.os.Parcelable.Creator
        public final DetailsContentItem createFromParcel(Parcel parcel) {
            return new DetailsContentItem((DeepLink) parcel.readParcelable(DetailsContentItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(DetailsContentItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DetailsContentItem[] newArray(int i12) {
            return new DetailsContentItem[i12];
        }
    }

    public DetailsContentItem(@l DeepLink deepLink, @l AttributedText attributedText) {
        this.deeplink = deepLink;
        this.value = attributedText;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsContentItem)) {
            return false;
        }
        DetailsContentItem detailsContentItem = (DetailsContentItem) obj;
        return L.f(this.deeplink, detailsContentItem.deeplink) && L.f(this.value, detailsContentItem.value);
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    public final int hashCode() {
        DeepLink deepLink = this.deeplink;
        int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
        AttributedText attributedText = this.value;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailsContentItem(deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", value=");
        return com.avito.android.actions_sheet.a.w(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.deeplink, i12);
        parcel.writeParcelable(this.value, i12);
    }
}
