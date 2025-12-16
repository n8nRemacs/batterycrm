package uY;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: Api2NewDevelopmentsCatalogBuildingsByDevelopmentIdGetResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"LuY/e;", "", "", "count", "price", "roomType", "", "roomsNumberId", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "J", "d", "()J", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uY.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49001e {

    @com.google.gson.annotations.c("count")
    @l
    private final String count;

    @com.google.gson.annotations.c("price")
    @l
    private final String price;

    @com.google.gson.annotations.c("roomType")
    @k
    private final String roomType;

    @com.google.gson.annotations.c("roomsNumberId")
    private final long roomsNumberId;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink uri;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    public C49001e(@l String str, @l String str2, @k String str3, long j12, @k DeepLink deepLink, @l String str4) {
        this.count = str;
        this.price = str2;
        this.roomType = str3;
        this.roomsNumberId = j12;
        this.uri = deepLink;
        this.url = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getRoomType() {
        return this.roomType;
    }

    /* renamed from: d, reason: from getter */
    public final long getRoomsNumberId() {
        return this.roomsNumberId;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
