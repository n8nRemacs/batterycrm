package com.avito.android.tariff.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoSfTermsLink.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpxInfoSfTermsLinkBody;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "saveButtonTitle", "skipButtonTitle", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffCpxInfoSfTermsLinkBody implements Parcelable {

    @k
    public static final Parcelable.Creator<TariffCpxInfoSfTermsLinkBody> CREATOR = new a();

    @c("description")
    @l
    private final AttributedText description;

    @c("image")
    @l
    private final UniversalImage image;

    @c("saveButtonTitle")
    @l
    private final String saveButtonTitle;

    @c("skipButtonTitle")
    @l
    private final String skipButtonTitle;

    /* compiled from: TariffCpxInfoSfTermsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxInfoSfTermsLinkBody> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoSfTermsLinkBody createFromParcel(Parcel parcel) {
            return new TariffCpxInfoSfTermsLinkBody((AttributedText) parcel.readParcelable(TariffCpxInfoSfTermsLinkBody.class.getClassLoader()), (UniversalImage) parcel.readParcelable(TariffCpxInfoSfTermsLinkBody.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoSfTermsLinkBody[] newArray(int i12) {
            return new TariffCpxInfoSfTermsLinkBody[i12];
        }
    }

    public TariffCpxInfoSfTermsLinkBody(@l AttributedText attributedText, @l UniversalImage universalImage, @l String str, @l String str2) {
        this.description = attributedText;
        this.image = universalImage;
        this.saveButtonTitle = str;
        this.skipButtonTitle = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getSaveButtonTitle() {
        return this.saveButtonTitle;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getSkipButtonTitle() {
        return this.skipButtonTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffCpxInfoSfTermsLinkBody)) {
            return false;
        }
        TariffCpxInfoSfTermsLinkBody tariffCpxInfoSfTermsLinkBody = (TariffCpxInfoSfTermsLinkBody) obj;
        return L.f(this.description, tariffCpxInfoSfTermsLinkBody.description) && L.f(this.image, tariffCpxInfoSfTermsLinkBody.image) && L.f(this.saveButtonTitle, tariffCpxInfoSfTermsLinkBody.saveButtonTitle) && L.f(this.skipButtonTitle, tariffCpxInfoSfTermsLinkBody.skipButtonTitle);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    public final int hashCode() {
        AttributedText attributedText = this.description;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str = this.saveButtonTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.skipButtonTitle;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoSfTermsLinkBody(description=");
        sb2.append(this.description);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", saveButtonTitle=");
        sb2.append(this.saveButtonTitle);
        sb2.append(", skipButtonTitle=");
        return C22026a.c(sb2, this.skipButtonTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.description, i12);
        parcel.writeParcelable(this.image, i12);
        parcel.writeString(this.saveButtonTitle);
        parcel.writeString(this.skipButtonTitle);
    }
}
