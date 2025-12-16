package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.authorization.analytics.CodeConfirmationSource;
import kotlin.Metadata;

/* compiled from: SmsCodeConfirmationParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/s0;", "", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class s0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SmsCodeConfirmationParams f119631a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CodeConfirmationSource f119632b;

    public s0(@Y61.k SmsCodeConfirmationParams smsCodeConfirmationParams, @Y61.k CodeConfirmationSource codeConfirmationSource) {
        this.f119631a = smsCodeConfirmationParams;
        this.f119632b = codeConfirmationSource;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return kotlin.jvm.internal.L.f(this.f119631a, s0Var.f119631a) && this.f119632b == s0Var.f119632b;
    }

    public final int hashCode() {
        return this.f119632b.hashCode() + (this.f119631a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SmsCcParamsWithSource(smsCodeConfirmationParams=" + this.f119631a + ", src=" + this.f119632b + ')';
    }
}
