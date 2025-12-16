package com.avito.android.external_apps.deep_linking;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InAppBrowserLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/j;", "Ldagger/internal/h;", "Lcom/avito/android/external_apps/deep_linking/i;", "a", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f155046c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dv.b f155047a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C35868p2 f155048b;

    /* compiled from: InAppBrowserLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/j$a;", "", "<init>", "()V", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k dv.b bVar, @Y61.k C35868p2 c35868p2) {
        this.f155047a = bVar;
        this.f155048b = c35868p2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f155047a.get();
        InterfaceC35845m2 interfaceC35845m2 = (InterfaceC35845m2) this.f155048b.get();
        f155046c.getClass();
        return new i(interfaceC4053a, interfaceC35845m2);
    }
}
