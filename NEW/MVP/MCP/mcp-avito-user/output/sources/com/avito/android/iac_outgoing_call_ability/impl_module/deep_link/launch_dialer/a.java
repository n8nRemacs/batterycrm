package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.launch_dialer;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartNewCallLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import zL.InterfaceC50481a;

/* compiled from: IacStartNewCallLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/launch_dialer/a;", "Lev/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartNewCallLink;", "a", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40161a<IacStartNewCallLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final NK.a f168595f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C25719a f168596g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50481a f168597h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final PK.a f168598i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.i f168599j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final MK.a f168600k;

    /* compiled from: IacStartNewCallLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/launch_dialer/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.launch_dialer.a$a, reason: collision with other inner class name */
    public static final class C4985a {
        public /* synthetic */ C4985a(C42822w c42822w) {
            this();
        }

        public C4985a() {
        }
    }

    static {
        new C4985a(null);
    }

    @Inject
    public a(@Y61.k NK.a aVar, @Y61.k C25719a c25719a, @Y61.k InterfaceC50481a interfaceC50481a, @Y61.k PK.a aVar2, @Y61.k a.i iVar, @Y61.k MK.a aVar3) {
        this.f168595f = aVar;
        this.f168596g = c25719a;
        this.f168597h = interfaceC50481a;
        this.f168598i = aVar2;
        this.f168599j = iVar;
        this.f168600k = aVar3;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacStartNewCallLink iacStartNewCallLink = (IacStartNewCallLink) deepLink;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacStartNewCallLinkHandler", "New deeplink in handler: " + iacStartNewCallLink, null);
        if (com.avito.android.iac_outgoing_call_ability.impl_module.utils.f.a(this.f168597h, this.f168598i, this.f168599j)) {
            j(IacStartNewCallLink.b.a.f168704b);
            return;
        }
        this.f168596g.a(iacStartNewCallLink, this, AuthSource.f92682Q, new b(this, iacStartNewCallLink));
    }
}
