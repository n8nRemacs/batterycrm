package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: VerificationOptionsListResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/VerificationOption;", "", MessageBody.SystemMessageBody.Platform.FLOW, "", "title", "subTitle", "status", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getFlow", "()Ljava/lang/String;", "getStatus", "getSubTitle", "getTitle", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VerificationOption {

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c("type")
    @k
    private final String flow;

    @c("status")
    @l
    private final String status;

    @c("subtitle")
    @k
    private final String subTitle;

    @c("title")
    @k
    private final String title;

    public VerificationOption(@k String str, @k String str2, @k String str3, @l String str4, @l DeepLink deepLink) {
        this.flow = str;
        this.title = str2;
        this.subTitle = str3;
        this.status = str4;
        this.deepLink = deepLink;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final String getFlow() {
        return this.flow;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    @k
    public final String getSubTitle() {
        return this.subTitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }
}
