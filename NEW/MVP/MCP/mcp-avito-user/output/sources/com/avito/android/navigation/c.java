package com.avito.android.navigation;

import Y61.k;
import com.avito.android.app.task.InterfaceC28580o;
import dagger.internal.h;
import id.C41383a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NavigationTabProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/navigation/c;", "Ldagger/internal/h;", "Lcom/avito/android/navigation/b;", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f207189c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C41383a> f207190a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC28580o> f207191b;

    /* compiled from: NavigationTabProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/navigation/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k Provider<C41383a> provider, @k Provider<InterfaceC28580o> provider2) {
        this.f207190a = provider;
        this.f207191b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C41383a c41383a = this.f207190a.get();
        InterfaceC28580o interfaceC28580o = this.f207191b.get();
        f207189c.getClass();
        return new b(c41383a, interfaceC28580o);
    }
}
