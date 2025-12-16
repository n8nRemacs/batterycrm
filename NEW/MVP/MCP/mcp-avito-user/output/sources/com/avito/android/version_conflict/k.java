package com.avito.android.version_conflict;

import aN0.C19794a;
import android.content.Context;
import cN0.C27072a;
import cN0.C27073b;
import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.ab_tests.configs.ForceUpdateProposalTestGroup;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35950u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import u3.InterfaceC48779c;
import ur.InterfaceC49101b;

/* compiled from: VersionConflictScreenOpenerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/version_conflict/k;", "Ldagger/internal/h;", "Lcom/avito/android/version_conflict/j;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final a f325918j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final S f325919a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC48779c<ForceUpdateProposalTestGroup>> f325920b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f325921c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f f325922d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<C19794a> f325923e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final c f325924f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C27073b f325925g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35950u> f325926h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ur.e f325927i;

    /* compiled from: VersionConflictScreenOpenerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/version_conflict/k$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k S s5, @Y61.k Provider provider, @Y61.k C30102l3 c30102l3, @Y61.k f fVar, @Y61.k Provider provider2, @Y61.k c cVar, @Y61.k C27073b c27073b, @Y61.k Provider provider3, @Y61.k ur.e eVar) {
        this.f325919a = s5;
        this.f325920b = provider;
        this.f325921c = c30102l3;
        this.f325922d = fVar;
        this.f325923e = provider2;
        this.f325924f = cVar;
        this.f325925g = c27073b;
        this.f325926h = provider3;
        this.f325927i = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        P p12 = (P) this.f325919a.get();
        InterfaceC48779c<ForceUpdateProposalTestGroup> interfaceC48779c = this.f325920b.get();
        Context context = (Context) this.f325921c.get();
        e eVar = (e) this.f325922d.get();
        C19794a c19794a = this.f325923e.get();
        b bVar = (b) this.f325924f.get();
        C27072a c27072a = (C27072a) this.f325925g.get();
        InterfaceC35950u interfaceC35950u = this.f325926h.get();
        InterfaceC49101b interfaceC49101b = (InterfaceC49101b) this.f325927i.get();
        f325918j.getClass();
        return new j(p12, interfaceC48779c, context, eVar, c19794a, bVar, c27072a, interfaceC35950u, interfaceC49101b);
    }
}
