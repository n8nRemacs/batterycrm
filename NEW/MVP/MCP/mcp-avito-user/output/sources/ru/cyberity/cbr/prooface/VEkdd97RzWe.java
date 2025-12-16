package ru.cyberity.cbr.prooface;

import X41.n;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import ru.cyberity.log.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/prooface/VEkdd97RzWe;", "", "<init>", "()V", "", "tag", "message", "", "exception", "Lkotlin/G0;", "AnZ4ntgRZiVOQFYAd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class VEkdd97RzWe {

    @k
    public static final VEkdd97RzWe AnZ4ntgRZiVOQFYAd = new VEkdd97RzWe();

    private VEkdd97RzWe() {
    }

    public static /* synthetic */ void AnZ4ntgRZiVOQFYAd(String str, String str2, Throwable th2, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        AnZ4ntgRZiVOQFYAd(str, str2, th2);
    }

    @n
    public static final void AnZ4ntgRZiVOQFYAd(@k String tag, @k String message, @l Throwable exception) {
        a.f436064a.a("CyberityProoface").d(tag, message, exception);
    }
}
