package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacCanRecallLink;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacCanRecallLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/d;", "Lev/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacCanRecallLink;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends AbstractC40161a<IacCanRecallLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final XL.a f168572f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C25719a f168573g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f168574h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.g f168575i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f168576j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.z f168577k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Resources f168578l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final AW.e f168579m = new AW.e("IacCanRecallLinkHandler", AW.f.f434a);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f168580n = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public d(@Y61.k XL.a aVar, @Y61.k C25719a c25719a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k a.g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.permissions.z zVar, @Y61.k Resources resources) {
        this.f168572f = aVar;
        this.f168573g = c25719a;
        this.f168574h = aVar2;
        this.f168575i = gVar;
        this.f168576j = interfaceC35745a5;
        this.f168577k = zVar;
        this.f168578l = resources;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacCanRecallLink iacCanRecallLink = (IacCanRecallLink) deepLink;
        AW.e.a(this.f168579m, "New deeplink in handler: " + iacCanRecallLink);
        this.f168573g.a(iacCanRecallLink, this, AuthSource.f92682Q, new C30924c(this, iacCanRecallLink));
    }
}
