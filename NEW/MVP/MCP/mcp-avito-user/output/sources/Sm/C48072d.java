package sM;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_util_deeplinks.public_module.run_once.RunOnceLink;
import com.avito.android.util.feature.OptionSet;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.reflect.n;

/* compiled from: RunOnceLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LsM/d;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/run_once/RunOnceLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sM.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48072d extends AbstractC40161a<RunOnceLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f437614f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final i f437615g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_util_deeplinks.impl_module.splitter.features.a f437616h;

    @Inject
    public C48072d(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k i iVar, @Y61.k com.avito.android.iac_util_deeplinks.impl_module.splitter.features.a aVar2) {
        this.f437614f = aVar;
        this.f437615g = iVar;
        this.f437616h = aVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        boolean zE2;
        RunOnceLink runOnceLink = (RunOnceLink) deepLink;
        com.avito.android.iac_util_deeplinks.impl_module.splitter.features.a aVar = this.f437616h;
        aVar.getClass();
        n<Object> nVar = com.avito.android.iac_util_deeplinks.impl_module.splitter.features.a.f169221d[0];
        String str2 = ((OptionSet) aVar.f169223c.a().invoke()).f318873b;
        if (L.f(str2, "key_exist")) {
            zE2 = true;
        } else if (L.f(str2, "key_not_exist")) {
            zE2 = false;
        } else {
            boolean zF2 = L.f(runOnceLink.f169326c, Boolean.TRUE);
            i iVar = this.f437615g;
            String str3 = runOnceLink.f169325b;
            if (zF2) {
                zE2 = iVar.c(str3);
                iVar.b(str3);
            } else {
                zE2 = iVar.e(str3);
                iVar.d(str3);
            }
        }
        DeepLink deepLink2 = zE2 ? runOnceLink.f169328e : runOnceLink.f169327d;
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f437614f;
        if (deepLink2 != null) {
            i(new RunOnceLink.b(), aVar2, deepLink2);
        } else {
            i(new RunOnceLink.b(), aVar2, new DeepLink[0]);
        }
    }
}
