package com.avito.android.screen_flow.link;

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

/* compiled from: ScreenFlowLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screen_flow/link/ScreenFlowLink;", "Lcom/avito/android/screen_flow/link/ScreenFlowLinkDeclaration;", "_avito_screen-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ScreenFlowLink extends ScreenFlowLinkDeclaration {

    @k
    public static final Parcelable.Creator<ScreenFlowLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f260204b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f260205c;

    /* compiled from: ScreenFlowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ScreenFlowLink> {
        @Override // android.os.Parcelable.Creator
        public final ScreenFlowLink createFromParcel(Parcel parcel) {
            return new ScreenFlowLink((DeepLink) parcel.readParcelable(ScreenFlowLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(ScreenFlowLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ScreenFlowLink[] newArray(int i12) {
            return new ScreenFlowLink[i12];
        }
    }

    public ScreenFlowLink(@k DeepLink deepLink, @k DeepLink deepLink2) {
        this.f260204b = deepLink;
        this.f260205c = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenFlowLink)) {
            return false;
        }
        ScreenFlowLink screenFlowLink = (ScreenFlowLink) obj;
        return L.f(this.f260204b, screenFlowLink.f260204b) && L.f(this.f260205c, screenFlowLink.f260205c);
    }

    @Override // com.avito.android.screen_flow.link.ScreenFlowLinkDeclaration
    @k
    /* renamed from: f, reason: from getter */
    public final DeepLink getF260207c() {
        return this.f260205c;
    }

    @Override // com.avito.android.screen_flow.link.ScreenFlowLinkDeclaration
    @k
    /* renamed from: g, reason: from getter */
    public final DeepLink getF260206b() {
        return this.f260204b;
    }

    public final int hashCode() {
        return this.f260205c.hashCode() + (this.f260204b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenFlowLink(screenToOpen=");
        sb2.append(this.f260204b);
        sb2.append(", innerLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f260205c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f260204b, i12);
        parcel.writeParcelable(this.f260205c, i12);
    }
}
