package com.avito.android.passport.profile_add.create_flow.select_specific;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectSpecificArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/SelectSpecificArguments;", "Landroid/os/Parcelable;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SelectSpecificArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectSpecificArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f211615b;

    /* renamed from: c, reason: collision with root package name */
    public final int f211616c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f211617d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<SpecificVo> f211618e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ProfileCreateExtendedFlow f211619f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f211620g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f211621h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f211622i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f211623j;

    /* compiled from: SelectSpecificArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectSpecificArguments> {
        @Override // android.os.Parcelable.Creator
        public final SelectSpecificArguments createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(SpecificVo.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SelectSpecificArguments(string, i12, string2, arrayList, (ProfileCreateExtendedFlow) parcel.readParcelable(SelectSpecificArguments.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectSpecificArguments[] newArray(int i12) {
            return new SelectSpecificArguments[i12];
        }
    }

    public SelectSpecificArguments(@k String str, int i12, @k String str2, @k List<SpecificVo> list, @k ProfileCreateExtendedFlow profileCreateExtendedFlow, @l String str3, boolean z12, @l String str4, boolean z13) {
        this.f211615b = str;
        this.f211616c = i12;
        this.f211617d = str2;
        this.f211618e = list;
        this.f211619f = profileCreateExtendedFlow;
        this.f211620g = str3;
        this.f211621h = z12;
        this.f211622i = str4;
        this.f211623j = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectSpecificArguments)) {
            return false;
        }
        SelectSpecificArguments selectSpecificArguments = (SelectSpecificArguments) obj;
        return L.f(this.f211615b, selectSpecificArguments.f211615b) && this.f211616c == selectSpecificArguments.f211616c && L.f(this.f211617d, selectSpecificArguments.f211617d) && L.f(this.f211618e, selectSpecificArguments.f211618e) && L.f(this.f211619f, selectSpecificArguments.f211619f) && L.f(this.f211620g, selectSpecificArguments.f211620g) && this.f211621h == selectSpecificArguments.f211621h && L.f(this.f211622i, selectSpecificArguments.f211622i) && this.f211623j == selectSpecificArguments.f211623j;
    }

    public final int hashCode() {
        int iHashCode = (this.f211619f.hashCode() + H.e(H.d(r.e(this.f211616c, this.f211615b.hashCode() * 31, 31), 31, this.f211617d), 31, this.f211618e)) * 31;
        String str = this.f211620g;
        int i12 = r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f211621h);
        String str2 = this.f211622i;
        return Boolean.hashCode(this.f211623j) + ((i12 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectSpecificArguments(constructorRequestId=");
        sb2.append(this.f211615b);
        sb2.append(", verticalId=");
        sb2.append(this.f211616c);
        sb2.append(", verticalTitle=");
        sb2.append(this.f211617d);
        sb2.append(", specifics=");
        sb2.append(this.f211618e);
        sb2.append(", flow=");
        sb2.append(this.f211619f);
        sb2.append(", source=");
        sb2.append(this.f211620g);
        sb2.append(", alreadyHasExtendedProfile=");
        sb2.append(this.f211621h);
        sb2.append(", userHash=");
        sb2.append(this.f211622i);
        sb2.append(", onlySelectVerticalAndSpecific=");
        return r.x(sb2, this.f211623j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f211615b);
        parcel.writeInt(this.f211616c);
        parcel.writeString(this.f211617d);
        Iterator itJ = C0.j(this.f211618e, parcel);
        while (itJ.hasNext()) {
            ((SpecificVo) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f211619f, i12);
        parcel.writeString(this.f211620g);
        parcel.writeInt(this.f211621h ? 1 : 0);
        parcel.writeString(this.f211622i);
        parcel.writeInt(this.f211623j ? 1 : 0);
    }

    public /* synthetic */ SelectSpecificArguments(String str, int i12, String str2, List list, ProfileCreateExtendedFlow profileCreateExtendedFlow, String str3, boolean z12, String str4, boolean z13, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 4) != 0 ? "" : str2, list, profileCreateExtendedFlow, str3, z12, str4, (i13 & 256) != 0 ? false : z13);
    }
}
