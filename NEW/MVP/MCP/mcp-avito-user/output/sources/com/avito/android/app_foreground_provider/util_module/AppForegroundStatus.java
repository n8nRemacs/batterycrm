package com.avito.android.app_foreground_provider.util_module;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: AppForegroundStatusProvider.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;", "Landroid/os/Parcelable;", "", "isForeground", "wasForeground", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getWasForeground", "_avito_app-foreground-status-provider_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AppForegroundStatus implements Parcelable {

    @k
    public static final Parcelable.Creator<AppForegroundStatus> CREATOR = new a();
    private final boolean isForeground;
    private final boolean wasForeground;

    /* compiled from: AppForegroundStatusProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppForegroundStatus> {
        @Override // android.os.Parcelable.Creator
        public final AppForegroundStatus createFromParcel(Parcel parcel) {
            return new AppForegroundStatus(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AppForegroundStatus[] newArray(int i12) {
            return new AppForegroundStatus[i12];
        }
    }

    public AppForegroundStatus(boolean z12, boolean z13) {
        this.isForeground = z12;
        this.wasForeground = z13;
    }

    public static /* synthetic */ AppForegroundStatus copy$default(AppForegroundStatus appForegroundStatus, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = appForegroundStatus.isForeground;
        }
        if ((i12 & 2) != 0) {
            z13 = appForegroundStatus.wasForeground;
        }
        return appForegroundStatus.copy(z12, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsForeground() {
        return this.isForeground;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getWasForeground() {
        return this.wasForeground;
    }

    @k
    public final AppForegroundStatus copy(boolean isForeground, boolean wasForeground) {
        return new AppForegroundStatus(isForeground, wasForeground);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppForegroundStatus)) {
            return false;
        }
        AppForegroundStatus appForegroundStatus = (AppForegroundStatus) other;
        return this.isForeground == appForegroundStatus.isForeground && this.wasForeground == appForegroundStatus.wasForeground;
    }

    public final boolean getWasForeground() {
        return this.wasForeground;
    }

    public int hashCode() {
        return Boolean.hashCode(this.wasForeground) + (Boolean.hashCode(this.isForeground) * 31);
    }

    public final boolean isForeground() {
        return this.isForeground;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppForegroundStatus(isForeground=");
        sb2.append(this.isForeground);
        sb2.append(", wasForeground=");
        return r.x(sb2, this.wasForeground, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.isForeground ? 1 : 0);
        parcel.writeInt(this.wasForeground ? 1 : 0);
    }
}
