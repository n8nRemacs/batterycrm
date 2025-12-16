package com.avito.android.comparison.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/comparison/remote/model/CallButton;", "Landroid/os/Parcelable;", "", "buttonText", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "active", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CallButton implements Parcelable {

    @k
    public static final Parcelable.Creator<CallButton> CREATOR = new a();

    @c("active")
    @l
    private final Boolean active;

    @c("buttonText")
    @k
    private final String buttonText;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink link;

    /* compiled from: ComparisonResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CallButton> {
        @Override // android.os.Parcelable.Creator
        public final CallButton createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(CallButton.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CallButton(string, deepLink, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CallButton[] newArray(int i12) {
            return new CallButton[i12];
        }
    }

    public CallButton(@k String str, @k DeepLink deepLink, @l Boolean bool) {
        this.buttonText = str;
        this.link = deepLink;
        this.active = bool;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallButton)) {
            return false;
        }
        CallButton callButton = (CallButton) obj;
        return L.f(this.buttonText, callButton.buttonText) && L.f(this.link, callButton.link) && L.f(this.active, callButton.active);
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.link, this.buttonText.hashCode() * 31, 31);
        Boolean bool = this.active;
        return iE2 + (bool == null ? 0 : bool.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallButton(buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", active=");
        return C0.g(sb2, this.active, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.buttonText);
        parcel.writeParcelable(this.link, i12);
        Boolean bool = this.active;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
