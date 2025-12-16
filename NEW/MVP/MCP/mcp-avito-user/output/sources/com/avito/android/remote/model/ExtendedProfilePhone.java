package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ExtendedProfilePhoneResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfilePhone;", "", "formattedPhone", "", "description", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getDescription", "()Ljava/lang/String;", "getFormattedPhone", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedProfilePhone {

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deepLink;

    @c("description")
    @k
    private final String description;

    @c("formattedPhone")
    @k
    private final String formattedPhone;

    public ExtendedProfilePhone(@k String str, @k String str2, @k DeepLink deepLink) {
        this.formattedPhone = str;
        this.description = str2;
        this.deepLink = deepLink;
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getFormattedPhone() {
        return this.formattedPhone;
    }
}
