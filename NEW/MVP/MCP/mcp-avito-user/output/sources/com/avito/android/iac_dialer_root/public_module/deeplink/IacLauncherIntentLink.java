package com.avito.android.iac_dialer_root.public_module.deeplink;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: IacLauncherIntentLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_root/public_module/deeplink/IacLauncherIntentLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-dialer-root_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacLauncherIntentLink extends DeepLink {

    @k
    public static final Parcelable.Creator<IacLauncherIntentLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f166882b;

    /* compiled from: IacLauncherIntentLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacLauncherIntentLink> {
        @Override // android.os.Parcelable.Creator
        public final IacLauncherIntentLink createFromParcel(Parcel parcel) {
            return new IacLauncherIntentLink(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacLauncherIntentLink[] newArray(int i12) {
            return new IacLauncherIntentLink[i12];
        }
    }

    /* compiled from: IacLauncherIntentLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_root/public_module/deeplink/IacLauncherIntentLink$b;", "", "a", "_avito_iac-dialer-root_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: IacLauncherIntentLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_root/public_module/deeplink/IacLauncherIntentLink$b$a;", "LJu/c$b;", "<init>", "()V", "_avito_iac-dialer-root_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f166883b = new a();
        }
    }

    public IacLauncherIntentLink(boolean z12) {
        this.f166882b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IacLauncherIntentLink) && this.f166882b == ((IacLauncherIntentLink) obj).f166882b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166882b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("IacLauncherIntentLink(finishCurrentActivity="), this.f166882b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f166882b ? 1 : 0);
    }
}
