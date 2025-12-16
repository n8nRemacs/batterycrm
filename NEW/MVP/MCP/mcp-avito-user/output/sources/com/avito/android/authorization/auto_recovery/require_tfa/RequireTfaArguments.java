package com.avito.android.authorization.auto_recovery.require_tfa;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.TfaSource;
import kotlin.Metadata;

/* compiled from: RequireTfaFragment.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/require_tfa/RequireTfaArguments;", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RequireTfaArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<RequireTfaArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TfaSource f93296b;

    /* compiled from: RequireTfaFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RequireTfaArguments> {
        @Override // android.os.Parcelable.Creator
        public final RequireTfaArguments createFromParcel(Parcel parcel) {
            return new RequireTfaArguments(TfaSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final RequireTfaArguments[] newArray(int i12) {
            return new RequireTfaArguments[i12];
        }
    }

    public RequireTfaArguments(@k TfaSource tfaSource) {
        this.f93296b = tfaSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequireTfaArguments) && this.f93296b == ((RequireTfaArguments) obj).f93296b;
    }

    public final int hashCode() {
        return this.f93296b.hashCode();
    }

    @k
    public final String toString() {
        return "RequireTfaArguments(tfaSource=" + this.f93296b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f93296b.name());
    }
}
