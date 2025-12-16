package com.avito.android.reputation.links;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ReputationLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/links/RestrictionLink;", "Lcom/avito/android/reputation/links/BaseReputationLink;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class RestrictionLink extends BaseReputationLink {

    @k
    public static final Parcelable.Creator<RestrictionLink> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f254762c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f254763d;

    /* compiled from: ReputationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RestrictionLink> {
        @Override // android.os.Parcelable.Creator
        public final RestrictionLink createFromParcel(Parcel parcel) {
            return new RestrictionLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RestrictionLink[] newArray(int i12) {
            return new RestrictionLink[i12];
        }
    }

    public RestrictionLink(@l String str, @k String str2) {
        super(str, null);
        this.f254762c = str;
        this.f254763d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestrictionLink)) {
            return false;
        }
        RestrictionLink restrictionLink = (RestrictionLink) obj;
        return L.f(this.f254762c, restrictionLink.f254762c) && L.f(this.f254763d, restrictionLink.f254763d);
    }

    @Override // com.avito.android.reputation.links.BaseReputationLink
    @l
    /* renamed from: f, reason: from getter */
    public final String getF254762c() {
        return this.f254762c;
    }

    public final int hashCode() {
        String str = this.f254762c;
        return this.f254763d.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RestrictionLink(source=");
        sb2.append(this.f254762c);
        sb2.append(", id=");
        return C22026a.c(sb2, this.f254763d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f254762c);
        parcel.writeString(this.f254763d);
    }
}
