package com.avito.android.passport.network.model;

import Y61.k;
import androidx.annotation.Keep;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: ProfileCreationDuplicationOptionsResponse.kt */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/passport/network/model/Action;", "", "title", "", "subtitle", "iconId", ContextActionHandler.Link.URL, "Lcom/avito/android/deep_linking/links/DeepLink;", "actionName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "getActionName", "()Ljava/lang/String;", "getIconId", "getSubtitle", "getTitle", "getUrl", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Action {

    @k
    private final String actionName;

    @k
    private final String iconId;

    @k
    private final String subtitle;

    @k
    private final String title;

    @k
    private final DeepLink url;

    public Action(@k String str, @k String str2, @k String str3, @k DeepLink deepLink, @k String str4) {
        this.title = str;
        this.subtitle = str2;
        this.iconId = str3;
        this.url = deepLink;
        this.actionName = str4;
    }

    @k
    public final String getActionName() {
        return this.actionName;
    }

    @k
    public final String getIconId() {
        return this.iconId;
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
    public final DeepLink getUrl() {
        return this.url;
    }
}
