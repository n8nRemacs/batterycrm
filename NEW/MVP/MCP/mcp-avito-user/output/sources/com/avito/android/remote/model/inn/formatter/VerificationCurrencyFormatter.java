package com.avito.android.remote.model.inn.formatter;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationCurrencyFormatter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/inn/formatter/VerificationCurrencyFormatter;", "Lcom/avito/android/remote/model/inn/formatter/VerificationFormatter;", "postfix", "", "(Ljava/lang/String;)V", "getPostfix", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationCurrencyFormatter implements VerificationFormatter {

    @c("postfix")
    @l
    private final String postfix;

    public VerificationCurrencyFormatter(@l String str) {
        this.postfix = str;
    }

    public static /* synthetic */ VerificationCurrencyFormatter copy$default(VerificationCurrencyFormatter verificationCurrencyFormatter, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationCurrencyFormatter.postfix;
        }
        return verificationCurrencyFormatter.copy(str);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getPostfix() {
        return this.postfix;
    }

    @k
    public final VerificationCurrencyFormatter copy(@l String postfix) {
        return new VerificationCurrencyFormatter(postfix);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VerificationCurrencyFormatter) && L.f(this.postfix, ((VerificationCurrencyFormatter) other).postfix);
    }

    @l
    public final String getPostfix() {
        return this.postfix;
    }

    public int hashCode() {
        String str = this.postfix;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("VerificationCurrencyFormatter(postfix="), this.postfix, ')');
    }
}
