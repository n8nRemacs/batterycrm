package com.avito.android.remote.model;

import Y61.l;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: SearchDeepLinkResult.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SearchDeepLinkResult;", "", Constants.DEEPLINK, "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getDeeplink", "()Landroid/net/Uri;", "_avito-discouraged_avito-api_onboarding"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SearchDeepLinkResult {

    @c(Constants.DEEPLINK)
    @l
    private final Uri deeplink;

    public SearchDeepLinkResult(@l Uri uri) {
        this.deeplink = uri;
    }

    @l
    public final Uri getDeeplink() {
        return this.deeplink;
    }
}
