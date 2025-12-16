package com.avito.android.passport.profile_add.create_flow.select_vertical;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectVerticalArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/SelectVerticalArguments;", "Landroid/os/Parcelable;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SelectVerticalArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SelectVerticalArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f211806b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ProfileCreateExtendedFlow f211807c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f211808d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f211809e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f211810f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f211811g;

    /* compiled from: SelectVerticalArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectVerticalArguments> {
        @Override // android.os.Parcelable.Creator
        public final SelectVerticalArguments createFromParcel(Parcel parcel) {
            return new SelectVerticalArguments(parcel.readString(), (ProfileCreateExtendedFlow) parcel.readParcelable(SelectVerticalArguments.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SelectVerticalArguments[] newArray(int i12) {
            return new SelectVerticalArguments[i12];
        }
    }

    public SelectVerticalArguments(@Y61.k String str, @Y61.k ProfileCreateExtendedFlow profileCreateExtendedFlow, @Y61.l String str2, boolean z12, @Y61.l Integer num, @Y61.l Integer num2) {
        this.f211806b = str;
        this.f211807c = profileCreateExtendedFlow;
        this.f211808d = str2;
        this.f211809e = z12;
        this.f211810f = num;
        this.f211811g = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectVerticalArguments)) {
            return false;
        }
        SelectVerticalArguments selectVerticalArguments = (SelectVerticalArguments) obj;
        return L.f(this.f211806b, selectVerticalArguments.f211806b) && L.f(this.f211807c, selectVerticalArguments.f211807c) && L.f(this.f211808d, selectVerticalArguments.f211808d) && this.f211809e == selectVerticalArguments.f211809e && L.f(this.f211810f, selectVerticalArguments.f211810f) && L.f(this.f211811g, selectVerticalArguments.f211811g);
    }

    public final int hashCode() {
        int iHashCode = (this.f211807c.hashCode() + (this.f211806b.hashCode() * 31)) * 31;
        String str = this.f211808d;
        int i12 = r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f211809e);
        Integer num = this.f211810f;
        int iHashCode2 = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f211811g;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectVerticalArguments(constructorRequestId=");
        sb2.append(this.f211806b);
        sb2.append(", flow=");
        sb2.append(this.f211807c);
        sb2.append(", source=");
        sb2.append(this.f211808d);
        sb2.append(", onlySelectVerticalAndSpecific=");
        sb2.append(this.f211809e);
        sb2.append(", selectedVerticalId=");
        sb2.append(this.f211810f);
        sb2.append(", selectedSpecificId=");
        return s.j(sb2, this.f211811g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f211806b);
        parcel.writeParcelable(this.f211807c, i12);
        parcel.writeString(this.f211808d);
        parcel.writeInt(this.f211809e ? 1 : 0);
        Integer num = this.f211810f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f211811g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }

    public /* synthetic */ SelectVerticalArguments(String str, ProfileCreateExtendedFlow profileCreateExtendedFlow, String str2, boolean z12, Integer num, Integer num2, int i12, C42822w c42822w) {
        this(str, profileCreateExtendedFlow, str2, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : num2);
    }
}
