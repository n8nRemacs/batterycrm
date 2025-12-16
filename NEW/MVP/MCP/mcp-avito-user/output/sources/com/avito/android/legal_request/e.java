package com.avito.android.legal_request;

import Y61.k;
import com.avito.android.legal_request.mvi.i;
import com.avito.android.legal_request.mvi.j;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.h;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LegalRequestViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/legal_request/e;", "Ldagger/internal/h;", "Lcom/avito/android/legal_request/d;", "a", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f175249g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f175250a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<n.a> f175251b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<B> f175252c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<Set<FV0.h>> f175253d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C31144q0 f175254e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Provider<R0> f175255f;

    /* compiled from: LegalRequestViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/legal_request/e$a;", "", "<init>", "()V", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k j jVar, @k Provider provider, @k Provider provider2, @k Provider provider3, @k C31144q0 c31144q0, @k Provider provider4) {
        this.f175250a = jVar;
        this.f175251b = provider;
        this.f175252c = provider2;
        this.f175253d = provider3;
        this.f175254e = c31144q0;
        this.f175255f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f175250a.get();
        n.a aVar = this.f175251b.get();
        B b12 = this.f175252c.get();
        Set<FV0.h> set = this.f175253d.get();
        aU0.b bVar = (aU0.b) this.f175254e.get();
        R0 r02 = this.f175255f.get();
        f175249g.getClass();
        return new d(iVar, aVar, b12, set, bVar, r02);
    }
}
