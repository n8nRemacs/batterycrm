package com.avito.android.offlinization;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mj0.C44089b;
import og0.InterfaceC44773a;
import s40.InterfaceC47996c;
import w40.InterfaceC49441a;

/* compiled from: OfflinizationInterceptorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/w;", "Ldagger/internal/h;", "Lcom/avito/android/offlinization/u;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<u> {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final a f208643j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<r40.f> f208644a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC49441a> f208645b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final s40.e f208646c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f208647d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f208648e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C44089b f208649f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f208650g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final r f208651h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final v40.d f208652i;

    /* compiled from: OfflinizationInterceptorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/w$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public w(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k s40.e eVar, @Y61.k Provider provider3, @Y61.k dagger.internal.f fVar, @Y61.k C44089b c44089b, @Y61.k dagger.internal.f fVar2, @Y61.k r rVar, @Y61.k v40.d dVar) {
        this.f208644a = provider;
        this.f208645b = provider2;
        this.f208646c = eVar;
        this.f208647d = provider3;
        this.f208648e = fVar;
        this.f208649f = c44089b;
        this.f208650g = fVar2;
        this.f208651h = rVar;
        this.f208652i = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        r40.f fVar = this.f208644a.get();
        InterfaceC49441a interfaceC49441a = this.f208645b.get();
        InterfaceC47996c interfaceC47996c = (InterfaceC47996c) this.f208646c.get();
        R0 r02 = this.f208647d.get();
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f208648e));
        InterfaceC44773a interfaceC44773a = (InterfaceC44773a) this.f208649f.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f208650g.get();
        p pVar = (p) this.f208651h.get();
        this.f208652i.getClass();
        v40.c cVar = new v40.c();
        f208643j.getClass();
        return new u(fVar, interfaceC49441a, interfaceC47996c, r02, eVarA, interfaceC44773a, interfaceC28373a, pVar, cVar);
    }
}
