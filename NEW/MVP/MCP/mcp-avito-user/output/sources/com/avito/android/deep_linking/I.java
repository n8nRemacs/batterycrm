package com.avito.android.deep_linking;

import Ic.InterfaceC14058a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lW.C43693c;
import lW.InterfaceC43691a;
import uc.InterfaceC49033h;

/* compiled from: DeepLinkingPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/I;", "Ldagger/internal/h;", "Lcom/avito/android/deep_linking/E;", "a", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class I implements dagger.internal.h<E> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final a f132835k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f132836a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f132837b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f132838c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43693c f132839d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.A f132840e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Ic.d f132841f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final cv.e f132842g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f132843h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f132844i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC49033h> f132845j;

    /* compiled from: DeepLinkingPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/I$a;", "", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public I(@Y61.k Provider provider, @Y61.k dagger.internal.f fVar, @Y61.k Provider provider2, @Y61.k C43693c c43693c, @Y61.k com.avito.android.location.A a12, @Y61.k Ic.d dVar, @Y61.k cv.e eVar, @Y61.k Provider provider3, @Y61.k com.avito.android.S s5, @Y61.k Provider provider4) {
        this.f132836a = provider;
        this.f132837b = fVar;
        this.f132838c = provider2;
        this.f132839d = c43693c;
        this.f132840e = a12;
        this.f132841f = dVar;
        this.f132842g = eVar;
        this.f132843h = provider3;
        this.f132844i = s5;
        this.f132845j = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f132836a.get();
        x xVar = (x) this.f132837b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f132838c.get();
        InterfaceC43691a interfaceC43691a = (InterfaceC43691a) this.f132839d.get();
        com.avito.android.location.r rVar = (com.avito.android.location.r) this.f132840e.get();
        InterfaceC14058a interfaceC14058a = (InterfaceC14058a) this.f132841f.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f132842g.get();
        InterfaceC35745a5 interfaceC35745a52 = this.f132843h.get();
        com.avito.android.P p12 = (com.avito.android.P) this.f132844i.get();
        InterfaceC49033h interfaceC49033h = this.f132845j.get();
        f132835k.getClass();
        return new E(c12, xVar, interfaceC35745a5, interfaceC43691a, rVar, interfaceC14058a, aVar, interfaceC35745a52, p12, interfaceC49033h);
    }
}
