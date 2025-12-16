package IL;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_profile_settings_show.IacProfileSettingsShowLink;
import com.avito.android.profile.deeplinks.IacProfilePhonesSettingsLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacProfileSettingsShowLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIL/a;", "Lev/a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_profile_settings_show/IacProfileSettingsShowLink;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40161a<IacProfileSettingsShowLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f8147f;

    @Inject
    public a(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f8147f = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        i(IacProfileSettingsShowLink.b.f168403b, this.f8147f, new IacProfilePhonesSettingsLink());
    }
}
