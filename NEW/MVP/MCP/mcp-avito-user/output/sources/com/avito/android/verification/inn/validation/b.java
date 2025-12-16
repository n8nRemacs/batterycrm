package com.avito.android.verification.inn.validation;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.inn.validation.VerificationRegexValidation;
import com.avito.android.remote.model.inn.validation.VerificationValidation;
import java.util.regex.Pattern;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ValidationConvertor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/validation/b;", "", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {
    @Inject
    public b() {
    }

    @l
    public static a a(@k VerificationValidation verificationValidation) {
        if (!(verificationValidation instanceof VerificationRegexValidation)) {
            throw new NoWhenBranchMatchedException();
        }
        VerificationRegexValidation verificationRegexValidation = (VerificationRegexValidation) verificationValidation;
        try {
            return new a(Pattern.compile(verificationRegexValidation.getPattern()), verificationRegexValidation.getMessage());
        } catch (Throwable unused) {
            return null;
        }
    }
}
