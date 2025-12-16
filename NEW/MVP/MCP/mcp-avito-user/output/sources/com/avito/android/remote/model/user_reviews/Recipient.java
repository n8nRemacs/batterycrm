package com.avito.android.remote.model.user_reviews;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Recipient.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/user_reviews/Recipient;", "", "title", "", "isShop", "", "avatar", "Lcom/avito/android/remote/model/Image;", "link", "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;ZLcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "()Z", "getLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Recipient {

    @c("avatar")
    @k
    private final Image avatar;

    @c("isShop")
    private final boolean isShop;

    @c("link")
    @k
    private final DeepLink link;

    @c("title")
    @k
    private final String title;

    public Recipient(@k String str, boolean z12, @k Image image, @k DeepLink deepLink) {
        this.title = str;
        this.isShop = z12;
        this.avatar = image;
        this.link = deepLink;
    }

    @k
    public final Image getAvatar() {
        return this.avatar;
    }

    @k
    public final DeepLink getLink() {
        return this.link;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: isShop, reason: from getter */
    public final boolean getIsShop() {
        return this.isShop;
    }
}
