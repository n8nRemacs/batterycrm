package com.avito.android.services_video_call.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ServicesVideoCallDeepLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_video_call/deeplink/ServicesVideoCallDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "_avito_services-video-call_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ServicesVideoCallDeepLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<ServicesVideoCallDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f280690b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f280691c;

    /* compiled from: ServicesVideoCallDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesVideoCallDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final ServicesVideoCallDeepLink createFromParcel(Parcel parcel) {
            return new ServicesVideoCallDeepLink((DeepLink) parcel.readParcelable(ServicesVideoCallDeepLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(ServicesVideoCallDeepLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesVideoCallDeepLink[] newArray(int i12) {
            return new ServicesVideoCallDeepLink[i12];
        }
    }

    public ServicesVideoCallDeepLink(@k DeepLink deepLink, @k DeepLink deepLink2) {
        this.f280690b = deepLink;
        this.f280691c = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesVideoCallDeepLink)) {
            return false;
        }
        ServicesVideoCallDeepLink servicesVideoCallDeepLink = (ServicesVideoCallDeepLink) obj;
        return L.f(this.f280690b, servicesVideoCallDeepLink.f280690b) && L.f(this.f280691c, servicesVideoCallDeepLink.f280691c);
    }

    public final int hashCode() {
        return this.f280691c.hashCode() + (this.f280690b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesVideoCallDeepLink(callLink=");
        sb2.append(this.f280690b);
        sb2.append(", detailsSheetUri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f280691c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f280690b, i12);
        parcel.writeParcelable(this.f280691c, i12);
    }
}
