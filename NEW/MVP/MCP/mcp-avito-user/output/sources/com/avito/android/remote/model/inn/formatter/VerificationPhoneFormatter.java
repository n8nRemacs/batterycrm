package com.avito.android.remote.model.inn.formatter;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationPhoneFormatter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/inn/formatter/VerificationPhoneFormatter;", "Lcom/avito/android/remote/model/inn/formatter/VerificationFormatter;", "prefix", "", "postfix", "(Ljava/lang/String;Ljava/lang/String;)V", "getPostfix", "()Ljava/lang/String;", "getPrefix", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationPhoneFormatter implements VerificationFormatter {

    @c("postfix")
    @l
    private final String postfix;

    @c("prefix")
    @l
    private final String prefix;

    public VerificationPhoneFormatter(@l String str, @l String str2) {
        this.prefix = str;
        this.postfix = str2;
    }

    public static /* synthetic */ VerificationPhoneFormatter copy$default(VerificationPhoneFormatter verificationPhoneFormatter, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationPhoneFormatter.prefix;
        }
        if ((i12 & 2) != 0) {
            str2 = verificationPhoneFormatter.postfix;
        }
        return verificationPhoneFormatter.copy(str, str2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getPostfix() {
        return this.postfix;
    }

    @k
    public final VerificationPhoneFormatter copy(@l String prefix, @l String postfix) {
        return new VerificationPhoneFormatter(prefix, postfix);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationPhoneFormatter)) {
            return false;
        }
        VerificationPhoneFormatter verificationPhoneFormatter = (VerificationPhoneFormatter) other;
        return L.f(this.prefix, verificationPhoneFormatter.prefix) && L.f(this.postfix, verificationPhoneFormatter.postfix);
    }

    @l
    public final String getPostfix() {
        return this.postfix;
    }

    @l
    public final String getPrefix() {
        return this.prefix;
    }

    public int hashCode() {
        String str = this.prefix;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.postfix;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationPhoneFormatter(prefix=");
        sb2.append(this.prefix);
        sb2.append(", postfix=");
        return C22026a.c(sb2, this.postfix, ')');
    }
}
