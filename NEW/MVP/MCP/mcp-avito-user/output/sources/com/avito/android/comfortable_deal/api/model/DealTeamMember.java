package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/DealTeamMember;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/Image;", "image", "name", "Lcom/avito/android/comfortable_deal/api/model/TeamMemberPhone;", "phone", "mail", "Lcom/avito/android/comfortable_deal/api/model/TeamRole;", "role", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/comfortable_deal/api/model/TeamMemberPhone;Ljava/lang/String;Lcom/avito/android/comfortable_deal/api/model/TeamRole;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getName", "Lcom/avito/android/comfortable_deal/api/model/TeamMemberPhone;", "c", "()Lcom/avito/android/comfortable_deal/api/model/TeamMemberPhone;", "getMail", "Lcom/avito/android/comfortable_deal/api/model/TeamRole;", "d", "()Lcom/avito/android/comfortable_deal/api/model/TeamRole;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DealTeamMember implements Parcelable {

    @k
    public static final Parcelable.Creator<DealTeamMember> CREATOR = new a();

    @c("id")
    @k
    private final String id;

    @c("avatar")
    @l
    private final Image image;

    @c("mail")
    @l
    private final String mail;

    @c("name")
    @k
    private final String name;

    @c("phone")
    @k
    private final TeamMemberPhone phone;

    @c("role")
    @k
    private final TeamRole role;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DealTeamMember> {
        @Override // android.os.Parcelable.Creator
        public final DealTeamMember createFromParcel(Parcel parcel) {
            return new DealTeamMember(parcel.readString(), (Image) parcel.readParcelable(DealTeamMember.class.getClassLoader()), parcel.readString(), TeamMemberPhone.CREATOR.createFromParcel(parcel), parcel.readString(), TeamRole.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DealTeamMember[] newArray(int i12) {
            return new DealTeamMember[i12];
        }
    }

    public DealTeamMember(@k String str, @l Image image, @k String str2, @k TeamMemberPhone teamMemberPhone, @l String str3, @k TeamRole teamRole) {
        this.id = str;
        this.image = image;
        this.name = str2;
        this.phone = teamMemberPhone;
        this.mail = str3;
        this.role = teamRole;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final TeamMemberPhone getPhone() {
        return this.phone;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final TeamRole getRole() {
        return this.role;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DealTeamMember)) {
            return false;
        }
        DealTeamMember dealTeamMember = (DealTeamMember) obj;
        return L.f(this.id, dealTeamMember.id) && L.f(this.image, dealTeamMember.image) && L.f(this.name, dealTeamMember.name) && L.f(this.phone, dealTeamMember.phone) && L.f(this.mail, dealTeamMember.mail) && this.role == dealTeamMember.role;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Image image = this.image;
        int iHashCode2 = (this.phone.hashCode() + H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.name)) * 31;
        String str = this.mail;
        return this.role.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "DealTeamMember(id=" + this.id + ", image=" + this.image + ", name=" + this.name + ", phone=" + this.phone + ", mail=" + this.mail + ", role=" + this.role + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.image, i12);
        parcel.writeString(this.name);
        this.phone.writeToParcel(parcel, i12);
        parcel.writeString(this.mail);
        this.role.writeToParcel(parcel, i12);
    }
}
