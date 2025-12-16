package com.avito.android.service_order_widget.link;

import Cu0.InterfaceC13353a;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.B2;
import com.avito.android.D2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.di.I1;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.A;
import ru.avito.messenger.F0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: SendServiceOrderRequestWithPhotoLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/n;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_widget/link/m;", "a", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f279032m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f279033a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<A> f279034b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I1 f279035c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35863o4> f279036d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C25721c f279037e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_order_widget.domain.d f279038f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f279039g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f279040h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final dv.b f279041i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC13353a> f279042j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final D2 f279043k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f279044l;

    /* compiled from: SendServiceOrderRequestWithPhotoLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/n$a;", "", "<init>", "()V", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public n(@Y61.k dagger.internal.f fVar, @Y61.k Provider provider, @Y61.k I1 i12, @Y61.k Provider provider2, @Y61.k C25721c c25721c, @Y61.k com.avito.android.service_order_widget.domain.d dVar, @Y61.k Provider provider3, @Y61.k dagger.internal.f fVar2, @Y61.k dv.b bVar, @Y61.k Provider provider4, @Y61.k D2 d22, @Y61.k dagger.internal.f fVar3) {
        this.f279033a = fVar;
        this.f279034b = provider;
        this.f279035c = i12;
        this.f279036d = provider2;
        this.f279037e = c25721c;
        this.f279038f = dVar;
        this.f279039g = provider3;
        this.f279040h = fVar2;
        this.f279041i = bVar;
        this.f279042j = provider4;
        this.f279043k = d22;
        this.f279044l = fVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47842z interfaceC47842z = (InterfaceC47842z) this.f279033a.get();
        A a12 = this.f279034b.get();
        F0 f02 = (F0) this.f279035c.get();
        InterfaceC35863o4 interfaceC35863o4 = this.f279036d.get();
        C25719a c25719a = (C25719a) this.f279037e.get();
        com.avito.android.service_order_widget.domain.a aVar = (com.avito.android.service_order_widget.domain.a) this.f279038f.get();
        R0 r02 = this.f279039g.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) this.f279040h.get();
        a.i iVar = (a.i) this.f279041i.get();
        InterfaceC13353a interfaceC13353a = this.f279042j.get();
        B2 b22 = (B2) this.f279043k.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f279044l.get();
        f279032m.getClass();
        return new m(interfaceC47842z, a12, f02, interfaceC35863o4, c25719a, aVar, r02, aVar2, iVar, interfaceC13353a, b22, interfaceC28373a);
    }
}
