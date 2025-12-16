package com.avito.android.model_card.routing;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ModelCardNonTabDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/model_card/routing/ModelCardNonTabLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class ModelCardNonTabLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<ModelCardNonTabLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f198030b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f198031c;

    /* compiled from: ModelCardNonTabDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ModelCardNonTabLink> {
        @Override // android.os.Parcelable.Creator
        public final ModelCardNonTabLink createFromParcel(Parcel parcel) {
            return new ModelCardNonTabLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ModelCardNonTabLink[] newArray(int i12) {
            return new ModelCardNonTabLink[i12];
        }
    }

    public ModelCardNonTabLink(@k String str, @l String str2) {
        this.f198030b = str;
        this.f198031c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelCardNonTabLink)) {
            return false;
        }
        ModelCardNonTabLink modelCardNonTabLink = (ModelCardNonTabLink) obj;
        return L.f(this.f198030b, modelCardNonTabLink.f198030b) && L.f(this.f198031c, modelCardNonTabLink.f198031c);
    }

    public final int hashCode() {
        int iHashCode = this.f198030b.hashCode() * 31;
        String str = this.f198031c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelCardNonTabLink(params=");
        sb2.append(this.f198030b);
        sb2.append(", style=");
        return C22026a.c(sb2, this.f198031c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f198030b);
        parcel.writeString(this.f198031c);
    }
}
