package com.avito.android.remote.captcha.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerifyCaptchaResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/captcha/model/VerifyCaptchaResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/captcha/model/CaptchaData;", "captcha", "", "verified", "<init>", "(Lcom/avito/android/remote/captcha/model/CaptchaData;Z)V", "Lcom/avito/android/remote/captcha/model/CaptchaData;", "c", "()Lcom/avito/android/remote/captcha/model/CaptchaData;", "Z", "d", "()Z", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerifyCaptchaResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<VerifyCaptchaResponse> CREATOR = new a();

    @c("captcha")
    @l
    private final CaptchaData captcha;

    @c("verified")
    private final boolean verified;

    /* compiled from: VerifyCaptchaResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerifyCaptchaResponse> {
        @Override // android.os.Parcelable.Creator
        public final VerifyCaptchaResponse createFromParcel(Parcel parcel) {
            return new VerifyCaptchaResponse(parcel.readInt() == 0 ? null : CaptchaData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VerifyCaptchaResponse[] newArray(int i12) {
            return new VerifyCaptchaResponse[i12];
        }
    }

    public VerifyCaptchaResponse(@l CaptchaData captchaData, boolean z12) {
        this.captcha = captchaData;
        this.verified = z12;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final CaptchaData getCaptcha() {
        return this.captcha;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getVerified() {
        return this.verified;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyCaptchaResponse)) {
            return false;
        }
        VerifyCaptchaResponse verifyCaptchaResponse = (VerifyCaptchaResponse) obj;
        return L.f(this.captcha, verifyCaptchaResponse.captcha) && this.verified == verifyCaptchaResponse.verified;
    }

    public final int hashCode() {
        CaptchaData captchaData = this.captcha;
        return Boolean.hashCode(this.verified) + ((captchaData == null ? 0 : captchaData.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerifyCaptchaResponse(captcha=");
        sb2.append(this.captcha);
        sb2.append(", verified=");
        return r.x(sb2, this.verified, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        CaptchaData captchaData = this.captcha;
        if (captchaData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            captchaData.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.verified ? 1 : 0);
    }
}
