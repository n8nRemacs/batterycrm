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
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: MortgageApplicationProxyDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/deeplink/f;", "Lev/a;", "Lcom/avito/android/mortgage/deeplink/MortgageApplicationProxyLink;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.deeplink.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32591f extends AbstractC40161a<MortgageApplicationProxyLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.deeplink.domain.g f198842f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f198843g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f198844h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C25719a f198845i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f198846j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C43238h f198847k;

    /* compiled from: MortgageApplicationProxyDeeplinkHandler.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/deeplink/f$a;", "", "<init>", "()V", "a", "Lcom/avito/android/mortgage/deeplink/f$a$a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.deeplink.f$a */
    public static abstract class a {

        /* compiled from: MortgageApplicationProxyDeeplinkHandler.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/deeplink/f$a$a;", "Lcom/avito/android/mortgage/deeplink/f$a;", "LJu/c$a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage.deeplink.f$a$a, reason: collision with other inner class name */
        public static final class C5863a extends a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C5863a f198848b = new C5863a();

            public C5863a() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public C32591f(@Y61.k com.avito.android.mortgage.deeplink.domain.g gVar, @Y61.k a.g gVar2, @Y61.k a.i iVar, @Y61.k C25719a c25719a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02) {
        this.f198842f = gVar;
        this.f198843g = gVar2;
        this.f198844h = iVar;
        this.f198845i = c25719a;
        this.f198846j = aVar;
        this.f198847k = kotlinx.coroutines.U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MortgageApplicationProxyLink mortgageApplicationProxyLink = (MortgageApplicationProxyLink) deepLink;
        this.f198845i.b(mortgageApplicationProxyLink, this, null, new C32593h(this, mortgageApplicationProxyLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        kotlinx.coroutines.U.b(this.f198847k, null);
    }
}
