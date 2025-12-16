package com.avito.android.offlinization.beduin;

import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.ab_tests.configs.BeduinPatternCachingTestGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import o40.InterfaceC44578a;
import t3.X;

/* compiled from: BeduinCacheStarter_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/beduin/d;", "Ldagger/internal/h;", "Lcom/avito/android/offlinization/beduin/c;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f208536g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u40.g f208537a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f208538b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final K1 f208539c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final X f208540d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final o40.d f208541e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final v40.d f208542f;

    /* compiled from: BeduinCacheStarter_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/beduin/d$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k u40.g gVar, @Y61.k h hVar, @Y61.k K1 k12, @Y61.k X x12, @Y61.k o40.d dVar, @Y61.k v40.d dVar2) {
        this.f208537a = gVar;
        this.f208538b = hVar;
        this.f208539c = k12;
        this.f208540d = x12;
        this.f208541e = dVar;
        this.f208542f = dVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = (p) this.f208537a.get();
        I1 i12 = (I1) this.f208539c.get();
        BeduinPatternCachingTestGroup beduinPatternCachingTestGroup = (BeduinPatternCachingTestGroup) this.f208540d.get();
        InterfaceC44578a interfaceC44578a = (InterfaceC44578a) this.f208541e.get();
        this.f208542f.getClass();
        v40.c cVar = new v40.c();
        f208536g.getClass();
        return new c(pVar, this.f208538b, i12, beduinPatternCachingTestGroup, interfaceC44578a, cVar);
    }
}
