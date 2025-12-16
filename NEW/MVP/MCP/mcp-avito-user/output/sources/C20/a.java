package C20;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;

/* compiled from: ApiBulkMessagingBannerGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LC20/a;", "", "LC20/c;", AdFormat.BANNER, "", "ok", "<init>", "(LC20/c;Z)V", "LC20/c;", "a", "()LC20/c;", "Z", "b", "()Z", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    @k
    private final c banner;

    @com.google.gson.annotations.c("ok")
    private final boolean ok;

    public a(@k c cVar, boolean z12) {
        this.banner = cVar;
        this.ok = z12;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final c getBanner() {
        return this.banner;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getOk() {
        return this.ok;
    }
}
