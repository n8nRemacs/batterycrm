package com.avito.android.player;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExoPlayerController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/player/ExoPlayerController;", "", "a", "State", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ExoPlayerController {

    /* compiled from: ExoPlayerController.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/ExoPlayerController$State;", "Landroid/os/Parcelable;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {

        @k
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f220025b;

        /* renamed from: c, reason: collision with root package name */
        public final int f220026c;

        /* renamed from: d, reason: collision with root package name */
        public final long f220027d;

        /* compiled from: ExoPlayerController.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel.readInt(), parcel.readLong(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i12) {
                return new State[i12];
            }
        }

        public State() {
            this(false, 0, 0L, 7, null);
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
            return this.f220025b == state.f220025b && this.f220026c == state.f220026c && this.f220027d == state.f220027d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f220027d) + r.e(this.f220026c, Boolean.hashCode(this.f220025b) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(playWhenReady=");
            sb2.append(this.f220025b);
            sb2.append(", currentWindow=");
            sb2.append(this.f220026c);
            sb2.append(", playbackPosition=");
            return r.u(sb2, this.f220027d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f220025b ? 1 : 0);
            parcel.writeInt(this.f220026c);
            parcel.writeLong(this.f220027d);
        }

        public State(int i12, long j12, boolean z12) {
            this.f220025b = z12;
            this.f220026c = i12;
            this.f220027d = j12;
        }

        public /* synthetic */ State(boolean z12, int i12, long j12, int i13, C42822w c42822w) {
            this((i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? 0L : j12, (i13 & 1) != 0 ? true : z12);
        }
    }

    /* compiled from: ExoPlayerController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/ExoPlayerController$a;", "Lcom/google/android/exoplayer2/d0$g;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends d0.g {
        void UB(float f12);
    }

    @l
    State H();

    @l
    InterfaceC36534o a(@k String str);

    void b();

    void c(@k Y41.l<? super InterfaceC36534o, ? extends a> lVar);

    void d();

    void e();
}
