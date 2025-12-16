package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.launch_dialer;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartRecallFromSystemApiLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import zL.InterfaceC50481a;

/* compiled from: IacStartRecallFromSystemApiLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/launch_dialer/h;", "Lev/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartRecallFromSystemApiLink;", "a", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends AbstractC40161a<IacStartRecallFromSystemApiLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final NK.a f168611f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C25719a f168612g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50481a f168613h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final PK.a f168614i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.i f168615j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final MK.a f168616k;

    /* compiled from: IacStartRecallFromSystemApiLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/launch_dialer/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public h(@Y61.k NK.a aVar, @Y61.k C25719a c25719a, @Y61.k InterfaceC50481a interfaceC50481a, @Y61.k PK.a aVar2, @Y61.k a.i iVar, @Y61.k MK.a aVar3) {
        this.f168611f = aVar;
        this.f168612g = c25719a;
        this.f168613h = interfaceC50481a;
        this.f168614i = aVar2;
        this.f168615j = iVar;
        this.f168616k = aVar3;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacStartRecallFromSystemApiLink iacStartRecallFromSystemApiLink = (IacStartRecallFromSystemApiLink) deepLink;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacStartRecallFromSystemApiLinkHandler", "New deeplink in handler: " + iacStartRecallFromSystemApiLink, null);
        if (com.avito.android.iac_outgoing_call_ability.impl_module.utils.f.a(this.f168613h, this.f168614i, this.f168615j)) {
            j(IacStartRecallFromSystemApiLink.b.a.f168709b);
            return;
        }
        this.f168612g.a(iacStartRecallFromSystemApiLink, this, AuthSource.f92682Q, new i(this, iacStartRecallFromSystemApiLink));
    }
}
