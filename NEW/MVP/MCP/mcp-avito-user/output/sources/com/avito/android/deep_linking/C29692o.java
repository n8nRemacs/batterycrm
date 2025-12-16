package com.avito.android.deep_linking;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppLinkPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/o;", "Ldagger/internal/h;", "Lcom/avito/android/deep_linking/l;", "a", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deep_linking.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29692o implements dagger.internal.h<C29674l> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f134026f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29672j f134027a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f134028b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C29668f f134029c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final cv.e f134030d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f134031e;

    /* compiled from: AppLinkPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/o$a;", "", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.o$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C29692o(@Y61.k C29672j c29672j, @Y61.k Provider provider, @Y61.k C29668f c29668f, @Y61.k cv.e eVar, @Y61.k com.avito.android.S s5) {
        this.f134027a = c29672j;
        this.f134028b = provider;
        this.f134029c = c29668f;
        this.f134030d = eVar;
        this.f134031e = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29669g interfaceC29669g = (InterfaceC29669g) this.f134027a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f134028b.get();
        C29667e c29667e = (C29667e) this.f134029c.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134030d.get();
        this.f134031e.get();
        f134026f.getClass();
        return new C29674l(interfaceC29669g, interfaceC35745a5, c29667e, aVar);
    }
}
