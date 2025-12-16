package com.avito.android.code_confirmation.code_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.util.Kundle;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: CodeConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter;", "", "Mode", "b", "TfaFlow", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CodeConfirmationPresenter {

    /* compiled from: CodeConfirmationPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode;", "Landroid/os/Parcelable;", "Default", "ModeForLogin", "PhoneVerification", "RecallMe", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode$ModeForLogin;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode$RecallMe;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public interface Mode extends Parcelable {

        /* compiled from: CodeConfirmationPresenter.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode$Default;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode$ModeForLogin;", "<init>", "()V", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Default implements ModeForLogin {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Default f119406b = new Default();

            @Y61.k
            public static final Parcelable.Creator<Default> CREATOR = new a();

            /* compiled from: CodeConfirmationPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Default> {
                @Override // android.os.Parcelable.Creator
                public final Default createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Default.f119406b;
                }

                @Override // android.os.Parcelable.Creator
                public final Default[] newArray(int i12) {
                    return new Default[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: CodeConfirmationPresenter.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode$ModeForLogin;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode$Default;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode$PhoneVerification;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface ModeForLogin extends Mode {
        }

        /* compiled from: CodeConfirmationPresenter.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode$PhoneVerification;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode$ModeForLogin;", "<init>", "()V", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PhoneVerification implements ModeForLogin {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final PhoneVerification f119407b = new PhoneVerification();

            @Y61.k
            public static final Parcelable.Creator<PhoneVerification> CREATOR = new a();

            /* compiled from: CodeConfirmationPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<PhoneVerification> {
                @Override // android.os.Parcelable.Creator
                public final PhoneVerification createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return PhoneVerification.f119407b;
                }

                @Override // android.os.Parcelable.Creator
                public final PhoneVerification[] newArray(int i12) {
                    return new PhoneVerification[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: CodeConfirmationPresenter.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode$RecallMe;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$Mode;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RecallMe implements Mode {

            @Y61.k
            public static final Parcelable.Creator<RecallMe> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f119408b;

            /* compiled from: CodeConfirmationPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RecallMe> {
                @Override // android.os.Parcelable.Creator
                public final RecallMe createFromParcel(Parcel parcel) {
                    return new RecallMe(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final RecallMe[] newArray(int i12) {
                    return new RecallMe[i12];
                }
            }

            public RecallMe(@Y61.k String str) {
                this.f119408b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RecallMe) && kotlin.jvm.internal.L.f(this.f119408b, ((RecallMe) obj).f119408b);
            }

            public final int hashCode() {
                return this.f119408b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("RecallMe(phone="), this.f119408b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f119408b);
            }
        }
    }

    /* compiled from: CodeConfirmationPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$TfaFlow;", "Landroid/os/Parcelable;", "Sms", "SmsFromPhoneList", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$TfaFlow$Sms;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$TfaFlow$SmsFromPhoneList;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface TfaFlow extends Parcelable {

        /* compiled from: CodeConfirmationPresenter.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$TfaFlow$Sms;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$TfaFlow;", "<init>", "()V", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Sms implements TfaFlow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Sms f119409b = new Sms();

            @Y61.k
            public static final Parcelable.Creator<Sms> CREATOR = new a();

            /* compiled from: CodeConfirmationPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Sms> {
                @Override // android.os.Parcelable.Creator
                public final Sms createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Sms.f119409b;
                }

                @Override // android.os.Parcelable.Creator
                public final Sms[] newArray(int i12) {
                    return new Sms[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: CodeConfirmationPresenter.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$TfaFlow$SmsFromPhoneList;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$TfaFlow;", "<init>", "()V", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SmsFromPhoneList implements TfaFlow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final SmsFromPhoneList f119410b = new SmsFromPhoneList();

            @Y61.k
            public static final Parcelable.Creator<SmsFromPhoneList> CREATOR = new a();

            /* compiled from: CodeConfirmationPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SmsFromPhoneList> {
                @Override // android.os.Parcelable.Creator
                public final SmsFromPhoneList createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return SmsFromPhoneList.f119410b;
                }

                @Override // android.os.Parcelable.Creator
                public final SmsFromPhoneList[] newArray(int i12) {
                    return new SmsFromPhoneList[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: CodeConfirmationPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: CodeConfirmationPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter$b;", "", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    void a();

    void b(boolean z12);

    void c(@Y61.k CodeConfirmationActivity codeConfirmationActivity);

    void c0();

    void d(@Y61.k String str, @Y61.k String str2, long j12, int i12, @Y61.k TfaFlow tfaFlow, @Y61.k Mode mode);

    @Y61.k
    Kundle d0();

    void e();

    void e0();

    void f(@Y61.k f0 f0Var);
}
