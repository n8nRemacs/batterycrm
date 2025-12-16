package JO0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: WalletHistoryResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LJO0/a;", "", "LCO0/a;", "historyPageLoad", "historyItemClick", "<init>", "(LCO0/a;LCO0/a;)V", "LCO0/a;", "b", "()LCO0/a;", "a", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    @com.google.gson.annotations.c("on_click")
    @l
    private final CO0.a historyItemClick;

    @com.google.gson.annotations.c("on_page_load")
    @l
    private final CO0.a historyPageLoad;

    public a(@l CO0.a aVar, @l CO0.a aVar2) {
        this.historyPageLoad = aVar;
        this.historyItemClick = aVar2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final CO0.a getHistoryItemClick() {
        return this.historyItemClick;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final CO0.a getHistoryPageLoad() {
        return this.historyPageLoad;
    }
}
