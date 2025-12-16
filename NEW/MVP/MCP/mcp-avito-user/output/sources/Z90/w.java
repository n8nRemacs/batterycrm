package z90;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lz90/w;", "", "", "id", "", "Lz90/x;", "items", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class w {

    @com.google.gson.annotations.c("id")
    @Y61.l
    private final String id;

    @com.google.gson.annotations.c("items")
    @Y61.k
    private final List<x> items;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final DeepLink uri;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.l
    private final String url;

    public w(@Y61.l String str, @Y61.k List<x> list, @Y61.l String str2, @Y61.l DeepLink deepLink, @Y61.l String str3) {
        this.id = str;
        this.items = list;
        this.title = str2;
        this.uri = deepLink;
        this.url = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    public final List<x> b() {
        return this.items;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
