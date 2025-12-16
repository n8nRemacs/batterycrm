package com.avito.android.iac_incoming_call_ability.public_module.iac_enable;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacOptionsData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/iac_enable/ScheduleOption;", "Landroid/os/Parcelable;", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ScheduleOption implements Parcelable {

    @k
    public static final Parcelable.Creator<ScheduleOption> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f168409b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f168410c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f168411d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f168412e;

    /* compiled from: IacOptionsData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ScheduleOption> {
        @Override // android.os.Parcelable.Creator
        public final ScheduleOption createFromParcel(Parcel parcel) {
            return new ScheduleOption(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduleOption[] newArray(int i12) {
            return new ScheduleOption[i12];
        }
    }

    public ScheduleOption(@k String str, @k String str2, @l String str3, boolean z12) {
        this.f168409b = str;
        this.f168410c = str2;
        this.f168411d = str3;
        this.f168412e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleOption)) {
            return false;
        }
        ScheduleOption scheduleOption = (ScheduleOption) obj;
        return L.f(this.f168409b, scheduleOption.f168409b) && L.f(this.f168410c, scheduleOption.f168410c) && L.f(this.f168411d, scheduleOption.f168411d) && this.f168412e == scheduleOption.f168412e;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f168409b.hashCode() * 31, 31, this.f168410c);
        String str = this.f168411d;
        return Boolean.hashCode(this.f168412e) + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScheduleOption(id=");
        sb2.append(this.f168409b);
        sb2.append(", title=");
        sb2.append(this.f168410c);
        sb2.append(", description=");
        sb2.append(this.f168411d);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f168412e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f168409b);
        parcel.writeString(this.f168410c);
        parcel.writeString(this.f168411d);
        parcel.writeInt(this.f168412e ? 1 : 0);
    }

    public /* synthetic */ ScheduleOption(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? false : z12);
    }
}
