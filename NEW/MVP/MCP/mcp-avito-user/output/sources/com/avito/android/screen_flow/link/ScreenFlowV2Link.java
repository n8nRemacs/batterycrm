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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screen_flow/link/ScreenFlowV2Link;", "Lcom/avito/android/screen_flow/link/ScreenFlowLinkDeclaration;", "_avito_screen-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ScreenFlowV2Link extends ScreenFlowLinkDeclaration {

    @k
    public static final Parcelable.Creator<ScreenFlowV2Link> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f260206b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f260207c;

    /* compiled from: ScreenFlowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ScreenFlowV2Link> {
        @Override // android.os.Parcelable.Creator
        public final ScreenFlowV2Link createFromParcel(Parcel parcel) {
            return new ScreenFlowV2Link((DeepLink) parcel.readParcelable(ScreenFlowV2Link.class.getClassLoader()), (DeepLink) parcel.readParcelable(ScreenFlowV2Link.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ScreenFlowV2Link[] newArray(int i12) {
            return new ScreenFlowV2Link[i12];
        }
    }

    public ScreenFlowV2Link(@k DeepLink deepLink, @k DeepLink deepLink2) {
        this.f260206b = deepLink;
        this.f260207c = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenFlowV2Link)) {
            return false;
        }
        ScreenFlowV2Link screenFlowV2Link = (ScreenFlowV2Link) obj;
        return L.f(this.f260206b, screenFlowV2Link.f260206b) && L.f(this.f260207c, screenFlowV2Link.f260207c);
    }

    @Override // com.avito.android.screen_flow.link.ScreenFlowLinkDeclaration
    @k
    /* renamed from: f, reason: from getter */
    public final DeepLink getF260207c() {
        return this.f260207c;
    }

    @Override // com.avito.android.screen_flow.link.ScreenFlowLinkDeclaration
    @k
    /* renamed from: g, reason: from getter */
    public final DeepLink getF260206b() {
        return this.f260206b;
    }

    public final int hashCode() {
        return this.f260207c.hashCode() + (this.f260206b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenFlowV2Link(screenToOpen=");
        sb2.append(this.f260206b);
        sb2.append(", innerLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f260207c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f260206b, i12);
        parcel.writeParcelable(this.f260207c, i12);
    }
}
