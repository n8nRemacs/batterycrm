package hL;

import Ju.InterfaceC14249c;
import Y61.k;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_dialer_root.public_module.deeplink.IacLauncherIntentLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacLauncherIntentLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LhL/a;", "Lev/b;", "Lcom/avito/android/iac_dialer_root/public_module/deeplink/IacLauncherIntentLink;", "_avito_iac-dialer-root_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hL.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40842a extends AbstractC40162b<IacLauncherIntentLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f397177d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Application f397178e;

    @Inject
    public C40842a(@k a.InterfaceC4053a interfaceC4053a, @k Application application) {
        this.f397177d = interfaceC4053a;
        this.f397178e = application;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        boolean z12 = ((IacLauncherIntentLink) deepLink).f166882b;
        a.InterfaceC4053a interfaceC4053a = this.f397177d;
        if (z12) {
            interfaceC4053a.s1();
        }
        interfaceC4053a.R(new Intent().setClassName(this.f397178e, "com.avito.android.Launcher").setAction("android.intent.action.MAIN").setFlags(268435456).addCategory("android.intent.category.LAUNCHER"), com.avito.android.deeplink_handler.view.b.f134588l);
        return IacLauncherIntentLink.b.a.f166883b;
    }
}
