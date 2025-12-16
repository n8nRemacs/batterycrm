package x90;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2SellersDashboardDataPostResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lx90/j;", "", "", "Lx90/k;", "barColor", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lx90/e;", "icon", "Lx90/l;", "periods", "Lcom/avito/android/remote/model/text/AttributedText;", "relativeValue", "", "slug", "title", "value", "<init>", "(Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Lx90/e;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lx90/e;", "c", "()Lx90/e;", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "h", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j {

    @com.google.gson.annotations.c("barColor")
    @Y61.k
    private final List<k> barColor;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @Y61.k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final e icon;

    @com.google.gson.annotations.c("periods")
    @Y61.k
    private final List<l> periods;

    @com.google.gson.annotations.c("relativeValue")
    @Y61.l
    private final AttributedText relativeValue;

    @com.google.gson.annotations.c("slug")
    @Y61.k
    private final String slug;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    @com.google.gson.annotations.c("value")
    @Y61.l
    private final AttributedText value;

    public j(@Y61.k List<k> list, @Y61.k DeepLink deepLink, @Y61.l e eVar, @Y61.k List<l> list2, @Y61.l AttributedText attributedText, @Y61.k String str, @Y61.k AttributedText attributedText2, @Y61.l AttributedText attributedText3) {
        this.barColor = list;
        this.deeplink = deepLink;
        this.icon = eVar;
        this.periods = list2;
        this.relativeValue = attributedText;
        this.slug = str;
        this.title = attributedText2;
        this.value = attributedText3;
    }

    @Y61.k
    public final List<k> a() {
        return this.barColor;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final e getIcon() {
        return this.icon;
    }

    @Y61.k
    public final List<l> d() {
        return this.periods;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final AttributedText getRelativeValue() {
        return this.relativeValue;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final AttributedText getValue() {
        return this.value;
    }
}
