package com.avito.android.deeplink_handler.app.handler;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35755b0;
import ev.AbstractC40161a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickStreamLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/g;", "Lev/a;", "Lcom/avito/android/deep_linking/links/ClickStreamLink;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_handler.app.handler.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29789g extends AbstractC40161a<ClickStreamLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f134421f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f134422g;

    /* compiled from: ClickStreamLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/g$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deeplink_handler/app/handler/g$a$a;", "Lcom/avito/android/deeplink_handler/app/handler/g$a$b;", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.app.handler.g$a */
    public static abstract class a {

        /* compiled from: ClickStreamLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/g$a$a;", "Lcom/avito/android/deeplink_handler/app/handler/g$a;", "LJu/c$a;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.app.handler.g$a$a, reason: collision with other inner class name */
        public static final class C4041a extends a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4041a f134423b = new C4041a();

            public C4041a() {
                super(null);
            }
        }

        /* compiled from: ClickStreamLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/g$a$b;", "Lcom/avito/android/deeplink_handler/app/handler/g$a;", "LJu/c$b;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.app.handler.g$a$b */
        public static final class b extends a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f134424b = new b();

            public b() {
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
    public C29789g(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f134421f = interfaceC28373a;
        this.f134422g = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ClickStreamLink clickStreamLink = (ClickStreamLink) deepLink;
        Map<String, String> mapC = clickStreamLink.f133109d;
        if (mapC == null) {
            mapC = P0.c();
        }
        this.f134421f.c(new ParametrizedClickStreamEvent(clickStreamLink.f133107b, clickStreamLink.f133108c, C35755b0.c(mapC), null, 8, null));
        DeepLink deepLink2 = clickStreamLink.f133110e;
        if (deepLink2 == null) {
            j(a.b.f134424b);
        } else {
            i(a.C4041a.f134423b, this.f134422g, deepLink2);
        }
    }
}
