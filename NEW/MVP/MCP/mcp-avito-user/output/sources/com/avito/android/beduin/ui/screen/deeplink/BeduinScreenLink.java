package com.avito.android.beduin.ui.screen.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.ScreenStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: BeduinScreenLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/deeplink/BeduinScreenLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class BeduinScreenLink extends DeepLink {

    @k
    public static final Parcelable.Creator<BeduinScreenLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f104097b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ScreenStyle f104098c;

    /* compiled from: BeduinScreenLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinScreenLink> {
        @Override // android.os.Parcelable.Creator
        public final BeduinScreenLink createFromParcel(Parcel parcel) {
            return new BeduinScreenLink(parcel.readString(), parcel.readInt() == 0 ? null : ScreenStyle.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinScreenLink[] newArray(int i12) {
            return new BeduinScreenLink[i12];
        }
    }

    public BeduinScreenLink(@k String str, @l ScreenStyle screenStyle) {
        this.f104097b = str;
        this.f104098c = screenStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinScreenLink)) {
            return false;
        }
        BeduinScreenLink beduinScreenLink = (BeduinScreenLink) obj;
        return L.f(this.f104097b, beduinScreenLink.f104097b) && this.f104098c == beduinScreenLink.f104098c;
    }

    public final int hashCode() {
        int iHashCode = this.f104097b.hashCode() * 31;
        ScreenStyle screenStyle = this.f104098c;
        return iHashCode + (screenStyle == null ? 0 : screenStyle.hashCode());
    }

    @k
    public final String toString() {
        return "BeduinScreenLink(url=" + this.f104097b + ", presentationStyle=" + this.f104098c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f104097b);
        ScreenStyle screenStyle = this.f104098c;
        if (screenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(screenStyle.name());
        }
    }
}
