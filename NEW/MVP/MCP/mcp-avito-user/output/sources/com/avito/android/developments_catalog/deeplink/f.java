package com.avito.android.developments_catalog.deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DevelopmentsCatalogLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DevelopmentsCatalogLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_catalog/deeplink/f;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DevelopmentsCatalogLink;", "a", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends AbstractC40161a<DevelopmentsCatalogLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f139099f;

    /* compiled from: DevelopmentsCatalogLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_catalog/deeplink/f$a;", "", "<init>", "()V", "a", "b", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: DevelopmentsCatalogLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_catalog/deeplink/f$a$a;", "LJu/c$b;", "LJu/a$a;", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_catalog.deeplink.f$a$a, reason: collision with other inner class name */
        public static final class C4193a implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4193a f139100b = new C4193a();
        }

        /* compiled from: DevelopmentsCatalogLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_catalog/deeplink/f$a$b;", "LJu/c$a;", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f139101b = new b();
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public f(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f139099f = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DeepLink deepLink2 = ((DevelopmentsCatalogLink) deepLink).f133250f;
        if (deepLink2 == null) {
            j(a.C4193a.f139100b);
        } else {
            i(a.b.f139101b, this.f139099f, deepLink2);
        }
    }
}
