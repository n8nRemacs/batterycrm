package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TeamMemberPhone.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/TeamMemberPhone;", "Landroid/os/Parcelable;", "", "number", "", "isVirtual", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "d", "()Z", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TeamMemberPhone implements Parcelable {

    @k
    public static final Parcelable.Creator<TeamMemberPhone> CREATOR = new a();

    @c("isVirtual")
    private final boolean isVirtual;

    @c("number")
    @k
    private final String number;

    /* compiled from: TeamMemberPhone.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TeamMemberPhone> {
        @Override // android.os.Parcelable.Creator
        public final TeamMemberPhone createFromParcel(Parcel parcel) {
            return new TeamMemberPhone(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TeamMemberPhone[] newArray(int i12) {
            return new TeamMemberPhone[i12];
        }
    }

    public TeamMemberPhone(@k String str, boolean z12) {
        this.number = str;
        this.isVirtual = z12;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsVirtual() {
        return this.isVirtual;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamMemberPhone)) {
            return false;
        }
        TeamMemberPhone teamMemberPhone = (TeamMemberPhone) obj;
        return L.f(this.number, teamMemberPhone.number) && this.isVirtual == teamMemberPhone.isVirtual;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isVirtual) + (this.number.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TeamMemberPhone(number=");
        sb2.append(this.number);
        sb2.append(", isVirtual=");
        return r.x(sb2, this.isVirtual, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.number);
        parcel.writeInt(this.isVirtual ? 1 : 0);
    }
}
