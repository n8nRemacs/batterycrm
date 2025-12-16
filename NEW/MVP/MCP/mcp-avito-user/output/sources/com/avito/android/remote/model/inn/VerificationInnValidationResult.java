package com.avito.android.remote.model.inn;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationInnValidationResult.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "", "errors", "", "", "Lcom/avito/android/remote/model/text/AttributedText;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/util/Map;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getErrors", "()Ljava/util/Map;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationInnValidationResult {

    @c("errors")
    @l
    private final Map<String, AttributedText> errors;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    public VerificationInnValidationResult(@l Map<String, AttributedText> map, @l DeepLink deepLink) {
        this.errors = map;
        this.uri = deepLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerificationInnValidationResult copy$default(VerificationInnValidationResult verificationInnValidationResult, Map map, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = verificationInnValidationResult.errors;
        }
        if ((i12 & 2) != 0) {
            deepLink = verificationInnValidationResult.uri;
        }
        return verificationInnValidationResult.copy(map, deepLink);
    }

    @l
    public final Map<String, AttributedText> component1() {
        return this.errors;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @k
    public final VerificationInnValidationResult copy(@l Map<String, AttributedText> errors, @l DeepLink uri) {
        return new VerificationInnValidationResult(errors, uri);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationInnValidationResult)) {
            return false;
        }
        VerificationInnValidationResult verificationInnValidationResult = (VerificationInnValidationResult) other;
        return L.f(this.errors, verificationInnValidationResult.errors) && L.f(this.uri, verificationInnValidationResult.uri);
    }

    @l
    public final Map<String, AttributedText> getErrors() {
        return this.errors;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    public int hashCode() {
        Map<String, AttributedText> map = this.errors;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        DeepLink deepLink = this.uri;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationInnValidationResult(errors=");
        sb2.append(this.errors);
        sb2.append(", uri=");
        return a.v(sb2, this.uri, ')');
    }
}
