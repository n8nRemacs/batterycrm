package hP0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: WalletPinCreationResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LhP0/k;", "", "", ContextActionHandler.Link.URL, "", "_params", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/Map;", "get_params", "()Ljava/util/Map;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k {

    @com.google.gson.annotations.c("params")
    @Y61.l
    private final Map<String, String> _params;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.k
    private final String url;

    public k(@Y61.k String str, @Y61.l Map<String, String> map) {
        this.url = str;
        this._params = map;
    }

    @Y61.k
    public final Map<String, String> a() {
        Map<String, String> map = this._params;
        return map == null ? P0.c() : map;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
