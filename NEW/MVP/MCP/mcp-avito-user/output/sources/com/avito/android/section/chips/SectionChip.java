package com.avito.android.section.chips;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SectionChip.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/chips/SectionChip;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionChip implements com.avito.android.lib.design.chips.h, Parcelable {

    @k
    public static final Parcelable.Creator<SectionChip> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f264617b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.l<Boolean, G0> f264618c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f264619d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final CharSequence f264620e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f264621f;

    /* compiled from: SectionChip.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionChip> {
        @Override // android.os.Parcelable.Creator
        public final SectionChip createFromParcel(Parcel parcel) {
            return new SectionChip(parcel.readString(), (Y41.l) parcel.readSerializable(), parcel.readInt() != 0, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SectionChip[] newArray(int i12) {
            return new SectionChip[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SectionChip(@k String str, @l Y41.l<? super Boolean, G0> lVar, boolean z12, @k CharSequence charSequence, boolean z13) {
        this.f264617b = str;
        this.f264618c = lVar;
        this.f264619d = z12;
        this.f264620e = charSequence;
        this.f264621f = z13;
    }

    public static SectionChip a(SectionChip sectionChip, boolean z12) {
        return new SectionChip(sectionChip.f264617b, sectionChip.f264618c, z12, sectionChip.f264620e, sectionChip.f264621f);
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final Y41.l<Boolean, G0> L() {
        return this.f264618c;
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
        if (obj instanceof SectionChip) {
            if (L.f(this.f264617b, ((SectionChip) obj).f264617b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @k
    /* renamed from: W, reason: from getter */
    public final CharSequence getF264620e() {
        return this.f264620e;
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
        if (!(obj instanceof SectionChip)) {
            return false;
        }
        SectionChip sectionChip = (SectionChip) obj;
        return L.f(this.f264617b, sectionChip.f264617b) && L.f(this.f264618c, sectionChip.f264618c) && this.f264619d == sectionChip.f264619d && L.f(this.f264620e, sectionChip.f264620e) && this.f264621f == sectionChip.f264621f;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0, reason: from getter */
    public final boolean getF264619d() {
        return this.f264619d;
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
        int iHashCode = this.f264617b.hashCode() * 31;
        Y41.l<Boolean, G0> lVar = this.f264618c;
        return Boolean.hashCode(this.f264621f) + com.avito.android.advert.item.delivery_suggests.l.c(r.i((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f264619d), 31, this.f264620e);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF264621f() {
        return this.f264621f;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionChip(stringId=");
        sb2.append(this.f264617b);
        sb2.append(", onChange=");
        sb2.append(this.f264618c);
        sb2.append(", isSelectedChip=");
        sb2.append(this.f264619d);
        sb2.append(", chipTitle=");
        sb2.append((Object) this.f264620e);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f264621f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f264617b);
        parcel.writeSerializable((Serializable) this.f264618c);
        parcel.writeInt(this.f264619d ? 1 : 0);
        TextUtils.writeToParcel(this.f264620e, parcel, i12);
        parcel.writeInt(this.f264621f ? 1 : 0);
    }

    public /* synthetic */ SectionChip(String str, Y41.l lVar, boolean z12, String str2, boolean z13, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : lVar, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? "" : str2, (i12 & 16) != 0 ? true : z13);
    }
}
