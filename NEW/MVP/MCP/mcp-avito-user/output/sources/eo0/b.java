package EO0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.history.generated.api.get_wallet_history_v_2.HistoryItemV2;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetWalletHistoryV2Response.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LEO0/b;", "", "LEO0/c;", "events", "", "hasMore", "", "Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2;", "items", "", "key", "<init>", "(LEO0/c;ZLjava/util/List;Ljava/lang/String;)V", "LEO0/c;", "a", "()LEO0/c;", "Z", "getHasMore", "()Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    @com.google.gson.annotations.c("events")
    @k
    private final c events;

    @com.google.gson.annotations.c("has_more")
    private final boolean hasMore;

    @com.google.gson.annotations.c("items")
    @k
    private final List<HistoryItemV2> items;

    @com.google.gson.annotations.c("key")
    @l
    private final String key;

    public b(@k c cVar, boolean z12, @k List<HistoryItemV2> list, @l String str) {
        this.events = cVar;
        this.hasMore = z12;
        this.items = list;
        this.key = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final c getEvents() {
        return this.events;
    }

    @k
    public final List<HistoryItemV2> b() {
        return this.items;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
