package com.avito.android.iac_dialer.impl_module.screens.call_screen;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacCallScreenArgument.kt */
@P
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument;", "Landroid/os/Parcelable;", "()V", "Answer", "EmptyArgument", "OpenAudioDeviceSettings", "WithoutAction", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$EmptyArgument;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$OpenAudioDeviceSettings;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacCallScreenArgument implements Parcelable {
    public static final int $stable = 0;

    /* compiled from: IacCallScreenArgument.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "<init>", "(Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From;)Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From;", "getFrom", "From", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Answer extends IacCallScreenArgument {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<Answer> CREATOR = new a();

        @k
        private final From from;

        /* compiled from: IacCallScreenArgument.kt */
        @P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From;", "Landroid/os/Parcelable;", "CallNotification", "ReserveNotification", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From$CallNotification;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From$ReserveNotification;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static abstract class From implements Parcelable {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f166218b;

            /* compiled from: IacCallScreenArgument.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From$CallNotification;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class CallNotification extends From {

                /* renamed from: c, reason: collision with root package name */
                @k
                public static final CallNotification f166219c = new CallNotification();

                @k
                public static final Parcelable.Creator<CallNotification> CREATOR = new a();

                /* compiled from: IacCallScreenArgument.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<CallNotification> {
                    @Override // android.os.Parcelable.Creator
                    public final CallNotification createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return CallNotification.f166219c;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final CallNotification[] newArray(int i12) {
                        return new CallNotification[i12];
                    }
                }

                public CallNotification() {
                    super("CallNotification", null);
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

            /* compiled from: IacCallScreenArgument.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From$ReserveNotification;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$Answer$From;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ReserveNotification extends From {

                /* renamed from: c, reason: collision with root package name */
                @k
                public static final ReserveNotification f166220c = new ReserveNotification();

                @k
                public static final Parcelable.Creator<ReserveNotification> CREATOR = new a();

                /* compiled from: IacCallScreenArgument.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ReserveNotification> {
                    @Override // android.os.Parcelable.Creator
                    public final ReserveNotification createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return ReserveNotification.f166220c;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ReserveNotification[] newArray(int i12) {
                        return new ReserveNotification[i12];
                    }
                }

                public ReserveNotification() {
                    super("ReserveNotification", null);
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

            public From(String str, C42822w c42822w) {
                this.f166218b = str;
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("From("), this.f166218b, ')');
            }
        }

        /* compiled from: IacCallScreenArgument.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Answer> {
            @Override // android.os.Parcelable.Creator
            public final Answer createFromParcel(Parcel parcel) {
                return new Answer((From) parcel.readParcelable(Answer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Answer[] newArray(int i12) {
                return new Answer[i12];
            }
        }

        public Answer(@k From from) {
            super(null);
            this.from = from;
        }

        public static /* synthetic */ Answer copy$default(Answer answer, From from, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                from = answer.from;
            }
            return answer.copy(from);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final From getFrom() {
            return this.from;
        }

        @k
        public final Answer copy(@k From from) {
            return new Answer(from);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Answer) && L.f(this.from, ((Answer) other).from);
        }

        @k
        public final From getFrom() {
            return this.from;
        }

        public int hashCode() {
            return this.from.hashCode();
        }

        @k
        public String toString() {
            return "IacCallScreenArgument.Answer(from=" + this.from + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.from, flags);
        }
    }

    /* compiled from: IacCallScreenArgument.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$EmptyArgument;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class EmptyArgument extends IacCallScreenArgument {
        public static final int $stable = 0;

        @k
        public static final EmptyArgument INSTANCE = new EmptyArgument();

        @k
        public static final Parcelable.Creator<EmptyArgument> CREATOR = new a();

        /* compiled from: IacCallScreenArgument.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EmptyArgument> {
            @Override // android.os.Parcelable.Creator
            public final EmptyArgument createFromParcel(Parcel parcel) {
                parcel.readInt();
                return EmptyArgument.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final EmptyArgument[] newArray(int i12) {
                return new EmptyArgument[i12];
            }
        }

        private EmptyArgument() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public String toString() {
            return "IacCallScreenArgument.EmptyArgument";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: IacCallScreenArgument.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$OpenAudioDeviceSettings;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class OpenAudioDeviceSettings extends IacCallScreenArgument {
        public static final int $stable = 0;

        @k
        public static final OpenAudioDeviceSettings INSTANCE = new OpenAudioDeviceSettings();

        @k
        public static final Parcelable.Creator<OpenAudioDeviceSettings> CREATOR = new a();

        /* compiled from: IacCallScreenArgument.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenAudioDeviceSettings> {
            @Override // android.os.Parcelable.Creator
            public final OpenAudioDeviceSettings createFromParcel(Parcel parcel) {
                parcel.readInt();
                return OpenAudioDeviceSettings.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final OpenAudioDeviceSettings[] newArray(int i12) {
                return new OpenAudioDeviceSettings[i12];
            }
        }

        private OpenAudioDeviceSettings() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public String toString() {
            return "IacCallScreenArgument.OpenAudioDeviceSettings";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: IacCallScreenArgument.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "<init>", "(Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From;)Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From;", "getFrom", "From", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class WithoutAction extends IacCallScreenArgument {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<WithoutAction> CREATOR = new a();

        @k
        private final From from;

        /* compiled from: IacCallScreenArgument.kt */
        @P
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From;", "Landroid/os/Parcelable;", "CallNotification", "Other", "ReserveNotification", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From$CallNotification;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From$Other;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From$ReserveNotification;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static abstract class From implements Parcelable {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f166221b;

            /* compiled from: IacCallScreenArgument.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From$CallNotification;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class CallNotification extends From {

                @k
                public static final Parcelable.Creator<CallNotification> CREATOR = new a();

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f166222c;

                /* compiled from: IacCallScreenArgument.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<CallNotification> {
                    @Override // android.os.Parcelable.Creator
                    public final CallNotification createFromParcel(Parcel parcel) {
                        return new CallNotification(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final CallNotification[] newArray(int i12) {
                        return new CallNotification[i12];
                    }
                }

                public CallNotification(@k String str) {
                    super("CallNotification_".concat(str), null);
                    this.f166222c = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.f166222c);
                }
            }

            /* compiled from: IacCallScreenArgument.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From$Other;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Other extends From {

                @k
                public static final Parcelable.Creator<Other> CREATOR = new a();

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f166223c;

                /* compiled from: IacCallScreenArgument.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Other> {
                    @Override // android.os.Parcelable.Creator
                    public final Other createFromParcel(Parcel parcel) {
                        return new Other(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Other[] newArray(int i12) {
                        return new Other[i12];
                    }
                }

                public Other(@k String str) {
                    super(str, null);
                    this.f166223c = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Other) && L.f(this.f166223c, ((Other) obj).f166223c);
                }

                @Override // com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument.WithoutAction.From
                @k
                /* renamed from: getName, reason: from getter */
                public final String getF166221b() {
                    return this.f166223c;
                }

                public final int hashCode() {
                    return this.f166223c.hashCode();
                }

                @Override // com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument.WithoutAction.From
                @k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Other(name="), this.f166223c, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.f166223c);
                }
            }

            /* compiled from: IacCallScreenArgument.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From$ReserveNotification;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction$From;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ReserveNotification extends From {

                @k
                public static final Parcelable.Creator<ReserveNotification> CREATOR = new a();

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f166224c;

                /* compiled from: IacCallScreenArgument.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ReserveNotification> {
                    @Override // android.os.Parcelable.Creator
                    public final ReserveNotification createFromParcel(Parcel parcel) {
                        return new ReserveNotification(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ReserveNotification[] newArray(int i12) {
                        return new ReserveNotification[i12];
                    }
                }

                public ReserveNotification(@k String str) {
                    super("ReserveNotification_".concat(str), null);
                    this.f166224c = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.f166224c);
                }
            }

            public From(String str, C42822w c42822w) {
                this.f166221b = str;
            }

            @k
            /* renamed from: getName, reason: from getter */
            public String getF166221b() {
                return this.f166221b;
            }

            @k
            public String toString() {
                return "From(" + getF166221b() + ')';
            }
        }

        /* compiled from: IacCallScreenArgument.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WithoutAction> {
            @Override // android.os.Parcelable.Creator
            public final WithoutAction createFromParcel(Parcel parcel) {
                return new WithoutAction((From) parcel.readParcelable(WithoutAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final WithoutAction[] newArray(int i12) {
                return new WithoutAction[i12];
            }
        }

        public WithoutAction(@k From from) {
            super(null);
            this.from = from;
        }

        public static /* synthetic */ WithoutAction copy$default(WithoutAction withoutAction, From from, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                from = withoutAction.from;
            }
            return withoutAction.copy(from);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final From getFrom() {
            return this.from;
        }

        @k
        public final WithoutAction copy(@k From from) {
            return new WithoutAction(from);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithoutAction) && L.f(this.from, ((WithoutAction) other).from);
        }

        @k
        public final From getFrom() {
            return this.from;
        }

        public int hashCode() {
            return this.from.hashCode();
        }

        @k
        public String toString() {
            return "IacCallScreenArgument.WithoutAction(from=" + this.from + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.from, flags);
        }
    }

    public /* synthetic */ IacCallScreenArgument(C42822w c42822w) {
        this();
    }

    private IacCallScreenArgument() {
    }
}
