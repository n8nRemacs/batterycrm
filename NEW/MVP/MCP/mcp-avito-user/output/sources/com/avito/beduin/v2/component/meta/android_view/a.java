package com.avito.beduin.v2.component.meta.android_view;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.exception.RendererBeduinException;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.B;
import com.avito.beduin.v2.render.android_view.C36336f;
import com.avito.beduin.v2.render.android_view.C36337g;
import com.avito.beduin.v2.render.android_view.E;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import com.avito.beduin.v2.render.android_view.o;
import com.avito.beduin.v2.render.android_view.x;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MetaComponent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/meta/android_view/a;", "Lcom/avito/beduin/v2/render/android_view/m;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements InterfaceC36343m {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final A f336095a;

    /* renamed from: c, reason: collision with root package name */
    @l
    public E f336097c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public View f336098d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public InterfaceC36249i f336099e;

    /* renamed from: g, reason: collision with root package name */
    @l
    public o f336101g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f336096b = C42727D.c(new C10415a());

    /* renamed from: f, reason: collision with root package name */
    @k
    public final B f336100f = new B(null, 1, null);

    /* compiled from: MetaComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/x;", "invoke", "()Lcom/avito/beduin/v2/render/android_view/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.component.meta.android_view.a$a, reason: collision with other inner class name */
    public static final class C10415a extends N implements Y41.a<x> {
        public C10415a() {
            super(0);
        }

        @Override // Y41.a
        public final x invoke() {
            return new x(a.this.f336095a);
        }
    }

    /* compiled from: MetaComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOT0/a;", "metaState", "Lkotlin/G0;", "invoke", "(LOT0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<OT0.a, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.theme.k f336104m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C36336f f336105n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.beduin.v2.theme.k kVar, C36336f c36336f) {
            super(1);
            this.f336104m = kVar;
            this.f336105n = c36336f;
        }

        @Override // Y41.l
        public final G0 invoke(OT0.a aVar) {
            a aVar2 = a.this;
            x xVar = (x) aVar2.f336096b.getValue();
            B b12 = aVar2.f336100f;
            Bundle bundle = b12.f337911a;
            b12.f337911a = null;
            InterfaceC36343m interfaceC36343m = xVar.f338029c;
            com.avito.beduin.v2.engine.component.l lVar = aVar.f12282c;
            interfaceC36343m.g(this.f336104m, lVar, this.f336105n, bundle, null, xVar.f338027a);
            o oVar = aVar2.f336101g;
            if (oVar != null) {
                oVar.a(aVar2.f336098d);
            }
            return G0.f406611a;
        }
    }

    public a(@k A a12) {
        this.f336095a = a12;
    }

    @Override // com.avito.beduin.v2.render.android_view.InterfaceC36343m
    @k
    public final View a(@k ViewGroup viewGroup, @k com.avito.beduin.v2.theme.k kVar, @k InterfaceC36249i interfaceC36249i, @k C36336f c36336f) throws RendererBeduinException.UnregisteredComponentException {
        interfaceC36249i.b();
        View view = this.f336098d;
        if (view != null) {
            return view;
        }
        x xVar = (x) this.f336096b.getValue();
        com.avito.beduin.v2.engine.component.l lVar = ((OT0.a) interfaceC36249i.getState()).f12282c;
        xVar.getClass();
        A a12 = xVar.f338027a;
        n<?> nVarA = a12.a(lVar.f336566c);
        if (!L.f(xVar.f338028b, nVarA)) {
            xVar.f338028b = nVarA;
            xVar.f338029c = nVarA.b(a12);
        }
        View viewA = xVar.f338029c.a(viewGroup, kVar, lVar, c36336f);
        this.f336098d = viewA;
        return viewA;
    }

    @Override // com.avito.beduin.v2.render.android_view.InterfaceC36343m
    public final void b() {
        InterfaceC36343m interfaceC36343m = ((x) this.f336096b.getValue()).f338029c;
        if (interfaceC36343m != null) {
            interfaceC36343m.b();
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.InterfaceC36343m
    @l
    public final Bundle e() {
        String id2;
        Bundle bundleB;
        InterfaceC36249i interfaceC36249i = this.f336099e;
        if (interfaceC36249i == null || (id2 = interfaceC36249i.getF336564a()) == null || (bundleB = ((x) this.f336096b.getValue()).b()) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(id2, bundleB);
        return bundle;
    }

    @Override // com.avito.beduin.v2.render.android_view.InterfaceC36343m
    @k
    public final View f(@k ViewGroup viewGroup, @k com.avito.beduin.v2.theme.k kVar, @k InterfaceC36249i interfaceC36249i, @k C36336f c36336f, @l Bundle bundle, @l o oVar, @k A a12) throws RendererBeduinException.UnregisteredComponentException {
        View viewA = a(viewGroup, kVar, interfaceC36249i, c36336f);
        g(kVar, interfaceC36249i, c36336f, bundle, oVar, a12);
        return viewA;
    }

    @Override // com.avito.beduin.v2.render.android_view.InterfaceC36343m
    public final void g(@k com.avito.beduin.v2.theme.k kVar, @k InterfaceC36249i interfaceC36249i, @k C36336f c36336f, @l Bundle bundle, @l o oVar, @k A a12) {
        this.f336101g = oVar;
        this.f336100f.f337911a = bundle != null ? bundle.getBundle(interfaceC36249i.getF336564a()) : null;
        if (L.f(this.f336099e, interfaceC36249i)) {
            return;
        }
        InterfaceC36249i interfaceC36249i2 = this.f336099e;
        this.f336099e = interfaceC36249i;
        E e12 = this.f336097c;
        if (e12 != null) {
            e12.a();
        }
        if (interfaceC36249i2 != null) {
            interfaceC36249i2.release();
        }
        interfaceC36249i.b();
        View view = this.f336098d;
        this.f336097c = new E(view, new C36337g(new b(kVar, c36336f), interfaceC36249i, view));
    }
}
