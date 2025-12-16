package com.hcaptcha.sdk;

import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import j.P;
import lombok.Generated;

/* loaded from: classes7.dex */
public class HCaptchaException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final HCaptchaError f363082b;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaException(HCaptchaError hCaptchaError) {
        this.f363082b = hCaptchaError;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HCaptchaException)) {
            return false;
        }
        HCaptchaException hCaptchaException = (HCaptchaException) obj;
        hCaptchaException.getClass();
        if (!super.equals(obj)) {
            return false;
        }
        HCaptchaError hCaptchaError = this.f363082b;
        HCaptchaError hCaptchaError2 = hCaptchaException.f363082b;
        return hCaptchaError != null ? hCaptchaError.equals(hCaptchaError2) : hCaptchaError2 == null;
    }

    @Override // java.lang.Throwable
    @P
    public final String getMessage() {
        return this.f363082b.f363081c;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public final int hashCode() {
        int iHashCode = super.hashCode() * 59;
        HCaptchaError hCaptchaError = this.f363082b;
        return iHashCode + (hCaptchaError == null ? 43 : hCaptchaError.hashCode());
    }

    @Override // java.lang.Throwable
    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public final String toString() {
        return "HCaptchaException(hCaptchaError=" + this.f363082b + ")";
    }
}
