package cp0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;

/* compiled from: ApiCreateDispatchVasV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcp0/f;", "", "", "id", "Lcom/avito/android/remote/model/Image;", "imageBySizes", "", "locationWithMetro", MessageBody.SystemMessageBody.Platform.Bubble.Item.OLD_PRICE_STRING, "title", MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH, "urlPath", "<init>", "(JLcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "J", "a", "()J", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "e", "f", "g", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cp0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39395f {

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("imageBySizes")
    @Y61.k
    private final Image imageBySizes;

    @com.google.gson.annotations.c("locationWithMetro")
    @Y61.k
    private final String locationWithMetro;

    @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.Bubble.Item.OLD_PRICE_STRING)
    @Y61.k
    private final String oldPriceString;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH)
    @Y61.k
    private final String uriPath;

    @com.google.gson.annotations.c("urlPath")
    @Y61.k
    private final String urlPath;

    public C39395f(long j12, @Y61.k Image image, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5) {
        this.id = j12;
        this.imageBySizes = image;
        this.locationWithMetro = str;
        this.oldPriceString = str2;
        this.title = str3;
        this.uriPath = str4;
        this.urlPath = str5;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final Image getImageBySizes() {
        return this.imageBySizes;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getLocationWithMetro() {
        return this.locationWithMetro;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getOldPriceString() {
        return this.oldPriceString;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getUriPath() {
        return this.uriPath;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getUrlPath() {
        return this.urlPath;
    }
}
