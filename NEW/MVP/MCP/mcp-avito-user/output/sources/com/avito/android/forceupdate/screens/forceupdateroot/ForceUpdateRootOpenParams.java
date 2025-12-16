package com.avito.android.forceupdate.screens.forceupdateroot;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.forceupdate.domain.dto.UpdateSource;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ForceUpdateRootOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootOpenParams;", "Lcom/avito/android/util/OpenParams;", "()V", "DeviceNotSupported", "UpdateProposal", "UpdateRequired", "Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootOpenParams$DeviceNotSupported;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootOpenParams$UpdateProposal;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootOpenParams$UpdateRequired;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ForceUpdateRootOpenParams implements OpenParams {

    /* compiled from: ForceUpdateRootOpenParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootOpenParams$DeviceNotSupported;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootOpenParams;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DeviceNotSupported extends ForceUpdateRootOpenParams {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DeviceNotSupported f158555b = new DeviceNotSupported();

        @k
        public static final Parcelable.Creator<DeviceNotSupported> CREATOR = new a();

        /* compiled from: ForceUpdateRootOpenParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DeviceNotSupported> {
            @Override // android.os.Parcelable.Creator
            public final DeviceNotSupported createFromParcel(Parcel parcel) {
                parcel.readInt();
                return DeviceNotSupported.f158555b;
            }

            @Override // android.os.Parcelable.Creator
            public final DeviceNotSupported[] newArray(int i12) {
                return new DeviceNotSupported[i12];
            }
        }

        public DeviceNotSupported() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ForceUpdateRootOpenParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootOpenParams$UpdateProposal;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootOpenParams;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateProposal extends ForceUpdateRootOpenParams {

        @k
        public static final Parcelable.Creator<UpdateProposal> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UpdateSource f158556b;

        /* compiled from: ForceUpdateRootOpenParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UpdateProposal> {
            @Override // android.os.Parcelable.Creator
            public final UpdateProposal createFromParcel(Parcel parcel) {
                return new UpdateProposal((UpdateSource) parcel.readParcelable(UpdateProposal.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final UpdateProposal[] newArray(int i12) {
                return new UpdateProposal[i12];
            }
        }

        public UpdateProposal(@k UpdateSource updateSource) {
            super(null);
            this.f158556b = updateSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateProposal) && L.f(this.f158556b, ((UpdateProposal) obj).f158556b);
        }

        public final int hashCode() {
            return this.f158556b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateProposal(updateSource=" + this.f158556b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f158556b, i12);
        }
    }

    /* compiled from: ForceUpdateRootOpenParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootOpenParams$UpdateRequired;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/ForceUpdateRootOpenParams;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateRequired extends ForceUpdateRootOpenParams {

        @k
        public static final Parcelable.Creator<UpdateRequired> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UpdateSource f158557b;

        /* compiled from: ForceUpdateRootOpenParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UpdateRequired> {
            @Override // android.os.Parcelable.Creator
            public final UpdateRequired createFromParcel(Parcel parcel) {
                return new UpdateRequired((UpdateSource) parcel.readParcelable(UpdateRequired.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final UpdateRequired[] newArray(int i12) {
                return new UpdateRequired[i12];
            }
        }

        public UpdateRequired(@k UpdateSource updateSource) {
            super(null);
            this.f158557b = updateSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateRequired) && L.f(this.f158557b, ((UpdateRequired) obj).f158557b);
        }

        public final int hashCode() {
            return this.f158557b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateRequired(updateSource=" + this.f158557b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f158557b, i12);
        }
    }

    public /* synthetic */ ForceUpdateRootOpenParams(C42822w c42822w) {
        this();
    }

    public ForceUpdateRootOpenParams() {
    }
}
