package com.avito.android.extended_profile_phone_dialog.deep_linking;

import Y61.k;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.extended_profile_phone_dialog.g;
import com.avito.android.remote.analytics.n;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedProfilePhoneRequestLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/deep_linking/f;", "Ldagger/internal/h;", "Lcom/avito/android/extended_profile_phone_dialog/deep_linking/d;", "a", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements h<d> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f151591h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f151592a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dv.b f151593b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.extended_profile_phone_dialog.k f151594c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final dagger.internal.f f151595d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<InterfaceC35745a5> f151596e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C25721c f151597f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Provider<n> f151598g;

    /* compiled from: ExtendedProfilePhoneRequestLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/deep_linking/f$a;", "", "<init>", "()V", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k dv.b bVar, @k dv.b bVar2, @k com.avito.android.extended_profile_phone_dialog.k kVar, @k dagger.internal.f fVar, @k Provider provider, @k C25721c c25721c, @k Provider provider2) {
        this.f151592a = bVar;
        this.f151593b = bVar2;
        this.f151594c = kVar;
        this.f151595d = fVar;
        this.f151596e = provider;
        this.f151597f = c25721c;
        this.f151598g = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.g gVar = (a.g) this.f151592a.get();
        a.i iVar = (a.i) this.f151593b.get();
        g gVar2 = (g) this.f151594c.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f151595d.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f151596e.get();
        C25719a c25719a = (C25719a) this.f151597f.get();
        n nVar = this.f151598g.get();
        f151591h.getClass();
        return new d(gVar, iVar, gVar2, aVar, interfaceC35745a5, c25719a, nVar);
    }
}
