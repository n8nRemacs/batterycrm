package com.avito.android.auto_contacts.link;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoContactsPackagesGetLinkHandler_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/link/c;", "Ldagger/internal/h;", "Lcom/avito/android/auto_contacts/link/b;", "a", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f94893f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.auto_contacts.domain.c f94894a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dv.b f94895b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dv.b f94896c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final dagger.internal.f f94897d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<R0> f94898e;

    /* compiled from: AutoContactsPackagesGetLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/link/c$a;", "", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k com.avito.android.auto_contacts.domain.c cVar, @k dv.b bVar, @k dv.b bVar2, @k dagger.internal.f fVar, @k Provider provider) {
        this.f94894a = cVar;
        this.f94895b = bVar;
        this.f94896c = bVar2;
        this.f94897d = fVar;
        this.f94898e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.auto_contacts.domain.b bVar = (com.avito.android.auto_contacts.domain.b) this.f94894a.get();
        a.g gVar = (a.g) this.f94895b.get();
        a.i iVar = (a.i) this.f94896c.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f94897d.get();
        R0 r02 = this.f94898e.get();
        f94893f.getClass();
        return new b(bVar, gVar, iVar, aVar, r02);
    }
}
