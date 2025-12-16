package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallInfo;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacMakeCallInChannelMenuLink;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacMakeCallInChannelMenuLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/m;", "Lev/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeCallInChannelMenuLink;", "a", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m extends AbstractC40161a<IacMakeCallInChannelMenuLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f168628f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final MK.a f168629g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final BL.a f168630h;

    /* compiled from: IacMakeCallInChannelMenuLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public m(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k MK.a aVar2, @Y61.k BL.a aVar3) {
        this.f168628f = aVar;
        this.f168629g = aVar2;
        this.f168630h = aVar3;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacMakeCallInChannelMenuLink iacMakeCallInChannelMenuLink = (IacMakeCallInChannelMenuLink) deepLink;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacAbMakeCallInChannelMenuLinkHandler", "New deeplink in handler: " + iacMakeCallInChannelMenuLink, null);
        IacMakeCallLink iacMakeCallLink = new IacMakeCallLink(IacCallInfo.a(iacMakeCallInChannelMenuLink.f168686b, this.f168629g.a(), false, null, null, null, 8174));
        IacCallInfo iacCallInfo = iacMakeCallLink.f168711b;
        this.f168630h.P0(iacCallInfo.f166832b, iacCallInfo.f166836f);
        i(IacMakeCallInChannelMenuLink.b.a.f168687b, this.f168628f, iacMakeCallLink);
    }
}
