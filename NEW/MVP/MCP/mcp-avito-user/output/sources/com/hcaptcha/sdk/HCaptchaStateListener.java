package com.hcaptcha.sdk;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
abstract class HCaptchaStateListener implements Parcelable {
    public abstract void a(HCaptchaException hCaptchaException);

    public abstract void c();

    public abstract void d(String str);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
    }
}
