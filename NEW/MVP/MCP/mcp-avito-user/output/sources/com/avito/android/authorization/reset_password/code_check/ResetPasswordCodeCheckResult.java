package com.avito.android.authorization.reset_password.code_check;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.authorization.confirm_3fa.ConfirmEmailList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResetPasswordCodeCheckScenarioBuilder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/authorization/reset_password/code_check/ResetPasswordCodeCheckResult;", "Landroid/os/Parcelable;", "CancelByAutoRecovery", "Confirmed", "NeedConfirmEmailList", "Lcom/avito/android/authorization/reset_password/code_check/ResetPasswordCodeCheckResult$CancelByAutoRecovery;", "Lcom/avito/android/authorization/reset_password/code_check/ResetPasswordCodeCheckResult$Confirmed;", "Lcom/avito/android/authorization/reset_password/code_check/ResetPasswordCodeCheckResult$NeedConfirmEmailList;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ResetPasswordCodeCheckResult extends Parcelable {

    /* compiled from: ResetPasswordCodeCheckScenarioBuilder.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/reset_password/code_check/ResetPasswordCodeCheckResult$CancelByAutoRecovery;", "Lcom/avito/android/authorization/reset_password/code_check/ResetPasswordCodeCheckResult;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CancelByAutoRecovery implements ResetPasswordCodeCheckResult {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final CancelByAutoRecovery f94109b = new CancelByAutoRecovery();

        @Y61.k
        public static final Parcelable.Creator<CancelByAutoRecovery> CREATOR = new a();

        /* compiled from: ResetPasswordCodeCheckScenarioBuilder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CancelByAutoRecovery> {
            @Override // android.os.Parcelable.Creator
            public final CancelByAutoRecovery createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CancelByAutoRecovery.f94109b;
            }

            @Override // android.os.Parcelable.Creator
            public final CancelByAutoRecovery[] newArray(int i12) {
                return new CancelByAutoRecovery[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof CancelByAutoRecovery);
        }

        public final int hashCode() {
            return 255464576;
        }

        @Y61.k
        public final String toString() {
            return "CancelByAutoRecovery";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ResetPasswordCodeCheckScenarioBuilder.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/reset_password/code_check/ResetPasswordCodeCheckResult$Confirmed;", "Lcom/avito/android/authorization/reset_password/code_check/ResetPasswordCodeCheckResult;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Confirmed implements ResetPasswordCodeCheckResult {

        @Y61.k
        public static final Parcelable.Creator<Confirmed> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f94110b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f94111c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f94112d;

        /* compiled from: ResetPasswordCodeCheckScenarioBuilder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Confirmed> {
            @Override // android.os.Parcelable.Creator
            public final Confirmed createFromParcel(Parcel parcel) {
                return new Confirmed(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Confirmed[] newArray(int i12) {
                return new Confirmed[i12];
            }
        }

        public Confirmed(@Y61.k String str, @Y61.k String str2, boolean z12) {
            this.f94110b = str;
            this.f94111c = str2;
            this.f94112d = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Confirmed)) {
                return false;
            }
            Confirmed confirmed = (Confirmed) obj;
            return L.f(this.f94110b, confirmed.f94110b) && L.f(this.f94111c, confirmed.f94111c) && this.f94112d == confirmed.f94112d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f94112d) + H.d(this.f94110b.hashCode() * 31, 31, this.f94111c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Confirmed(login=");
            sb2.append(this.f94110b);
            sb2.append(", hash=");
            sb2.append(this.f94111c);
            sb2.append(", isPhoneUsed=");
            return r.x(sb2, this.f94112d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f94110b);
            parcel.writeString(this.f94111c);
            parcel.writeInt(this.f94112d ? 1 : 0);
        }
    }

    /* compiled from: ResetPasswordCodeCheckScenarioBuilder.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/reset_password/code_check/ResetPasswordCodeCheckResult$NeedConfirmEmailList;", "Lcom/avito/android/authorization/reset_password/code_check/ResetPasswordCodeCheckResult;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NeedConfirmEmailList implements ResetPasswordCodeCheckResult {

        @Y61.k
        public static final Parcelable.Creator<NeedConfirmEmailList> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ConfirmEmailList f94113b;

        /* compiled from: ResetPasswordCodeCheckScenarioBuilder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NeedConfirmEmailList> {
            @Override // android.os.Parcelable.Creator
            public final NeedConfirmEmailList createFromParcel(Parcel parcel) {
                return new NeedConfirmEmailList(ConfirmEmailList.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NeedConfirmEmailList[] newArray(int i12) {
                return new NeedConfirmEmailList[i12];
            }
        }

        public NeedConfirmEmailList(@Y61.k ConfirmEmailList confirmEmailList) {
            this.f94113b = confirmEmailList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NeedConfirmEmailList) && L.f(this.f94113b, ((NeedConfirmEmailList) obj).f94113b);
        }

        public final int hashCode() {
            return this.f94113b.f93534b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "NeedConfirmEmailList(emailList=" + this.f94113b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.f94113b.writeToParcel(parcel, i12);
        }
    }
}
