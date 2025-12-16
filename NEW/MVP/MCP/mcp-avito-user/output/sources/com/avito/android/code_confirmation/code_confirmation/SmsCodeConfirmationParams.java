package com.avito.android.code_confirmation.code_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SmsCodeConfirmationParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/SmsCodeConfirmationParams;", "Landroid/os/Parcelable;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SmsCodeConfirmationParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SmsCodeConfirmationParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f119433b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f119434c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f119435d;

    /* renamed from: e, reason: collision with root package name */
    public final long f119436e;

    /* renamed from: f, reason: collision with root package name */
    public final int f119437f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final CodeConfirmationPresenter.TfaFlow f119438g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CodeConfirmationPresenter.Mode f119439h;

    /* compiled from: SmsCodeConfirmationParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SmsCodeConfirmationParams> {
        @Override // android.os.Parcelable.Creator
        public final SmsCodeConfirmationParams createFromParcel(Parcel parcel) {
            return new SmsCodeConfirmationParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), (CodeConfirmationPresenter.TfaFlow) parcel.readParcelable(SmsCodeConfirmationParams.class.getClassLoader()), (CodeConfirmationPresenter.Mode) parcel.readParcelable(SmsCodeConfirmationParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SmsCodeConfirmationParams[] newArray(int i12) {
            return new SmsCodeConfirmationParams[i12];
        }
    }

    public SmsCodeConfirmationParams(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, long j12, int i12, @Y61.k CodeConfirmationPresenter.TfaFlow tfaFlow, @Y61.k CodeConfirmationPresenter.Mode mode) {
        this.f119433b = str;
        this.f119434c = str2;
        this.f119435d = str3;
        this.f119436e = j12;
        this.f119437f = i12;
        this.f119438g = tfaFlow;
        this.f119439h = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsCodeConfirmationParams)) {
            return false;
        }
        SmsCodeConfirmationParams smsCodeConfirmationParams = (SmsCodeConfirmationParams) obj;
        return kotlin.jvm.internal.L.f(this.f119433b, smsCodeConfirmationParams.f119433b) && kotlin.jvm.internal.L.f(this.f119434c, smsCodeConfirmationParams.f119434c) && kotlin.jvm.internal.L.f(this.f119435d, smsCodeConfirmationParams.f119435d) && this.f119436e == smsCodeConfirmationParams.f119436e && this.f119437f == smsCodeConfirmationParams.f119437f && kotlin.jvm.internal.L.f(this.f119438g, smsCodeConfirmationParams.f119438g) && kotlin.jvm.internal.L.f(this.f119439h, smsCodeConfirmationParams.f119439h);
    }

    public final int hashCode() {
        int iHashCode = this.f119433b.hashCode() * 31;
        String str = this.f119434c;
        return this.f119439h.hashCode() + ((this.f119438g.hashCode() + androidx.appcompat.app.r.e(this.f119437f, androidx.appcompat.app.r.g(androidx.compose.foundation.H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f119435d), 31, this.f119436e), 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "SmsCodeConfirmationParams(login=" + this.f119433b + ", phone=" + this.f119434c + ", text=" + this.f119435d + ", codeTimeout=" + this.f119436e + ", codeLength=" + this.f119437f + ", tfaFlow=" + this.f119438g + ", ccMode=" + this.f119439h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f119433b);
        parcel.writeString(this.f119434c);
        parcel.writeString(this.f119435d);
        parcel.writeLong(this.f119436e);
        parcel.writeInt(this.f119437f);
        parcel.writeParcelable(this.f119438g, i12);
        parcel.writeParcelable(this.f119439h, i12);
    }

    public /* synthetic */ SmsCodeConfirmationParams(String str, String str2, String str3, long j12, int i12, CodeConfirmationPresenter.TfaFlow tfaFlow, CodeConfirmationPresenter.Mode mode, int i13, C42822w c42822w) {
        this(str, str2, str3, j12, (i13 & 16) != 0 ? 5 : i12, (i13 & 32) != 0 ? CodeConfirmationPresenter.TfaFlow.Sms.f119409b : tfaFlow, mode);
    }
}
