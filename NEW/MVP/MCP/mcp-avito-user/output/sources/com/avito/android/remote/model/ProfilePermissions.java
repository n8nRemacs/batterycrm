package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ProfilePermissions.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0007\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\b\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/ProfilePermissions;", "Landroid/os/Parcelable;", "", "allowMultipleNames", "allowMultipleEmails", "allowHidePhone", "allowHideStats", "isHiddenStats", "isPRO", "<init>", "(ZZZZZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getAllowMultipleNames", "()Z", "getAllowMultipleEmails", "getAllowHidePhone", "getAllowHideStats", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ProfilePermissions implements Parcelable {

    @k
    public static final Parcelable.Creator<ProfilePermissions> CREATOR = new Creator();

    @c("allowHidePhone")
    private final boolean allowHidePhone;

    @c("allowHideStats")
    private final boolean allowHideStats;

    @c("allowMultipleEmails")
    private final boolean allowMultipleEmails;

    @c("allowMultipleNames")
    private final boolean allowMultipleNames;

    @c("isHiddenStats")
    private final boolean isHiddenStats;

    @c("isPRO")
    private final boolean isPRO;

    /* compiled from: ProfilePermissions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProfilePermissions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ProfilePermissions createFromParcel(@k Parcel parcel) {
            return new ProfilePermissions(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ProfilePermissions[] newArray(int i12) {
            return new ProfilePermissions[i12];
        }
    }

    public ProfilePermissions(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.allowMultipleNames = z12;
        this.allowMultipleEmails = z13;
        this.allowHidePhone = z14;
        this.allowHideStats = z15;
        this.isHiddenStats = z16;
        this.isPRO = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean getAllowHidePhone() {
        return this.allowHidePhone;
    }

    public final boolean getAllowHideStats() {
        return this.allowHideStats;
    }

    public final boolean getAllowMultipleEmails() {
        return this.allowMultipleEmails;
    }

    public final boolean getAllowMultipleNames() {
        return this.allowMultipleNames;
    }

    /* renamed from: isHiddenStats, reason: from getter */
    public final boolean getIsHiddenStats() {
        return this.isHiddenStats;
    }

    /* renamed from: isPRO, reason: from getter */
    public final boolean getIsPRO() {
        return this.isPRO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.allowMultipleNames ? 1 : 0);
        parcel.writeInt(this.allowMultipleEmails ? 1 : 0);
        parcel.writeInt(this.allowHidePhone ? 1 : 0);
        parcel.writeInt(this.allowHideStats ? 1 : 0);
        parcel.writeInt(this.isHiddenStats ? 1 : 0);
        parcel.writeInt(this.isPRO ? 1 : 0);
    }
}
