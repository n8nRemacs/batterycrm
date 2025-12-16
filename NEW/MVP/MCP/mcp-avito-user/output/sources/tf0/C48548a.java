package tF0;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1TravelSearchFavoritesHeaderPostResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LtF0/a;", "", "", "LtF0/b;", "filters", "LtF0/e;", "header", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/util/List;LtF0/e;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LtF0/e;", "b", "()LtF0/e;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tF0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48548a {

    @com.google.gson.annotations.c("filters")
    @k
    private final List<C48549b> filters;

    @com.google.gson.annotations.c("header")
    @k
    private final e header;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink uri;

    public C48548a(@k List<C48549b> list, @k e eVar, @k DeepLink deepLink) {
        this.filters = list;
        this.header = eVar;
        this.uri = deepLink;
    }

    @k
    public final List<C48549b> a() {
        return this.filters;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final e getHeader() {
        return this.header;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
