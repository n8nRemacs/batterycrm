package com.avito.android.avl.deeplink;

import K51.d;
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

/* compiled from: AvlLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl/deeplink/AvlLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class AvlLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<AvlLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f98075b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f98076c;

    /* compiled from: AvlLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvlLink> {
        @Override // android.os.Parcelable.Creator
        public final AvlLink createFromParcel(Parcel parcel) {
            return new AvlLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AvlLink[] newArray(int i12) {
            return new AvlLink[i12];
        }
    }

    public AvlLink(@l String str, @l String str2) {
        this.f98075b = str;
        this.f98076c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvlLink)) {
            return false;
        }
        AvlLink avlLink = (AvlLink) obj;
        return L.f(this.f98075b, avlLink.f98075b) && L.f(this.f98076c, avlLink.f98076c);
    }

    public final int hashCode() {
        String str = this.f98075b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f98076c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvlLink(itemId=");
        sb2.append(this.f98075b);
        sb2.append(", sourceSessionId=");
        return C22026a.c(sb2, this.f98076c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f98075b);
        parcel.writeString(this.f98076c);
    }
}
