package com.avito.android.mortgage.deeplink;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.C43238h;
import t00.InterfaceC48454a;

/* compiled from: MortgageApplicationsListDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/deeplink/k;", "Lev/a;", "Lcom/avito/android/mortgage/deeplink/MortgageApplicationsListLink;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.deeplink.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32596k extends AbstractC40161a<MortgageApplicationsListLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f198863f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48454a f198864g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.deeplink.domain.i f198865h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.g f198866i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.i f198867j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C25719a f198868k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f198869l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C43238h f198870m;

    /* compiled from: MortgageApplicationsListDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/deeplink/k$a;", "", "a", "b", "Lcom/avito/android/mortgage/deeplink/k$a$a;", "Lcom/avito/android/mortgage/deeplink/k$a$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.deeplink.k$a */
    public interface a {

        /* compiled from: MortgageApplicationsListDeeplinkHandler.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/deeplink/k$a$a;", "Lcom/avito/android/mortgage/deeplink/k$a;", "LJu/c$a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage.deeplink.k$a$a, reason: collision with other inner class name */
        public static final class C5864a implements a, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C5864a f198871b = new C5864a();
        }

        /* compiled from: MortgageApplicationsListDeeplinkHandler.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/deeplink/k$a$b;", "Lcom/avito/android/mortgage/deeplink/k$a;", "LJu/c$a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage.deeplink.k$a$b */
        public static final class b implements a, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f198872b = new b();
        }
    }

    @Inject
    public C32596k(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC48454a interfaceC48454a, @Y61.k com.avito.android.mortgage.deeplink.domain.i iVar, @Y61.k a.g gVar, @Y61.k a.i iVar2, @Y61.k C25719a c25719a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02) {
        this.f198863f = interfaceC4053a;
        this.f198864g = interfaceC48454a;
        this.f198865h = iVar;
        this.f198866i = gVar;
        this.f198867j = iVar2;
        this.f198868k = c25719a;
        this.f198869l = aVar;
        this.f198870m = kotlinx.coroutines.U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C32598m c32598m = new C32598m(this);
        this.f198868k.b((MortgageApplicationsListLink) deepLink, this, null, c32598m);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        kotlinx.coroutines.U.b(this.f198870m, null);
    }
}
