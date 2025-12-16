package iE0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ThemeSettingsLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ThemeSettingsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LiE0/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ThemeSettingsLink;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iE0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41275a extends AbstractC40162b<ThemeSettingsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f398453d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.settings.b f398454e;

    @Inject
    public C41275a(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.settings.b bVar) {
        this.f398453d = interfaceC4053a;
        this.f398454e = bVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f398453d.R(this.f398454e.a(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
