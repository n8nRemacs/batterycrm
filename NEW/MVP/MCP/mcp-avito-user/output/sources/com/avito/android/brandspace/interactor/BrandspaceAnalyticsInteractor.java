package com.avito.android.brandspace.interactor;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BrandspaceAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brandspace/interactor/BrandspaceAnalyticsInteractor;", "", "State", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BrandspaceAnalyticsInteractor {

    /* compiled from: BrandspaceAnalyticsInteractor.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/interactor/BrandspaceAnalyticsInteractor$State;", "Landroid/os/Parcelable;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {

        @k
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f107735b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f107736c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f107737d;

        /* compiled from: BrandspaceAnalyticsInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i12) {
                return new State[i12];
            }
        }

        public State(long j12, boolean z12, boolean z13) {
            this.f107735b = j12;
            this.f107736c = z12;
            this.f107737d = z13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.f107735b == state.f107735b && this.f107736c == state.f107736c && this.f107737d == state.f107737d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f107737d) + r.i(Long.hashCode(this.f107735b) * 31, 31, this.f107736c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(durationToTrackVisit=");
            sb2.append(this.f107735b);
            sb2.append(", isLoadTracked=");
            sb2.append(this.f107736c);
            sb2.append(", isVisitTracked=");
            return r.x(sb2, this.f107737d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f107735b);
            parcel.writeInt(this.f107736c ? 1 : 0);
            parcel.writeInt(this.f107737d ? 1 : 0);
        }
    }

    @k
    State H();

    void a();

    void b(@k List<? extends BeduinAction> list);

    void c(@k State state);

    void d();

    void e(long j12, @k List<? extends BeduinAction> list);
}
