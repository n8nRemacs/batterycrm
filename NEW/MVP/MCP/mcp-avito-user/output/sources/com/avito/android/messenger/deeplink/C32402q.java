package com.avito.android.messenger.deeplink;

import android.os.Bundle;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.deep_linking.links.ChannelCallLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelCallDeepLinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/q;", "Lev/a;", "Lcom/avito/android/deep_linking/links/ChannelCallLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.deeplink.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32402q extends AbstractC40161a<ChannelCallLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f195542f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.i f195543g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f195544h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f195545i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f195546j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f195547k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f195548l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f195549m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public String f195550n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195551o = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public C32402q(@Y61.k a.d dVar, @Y61.k a.i iVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC47842z interfaceC47842z, @N3.c @Y61.k InterfaceC35945t1<String> interfaceC35945t1, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k C30277e1 c30277e1) {
        this.f195542f = dVar;
        this.f195543g = iVar;
        this.f195544h = interfaceC35745a5;
        this.f195545i = aVar;
        this.f195546j = interfaceC47842z;
        this.f195547k = interfaceC35945t1;
        this.f195548l = interfaceC35741a1;
        this.f195549m = c30277e1;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ChannelCallLink channelCallLink = (ChannelCallLink) deepLink;
        this.f195551o.b(this.f195546j.getPhoneByChannelId(channelCallLink.f133092b, channelCallLink.f133094d).s(this.f195544h.e()).x(new C32386i(this), new C32388j(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f195551o.e();
    }

    @Override // ev.AbstractC40161a, com.avito.android.deeplink_handler.handler.lifecycle.c
    public final void nc() {
        String str = this.f195550n;
        if (str == null) {
            return;
        }
        this.f195550n = str;
        this.f195542f.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new C32400p(this, str));
    }
}
