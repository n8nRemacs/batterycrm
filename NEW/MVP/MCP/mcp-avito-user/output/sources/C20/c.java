package C20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiBulkMessagingBannerGetResponse.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LC20/c;", "", "LC20/d;", "button", "LC20/e;", "defaultImage", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/Image;", "img", "Lcom/avito/android/deep_linking/links/DeepLink;", "onCloseDeeplink", "", "title", "<init>", "(LC20/d;LC20/e;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "LC20/d;", "a", "()LC20/d;", "LC20/e;", "b", "()LC20/e;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/Image;", "d", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    @com.google.gson.annotations.c("button")
    @k
    private final d button;

    @com.google.gson.annotations.c("defaultImage")
    @l
    private final e defaultImage;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("img")
    @l
    private final Image img;

    @com.google.gson.annotations.c("onCloseDeeplink")
    @l
    private final DeepLink onCloseDeeplink;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public c(@k d dVar, @l e eVar, @l AttributedText attributedText, @l Image image, @l DeepLink deepLink, @l String str) {
        this.button = dVar;
        this.defaultImage = eVar;
        this.description = attributedText;
        this.img = image;
        this.onCloseDeeplink = deepLink;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final d getButton() {
        return this.button;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final e getDefaultImage() {
        return this.defaultImage;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Image getImg() {
        return this.img;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getOnCloseDeeplink() {
        return this.onCloseDeeplink;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
