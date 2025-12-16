package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.iac_dialer_models.abstract_module.IacItemInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacPeerInfo;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacMakeSupportCallLink;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.U;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import nJ.C44265D;

/* compiled from: IacMakeSupportCallLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/s;", "Lev/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s extends AbstractC40161a<IacMakeSupportCallLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f168640f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final XL.a f168641g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Context f168642h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final BL.a f168643i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final E f168644j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f168645k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f168646l;

    @Inject
    public s(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k XL.a aVar2, @Y61.k Context context, @Y61.k BL.a aVar3, @Y61.k E e12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f168640f = aVar;
        this.f168641g = aVar2;
        this.f168642h = context;
        this.f168643i = aVar3;
        this.f168644j = e12;
        this.f168645k = interfaceC35745a5;
        this.f168646l = interfaceC28373a;
    }

    public static final void k(s sVar, DeepLink deepLink) {
        if (deepLink == null) {
            sVar.j(IacMakeSupportCallLink.b.C4988b.f168691b);
            return;
        }
        sVar.f168646l.c(new C44265D());
        sVar.i(IacMakeSupportCallLink.b.c.f168692b, sVar.f168640f, deepLink);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacMakeSupportCallLink iacMakeSupportCallLink = (IacMakeSupportCallLink) deepLink;
        if (this.f168644j.a() == null) {
            j(IacMakeSupportCallLink.b.a.f168690b);
            return;
        }
        U uD2 = this.f168641g.d(new IacCallContext(AttachMenuItem.Support.KEY, new IacPeerInfo(null, AttachMenuItem.Support.KEY, this.f168642h.getString(R.string.iac_outgoing_call_ability_impl_iac_support_display_name), "", C42784z0.f406748b), new IacItemInfo("0", "", "", "", null, null, 32, null), null, null), iacMakeSupportCallLink.f168689c);
        InterfaceC35745a5 interfaceC35745a5 = this.f168645k;
        A1.e(uD2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()), new q(this, iacMakeSupportCallLink), new r(this, iacMakeSupportCallLink));
    }
}
