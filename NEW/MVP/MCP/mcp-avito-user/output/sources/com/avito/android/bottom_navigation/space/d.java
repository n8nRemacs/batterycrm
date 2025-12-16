package com.avito.android.bottom_navigation.space;

import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BottomNavigationCurrentSpaceProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/space/d;", "Ldagger/internal/h;", "Lcom/avito/android/bottom_navigation/space/b;", "a", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f107075c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<id.j> f107076a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f107077b;

    /* compiled from: BottomNavigationCurrentSpaceProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/space/d$a;", "", "<init>", "()V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k u uVar, @Y61.k Provider provider) {
        this.f107076a = provider;
        this.f107077b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        id.j jVar = this.f107076a.get();
        f fVar = (f) this.f107077b.get();
        f107075c.getClass();
        return new b(jVar, fVar);
    }
}
