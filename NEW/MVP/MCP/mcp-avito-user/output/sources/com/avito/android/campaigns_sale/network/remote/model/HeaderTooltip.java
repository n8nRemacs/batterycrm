package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleLoadPageResult.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/HeaderTooltip;", "Landroid/os/Parcelable;", "", "title", "text", "Lcom/avito/android/campaigns_sale/network/remote/model/TooltipButton;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/campaigns_sale/network/remote/model/TooltipButton;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getText", "Lcom/avito/android/campaigns_sale/network/remote/model/TooltipButton;", "c", "()Lcom/avito/android/campaigns_sale/network/remote/model/TooltipButton;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HeaderTooltip implements Parcelable {

    @k
    public static final Parcelable.Creator<HeaderTooltip> CREATOR = new a();

    @c("button")
    @l
    private final TooltipButton button;

    @c("text")
    @k
    private final String text;

    @c("title")
    @l
    private final String title;

    /* compiled from: CampaignsSaleLoadPageResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HeaderTooltip> {
        @Override // android.os.Parcelable.Creator
        public final HeaderTooltip createFromParcel(Parcel parcel) {
            return new HeaderTooltip(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TooltipButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderTooltip[] newArray(int i12) {
            return new HeaderTooltip[i12];
        }
    }

    public HeaderTooltip(@l String str, @k String str2, @l TooltipButton tooltipButton) {
        this.title = str;
        this.text = str2;
        this.button = tooltipButton;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final TooltipButton getButton() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderTooltip)) {
            return false;
        }
        HeaderTooltip headerTooltip = (HeaderTooltip) obj;
        return L.f(this.title, headerTooltip.title) && L.f(this.text, headerTooltip.text) && L.f(this.button, headerTooltip.button);
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.text);
        TooltipButton tooltipButton = this.button;
        return iD2 + (tooltipButton != null ? tooltipButton.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "HeaderTooltip(title=" + this.title + ", text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        TooltipButton tooltipButton = this.button;
        if (tooltipButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tooltipButton.writeToParcel(parcel, i12);
        }
    }
}
