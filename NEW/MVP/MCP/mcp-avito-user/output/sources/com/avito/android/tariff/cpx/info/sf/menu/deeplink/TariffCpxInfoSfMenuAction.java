package com.avito.android.tariff.cpx.info.sf.menu.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoSfMenuLink.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/menu/deeplink/TariffCpxInfoSfMenuAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "iconName", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffCpxInfoSfMenuAction implements Parcelable {

    @k
    public static final Parcelable.Creator<TariffCpxInfoSfMenuAction> CREATOR = new a();

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c("textIcon")
    @k
    private final String iconName;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: TariffCpxInfoSfMenuLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxInfoSfMenuAction> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoSfMenuAction createFromParcel(Parcel parcel) {
            return new TariffCpxInfoSfMenuAction((AttributedText) parcel.readParcelable(TariffCpxInfoSfMenuAction.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(TariffCpxInfoSfMenuAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoSfMenuAction[] newArray(int i12) {
            return new TariffCpxInfoSfMenuAction[i12];
        }
    }

    public TariffCpxInfoSfMenuAction(@k AttributedText attributedText, @k String str, @l DeepLink deepLink) {
        this.title = attributedText;
        this.iconName = str;
        this.deepLink = deepLink;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffCpxInfoSfMenuAction)) {
            return false;
        }
        TariffCpxInfoSfMenuAction tariffCpxInfoSfMenuAction = (TariffCpxInfoSfMenuAction) obj;
        return L.f(this.title, tariffCpxInfoSfMenuAction.title) && L.f(this.iconName, tariffCpxInfoSfMenuAction.iconName) && L.f(this.deepLink, tariffCpxInfoSfMenuAction.deepLink);
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    public final int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.iconName);
        DeepLink deepLink = this.deepLink;
        return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoSfMenuAction(title=");
        sb2.append(this.title);
        sb2.append(", iconName=");
        sb2.append(this.iconName);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeString(this.iconName);
        parcel.writeParcelable(this.deepLink, i12);
    }
}
