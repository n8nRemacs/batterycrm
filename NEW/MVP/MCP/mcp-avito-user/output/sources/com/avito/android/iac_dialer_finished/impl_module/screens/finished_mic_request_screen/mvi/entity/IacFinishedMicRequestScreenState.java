package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import aL.C19787a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_mic_request_screen.IacFinishedMicRequestScreenArgument;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacFinishedMicRequestScreenState.kt */
@P
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "getArgument", "()Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "argument", "Companion", "a", "Granted", "Initial", "Requesting", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState$Granted;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState$Initial;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState$Requesting;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacFinishedMicRequestScreenState extends q implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final C19787a<IacFinishedMicRequestScreenState> toStringDelegate = new C19787a<>(IacFinishedMicRequestScreenState.class);

    /* compiled from: IacFinishedMicRequestScreenState.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState$Granted;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState;", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "argument", "<init>", "(Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "copy", "(Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;)Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState$Granted;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "getArgument", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Granted extends IacFinishedMicRequestScreenState {
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<Granted> CREATOR = new a();

        @k
        private final IacFinishedMicRequestScreenArgument argument;

        /* compiled from: IacFinishedMicRequestScreenState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Granted> {
            @Override // android.os.Parcelable.Creator
            public final Granted createFromParcel(Parcel parcel) {
                return new Granted((IacFinishedMicRequestScreenArgument) parcel.readParcelable(Granted.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Granted[] newArray(int i12) {
                return new Granted[i12];
            }
        }

        public Granted(@k IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument) {
            super(null);
            this.argument = iacFinishedMicRequestScreenArgument;
        }

        public static /* synthetic */ Granted copy$default(Granted granted, IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacFinishedMicRequestScreenArgument = granted.argument;
            }
            return granted.copy(iacFinishedMicRequestScreenArgument);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final IacFinishedMicRequestScreenArgument getArgument() {
            return this.argument;
        }

        @k
        public final Granted copy(@k IacFinishedMicRequestScreenArgument argument) {
            return new Granted(argument);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Granted) && L.f(this.argument, ((Granted) other).argument);
        }

        @Override // com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenState
        @k
        public IacFinishedMicRequestScreenArgument getArgument() {
            return this.argument;
        }

        public int hashCode() {
            return this.argument.hashCode();
        }

        @k
        public String toString() {
            IacFinishedMicRequestScreenState.INSTANCE.getClass();
            return IacFinishedMicRequestScreenState.toStringDelegate.a(new String[]{"argument=" + getArgument()}, this);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.argument, flags);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenState.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState$Initial;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState;", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "argument", "<init>", "(Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "copy", "(Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;)Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState$Initial;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "getArgument", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Initial extends IacFinishedMicRequestScreenState {
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        @k
        private final IacFinishedMicRequestScreenArgument argument;

        /* compiled from: IacFinishedMicRequestScreenState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Initial> {
            @Override // android.os.Parcelable.Creator
            public final Initial createFromParcel(Parcel parcel) {
                return new Initial((IacFinishedMicRequestScreenArgument) parcel.readParcelable(Initial.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Initial[] newArray(int i12) {
                return new Initial[i12];
            }
        }

        public Initial(@k IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument) {
            super(null);
            this.argument = iacFinishedMicRequestScreenArgument;
        }

        public static /* synthetic */ Initial copy$default(Initial initial, IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacFinishedMicRequestScreenArgument = initial.argument;
            }
            return initial.copy(iacFinishedMicRequestScreenArgument);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final IacFinishedMicRequestScreenArgument getArgument() {
            return this.argument;
        }

        @k
        public final Initial copy(@k IacFinishedMicRequestScreenArgument argument) {
            return new Initial(argument);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && L.f(this.argument, ((Initial) other).argument);
        }

        @Override // com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenState
        @k
        public IacFinishedMicRequestScreenArgument getArgument() {
            return this.argument;
        }

        public int hashCode() {
            return this.argument.hashCode();
        }

        @k
        public String toString() {
            IacFinishedMicRequestScreenState.INSTANCE.getClass();
            return IacFinishedMicRequestScreenState.toStringDelegate.a(new String[]{"argument=" + getArgument()}, this);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.argument, flags);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenState.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0010¨\u0006&"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState$Requesting;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState;", "", "canAskMic", "needCheckUpdatesAfterSettings", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "argument", "<init>", "(ZZLcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Z", "component2", "component3", "()Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "copy", "(ZZLcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;)Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState$Requesting;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getCanAskMic", "getNeedCheckUpdatesAfterSettings", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "getArgument", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Requesting extends IacFinishedMicRequestScreenState {
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<Requesting> CREATOR = new a();

        @k
        private final IacFinishedMicRequestScreenArgument argument;
        private final boolean canAskMic;
        private final boolean needCheckUpdatesAfterSettings;

        /* compiled from: IacFinishedMicRequestScreenState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Requesting> {
            @Override // android.os.Parcelable.Creator
            public final Requesting createFromParcel(Parcel parcel) {
                return new Requesting(parcel.readInt() != 0, parcel.readInt() != 0, (IacFinishedMicRequestScreenArgument) parcel.readParcelable(Requesting.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Requesting[] newArray(int i12) {
                return new Requesting[i12];
            }
        }

        public Requesting(boolean z12, boolean z13, @k IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument) {
            super(null);
            this.canAskMic = z12;
            this.needCheckUpdatesAfterSettings = z13;
            this.argument = iacFinishedMicRequestScreenArgument;
        }

        public static /* synthetic */ Requesting copy$default(Requesting requesting, boolean z12, boolean z13, IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = requesting.canAskMic;
            }
            if ((i12 & 2) != 0) {
                z13 = requesting.needCheckUpdatesAfterSettings;
            }
            if ((i12 & 4) != 0) {
                iacFinishedMicRequestScreenArgument = requesting.argument;
            }
            return requesting.copy(z12, z13, iacFinishedMicRequestScreenArgument);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getCanAskMic() {
            return this.canAskMic;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getNeedCheckUpdatesAfterSettings() {
            return this.needCheckUpdatesAfterSettings;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final IacFinishedMicRequestScreenArgument getArgument() {
            return this.argument;
        }

        @k
        public final Requesting copy(boolean canAskMic, boolean needCheckUpdatesAfterSettings, @k IacFinishedMicRequestScreenArgument argument) {
            return new Requesting(canAskMic, needCheckUpdatesAfterSettings, argument);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Requesting)) {
                return false;
            }
            Requesting requesting = (Requesting) other;
            return this.canAskMic == requesting.canAskMic && this.needCheckUpdatesAfterSettings == requesting.needCheckUpdatesAfterSettings && L.f(this.argument, requesting.argument);
        }

        @Override // com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenState
        @k
        public IacFinishedMicRequestScreenArgument getArgument() {
            return this.argument;
        }

        public final boolean getCanAskMic() {
            return this.canAskMic;
        }

        public final boolean getNeedCheckUpdatesAfterSettings() {
            return this.needCheckUpdatesAfterSettings;
        }

        public int hashCode() {
            return this.argument.hashCode() + r.i(Boolean.hashCode(this.canAskMic) * 31, 31, this.needCheckUpdatesAfterSettings);
        }

        @k
        public String toString() {
            IacFinishedMicRequestScreenState.INSTANCE.getClass();
            return IacFinishedMicRequestScreenState.toStringDelegate.a(new String[]{"canAskMic=" + this.canAskMic, "needCheckUpdatesAfterSettings=" + this.needCheckUpdatesAfterSettings, "argument=" + getArgument()}, this);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.canAskMic ? 1 : 0);
            parcel.writeInt(this.needCheckUpdatesAfterSettings ? 1 : 0);
            parcel.writeParcelable(this.argument, flags);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState$a;", "", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenState$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ IacFinishedMicRequestScreenState(C42822w c42822w) {
        this();
    }

    @k
    public abstract IacFinishedMicRequestScreenArgument getArgument();

    private IacFinishedMicRequestScreenState() {
    }
}
