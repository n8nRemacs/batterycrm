package tF0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1TravelSearchFavoritesHeaderPostResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B=\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LtF0/e;", "", "", "", "inlinesOrder", "Lcom/avito/android/deep_linking/links/DeepLink;", "resetAction", "", "selectedFiltersCount", "LtF0/f;", "subTitle", "title", "<init>", "(Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Long;LtF0/f;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "LtF0/f;", "d", "()LtF0/f;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    @com.google.gson.annotations.c("inlinesOrder")
    @l
    private final List<String> inlinesOrder;

    @com.google.gson.annotations.c("resetAction")
    @l
    private final DeepLink resetAction;

    @com.google.gson.annotations.c("selectedFiltersCount")
    @l
    private final Long selectedFiltersCount;

    @com.google.gson.annotations.c("subTitle")
    @l
    private final f subTitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public e(@l List<String> list, @l DeepLink deepLink, @l Long l12, @l f fVar, @k String str) {
        this.inlinesOrder = list;
        this.resetAction = deepLink;
        this.selectedFiltersCount = l12;
        this.subTitle = fVar;
        this.title = str;
    }

    @l
    public final List<String> a() {
        return this.inlinesOrder;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final DeepLink getResetAction() {
        return this.resetAction;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getSelectedFiltersCount() {
        return this.selectedFiltersCount;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final f getSubTitle() {
        return this.subTitle;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
