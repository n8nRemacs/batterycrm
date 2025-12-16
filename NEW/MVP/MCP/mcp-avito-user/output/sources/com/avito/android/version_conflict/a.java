package com.avito.android.version_conflict;

import Tj0.C15370a;
import aN0.C19794a;
import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.remote.C34390u;
import com.avito.android.util.C;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import vz.InterfaceC49401b;

/* compiled from: CheckConfigTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/version_conflict/a;", "Ldagger/internal/h;", "Lcom/avito/android/version_conflict/CheckConfigTask;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements dagger.internal.h<CheckConfigTask> {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final C10069a f325855j = new C10069a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f325856a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<C34390u> f325857b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f325858c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C15370a f325859d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<C19794a> f325860e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final k f325861f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC49401b> f325862g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final S f325863h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f325864i;

    /* compiled from: CheckConfigTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/version_conflict/a$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.version_conflict.a$a, reason: collision with other inner class name */
    public static final class C10069a {
        public /* synthetic */ C10069a(C42822w c42822w) {
            this();
        }

        public C10069a() {
        }
    }

    public a(@Y61.k c cVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k C15370a c15370a, @Y61.k Provider provider3, @Y61.k k kVar, @Y61.k Provider provider4, @Y61.k S s5, @Y61.k Provider provider5) {
        this.f325856a = cVar;
        this.f325857b = provider;
        this.f325858c = provider2;
        this.f325859d = c15370a;
        this.f325860e = provider3;
        this.f325861f = kVar;
        this.f325862g = provider4;
        this.f325863h = s5;
        this.f325864i = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f325856a.get();
        C34390u c34390u = this.f325857b.get();
        C c12 = this.f325858c.get();
        this.f325859d.getClass();
        com.avito.android.remote.config.b bVar2 = new com.avito.android.remote.config.b();
        C19794a c19794a = this.f325860e.get();
        i iVar = (i) this.f325861f.get();
        InterfaceC49401b interfaceC49401b = this.f325862g.get();
        P p12 = (P) this.f325863h.get();
        R0 r02 = this.f325864i.get();
        f325855j.getClass();
        return new CheckConfigTask(bVar, c34390u, c12, bVar2, c19794a, iVar, interfaceC49401b, p12, r02);
    }
}
