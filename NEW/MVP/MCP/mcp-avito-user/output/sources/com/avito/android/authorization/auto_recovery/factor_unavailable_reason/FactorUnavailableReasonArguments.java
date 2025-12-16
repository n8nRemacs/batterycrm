package com.avito.android.authorization.auto_recovery.factor_unavailable_reason;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FactorUnavailableReasonFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/FactorUnavailableReasonArguments;", "Landroid/os/Parcelable;", "Email", "Phone", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/FactorUnavailableReasonArguments$Email;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/FactorUnavailableReasonArguments$Phone;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FactorUnavailableReasonArguments extends Parcelable {

    /* compiled from: FactorUnavailableReasonFragment.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/FactorUnavailableReasonArguments$Email;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/FactorUnavailableReasonArguments;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Email implements FactorUnavailableReasonArguments {

        @Y61.k
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f93077b;

        /* compiled from: FactorUnavailableReasonFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Email> {
            @Override // android.os.Parcelable.Creator
            public final Email createFromParcel(Parcel parcel) {
                return new Email(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Email[] newArray(int i12) {
                return new Email[i12];
            }
        }

        public Email(@Y61.k String str) {
            this.f93077b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Email) && L.f(this.f93077b, ((Email) obj).f93077b);
        }

        public final int hashCode() {
            return this.f93077b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Email(source="), this.f93077b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f93077b);
        }
    }

    /* compiled from: FactorUnavailableReasonFragment.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/FactorUnavailableReasonArguments$Phone;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/FactorUnavailableReasonArguments;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Phone implements FactorUnavailableReasonArguments {

        @Y61.k
        public static final Parcelable.Creator<Phone> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AutoRecoveryLink.Source f93078b;

        /* compiled from: FactorUnavailableReasonFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Phone> {
            @Override // android.os.Parcelable.Creator
            public final Phone createFromParcel(Parcel parcel) {
                return new Phone(AutoRecoveryLink.Source.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Phone[] newArray(int i12) {
                return new Phone[i12];
            }
        }

        public Phone(@Y61.k AutoRecoveryLink.Source source) {
            this.f93078b = source;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Phone) && this.f93078b == ((Phone) obj).f93078b;
        }

        public final int hashCode() {
            return this.f93078b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Phone(source=" + this.f93078b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f93078b.name());
        }
    }
}
