package No0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001c"}, d2 = {"LNo0/d;", "", "", "id", "", "title", "Lcom/avito/android/remote/model/Image;", "imageBySizes", MessageBody.SystemMessageBody.Platform.Bubble.Item.OLD_PRICE_STRING, "locationWithMetro", "urlPath", MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH, "<init>", "(JLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "getImageBySizes", "()Lcom/avito/android/remote/model/Image;", "getOldPriceString", "getLocationWithMetro", "getUrlPath", "getUriPath", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d {

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("imageBySizes")
    @l
    private final Image imageBySizes;

    @com.google.gson.annotations.c("locationWithMetro")
    @k
    private final String locationWithMetro;

    @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.Bubble.Item.OLD_PRICE_STRING)
    @k
    private final String oldPriceString;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH)
    @k
    private final String uriPath;

    @com.google.gson.annotations.c("urlPath")
    @k
    private final String urlPath;

    /* compiled from: CreateDiscountDispatchResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"LNo0/d$a;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;", "IMAGE_BY_SIZES", "LOCATION_WITH_METRO", "OLD_PRICE_STRING", "TITLE", "URI_PATH", "URL_PATH", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public d(long j12, @k String str, @l Image image, @k String str2, @k String str3, @k String str4, @k String str5) {
        this.id = j12;
        this.title = str;
        this.imageBySizes = image;
        this.oldPriceString = str2;
        this.locationWithMetro = str3;
        this.urlPath = str4;
        this.uriPath = str5;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.id == dVar.id && L.f(this.title, dVar.title) && L.f(this.imageBySizes, dVar.imageBySizes) && L.f(this.oldPriceString, dVar.oldPriceString) && L.f(this.locationWithMetro, dVar.locationWithMetro) && L.f(this.urlPath, dVar.urlPath) && L.f(this.uriPath, dVar.uriPath);
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.id) * 31, 31, this.title);
        Image image = this.imageBySizes;
        return this.uriPath.hashCode() + H.d(H.d(H.d((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.oldPriceString), 31, this.locationWithMetro), 31, this.urlPath);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemInfo(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", imageBySizes=");
        sb2.append(this.imageBySizes);
        sb2.append(", oldPriceString=");
        sb2.append(this.oldPriceString);
        sb2.append(", locationWithMetro=");
        sb2.append(this.locationWithMetro);
        sb2.append(", urlPath=");
        sb2.append(this.urlPath);
        sb2.append(", uriPath=");
        return C22026a.c(sb2, this.uriPath, ')');
    }
}
