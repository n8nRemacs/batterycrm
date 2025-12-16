package com.avito.android.remote.model;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: VerificationPlatformRedirectResult.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/VerificationPlatformRedirectResult;", "", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "sendAnalytic", "", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)V", "getSendAnalytic", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VerificationPlatformRedirectResult {

    @c("sendAnalytic")
    @l
    private final Boolean sendAnalytic;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    public VerificationPlatformRedirectResult(@l DeepLink deepLink, @l Boolean bool) {
        this.uri = deepLink;
        this.sendAnalytic = bool;
    }

    @l
    public final Boolean getSendAnalytic() {
        return this.sendAnalytic;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }
}
