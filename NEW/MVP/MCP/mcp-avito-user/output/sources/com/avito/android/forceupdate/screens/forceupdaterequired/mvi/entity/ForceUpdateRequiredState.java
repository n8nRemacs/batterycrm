package com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.forceupdate.domain.dto.UpdateSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ForceUpdateRequiredState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ForceUpdateRequiredState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UpdateSource f158516b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f158514c = new a(null);

    @k
    public static final Parcelable.Creator<ForceUpdateRequiredState> CREATOR = new b();

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final ForceUpdateRequiredState f158515d = new ForceUpdateRequiredState(UpdateSource.Official.f158466b);

    /* compiled from: ForceUpdateRequiredState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredState$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ForceUpdateRequiredState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ForceUpdateRequiredState> {
        @Override // android.os.Parcelable.Creator
        public final ForceUpdateRequiredState createFromParcel(Parcel parcel) {
            return new ForceUpdateRequiredState((UpdateSource) parcel.readParcelable(ForceUpdateRequiredState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ForceUpdateRequiredState[] newArray(int i12) {
            return new ForceUpdateRequiredState[i12];
        }
    }

    public ForceUpdateRequiredState(@k UpdateSource updateSource) {
        this.f158516b = updateSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateRequiredState) && L.f(this.f158516b, ((ForceUpdateRequiredState) obj).f158516b);
    }

    public final int hashCode() {
        return this.f158516b.hashCode();
    }

    @k
    public final String toString() {
        return "ForceUpdateRequiredState(updateSource=" + this.f158516b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f158516b, i12);
    }
}
