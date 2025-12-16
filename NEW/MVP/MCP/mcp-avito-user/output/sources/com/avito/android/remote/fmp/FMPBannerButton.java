package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FMPBannerButton.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/fmp/FMPBannerButton;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "Lcom/avito/android/remote/fmp/AnalyticsEvent;", "onClick", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getStyle", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FMPBannerButton implements Parcelable {

    @k
    public static final Parcelable.Creator<FMPBannerButton> CREATOR = new a();

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("onClick")
    @l
    private final List<AnalyticsEvent> onClick;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c("text")
    @l
    private final String text;

    /* compiled from: FMPBannerButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FMPBannerButton> {
        @Override // android.os.Parcelable.Creator
        public final FMPBannerButton createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(FMPBannerButton.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AnalyticsEvent.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new FMPBannerButton(string, deepLink, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FMPBannerButton[] newArray(int i12) {
            return new FMPBannerButton[i12];
        }
    }

    public FMPBannerButton(@l String str, @l DeepLink deepLink, @l String str2, @l List<AnalyticsEvent> list) {
        this.text = str;
        this.deeplink = deepLink;
        this.style = str2;
        this.onClick = list;
    }

    @l
    public final List<AnalyticsEvent> c() {
        return this.onClick;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FMPBannerButton)) {
            return false;
        }
        FMPBannerButton fMPBannerButton = (FMPBannerButton) obj;
        return L.f(this.text, fMPBannerButton.text) && L.f(this.deeplink, fMPBannerButton.deeplink) && L.f(this.style, fMPBannerButton.style) && L.f(this.onClick, fMPBannerButton.onClick);
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str2 = this.style;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AnalyticsEvent> list = this.onClick;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FMPBannerButton(text=");
        sb2.append(this.text);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", onClick=");
        return H.p(sb2, this.onClick, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.deeplink, i12);
        parcel.writeString(this.style);
        List<AnalyticsEvent> list = this.onClick;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((AnalyticsEvent) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
