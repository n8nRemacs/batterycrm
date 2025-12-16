package F7;

import Y61.l;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AddCollectionsFavoritesResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LF7/b;", "", "", "", "counters", "", "isFavorite", "<init>", "(Ljava/util/Map;Ljava/lang/Boolean;)V", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    @c("counters")
    @l
    private final Map<String, String> counters;

    @c("isFavorite")
    @l
    private final Boolean isFavorite;

    public b(@l Map<String, String> map, @l Boolean bool) {
        this.counters = map;
        this.isFavorite = bool;
    }

    @l
    public final Map<String, String> a() {
        return this.counters;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Boolean getIsFavorite() {
        return this.isFavorite;
    }
}
