package com.avito.android.advert.viewed;

import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ViewedAdvertsPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/viewed/i;", "Ldagger/internal/h;", "Lcom/avito/android/advert/viewed/g;", "a", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f81026e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f81027a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<d> f81028b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u f81029c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final u f81030d;

    /* compiled from: ViewedAdvertsPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/viewed/i$a;", "", "<init>", "()V", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@k u uVar, @k u uVar2, @k u uVar3, @k Provider provider) {
        this.f81027a = uVar;
        this.f81028b = provider;
        this.f81029c = uVar2;
        this.f81030d = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert.viewed.a aVar = (com.avito.android.advert.viewed.a) this.f81027a.get();
        d dVar = this.f81028b.get();
        R0 r02 = (R0) this.f81029c.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f81030d.get();
        f81026e.getClass();
        return new g(aVar, dVar, r02, interfaceC35745a5);
    }
}
