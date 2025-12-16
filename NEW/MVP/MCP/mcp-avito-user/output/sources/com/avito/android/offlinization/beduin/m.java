package com.avito.android.offlinization.beduin;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import p40.C46893d;
import p40.InterfaceC46890a;

/* compiled from: BeduinPatternCacheStorageImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/beduin/m;", "Ldagger/internal/h;", "Lcom/avito/android/offlinization/beduin/j;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<j> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f208560c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u40.g f208561a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C46893d f208562b;

    /* compiled from: BeduinPatternCacheStorageImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/beduin/m$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(@Y61.k u40.g gVar, @Y61.k C46893d c46893d) {
        this.f208561a = gVar;
        this.f208562b = c46893d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = (p) this.f208561a.get();
        InterfaceC46890a interfaceC46890a = (InterfaceC46890a) this.f208562b.get();
        f208560c.getClass();
        return new j(pVar, interfaceC46890a);
    }
}
