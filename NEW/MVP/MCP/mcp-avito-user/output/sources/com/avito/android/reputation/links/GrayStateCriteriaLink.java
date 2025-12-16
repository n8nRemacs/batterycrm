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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/links/GrayStateCriteriaLink;", "Lcom/avito/android/reputation/links/BaseReputationLink;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class GrayStateCriteriaLink extends BaseReputationLink {

    @k
    public static final Parcelable.Creator<GrayStateCriteriaLink> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f254759c;

    /* compiled from: ReputationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GrayStateCriteriaLink> {
        @Override // android.os.Parcelable.Creator
        public final GrayStateCriteriaLink createFromParcel(Parcel parcel) {
            return new GrayStateCriteriaLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GrayStateCriteriaLink[] newArray(int i12) {
            return new GrayStateCriteriaLink[i12];
        }
    }

    public GrayStateCriteriaLink(@l String str) {
        super(str, null);
        this.f254759c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GrayStateCriteriaLink) && L.f(this.f254759c, ((GrayStateCriteriaLink) obj).f254759c);
    }

    @Override // com.avito.android.reputation.links.BaseReputationLink
    @l
    /* renamed from: f, reason: from getter */
    public final String getF254762c() {
        return this.f254759c;
    }

    public final int hashCode() {
        String str = this.f254759c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("GrayStateCriteriaLink(source="), this.f254759c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f254759c);
    }
}
