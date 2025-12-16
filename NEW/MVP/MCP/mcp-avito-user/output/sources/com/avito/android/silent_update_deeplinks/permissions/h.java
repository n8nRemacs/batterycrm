package com.avito.android.silent_update_deeplinks.permissions;

import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30101l2;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SilentUpdatePermissionsLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/silent_update_deeplinks/permissions/h;", "Ldagger/internal/h;", "Lcom/avito/android/silent_update_deeplinks/permissions/g;", "a", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f283769e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f283770a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dv.b f283771b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C30101l2 f283772c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<R0> f283773d;

    /* compiled from: SilentUpdatePermissionsLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/silent_update_deeplinks/permissions/h$a;", "", "<init>", "()V", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@k dv.b bVar, @k dv.b bVar2, @k C30101l2 c30101l2, @k Provider provider) {
        this.f283770a = bVar;
        this.f283771b = bVar2;
        this.f283772c = c30101l2;
        this.f283773d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.b bVar = (a.b) this.f283770a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f283771b.get();
        com.avito.android.silent_update.permissions.c cVar = (com.avito.android.silent_update.permissions.c) this.f283772c.get();
        R0 r02 = this.f283773d.get();
        f283769e.getClass();
        return new g(bVar, interfaceC4053a, cVar, r02);
    }
}
