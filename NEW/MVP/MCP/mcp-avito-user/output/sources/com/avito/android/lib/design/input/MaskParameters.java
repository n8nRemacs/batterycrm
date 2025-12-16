package com.avito.android.lib.design.input;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FormatterType.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/input/MaskParameters;", "Landroid/os/Parcelable;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MaskParameters implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<MaskParameters> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f179371b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f179372c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f179373d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f179374e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f179375f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f179376g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f179377h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f179378i;

    /* renamed from: j, reason: collision with root package name */
    public final char f179379j;

    /* renamed from: k, reason: collision with root package name */
    public final int f179380k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f179381l;

    /* compiled from: FormatterType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MaskParameters> {
        @Override // android.os.Parcelable.Creator
        public final MaskParameters createFromParcel(Parcel parcel) {
            return new MaskParameters(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), (char) parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MaskParameters[] newArray(int i12) {
            return new MaskParameters[i12];
        }
    }

    public MaskParameters() {
        this(null, false, null, null, false, null, false, null, (char) 0, 0, null, 2047, null);
    }

    public static MaskParameters a(MaskParameters maskParameters, String str, String str2, int i12) {
        if ((i12 & 1) != 0) {
            str = maskParameters.f179371b;
        }
        String str3 = str;
        boolean z12 = maskParameters.f179372c;
        if ((i12 & 4) != 0) {
            str2 = maskParameters.f179373d;
        }
        String str4 = str2;
        String str5 = maskParameters.f179374e;
        boolean z13 = maskParameters.f179375f;
        String str6 = (i12 & 32) != 0 ? maskParameters.f179376g : "### ### ### ### ### ###,#";
        boolean z14 = maskParameters.f179377h;
        String str7 = (i12 & 128) != 0 ? maskParameters.f179378i : "";
        char c12 = maskParameters.f179379j;
        int i13 = maskParameters.f179380k;
        String str8 = maskParameters.f179381l;
        maskParameters.getClass();
        return new MaskParameters(str3, z12, str4, str5, z13, str6, z14, str7, c12, i13, str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskParameters)) {
            return false;
        }
        MaskParameters maskParameters = (MaskParameters) obj;
        return L.f(this.f179371b, maskParameters.f179371b) && this.f179372c == maskParameters.f179372c && L.f(this.f179373d, maskParameters.f179373d) && L.f(this.f179374e, maskParameters.f179374e) && this.f179375f == maskParameters.f179375f && L.f(this.f179376g, maskParameters.f179376g) && this.f179377h == maskParameters.f179377h && L.f(this.f179378i, maskParameters.f179378i) && this.f179379j == maskParameters.f179379j && this.f179380k == maskParameters.f179380k && L.f(this.f179381l, maskParameters.f179381l);
    }

    public final int hashCode() {
        return this.f179381l.hashCode() + androidx.appcompat.app.r.e(this.f179380k, (Character.hashCode(this.f179379j) + H.d(androidx.appcompat.app.r.i(H.d(androidx.appcompat.app.r.i(H.d(H.d(androidx.appcompat.app.r.i(this.f179371b.hashCode() * 31, 31, this.f179372c), 31, this.f179373d), 31, this.f179374e), 31, this.f179375f), 31, this.f179376g), 31, this.f179377h), 31, this.f179378i)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MaskParameters(prefix=");
        sb2.append(this.f179371b);
        sb2.append(", isPrefixSelectionAllowed=");
        sb2.append(this.f179372c);
        sb2.append(", postfix=");
        sb2.append(this.f179373d);
        sb2.append(", divider=");
        sb2.append(this.f179374e);
        sb2.append(", isPostfixSelectionAllowed=");
        sb2.append(this.f179375f);
        sb2.append(", mask=");
        sb2.append(this.f179376g);
        sb2.append(", isReversedMask=");
        sb2.append(this.f179377h);
        sb2.append(", removableDuplicateStringFromStart=");
        sb2.append(this.f179378i);
        sb2.append(", decimalSeparator=");
        sb2.append(this.f179379j);
        sb2.append(", decimalPlaces=");
        sb2.append(this.f179380k);
        sb2.append(", countryCodeAlias=");
        return C22026a.c(sb2, this.f179381l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f179371b);
        parcel.writeInt(this.f179372c ? 1 : 0);
        parcel.writeString(this.f179373d);
        parcel.writeString(this.f179374e);
        parcel.writeInt(this.f179375f ? 1 : 0);
        parcel.writeString(this.f179376g);
        parcel.writeInt(this.f179377h ? 1 : 0);
        parcel.writeString(this.f179378i);
        parcel.writeInt(this.f179379j);
        parcel.writeInt(this.f179380k);
        parcel.writeString(this.f179381l);
    }

    public MaskParameters(@Y61.k String str, boolean z12, @Y61.k String str2, @Y61.k String str3, boolean z13, @Y61.k String str4, boolean z14, @Y61.k String str5, char c12, int i12, @Y61.k String str6) {
        this.f179371b = str;
        this.f179372c = z12;
        this.f179373d = str2;
        this.f179374e = str3;
        this.f179375f = z13;
        this.f179376g = str4;
        this.f179377h = z14;
        this.f179378i = str5;
        this.f179379j = c12;
        this.f179380k = i12;
        this.f179381l = str6;
    }

    public /* synthetic */ MaskParameters(String str, boolean z12, String str2, String str3, boolean z13, String str4, boolean z14, String str5, char c12, int i12, String str6, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z12, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? " " : str3, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? "" : str4, (i13 & 64) == 0 ? z14 : false, (i13 & 128) != 0 ? "" : str5, (i13 & 256) != 0 ? '.' : c12, (i13 & 512) != 0 ? 2 : i12, (i13 & 1024) == 0 ? str6 : "");
    }
}
