package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Advices.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/AdviceHeader;", "", "title", "", "count", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getCount", "()Ljava/lang/String;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdviceHeader {

    @c("count")
    @l
    private final String count;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("title")
    @k
    private final String title;

    public AdviceHeader(@k String str, @l String str2, @l DeepLink deepLink) {
        this.title = str;
        this.count = str2;
        this.deeplink = deepLink;
    }

    public static /* synthetic */ AdviceHeader copy$default(AdviceHeader adviceHeader, String str, String str2, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = adviceHeader.title;
        }
        if ((i12 & 2) != 0) {
            str2 = adviceHeader.count;
        }
        if ((i12 & 4) != 0) {
            deepLink = adviceHeader.deeplink;
        }
        return adviceHeader.copy(str, str2, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final AdviceHeader copy(@k String title, @l String count, @l DeepLink deeplink) {
        return new AdviceHeader(title, count, deeplink);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdviceHeader)) {
            return false;
        }
        AdviceHeader adviceHeader = (AdviceHeader) other;
        return L.f(this.title, adviceHeader.title) && L.f(this.count, adviceHeader.count) && L.f(this.deeplink, adviceHeader.deeplink);
    }

    @l
    public final String getCount() {
        return this.count;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.count;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdviceHeader(title=");
        sb2.append(this.title);
        sb2.append(", count=");
        sb2.append(this.count);
        sb2.append(", deeplink=");
        return a.v(sb2, this.deeplink, ')');
    }
}
