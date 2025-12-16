package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoHubInfo.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/PromoHubInfo;", "", "title", "", "description", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "image", "Lcom/avito/android/remote/model/Image;", "badge", "Lcom/avito/android/remote/model/PromoHubBadge;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/PromoHubBadge;)V", "getBadge", "()Lcom/avito/android/remote/model/PromoHubBadge;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getDescription", "()Ljava/lang/String;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PromoHubInfo {

    @c("badge")
    @l
    private final PromoHubBadge badge;

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deepLink;

    @c("description")
    @k
    private final String description;

    @c("images")
    @k
    private final Image image;

    @c("title")
    @k
    private final String title;

    public PromoHubInfo(@k String str, @k String str2, @k DeepLink deepLink, @k Image image, @l PromoHubBadge promoHubBadge) {
        this.title = str;
        this.description = str2;
        this.deepLink = deepLink;
        this.image = image;
        this.badge = promoHubBadge;
    }

    public static /* synthetic */ PromoHubInfo copy$default(PromoHubInfo promoHubInfo, String str, String str2, DeepLink deepLink, Image image, PromoHubBadge promoHubBadge, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = promoHubInfo.title;
        }
        if ((i12 & 2) != 0) {
            str2 = promoHubInfo.description;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            deepLink = promoHubInfo.deepLink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 8) != 0) {
            image = promoHubInfo.image;
        }
        Image image2 = image;
        if ((i12 & 16) != 0) {
            promoHubBadge = promoHubInfo.badge;
        }
        return promoHubInfo.copy(str, str3, deepLink2, image2, promoHubBadge);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final PromoHubBadge getBadge() {
        return this.badge;
    }

    @k
    public final PromoHubInfo copy(@k String title, @k String description, @k DeepLink deepLink, @k Image image, @l PromoHubBadge badge) {
        return new PromoHubInfo(title, description, deepLink, image, badge);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoHubInfo)) {
            return false;
        }
        PromoHubInfo promoHubInfo = (PromoHubInfo) other;
        return L.f(this.title, promoHubInfo.title) && L.f(this.description, promoHubInfo.description) && L.f(this.deepLink, promoHubInfo.deepLink) && L.f(this.image, promoHubInfo.image) && L.f(this.badge, promoHubInfo.badge);
    }

    @l
    public final PromoHubBadge getBadge() {
        return this.badge;
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
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iG2 = a.g(this.image, a.e(this.deepLink, H.d(this.title.hashCode() * 31, 31, this.description), 31), 31);
        PromoHubBadge promoHubBadge = this.badge;
        return iG2 + (promoHubBadge == null ? 0 : promoHubBadge.hashCode());
    }

    @k
    public String toString() {
        return "PromoHubInfo(title=" + this.title + ", description=" + this.description + ", deepLink=" + this.deepLink + ", image=" + this.image + ", badge=" + this.badge + ')';
    }
}
