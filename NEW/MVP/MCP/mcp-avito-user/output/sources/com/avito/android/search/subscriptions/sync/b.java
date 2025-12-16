package com.avito.android.search.subscriptions.sync;

import Cq0.C13343b;
import Go0.InterfaceC13902a;
import Y61.k;
import com.avito.android.account.G;
import com.avito.android.db.n;
import io.reactivex.rxjava3.internal.operators.observable.F;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchSubscriptionSyncInteractorImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/subscriptions/sync/b;", "Lcom/avito/android/search/subscriptions/sync/a;", "a", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.search.subscriptions.sync.a {

    /* renamed from: e, reason: collision with root package name */
    public static long f264006e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f264007f = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC13902a> f264008a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TV.c f264009b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final n f264010c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final G f264011d;

    /* compiled from: SearchSubscriptionSyncInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/subscriptions/sync/b$a;", "", "<init>", "()V", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k h31.e<InterfaceC13902a> eVar, @k TV.c cVar, @k n nVar, @k G g12) {
        this.f264008a = eVar;
        this.f264009b = cVar;
        this.f264010c = nVar;
        this.f264011d = g12;
    }

    @Override // com.avito.android.search.subscriptions.sync.a
    public final void a(long j12) {
        if (this.f264011d.i().f68044a.b()) {
            if (j12 != 2 && j12 != 0) {
                if (f.f264015a >= System.currentTimeMillis() - f264006e) {
                    return;
                }
            }
            f264006e = System.currentTimeMillis();
            new F(new C13343b(this, 11)).K(new c(this)).u0(new d(this), new e(this));
        }
    }
}
