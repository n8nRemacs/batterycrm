package com.avito.android.remote.model.inn.validation;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationRegexValidation.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/inn/validation/VerificationRegexValidation;", "Lcom/avito/android/remote/model/inn/validation/VerificationValidation;", "pattern", "", "message", "Lcom/avito/android/remote/model/text/AttributedText;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "getMessage", "()Lcom/avito/android/remote/model/text/AttributedText;", "getPattern", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationRegexValidation implements VerificationValidation {

    @c("message")
    @k
    private final AttributedText message;

    @c("pattern")
    @k
    private final String pattern;

    public VerificationRegexValidation(@k String str, @k AttributedText attributedText) {
        this.pattern = str;
        this.message = attributedText;
    }

    public static /* synthetic */ VerificationRegexValidation copy$default(VerificationRegexValidation verificationRegexValidation, String str, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationRegexValidation.pattern;
        }
        if ((i12 & 2) != 0) {
            attributedText = verificationRegexValidation.message;
        }
        return verificationRegexValidation.copy(str, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getPattern() {
        return this.pattern;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getMessage() {
        return this.message;
    }

    @k
    public final VerificationRegexValidation copy(@k String pattern, @k AttributedText message) {
        return new VerificationRegexValidation(pattern, message);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationRegexValidation)) {
            return false;
        }
        VerificationRegexValidation verificationRegexValidation = (VerificationRegexValidation) other;
        return L.f(this.pattern, verificationRegexValidation.pattern) && L.f(this.message, verificationRegexValidation.message);
    }

    @k
    public final AttributedText getMessage() {
        return this.message;
    }

    @k
    public final String getPattern() {
        return this.pattern;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.pattern.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationRegexValidation(pattern=");
        sb2.append(this.pattern);
        sb2.append(", message=");
        return a.w(sb2, this.message, ')');
    }
}
