package H7;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: UpdateCollectionResponse.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LH7/b;", "", "", "", "avatar", "name", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "Ljava/util/Map;", "getAvatar", "()Ljava/util/Map;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    @com.google.gson.annotations.c("avatar")
    @l
    private final Map<String, String> avatar;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    public b(@l Map<String, String> map, @k String str) {
        this.avatar = map;
        this.name = str;
    }
}
