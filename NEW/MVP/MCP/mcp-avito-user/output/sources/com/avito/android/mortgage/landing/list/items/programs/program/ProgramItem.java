package com.avito.android.mortgage.landing.list.items.programs.program;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProgramItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/programs/program/ProgramItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProgramItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProgramItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f199921b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f199922c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f199923d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f199924e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f199925f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f199926g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f199927h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f199928i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f199929j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final AttributedText f199930k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f199931l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f199932m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f199933n;

    /* compiled from: ProgramItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProgramItem> {
        @Override // android.os.Parcelable.Creator
        public final ProgramItem createFromParcel(Parcel parcel) {
            return new ProgramItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(ProgramItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ProgramItem[] newArray(int i12) {
            return new ProgramItem[i12];
        }
    }

    public ProgramItem(@k String str, @k String str2, @l String str3, @k String str4, @k String str5, @l String str6, boolean z12, @k String str7, @k String str8, @l AttributedText attributedText, @k String str9, boolean z13, boolean z14) {
        this.f199921b = str;
        this.f199922c = str2;
        this.f199923d = str3;
        this.f199924e = str4;
        this.f199925f = str5;
        this.f199926g = str6;
        this.f199927h = z12;
        this.f199928i = str7;
        this.f199929j = str8;
        this.f199930k = attributedText;
        this.f199931l = str9;
        this.f199932m = z13;
        this.f199933n = z14;
    }

    public static ProgramItem a(ProgramItem programItem, boolean z12, int i12) {
        String str = programItem.f199921b;
        String str2 = programItem.f199922c;
        String str3 = programItem.f199923d;
        String str4 = programItem.f199924e;
        String str5 = programItem.f199925f;
        String str6 = programItem.f199926g;
        boolean z13 = programItem.f199927h;
        String str7 = programItem.f199928i;
        String str8 = programItem.f199929j;
        AttributedText attributedText = programItem.f199930k;
        String str9 = programItem.f199931l;
        boolean z14 = (i12 & 2048) != 0 ? programItem.f199932m : z12;
        boolean z15 = (i12 & 4096) != 0 ? programItem.f199933n : false;
        programItem.getClass();
        return new ProgramItem(str, str2, str3, str4, str5, str6, z13, str7, str8, attributedText, str9, z14, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramItem)) {
            return false;
        }
        ProgramItem programItem = (ProgramItem) obj;
        return L.f(this.f199921b, programItem.f199921b) && L.f(this.f199922c, programItem.f199922c) && L.f(this.f199923d, programItem.f199923d) && L.f(this.f199924e, programItem.f199924e) && L.f(this.f199925f, programItem.f199925f) && L.f(this.f199926g, programItem.f199926g) && this.f199927h == programItem.f199927h && L.f(this.f199928i, programItem.f199928i) && L.f(this.f199929j, programItem.f199929j) && L.f(this.f199930k, programItem.f199930k) && L.f(this.f199931l, programItem.f199931l) && this.f199932m == programItem.f199932m && this.f199933n == programItem.f199933n;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170120b() {
        return this.f199921b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f199921b.hashCode() * 31, 31, this.f199922c);
        String str = this.f199923d;
        int iD3 = H.d(H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f199924e), 31, this.f199925f);
        String str2 = this.f199926g;
        int iD4 = H.d(H.d(r.i((iD3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f199927h), 31, this.f199928i), 31, this.f199929j);
        AttributedText attributedText = this.f199930k;
        return Boolean.hashCode(this.f199933n) + r.i(H.d((iD4 + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f199931l), 31, this.f199932m);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgramItem(stringId=");
        sb2.append(this.f199921b);
        sb2.append(", title=");
        sb2.append(this.f199922c);
        sb2.append(", subtitle=");
        sb2.append(this.f199923d);
        sb2.append(", rate=");
        sb2.append(this.f199924e);
        sb2.append(", downPayment=");
        sb2.append(this.f199925f);
        sb2.append(", alert=");
        sb2.append(this.f199926g);
        sb2.append(", hasAlertInPrograms=");
        sb2.append(this.f199927h);
        sb2.append(", maxAmount=");
        sb2.append(this.f199928i);
        sb2.append(", term=");
        sb2.append(this.f199929j);
        sb2.append(", detailedDescription=");
        sb2.append(this.f199930k);
        sb2.append(", value=");
        sb2.append(this.f199931l);
        sb2.append(", isChecked=");
        sb2.append(this.f199932m);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f199933n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f199921b);
        parcel.writeString(this.f199922c);
        parcel.writeString(this.f199923d);
        parcel.writeString(this.f199924e);
        parcel.writeString(this.f199925f);
        parcel.writeString(this.f199926g);
        parcel.writeInt(this.f199927h ? 1 : 0);
        parcel.writeString(this.f199928i);
        parcel.writeString(this.f199929j);
        parcel.writeParcelable(this.f199930k, i12);
        parcel.writeString(this.f199931l);
        parcel.writeInt(this.f199932m ? 1 : 0);
        parcel.writeInt(this.f199933n ? 1 : 0);
    }

    public /* synthetic */ ProgramItem(String str, String str2, String str3, String str4, String str5, String str6, boolean z12, String str7, String str8, AttributedText attributedText, String str9, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, str6, z12, str7, str8, attributedText, str9, z13, (i12 & 4096) != 0 ? true : z14);
    }
}
