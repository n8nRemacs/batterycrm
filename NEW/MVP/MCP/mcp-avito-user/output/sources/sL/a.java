package SL;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacItemInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacSupportData;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartNewCallLink;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: IacMakeCallLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LSL/a;", "Lev/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink;", "a", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40161a<IacMakeCallLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f14907f;

    /* compiled from: IacMakeCallLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LSL/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: SL.a$a, reason: collision with other inner class name */
    public static final class C1006a {
        public /* synthetic */ C1006a(C42822w c42822w) {
            this();
        }

        public C1006a() {
        }
    }

    static {
        new C1006a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f14907f = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String str2;
        IacMakeCallLink iacMakeCallLink = (IacMakeCallLink) deepLink;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacMakeCallLinkHandler", "New deeplink in handler: " + iacMakeCallLink, null);
        IacCallInfo iacCallInfo = iacMakeCallLink.f168711b;
        IacItemInfo iacItemInfo = iacCallInfo.f166834d;
        IacMakeCallLink.b.AbstractC4992b.C4993b c4993b = new IacMakeCallLink.b.AbstractC4992b.C4993b(iacItemInfo != null ? iacItemInfo.f166858b : null);
        String str3 = iacCallInfo.f166833c.f166868b;
        IacItemInfo iacItemInfo2 = iacCallInfo.f166834d;
        Long lZ02 = (iacItemInfo2 == null || (str2 = iacItemInfo2.f166858b) == null) ? null : C43066x.z0(str2);
        IacSupportData iacSupportData = iacCallInfo.f166841k;
        i(c4993b, this.f14907f, new IacStartNewCallLink(iacCallInfo.f166832b, iacCallInfo.f166835e, iacCallInfo.f166837g, str3, iacCallInfo.f166836f, lZ02, iacSupportData != null ? iacSupportData.f166873b : null, C35755b0.c(P0.g(new Q("x", C35800g5.b(new C35792f5(iacCallInfo.f166843m))), new Q("video_call_type", iacCallInfo.f166844n)))));
    }
}
