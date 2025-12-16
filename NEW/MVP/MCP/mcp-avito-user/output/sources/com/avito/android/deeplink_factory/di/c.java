package com.avito.android.deeplink_factory.di;

import Y61.k;
import com.avito.android.util.X5;
import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.r;
import dagger.internal.A;
import dagger.internal.h;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeepLinkFactoryModule_ProvideDeeplinkFactoryGsonFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_factory/di/c;", "Ldagger/internal/h;", "Lcom/google/gson/Gson;", "a", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<Gson> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f134175c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final A f134176a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A f134177b;

    /* compiled from: DeepLinkFactoryModule_ProvideDeeplinkFactoryGsonFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_factory/di/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k A a12, @k A a13) {
        this.f134176a = a12;
        this.f134177b = a13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set<X5> set = (Set) this.f134176a.get();
        Set set2 = (Set) this.f134177b.get();
        f134175c.getClass();
        com.avito.android.deeplink_factory.di.a.f134166a.getClass();
        com.google.gson.d dVar = new com.google.gson.d();
        for (X5 x52 : set) {
            dVar.b(x52.f318780a, x52.f318781b);
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            dVar.c((r) it.next());
        }
        dVar.f361997l = ToNumberPolicy.f361982d;
        return dVar.a();
    }
}
