package com.avito.android.buy_contact.deeplink;

import Fk.InterfaceC13809a;
import Y61.k;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BuyContactDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/buy_contact/deeplink/g;", "Ldagger/internal/h;", "Lcom/avito/android/buy_contact/deeplink/e;", "a", "_avito_job_buy-contact-link_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f108785e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C25721c f108786a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC13809a> f108787b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dagger.internal.f f108788c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<R0> f108789d;

    /* compiled from: BuyContactDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/buy_contact/deeplink/g$a;", "", "<init>", "()V", "_avito_job_buy-contact-link_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k C25721c c25721c, @k Provider provider, @k dagger.internal.f fVar, @k Provider provider2) {
        this.f108786a = c25721c;
        this.f108787b = provider;
        this.f108788c = fVar;
        this.f108789d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C25719a c25719a = (C25719a) this.f108786a.get();
        InterfaceC13809a interfaceC13809a = this.f108787b.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f108788c.get();
        R0 r02 = this.f108789d.get();
        f108785e.getClass();
        return new e(c25719a, interfaceC13809a, aVar, r02);
    }
}
