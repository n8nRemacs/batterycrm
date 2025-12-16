package com.avito.android.iac_util_deeplinks.public_module;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ClickStreamLocalLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/ClickStreamLocalLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class ClickStreamLocalLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ClickStreamLocalLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ParametrizedClickStreamEvent f169244b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f169245c;

    /* compiled from: ClickStreamLocalLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClickStreamLocalLink> {
        @Override // android.os.Parcelable.Creator
        public final ClickStreamLocalLink createFromParcel(Parcel parcel) {
            return new ClickStreamLocalLink((ParametrizedClickStreamEvent) parcel.readParcelable(ClickStreamLocalLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(ClickStreamLocalLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClickStreamLocalLink[] newArray(int i12) {
            return new ClickStreamLocalLink[i12];
        }
    }

    /* compiled from: ClickStreamLocalLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/ClickStreamLocalLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.a {
    }

    public /* synthetic */ ClickStreamLocalLink(ParametrizedClickStreamEvent parametrizedClickStreamEvent, DeepLink deepLink, int i12, C42822w c42822w) {
        this(parametrizedClickStreamEvent, (i12 & 2) != 0 ? null : deepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickStreamLocalLink)) {
            return false;
        }
        ClickStreamLocalLink clickStreamLocalLink = (ClickStreamLocalLink) obj;
        return L.f(this.f169244b, clickStreamLocalLink.f169244b) && L.f(this.f169245c, clickStreamLocalLink.f169245c);
    }

    public final int hashCode() {
        int iHashCode = this.f169244b.hashCode() * 31;
        DeepLink deepLink = this.f169245c;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClickStreamLocalLink(event=");
        sb2.append(this.f169244b);
        sb2.append(", nextLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f169245c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f169244b, i12);
        parcel.writeParcelable(this.f169245c, i12);
    }

    public ClickStreamLocalLink(@k ParametrizedClickStreamEvent parametrizedClickStreamEvent, @l DeepLink deepLink) {
        this.f169244b = parametrizedClickStreamEvent;
        this.f169245c = deepLink;
    }

    public /* synthetic */ ClickStreamLocalLink(com.avito.android.analytics.provider.clickstream.a aVar, DeepLink deepLink, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? null : deepLink);
    }

    public ClickStreamLocalLink(@k com.avito.android.analytics.provider.clickstream.a aVar, @l DeepLink deepLink) {
        this(new ParametrizedClickStreamEvent(aVar.getF82866b(), aVar.getF82867c(), aVar.getParams(), null, 8, null), deepLink);
    }
}
