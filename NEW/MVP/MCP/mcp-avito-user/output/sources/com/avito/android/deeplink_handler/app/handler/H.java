package com.avito.android.deeplink_handler.app.handler;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.LogFirebaseEventLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LogFirebaseEventLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/H;", "Lev/a;", "Lcom/avito/android/deep_linking/links/LogFirebaseEventLink;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class H extends AbstractC40161a<LogFirebaseEventLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f134380f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f134381g;

    /* compiled from: LogFirebaseEventLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/H$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deeplink_handler/app/handler/H$a$a;", "Lcom/avito/android/deeplink_handler/app/handler/H$a$b;", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: LogFirebaseEventLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/H$a$a;", "Lcom/avito/android/deeplink_handler/app/handler/H$a;", "LJu/c$a;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.app.handler.H$a$a, reason: collision with other inner class name */
        public static final class C4040a extends a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4040a f134382b = new C4040a();

            public C4040a() {
                super(null);
            }
        }

        /* compiled from: LogFirebaseEventLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/H$a$b;", "Lcom/avito/android/deeplink_handler/app/handler/H$a;", "LJu/c$b;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f134383b = new b();

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
    public H(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f134380f = interfaceC28373a;
        this.f134381g = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        LogFirebaseEventLink logFirebaseEventLink = (LogFirebaseEventLink) deepLink;
        this.f134380f.c(Qc.h.a(logFirebaseEventLink.f133428b, logFirebaseEventLink.f133429c));
        DeepLink deepLink2 = logFirebaseEventLink.f133430d;
        if (deepLink2 == null) {
            j(a.b.f134383b);
        } else {
            i(a.C4040a.f134382b, this.f134381g, deepLink2);
        }
    }
}
