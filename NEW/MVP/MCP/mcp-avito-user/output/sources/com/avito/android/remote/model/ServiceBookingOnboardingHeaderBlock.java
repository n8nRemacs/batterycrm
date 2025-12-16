package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ServiceBookingHeaderBlock.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/ServiceBookingOnboardingHeaderBlock;", "Lcom/avito/android/remote/model/ServiceBookingHeaderBlock;", "title", "", "subtitle", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "steps", "", "storageKey", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;ILjava/lang/String;)V", "getSteps", "()I", "getStorageKey", "()Ljava/lang/String;", "getSubtitle", "getTitle", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ServiceBookingOnboardingHeaderBlock implements ServiceBookingHeaderBlock {

    @c("steps")
    private final int steps;

    @c("storageKey")
    @k
    private final String storageKey;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink uri;

    public ServiceBookingOnboardingHeaderBlock(@k String str, @k String str2, @k DeepLink deepLink, int i12, @k String str3) {
        this.title = str;
        this.subtitle = str2;
        this.uri = deepLink;
        this.steps = i12;
        this.storageKey = str3;
    }

    public final int getSteps() {
        return this.steps;
    }

    @k
    public final String getStorageKey() {
        return this.storageKey;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final DeepLink getUri() {
        return this.uri;
    }
}
