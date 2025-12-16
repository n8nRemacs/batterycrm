package com.avito.android.rating_ui.aspects.view;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.lib.design.chips.h;
import j.InterfaceC42156l;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingAspectsChipable.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/RatingAspectsChipable;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingAspectsChipable implements h, Parcelable {

    @k
    public static final Parcelable.Creator<RatingAspectsChipable> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f249888b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f249889c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f249890d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f249891e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f249892f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.l<Boolean, G0> f249893g;

    /* compiled from: RatingAspectsChipable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingAspectsChipable> {
        @Override // android.os.Parcelable.Creator
        public final RatingAspectsChipable createFromParcel(Parcel parcel) {
            return new RatingAspectsChipable(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (Y41.l) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAspectsChipable[] newArray(int i12) {
            return new RatingAspectsChipable[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RatingAspectsChipable(int i12, @k String str, @l String str2, boolean z12, boolean z13, @l Y41.l<? super Boolean, G0> lVar) {
        this.f249888b = i12;
        this.f249889c = str;
        this.f249890d = str2;
        this.f249891e = z12;
        this.f249892f = z13;
        this.f249893g = lVar;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final Y41.l<Boolean, G0> L() {
        return this.f249893g;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@k Object obj) {
        if (obj instanceof RatingAspectsChipable) {
            RatingAspectsChipable ratingAspectsChipable = (RatingAspectsChipable) obj;
            if (L.f(this.f249889c, ratingAspectsChipable.f249889c) && L.f(this.f249890d, ratingAspectsChipable.f249890d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF199741b() {
        return this.f249889c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingAspectsChipable)) {
            return false;
        }
        RatingAspectsChipable ratingAspectsChipable = (RatingAspectsChipable) obj;
        return this.f249888b == ratingAspectsChipable.f249888b && L.f(this.f249889c, ratingAspectsChipable.f249889c) && L.f(this.f249890d, ratingAspectsChipable.f249890d) && this.f249891e == ratingAspectsChipable.f249891e && this.f249892f == ratingAspectsChipable.f249892f && L.f(this.f249893g, ratingAspectsChipable.f249893g);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0, reason: from getter */
    public final boolean getF106770d() {
        return this.f249891e;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    public final int hashCode() {
        int iD2 = H.d(Integer.hashCode(this.f249888b) * 31, 31, this.f249889c);
        String str = this.f249890d;
        int i12 = r.i(r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f249891e), 31, this.f249892f);
        Y41.l<Boolean, G0> lVar = this.f249893g;
        return i12 + (lVar != null ? lVar.hashCode() : 0);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF171727d() {
        return this.f249892f;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingAspectsChipable(id=");
        sb2.append(this.f249888b);
        sb2.append(", chipTitle=");
        sb2.append(this.f249889c);
        sb2.append(", chipDescription=");
        sb2.append(this.f249890d);
        sb2.append(", isSelectedChip=");
        sb2.append(this.f249891e);
        sb2.append(", isEnabled=");
        sb2.append(this.f249892f);
        sb2.append(", onChange=");
        return H.l(sb2, this.f249893g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f249888b);
        parcel.writeString(this.f249889c);
        parcel.writeString(this.f249890d);
        parcel.writeInt(this.f249891e ? 1 : 0);
        parcel.writeInt(this.f249892f ? 1 : 0);
        parcel.writeSerializable((Serializable) this.f249893g);
    }

    public /* synthetic */ RatingAspectsChipable(int i12, String str, String str2, boolean z12, boolean z13, Y41.l lVar, int i13, C42822w c42822w) {
        this(i12, str, str2, (i13 & 8) != 0 ? false : z12, (i13 & 16) != 0 ? true : z13, (i13 & 32) != 0 ? null : lVar);
    }
}
