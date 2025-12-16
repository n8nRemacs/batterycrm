package com.avito.android.deeplink_handler.app.handler;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics_adjust.C28537e;
import com.avito.android.analytics_adjust.InterfaceC28535c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.LogAdjustEventLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LogAdjustEventLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/F;", "Lev/a;", "Lcom/avito/android/deep_linking/links/LogAdjustEventLink;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class F extends AbstractC40161a<LogAdjustEventLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f134373f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f134374g;

    /* compiled from: LogAdjustEventLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/F$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deeplink_handler/app/handler/F$a$a;", "Lcom/avito/android/deeplink_handler/app/handler/F$a$b;", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: LogAdjustEventLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/F$a$a;", "Lcom/avito/android/deeplink_handler/app/handler/F$a;", "LJu/c$a;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.app.handler.F$a$a, reason: collision with other inner class name */
        public static final class C4039a extends a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4039a f134375b = new C4039a();

            public C4039a() {
                super(null);
            }
        }

        /* compiled from: LogAdjustEventLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/F$a$b;", "Lcom/avito/android/deeplink_handler/app/handler/F$a;", "LJu/c$b;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f134376b = new b();

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
    public F(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f134373f = interfaceC28373a;
        this.f134374g = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        LogAdjustEventLink logAdjustEventLink = (LogAdjustEventLink) deepLink;
        InterfaceC28535c interfaceC28535cA = C28537e.a(logAdjustEventLink.f133425b, new com.avito.android.analytics_adjust.q());
        interfaceC28535cA.d(logAdjustEventLink.f133426c);
        this.f134373f.c(interfaceC28535cA);
        DeepLink deepLink2 = logAdjustEventLink.f133427d;
        if (deepLink2 == null) {
            j(a.b.f134376b);
        } else {
            i(a.C4039a.f134375b, this.f134374g, deepLink2);
        }
    }
}
