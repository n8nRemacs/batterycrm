package com.avito.android.comfortable_deal.save_dialog.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SaveArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/save_dialog/model/SaveArguments;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SaveArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<SaveArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f122634b;

    /* renamed from: c, reason: collision with root package name */
    public final int f122635c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f122636d;

    /* renamed from: e, reason: collision with root package name */
    public final int f122637e;

    /* renamed from: f, reason: collision with root package name */
    public final int f122638f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f122639g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f122640h;

    /* compiled from: SaveArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SaveArguments> {
        @Override // android.os.Parcelable.Creator
        public final SaveArguments createFromParcel(Parcel parcel) {
            return new SaveArguments(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SaveArguments[] newArray(int i12) {
            return new SaveArguments[i12];
        }
    }

    public SaveArguments(@k String str, @e0 int i12, @l @e0 Integer num, @e0 int i13, @e0 int i14, boolean z12, boolean z13) {
        this.f122634b = str;
        this.f122635c = i12;
        this.f122636d = num;
        this.f122637e = i13;
        this.f122638f = i14;
        this.f122639g = z12;
        this.f122640h = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveArguments)) {
            return false;
        }
        SaveArguments saveArguments = (SaveArguments) obj;
        return L.f(this.f122634b, saveArguments.f122634b) && this.f122635c == saveArguments.f122635c && L.f(this.f122636d, saveArguments.f122636d) && this.f122637e == saveArguments.f122637e && this.f122638f == saveArguments.f122638f && this.f122639g == saveArguments.f122639g && this.f122640h == saveArguments.f122640h;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f122635c, this.f122634b.hashCode() * 31, 31);
        Integer num = this.f122636d;
        return Boolean.hashCode(this.f122640h) + r.i(r.e(this.f122638f, r.e(this.f122637e, (iE2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31, this.f122639g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SaveArguments(requestKey=");
        sb2.append(this.f122634b);
        sb2.append(", label=");
        sb2.append(this.f122635c);
        sb2.append(", description=");
        sb2.append(this.f122636d);
        sb2.append(", applyButtonText=");
        sb2.append(this.f122637e);
        sb2.append(", cancelButtonText=");
        sb2.append(this.f122638f);
        sb2.append(", buttonsHorizontalOrientation=");
        sb2.append(this.f122639g);
        sb2.append(", swapButtons=");
        return r.x(sb2, this.f122640h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f122634b);
        parcel.writeInt(this.f122635c);
        Integer num = this.f122636d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f122637e);
        parcel.writeInt(this.f122638f);
        parcel.writeInt(this.f122639g ? 1 : 0);
        parcel.writeInt(this.f122640h ? 1 : 0);
    }
}
