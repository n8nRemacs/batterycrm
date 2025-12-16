package com.vk.id;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import androidx.media3.common.C23088b;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VKIDUser.kt */
@d
@H0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lcom/vk/id/VKIDUser;", "Landroid/os/Parcelable;", "", "firstName", "lastName", "phone", "photo50", "photo100", "photo200", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ljava/lang/String;", "getFirstName", "getLastName", "getPhone", "getPhoto50", "getPhoto100", "getPhoto200", "getEmail", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDUser implements Parcelable {

    @k
    public static final Parcelable.Creator<VKIDUser> CREATOR = new Creator();

    @l
    private final String email;

    @k
    private final String firstName;

    @k
    private final String lastName;

    @l
    private final String phone;

    @l
    private final String photo100;

    @l
    private final String photo200;

    @l
    private final String photo50;

    /* compiled from: VKIDUser.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VKIDUser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VKIDUser createFromParcel(Parcel parcel) {
            return new VKIDUser(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VKIDUser[] newArray(int i12) {
            return new VKIDUser[i12];
        }
    }

    public VKIDUser(@k String str, @k String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7) {
        this.firstName = str;
        this.lastName = str2;
        this.phone = str3;
        this.photo50 = str4;
        this.photo100 = str5;
        this.photo200 = str6;
        this.email = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!VKIDUser.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        VKIDUser vKIDUser = (VKIDUser) other;
        return L.f(this.firstName, vKIDUser.firstName) && L.f(this.lastName, vKIDUser.lastName) && L.f(this.phone, vKIDUser.phone) && L.f(this.photo50, vKIDUser.photo50) && L.f(this.photo100, vKIDUser.photo100) && L.f(this.photo200, vKIDUser.photo200) && L.f(this.email, vKIDUser.email);
    }

    @l
    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        int iD2 = H.d(this.firstName.hashCode() * 31, 31, this.lastName);
        String str = this.phone;
        int iHashCode = (iD2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.photo50;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.photo100;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.photo200;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.email;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.phone;
        String str4 = this.photo50;
        String str5 = this.photo100;
        String str6 = this.photo200;
        String str7 = this.email;
        StringBuilder sbB = C23088b.b("VKIDUser(firstName='", str, "', lastName='", str2, "', phone=");
        m.p(sbB, str3, ", photo50=", str4, ", photo100=");
        m.p(sbB, str5, ", photo200=", str6, ", email=");
        return c.s(sbB, str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int flags) {
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.phone);
        dest.writeString(this.photo50);
        dest.writeString(this.photo100);
        dest.writeString(this.photo200);
        dest.writeString(this.email);
    }

    public /* synthetic */ VKIDUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7);
    }
}
