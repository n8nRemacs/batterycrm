package com.avito.android.blocked_ip.deep_linking;

import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.help_center.C30753j;
import com.avito.android.help_center.InterfaceC30751h;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BlockedIpScreenLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blocked_ip/deep_linking/e;", "Ldagger/internal/h;", "Lcom/avito/android/blocked_ip/deep_linking/a;", "a", "_avito_blocked-ip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements h<com.avito.android.blocked_ip.deep_linking.a> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f105352d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f105353a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C30753j f105354b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dv.b f105355c;

    /* compiled from: BlockedIpScreenLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blocked_ip/deep_linking/e$a;", "", "<init>", "()V", "_avito_blocked-ip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k dv.b bVar, @k C30753j c30753j, @k dv.b bVar2) {
        this.f105353a = bVar;
        this.f105354b = c30753j;
        this.f105355c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.d dVar = (a.d) this.f105353a.get();
        InterfaceC30751h interfaceC30751h = (InterfaceC30751h) this.f105354b.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f105355c.get();
        f105352d.getClass();
        return new com.avito.android.blocked_ip.deep_linking.a(dVar, interfaceC30751h, interfaceC4053a);
    }
}
