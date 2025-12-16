package com.avito.android.comfortable_deal.deeplink;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ComfortableDealDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/k;", "Lev/a;", "Lcom/avito/android/comfortable_deal/deeplink/ComfortableDealDeeplink;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.comfortable_deal.deeplink.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29470k extends AbstractC40161a<ComfortableDealDeeplink> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f121958k = 0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f121959f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.webview.l f121960g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C25719a f121961h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f121962i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f121963j;

    /* compiled from: ComfortableDealDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/k$a;", "", "<init>", "()V", "", "MAV_HOST_URL", "Ljava/lang/String;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.deeplink.k$a */
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
    public C29470k(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.webview.l lVar, @Y61.k C25719a c25719a, @Y61.k com.avito.android.util.C c12, @Y61.k com.avito.android.P p12) {
        this.f121959f = interfaceC4053a;
        this.f121960g = lVar;
        this.f121961h = c25719a;
        this.f121962i = c12;
        this.f121963j = p12;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ComfortableDealDeeplink comfortableDealDeeplink = (ComfortableDealDeeplink) deepLink;
        this.f121961h.b(comfortableDealDeeplink, this, null, new l(this, comfortableDealDeeplink));
    }
}
