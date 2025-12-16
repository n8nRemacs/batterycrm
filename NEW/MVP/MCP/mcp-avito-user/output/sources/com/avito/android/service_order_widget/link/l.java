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

/* compiled from: SendServiceOrderRequestOldLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/l;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_widget/link/k;", "a", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f279008m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f279009a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<A> f279010b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I1 f279011c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35863o4> f279012d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C25721c f279013e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_order_widget.domain.d f279014f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f279015g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f279016h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final dv.b f279017i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC13353a> f279018j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final D2 f279019k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f279020l;

    /* compiled from: SendServiceOrderRequestOldLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/l$a;", "", "<init>", "()V", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k dagger.internal.f fVar, @Y61.k Provider provider, @Y61.k I1 i12, @Y61.k Provider provider2, @Y61.k C25721c c25721c, @Y61.k com.avito.android.service_order_widget.domain.d dVar, @Y61.k Provider provider3, @Y61.k dagger.internal.f fVar2, @Y61.k dv.b bVar, @Y61.k Provider provider4, @Y61.k D2 d22, @Y61.k dagger.internal.f fVar3) {
        this.f279009a = fVar;
        this.f279010b = provider;
        this.f279011c = i12;
        this.f279012d = provider2;
        this.f279013e = c25721c;
        this.f279014f = dVar;
        this.f279015g = provider3;
        this.f279016h = fVar2;
        this.f279017i = bVar;
        this.f279018j = provider4;
        this.f279019k = d22;
        this.f279020l = fVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47842z interfaceC47842z = (InterfaceC47842z) this.f279009a.get();
        A a12 = this.f279010b.get();
        F0 f02 = (F0) this.f279011c.get();
        InterfaceC35863o4 interfaceC35863o4 = this.f279012d.get();
        C25719a c25719a = (C25719a) this.f279013e.get();
        com.avito.android.service_order_widget.domain.a aVar = (com.avito.android.service_order_widget.domain.a) this.f279014f.get();
        R0 r02 = this.f279015g.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) this.f279016h.get();
        a.i iVar = (a.i) this.f279017i.get();
        InterfaceC13353a interfaceC13353a = this.f279018j.get();
        B2 b22 = (B2) this.f279019k.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f279020l.get();
        f279008m.getClass();
        return new k(interfaceC47842z, a12, f02, interfaceC35863o4, c25719a, aVar, r02, aVar2, iVar, interfaceC13353a, b22, interfaceC28373a);
    }
}
