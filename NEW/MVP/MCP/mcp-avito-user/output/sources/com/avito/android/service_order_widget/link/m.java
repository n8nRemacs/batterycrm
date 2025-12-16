package com.avito.android.service_order_widget.link;

import Cu0.InterfaceC13353a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.B2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.A;
import ru.avito.messenger.F0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: SendServiceOrderRequestLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/m;", "Lev/a;", "Lcom/avito/android/service_order_widget/link/SendServiceOrderRequestWithPhotoLink;", "Lcom/avito/android/service_order_widget/link/j;", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes3.dex */
public final class m extends AbstractC40161a<SendServiceOrderRequestWithPhotoLink> implements j {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f279021f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final A f279022g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final F0 f279023h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f279024i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_order_widget.domain.a f279025j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final R0 f279026k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f279027l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final a.i f279028m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13353a f279029n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f279030o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b f279031p;

    @Inject
    public m(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k A a12, @Y61.k F0 f02, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k C25719a c25719a, @Y61.k com.avito.android.service_order_widget.domain.a aVar, @Y61.k R0 r02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k a.i iVar, @Y61.k InterfaceC13353a interfaceC13353a, @Y61.k B2 b22, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f279021f = interfaceC47842z;
        this.f279022g = a12;
        this.f279023h = f02;
        this.f279024i = interfaceC35863o4;
        this.f279025j = aVar;
        this.f279026k = r02;
        this.f279027l = aVar2;
        this.f279028m = iVar;
        this.f279029n = interfaceC13353a;
        this.f279030o = interfaceC28373a;
        this.f279031p = new b(interfaceC47842z, a12, f02, interfaceC35863o4, c25719a, aVar, r02, aVar2, iVar, interfaceC13353a, b22, interfaceC28373a);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f279031p.c((SendServiceOrderRequestWithPhotoLink) deepLink);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f279031p.f278962p = this;
    }
}
