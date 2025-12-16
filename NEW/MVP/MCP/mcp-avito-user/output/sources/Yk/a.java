package YK;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenLink;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_mic_request_screen.IacFinishedMicRequestScreenLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import mL.InterfaceC43977a;

/* compiled from: IacFinishedMicRequestScreenLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LYK/a;", "Lev/a;", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenLink;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40161a<IacFinishedMicRequestScreenLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f19439f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC43977a f19440g;

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC43977a interfaceC43977a) {
        this.f19439f = interfaceC4053a;
        this.f19440g = interfaceC43977a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f19440g.b(((IacFinishedMicRequestScreenLink) deepLink).toScreenArgument());
        j(IacFinishedFallbackScreenLink.b.f166823b);
    }
}
