package PE;

import Y61.k;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.deep_linking.links.Store;
import com.avito.android.forceupdate.domain.dto.UpdateSource;
import com.avito.android.util.C35853n2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ForceUpdateMarketIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPE/a;", "", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C35853n2 f12878a;

    @Inject
    public a(@k C35853n2 c35853n2) {
        this.f12878a = c35853n2;
    }

    @k
    public final Intent a(@k UpdateSource updateSource) {
        boolean z12 = updateSource instanceof UpdateSource.Official;
        C35853n2 c35853n2 = this.f12878a;
        if (z12) {
            return c35853n2.b(Store.f133676d);
        }
        if (updateSource instanceof UpdateSource.Custom) {
            return new Intent("android.intent.action.VIEW", Uri.parse(((UpdateSource.Custom) updateSource).f158465b));
        }
        if (updateSource instanceof UpdateSource.SelfUpdate) {
            return c35853n2.b(Store.f133676d);
        }
        throw new NoWhenBranchMatchedException();
    }
}
