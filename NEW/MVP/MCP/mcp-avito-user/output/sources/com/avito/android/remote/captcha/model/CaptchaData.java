package com.avito.android.remote.captcha.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CaptchaData.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/captcha/model/CaptchaData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/captcha/model/CaptchaType;", "type", "", "image", "message", "<init>", "(Lcom/avito/android/remote/captcha/model/CaptchaType;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/captcha/model/CaptchaType;", "c", "()Lcom/avito/android/remote/captcha/model/CaptchaType;", "Ljava/lang/String;", "getImage", "()Ljava/lang/String;", "getMessage", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CaptchaData implements Parcelable {

    @k
    public static final Parcelable.Creator<CaptchaData> CREATOR = new a();

    @c("image")
    @l
    private final String image;

    @c("message")
    @l
    private final String message;

    @c("type")
    @l
    private final CaptchaType type;

    /* compiled from: CaptchaData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CaptchaData> {
        @Override // android.os.Parcelable.Creator
        public final CaptchaData createFromParcel(Parcel parcel) {
            return new CaptchaData(parcel.readInt() == 0 ? null : CaptchaType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CaptchaData[] newArray(int i12) {
            return new CaptchaData[i12];
        }
    }

    public CaptchaData() {
        this(null, null, null, 7, null);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final CaptchaType getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptchaData)) {
            return false;
        }
        CaptchaData captchaData = (CaptchaData) obj;
        return this.type == captchaData.type && L.f(this.image, captchaData.image) && L.f(this.message, captchaData.message);
    }

    @l
    public final String getImage() {
        return this.image;
    }

    @l
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        CaptchaType captchaType = this.type;
        int iHashCode = (captchaType == null ? 0 : captchaType.hashCode()) * 31;
        String str = this.image;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CaptchaData(type=");
        sb2.append(this.type);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", message=");
        return C22026a.c(sb2, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        CaptchaType captchaType = this.type;
        if (captchaType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(captchaType.name());
        }
        parcel.writeString(this.image);
        parcel.writeString(this.message);
    }

    public CaptchaData(@l CaptchaType captchaType, @l String str, @l String str2) {
        this.type = captchaType;
        this.image = str;
        this.message = str2;
    }

    public /* synthetic */ CaptchaData(CaptchaType captchaType, String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? CaptchaType.f253318b : captchaType, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2);
    }
}
