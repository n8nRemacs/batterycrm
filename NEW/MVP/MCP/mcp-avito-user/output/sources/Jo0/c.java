package JO0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WalletHistoryResponse.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LJO0/c;", "", "LJO0/a;", "events", "", "LJO0/b;", "items", "", "hasMore", "", "key", "<init>", "(LJO0/a;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "LJO0/a;", "a", "()LJO0/a;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    @com.google.gson.annotations.c("events")
    @l
    private final a events;

    @com.google.gson.annotations.c("has_more")
    @l
    private final Boolean hasMore;

    @com.google.gson.annotations.c("items")
    @l
    private final List<b> items;

    @com.google.gson.annotations.c("key")
    @l
    private final String key;

    public c(@l a aVar, @l List<b> list, @l Boolean bool, @l String str) {
        this.events = aVar;
        this.items = list;
        this.hasMore = bool;
        this.key = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final a getEvents() {
        return this.events;
    }

    @l
    public final List<b> b() {
        return this.items;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
