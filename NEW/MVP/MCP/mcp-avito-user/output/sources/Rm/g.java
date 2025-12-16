package rM;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_util_deeplinks.public_module.control_flow.SetExecutableArgsLink;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SetExecutableArgsLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LrM/g;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/control_flow/SetExecutableArgsLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends AbstractC40161a<SetExecutableArgsLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f429764f;

    @Inject
    public g(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f429764f = aVar;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SetExecutableArgsLink setExecutableArgsLink = (SetExecutableArgsLink) deepLink;
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : setExecutableArgsLink.f169292c.entrySet()) {
            String str2 = (String) entry.getKey();
            DeepLink deepLink2 = (DeepLink) entry.getValue();
            bundle2.putParcelable(str2, deepLink2);
            V2.f318762a.c("SetExecutableArgsLinkHandler", "key=" + str2 + ": " + deepLink2, null);
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f429764f;
        aVar.Qb(bundle2);
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("run=");
        DeepLink deepLink3 = setExecutableArgsLink.f169291b;
        sb2.append(deepLink3);
        v22.c("SetExecutableArgsLinkHandler", sb2.toString(), null);
        i(SetExecutableArgsLink.b.f169293b, aVar, deepLink3);
    }
}
