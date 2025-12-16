package jz0;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api4StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Ljz0/f;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "icon", "iconName", "Ljz0/g;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljz0/g;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Ljz0/g;", "d", "()Ljz0/g;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jz0.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42460f {

    @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @com.google.gson.annotations.c("icon")
    @l
    private final String icon;

    @com.google.gson.annotations.c("iconName")
    @l
    private final String iconName;

    @com.google.gson.annotations.c("image")
    @l
    private final C42461g image;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @l
    private final AttributedText title;

    public C42460f(@l DeepLink deepLink, @l String str, @l String str2, @l C42461g c42461g, @l AttributedText attributedText, @l AttributedText attributedText2) {
        this.deepLink = deepLink;
        this.icon = str;
        this.iconName = str2;
        this.image = c42461g;
        this.subtitle = attributedText;
        this.title = attributedText2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C42461g getImage() {
        return this.image;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
