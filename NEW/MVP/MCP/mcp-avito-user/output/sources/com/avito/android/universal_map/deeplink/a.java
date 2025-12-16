package com.avito.android.universal_map.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.avito.android.deep_linking.links.CreateRouteLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CreateRouteLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/deeplink/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/CreateRouteLink;", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40162b<CreateRouteLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f304764d;

    /* compiled from: CreateRouteLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/universal_map/deeplink/a$a;", "", "<init>", "()V", "", "GEO_ROUTE_INTENT", "Ljava/lang/String;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.universal_map.deeplink.a$a, reason: collision with other inner class name */
    public static final class C9361a {
        public /* synthetic */ C9361a(C42822w c42822w) {
            this();
        }

        public C9361a() {
        }
    }

    static {
        new C9361a(null);
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a) {
        this.f304764d = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CreateRouteLink createRouteLink = (CreateRouteLink) deepLink;
        this.f304764d.R(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + createRouteLink.f133158b + ',' + createRouteLink.f133159c)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
