package com.avito.android.util;

import com.avito.android.InterfaceC32900o;
import com.avito.android.di.module.C30113m3;
import java.util.Locale;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAgentProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/k6;", "Ldagger/internal/h;", "Lcom/avito/android/util/j6;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.k6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35833k6 implements dagger.internal.h<C35825j6> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f318917d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f318918a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30113m3 f318919b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC32900o> f318920c;

    /* compiled from: UserAgentProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/k6$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.k6$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C35833k6(@Y61.k Provider provider, @Y61.k C30113m3 c30113m3, @Y61.k Provider provider2) {
        this.f318918a = provider;
        this.f318919b = c30113m3;
        this.f318920c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f318918a.get();
        Locale locale = (Locale) this.f318919b.get();
        InterfaceC32900o interfaceC32900o = this.f318920c.get();
        f318917d.getClass();
        return new C35825j6(c12, locale, interfaceC32900o);
    }
}
