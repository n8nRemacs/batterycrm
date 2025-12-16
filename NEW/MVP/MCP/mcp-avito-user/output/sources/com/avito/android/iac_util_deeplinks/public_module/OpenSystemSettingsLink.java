package com.avito.android.iac_util_deeplinks.public_module;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.ParametrizedEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: OpenSystemSettingsLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/OpenSystemSettingsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class OpenSystemSettingsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<OpenSystemSettingsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f169247b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ParametrizedEvent f169248c;

    /* compiled from: OpenSystemSettingsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OpenSystemSettingsLink> {
        @Override // android.os.Parcelable.Creator
        public final OpenSystemSettingsLink createFromParcel(Parcel parcel) {
            return new OpenSystemSettingsLink((DeepLink) parcel.readParcelable(OpenSystemSettingsLink.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(OpenSystemSettingsLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OpenSystemSettingsLink[] newArray(int i12) {
            return new OpenSystemSettingsLink[i12];
        }
    }

    /* compiled from: OpenSystemSettingsLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/OpenSystemSettingsLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenSystemSettingsLink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenSystemSettingsLink)) {
            return false;
        }
        OpenSystemSettingsLink openSystemSettingsLink = (OpenSystemSettingsLink) obj;
        return L.f(this.f169247b, openSystemSettingsLink.f169247b) && L.f(this.f169248c, openSystemSettingsLink.f169248c);
    }

    public final int hashCode() {
        DeepLink deepLink = this.f169247b;
        int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
        ParametrizedEvent parametrizedEvent = this.f169248c;
        return iHashCode + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenSystemSettingsLink(nextLink=");
        sb2.append(this.f169247b);
        sb2.append(", openSettingsEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f169248c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f169247b, i12);
        parcel.writeParcelable(this.f169248c, i12);
    }

    public /* synthetic */ OpenSystemSettingsLink(DeepLink deepLink, ParametrizedEvent parametrizedEvent, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : deepLink, (i12 & 2) != 0 ? null : parametrizedEvent);
    }

    public OpenSystemSettingsLink(@l DeepLink deepLink, @l ParametrizedEvent parametrizedEvent) {
        this.f169247b = deepLink;
        this.f169248c = parametrizedEvent;
    }
}
