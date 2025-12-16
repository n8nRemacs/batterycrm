package com.avito.android.di.module;

import com.avito.android.InterfaceC35289u1;
import com.avito.android.gson.ListTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.bind.TreeTypeAdapter;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoreJsonModule_ProvideGson$_avito_network_implFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/h3;", "Ldagger/internal/h;", "Lcom/google/gson/Gson;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.h3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30058h3 implements dagger.internal.h<Gson> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f144316f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.retrofit.H> f144317a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f144318b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f144319c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f144320d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f144321e;

    /* compiled from: CoreJsonModule_ProvideGson$_avito_network_implFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/di/module/CoreJsonModule_ProvideGson$_avito_network_implFactory.Companion", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.h3$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30058h3(@Y61.k Provider provider, @Y61.k dagger.internal.A a12, @Y61.k dagger.internal.A a13, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider2) {
        this.f144317a = provider;
        this.f144318b = a12;
        this.f144319c = a13;
        this.f144320d = uVar;
        this.f144321e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.retrofit.H h12 = this.f144317a.get();
        Set<com.avito.android.util.X5> set = (Set) this.f144318b.get();
        Set set2 = (Set) this.f144319c.get();
        InterfaceC35289u1 interfaceC35289u1 = (InterfaceC35289u1) this.f144320d.get();
        com.avito.android.util.C c12 = this.f144321e.get();
        f144316f.getClass();
        int i12 = C30025e3.f144277a;
        h12.a();
        com.google.gson.d dVar = new com.google.gson.d();
        ListTypeAdapter listTypeAdapter = new ListTypeAdapter();
        boolean z12 = listTypeAdapter instanceof com.google.gson.o;
        dVar.f361991f.add(TreeTypeAdapter.b(listTypeAdapter));
        for (com.avito.android.util.X5 x52 : set) {
            dVar.b(x52.f318780a, x52.f318781b);
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            dVar.c((com.google.gson.r) it.next());
        }
        dVar.f361997l = ToNumberPolicy.f361982d;
        return interfaceC35289u1.n().invoke().booleanValue() ? com.avito.android.gson.e.a(dVar, interfaceC35289u1.q().invoke().booleanValue(), true ^ c12.l(), AW.f.f434a) : dVar.a();
    }
}
