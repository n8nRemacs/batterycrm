package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RentAgreement.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/RentAgreement;", "Landroid/os/Parcelable;", "", "buttonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "buttonDeeplink", "buttonTextIconName", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)Lcom/avito/android/remote/model/RentAgreement;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getButtonDeeplink", "getButtonTextIconName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RentAgreement implements Parcelable {

    @k
    public static final Parcelable.Creator<RentAgreement> CREATOR = new Creator();

    @c("buttonDeeplink")
    @k
    private final DeepLink buttonDeeplink;

    @c("buttonTextIconName")
    @k
    private final String buttonTextIconName;

    @c("buttonTitle")
    @k
    private final String buttonTitle;

    /* compiled from: RentAgreement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RentAgreement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RentAgreement createFromParcel(@k Parcel parcel) {
            return new RentAgreement(parcel.readString(), (DeepLink) parcel.readParcelable(RentAgreement.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RentAgreement[] newArray(int i12) {
            return new RentAgreement[i12];
        }
    }

    public RentAgreement(@k String str, @k DeepLink deepLink, @k String str2) {
        this.buttonTitle = str;
        this.buttonDeeplink = deepLink;
        this.buttonTextIconName = str2;
    }

    public static /* synthetic */ RentAgreement copy$default(RentAgreement rentAgreement, String str, DeepLink deepLink, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = rentAgreement.buttonTitle;
        }
        if ((i12 & 2) != 0) {
            deepLink = rentAgreement.buttonDeeplink;
        }
        if ((i12 & 4) != 0) {
            str2 = rentAgreement.buttonTextIconName;
        }
        return rentAgreement.copy(str, deepLink, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getButtonDeeplink() {
        return this.buttonDeeplink;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getButtonTextIconName() {
        return this.buttonTextIconName;
    }

    @k
    public final RentAgreement copy(@k String buttonTitle, @k DeepLink buttonDeeplink, @k String buttonTextIconName) {
        return new RentAgreement(buttonTitle, buttonDeeplink, buttonTextIconName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RentAgreement)) {
            return false;
        }
        RentAgreement rentAgreement = (RentAgreement) other;
        return L.f(this.buttonTitle, rentAgreement.buttonTitle) && L.f(this.buttonDeeplink, rentAgreement.buttonDeeplink) && L.f(this.buttonTextIconName, rentAgreement.buttonTextIconName);
    }

    @k
    public final DeepLink getButtonDeeplink() {
        return this.buttonDeeplink;
    }

    @k
    public final String getButtonTextIconName() {
        return this.buttonTextIconName;
    }

    @k
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public int hashCode() {
        return this.buttonTextIconName.hashCode() + a.e(this.buttonDeeplink, this.buttonTitle.hashCode() * 31, 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RentAgreement(buttonTitle=");
        sb2.append(this.buttonTitle);
        sb2.append(", buttonDeeplink=");
        sb2.append(this.buttonDeeplink);
        sb2.append(", buttonTextIconName=");
        return C22026a.c(sb2, this.buttonTextIconName, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.buttonTitle);
        parcel.writeParcelable(this.buttonDeeplink, flags);
        parcel.writeString(this.buttonTextIconName);
    }
}
