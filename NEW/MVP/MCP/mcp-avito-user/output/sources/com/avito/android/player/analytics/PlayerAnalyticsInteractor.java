package com.avito.android.player.analytics;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PlayerAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/analytics/PlayerAnalyticsInteractor;", "", "State", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface PlayerAnalyticsInteractor {

    /* compiled from: PlayerAnalyticsInteractor.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/analytics/PlayerAnalyticsInteractor$State;", "Landroid/os/Parcelable;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {

        @k
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public boolean f220037b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f220038c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f220039d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f220040e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f220041f;

        /* compiled from: PlayerAnalyticsInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i12) {
                return new State[i12];
            }
        }

        public State() {
            this(false, false, false, false, false, 31, null);
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
            return this.f220037b == state.f220037b && this.f220038c == state.f220038c && this.f220039d == state.f220039d && this.f220040e == state.f220040e && this.f220041f == state.f220041f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f220041f) + r.i(r.i(r.i(Boolean.hashCode(this.f220037b) * 31, 31, this.f220038c), 31, this.f220039d), 31, this.f220040e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(isMediaStartTracked=");
            sb2.append(this.f220037b);
            sb2.append(", isMediaFirstQuartileTracked=");
            sb2.append(this.f220038c);
            sb2.append(", isMediaMidpointTracked=");
            sb2.append(this.f220039d);
            sb2.append(", isMediaThirdQuartileTracked=");
            sb2.append(this.f220040e);
            sb2.append(", isMediaCompleteTracked=");
            return r.x(sb2, this.f220041f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f220037b ? 1 : 0);
            parcel.writeInt(this.f220038c ? 1 : 0);
            parcel.writeInt(this.f220039d ? 1 : 0);
            parcel.writeInt(this.f220040e ? 1 : 0);
            parcel.writeInt(this.f220041f ? 1 : 0);
        }

        public State(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
            this.f220037b = z12;
            this.f220038c = z13;
            this.f220039d = z14;
            this.f220040e = z15;
            this.f220041f = z16;
        }

        public /* synthetic */ State(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? false : z15, (i12 & 16) != 0 ? false : z16);
        }
    }

    @k
    State H();

    void a();

    void b(@l Double d12, @l Double d13, @k VideoStopReason videoStopReason);

    void c();

    void d();

    void e(@l Double d12, @l Double d13);

    void f();

    void g(boolean z12);

    void h(float f12);

    void i();

    void j();

    void k(@l Double d12, @l Double d13);

    void l();
}
