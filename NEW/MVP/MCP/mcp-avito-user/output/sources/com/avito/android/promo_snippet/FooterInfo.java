package com.avito.android.promo_snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoSnippetState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promo_snippet/FooterInfo;", "Landroid/os/Parcelable;", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class FooterInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<FooterInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f231692b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f231693c;

    /* compiled from: PromoSnippetState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FooterInfo> {
        @Override // android.os.Parcelable.Creator
        public final FooterInfo createFromParcel(Parcel parcel) {
            return new FooterInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FooterInfo[] newArray(int i12) {
            return new FooterInfo[i12];
        }
    }

    public FooterInfo(@l String str, @k String str2) {
        this.f231692b = str;
        this.f231693c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterInfo)) {
            return false;
        }
        FooterInfo footerInfo = (FooterInfo) obj;
        return L.f(this.f231692b, footerInfo.f231692b) && L.f(this.f231693c, footerInfo.f231693c);
    }

    public final int hashCode() {
        String str = this.f231692b;
        return this.f231693c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FooterInfo(progressText=");
        sb2.append(this.f231692b);
        sb2.append(", deadline=");
        return C22026a.c(sb2, this.f231693c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f231692b);
        parcel.writeString(this.f231693c);
    }
}
