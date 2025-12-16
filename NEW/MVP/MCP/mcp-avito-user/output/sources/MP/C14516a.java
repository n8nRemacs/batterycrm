package Mp;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
@P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LMp/a;", "", "", AddressParameter.TYPE, "", "id", "", "image", "price", "", "LMp/m;", "stats", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;JLjava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "J", "b", "()J", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "f", "Lcom/avito/android/deep_linking/links/DeepLink;", "g", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14516a {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @Y61.k
    private final String address;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final Map<String, String> image;

    @com.google.gson.annotations.c("price")
    @Y61.l
    private final String price;

    @com.google.gson.annotations.c("stats")
    @Y61.l
    private final List<m> stats;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.k
    private final DeepLink url;

    public C14516a(@Y61.k String str, long j12, @Y61.l Map<String, String> map, @Y61.l String str2, @Y61.l List<m> list, @Y61.k String str3, @Y61.k DeepLink deepLink) {
        this.address = str;
        this.id = j12;
        this.image = map;
        this.price = str2;
        this.stats = list;
        this.title = str3;
        this.url = deepLink;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Y61.l
    public final Map<String, String> c() {
        return this.image;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Y61.l
    public final List<m> e() {
        return this.stats;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final DeepLink getUrl() {
        return this.url;
    }
}
