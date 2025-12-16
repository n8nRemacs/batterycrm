package com.avito.android.comparison.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/avito/android/comparison/remote/model/MessageButton;", "Landroid/os/Parcelable;", "", "buttonText", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "active", "modalText", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "f", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MessageButton implements Parcelable {

    @k
    public static final Parcelable.Creator<MessageButton> CREATOR = new a();

    @c("active")
    @l
    private final Boolean active;

    @c("buttonText")
    @k
    private final String buttonText;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink link;

    @c("modalText")
    @k
    private final String modalText;

    /* compiled from: ComparisonResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MessageButton> {
        @Override // android.os.Parcelable.Creator
        public final MessageButton createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(MessageButton.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessageButton(string, deepLink, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessageButton[] newArray(int i12) {
            return new MessageButton[i12];
        }
    }

    public MessageButton(@k String str, @k DeepLink deepLink, @l Boolean bool, @k String str2) {
        this.buttonText = str;
        this.link = deepLink;
        this.active = bool;
        this.modalText = str2;
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
        if (!(obj instanceof MessageButton)) {
            return false;
        }
        MessageButton messageButton = (MessageButton) obj;
        return L.f(this.buttonText, messageButton.buttonText) && L.f(this.link, messageButton.link) && L.f(this.active, messageButton.active) && L.f(this.modalText, messageButton.modalText);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getModalText() {
        return this.modalText;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.link, this.buttonText.hashCode() * 31, 31);
        Boolean bool = this.active;
        return this.modalText.hashCode() + ((iE2 + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageButton(buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", active=");
        sb2.append(this.active);
        sb2.append(", modalText=");
        return C22026a.c(sb2, this.modalText, ')');
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
        parcel.writeString(this.modalText);
    }
}
