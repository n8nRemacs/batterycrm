package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleLoadPageResult.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/TooltipButton;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TooltipButton implements Parcelable {

    @k
    public static final Parcelable.Creator<TooltipButton> CREATOR = new a();

    @c("text")
    @k
    private final String text;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* compiled from: CampaignsSaleLoadPageResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TooltipButton> {
        @Override // android.os.Parcelable.Creator
        public final TooltipButton createFromParcel(Parcel parcel) {
            return new TooltipButton(parcel.readString(), (DeepLink) parcel.readParcelable(TooltipButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TooltipButton[] newArray(int i12) {
            return new TooltipButton[i12];
        }
    }

    public TooltipButton(@k String str, @l DeepLink deepLink) {
        this.text = str;
        this.uri = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TooltipButton)) {
            return false;
        }
        TooltipButton tooltipButton = (TooltipButton) obj;
        return L.f(this.text, tooltipButton.text) && L.f(this.uri, tooltipButton.uri);
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        DeepLink deepLink = this.uri;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TooltipButton(text=");
        sb2.append(this.text);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.uri, i12);
    }
}
