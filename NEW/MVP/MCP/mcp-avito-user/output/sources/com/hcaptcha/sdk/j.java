package com.hcaptcha.sdk;

import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import lombok.Generated;

/* loaded from: classes7.dex */
class j implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public r f363105b;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class a {
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a() {
        }

        @NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public final String toString() {
            return "HCaptchaInternalConfig.HCaptchaInternalConfigBuilder(htmlProvider$value=null)";
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        jVar.getClass();
        r rVar = this.f363105b;
        r rVar2 = jVar.f363105b;
        return rVar != null ? rVar.equals(rVar2) : rVar2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public final int hashCode() {
        r rVar = this.f363105b;
        return (rVar == null ? 43 : rVar.hashCode()) + 59;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public final String toString() {
        return "HCaptchaInternalConfig(htmlProvider=" + this.f363105b + ")";
    }
}
