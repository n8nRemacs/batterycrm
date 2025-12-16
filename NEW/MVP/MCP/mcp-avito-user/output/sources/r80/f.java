package R80;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionV1Response.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LR80/f;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/Image;", "image", "", "location", "price", "title", "LR80/g;", "views", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LR80/g;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "e", "LR80/g;", "f", "()LR80/g;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {

    @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
    @k
    private final DeepLink deepLink;

    @com.google.gson.annotations.c("image")
    @l
    private final Image image;

    @com.google.gson.annotations.c("location")
    @k
    private final String location;

    @com.google.gson.annotations.c("price")
    @k
    private final String price;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("views")
    @l
    private final g views;

    public f(@k DeepLink deepLink, @l Image image, @k String str, @k String str2, @k String str3, @l g gVar) {
        this.deepLink = deepLink;
        this.image = image;
        this.location = str;
        this.price = str2;
        this.title = str3;
        this.views = gVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final g getViews() {
        return this.views;
    }
}
