package com.avito.android.comfortable_deal_info.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.comfortable_deal_info.dto.Screen;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ComfortableDealInfoLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_info/deeplink/ComfortableDealInfoLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_comfortable-deal-info_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ComfortableDealInfoLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ComfortableDealInfoLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f123465b;

    /* renamed from: c, reason: collision with root package name */
    public final int f123466c;

    /* compiled from: ComfortableDealInfoLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComfortableDealInfoLink> {
        @Override // android.os.Parcelable.Creator
        public final ComfortableDealInfoLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Screen.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ComfortableDealInfoLink(parcel.readInt(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ComfortableDealInfoLink[] newArray(int i12) {
            return new ComfortableDealInfoLink[i12];
        }
    }

    public ComfortableDealInfoLink(int i12, @k ArrayList arrayList) {
        this.f123465b = arrayList;
        this.f123466c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComfortableDealInfoLink)) {
            return false;
        }
        ComfortableDealInfoLink comfortableDealInfoLink = (ComfortableDealInfoLink) obj;
        return L.f(this.f123465b, comfortableDealInfoLink.f123465b) && this.f123466c == comfortableDealInfoLink.f123466c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f123466c) + (this.f123465b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComfortableDealInfoLink(screens=");
        sb2.append(this.f123465b);
        sb2.append(", currentIndex=");
        return r.t(sb2, this.f123466c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f123465b, parcel);
        while (itZ.hasNext()) {
            ((Screen) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f123466c);
    }
}
