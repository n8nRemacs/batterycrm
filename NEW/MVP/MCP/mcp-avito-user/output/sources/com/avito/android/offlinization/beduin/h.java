package com.avito.android.offlinization.beduin;

import dagger.internal.A;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import o40.InterfaceC44578a;

/* compiled from: BeduinPatternCacheProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/beduin/h;", "Ldagger/internal/h;", "Lcom/avito/android/offlinization/beduin/f;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f208550e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f208551a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o40.d f208552b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f208553c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final v40.d f208554d;

    /* compiled from: BeduinPatternCacheProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/beduin/h$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.k A a12, @Y61.k o40.d dVar, @Y61.k m mVar, @Y61.k v40.d dVar2) {
        this.f208551a = a12;
        this.f208552b = dVar;
        this.f208553c = mVar;
        this.f208554d = dVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f208551a.get();
        InterfaceC44578a interfaceC44578a = (InterfaceC44578a) this.f208552b.get();
        i iVar = (i) this.f208553c.get();
        this.f208554d.getClass();
        v40.c cVar = new v40.c();
        f208550e.getClass();
        return new f(set, interfaceC44578a, iVar, cVar);
    }
}
