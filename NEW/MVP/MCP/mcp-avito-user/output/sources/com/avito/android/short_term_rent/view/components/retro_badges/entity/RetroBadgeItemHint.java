package com.avito.android.short_term_rent.view.components.retro_badges.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RetroBadgeItemHint.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/retro_badges/entity/RetroBadgeItemHint;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RetroBadgeItemHint implements Parcelable {

    @k
    public static final Parcelable.Creator<RetroBadgeItemHint> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f283049b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f283050c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f283051d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f283052e;

    /* compiled from: RetroBadgeItemHint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RetroBadgeItemHint> {
        @Override // android.os.Parcelable.Creator
        public final RetroBadgeItemHint createFromParcel(Parcel parcel) {
            return new RetroBadgeItemHint(parcel.readString(), (AttributedText) parcel.readParcelable(RetroBadgeItemHint.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RetroBadgeItemHint[] newArray(int i12) {
            return new RetroBadgeItemHint[i12];
        }
    }

    public RetroBadgeItemHint(@l String str, @l AttributedText attributedText, @l String str2, @l String str3) {
        this.f283049b = str;
        this.f283050c = attributedText;
        this.f283051d = str2;
        this.f283052e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetroBadgeItemHint)) {
            return false;
        }
        RetroBadgeItemHint retroBadgeItemHint = (RetroBadgeItemHint) obj;
        return L.f(this.f283049b, retroBadgeItemHint.f283049b) && L.f(this.f283050c, retroBadgeItemHint.f283050c) && L.f(this.f283051d, retroBadgeItemHint.f283051d) && L.f(this.f283052e, retroBadgeItemHint.f283052e);
    }

    public final int hashCode() {
        String str = this.f283049b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f283050c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str2 = this.f283051d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f283052e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RetroBadgeItemHint(buttonTitle=");
        sb2.append(this.f283049b);
        sb2.append(", description=");
        sb2.append(this.f283050c);
        sb2.append(", icon=");
        sb2.append(this.f283051d);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f283052e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f283049b);
        parcel.writeParcelable(this.f283050c, i12);
        parcel.writeString(this.f283051d);
        parcel.writeString(this.f283052e);
    }
}
