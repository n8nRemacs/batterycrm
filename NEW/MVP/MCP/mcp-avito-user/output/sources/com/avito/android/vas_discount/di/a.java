package com.avito.android.vas_discount.di;

import androidx.view.P0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_discount.di.g;
import com.avito.android.vas_discount.remote.model.DiscountResponse;
import com.avito.android.vas_discount.ui.dialog.DiscountDialogFragment;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import java.util.List;
import java.util.Set;
import xJ0.InterfaceC49849a;
import xJ0.InterfaceC49850b;

/* compiled from: DaggerPickerComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerPickerComponent.java */
    public static final class b implements g.a {

        /* renamed from: a, reason: collision with root package name */
        public h f319624a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f319625b;

        /* renamed from: c, reason: collision with root package name */
        public i f319626c;

        public b() {
        }

        @Override // com.avito.android.vas_discount.di.g.a
        public final g.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f319625b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.vas_discount.di.g.a
        public final g.a b(h hVar) {
            this.f319624a = hVar;
            return this;
        }

        @Override // com.avito.android.vas_discount.di.g.a
        public final g build() {
            t.a(h.class, this.f319624a);
            t.a(cv.b.class, this.f319625b);
            t.a(i.class, this.f319626c);
            return new c(this.f319626c, this.f319624a, this.f319625b, null);
        }

        @Override // com.avito.android.vas_discount.di.g.a
        public final g.a c(i iVar) {
            this.f319626c = iVar;
            return this;
        }
    }

    /* compiled from: DaggerPickerComponent.java */
    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f319627a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC49850b> f319628b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f319629c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC49849a> f319630d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f319631e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.vas_discount.ui.items.title.e> f319632f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f319633g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f319634h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f319635i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.vas_discount.ui.items.button.e> f319636j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f319637k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f319638l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f319639m;

        /* renamed from: n, reason: collision with root package name */
        public final u<DiscountResponse> f319640n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.vas_discount.business.d> f319641o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC35745a5> f319642p;

        /* renamed from: q, reason: collision with root package name */
        public final u<P0.c> f319643q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.vas_discount.ui.dialog.e> f319644r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.d<?, ?>> f319645s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.d<?, ?>> f319646t;

        /* compiled from: DaggerPickerComponent.java */
        /* renamed from: com.avito.android.vas_discount.di.a$c$a, reason: collision with other inner class name */
        public static final class C9905a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final h f319647a;

            public C9905a(h hVar) {
                this.f319647a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f319647a.e();
            }
        }

        /* compiled from: DaggerPickerComponent.java */
        public static final class b implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final h f319648a;

            public b(h hVar) {
                this.f319648a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f319648a.d();
            }
        }

        /* compiled from: DaggerPickerComponent.java */
        /* renamed from: com.avito.android.vas_discount.di.a$c$c, reason: collision with other inner class name */
        public static final class C9906c implements u<InterfaceC49850b> {

            /* renamed from: a, reason: collision with root package name */
            public final h f319649a;

            public C9906c(h hVar) {
                this.f319649a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f319649a.x1();
            }
        }

        public c(i iVar, h hVar, cv.b bVar, C9904a c9904a) {
            this.f319627a = bVar;
            u<InterfaceC49849a> uVarD = dagger.internal.g.d(new n(iVar, new C9906c(hVar), new C9905a(hVar)));
            this.f319630d = uVarD;
            this.f319631e = dagger.internal.g.d(new m(iVar, uVarD));
            u<com.avito.android.vas_discount.ui.items.title.e> uVarD2 = dagger.internal.g.d(new l(iVar));
            this.f319632f = uVarD2;
            this.f319633g = dagger.internal.g.d(new k(iVar, uVarD2));
            this.f319634h = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f319635i = dagger.internal.g.d(new com.avito.android.vas_discount.ui.items.description.c(com.avito.android.vas_discount.ui.items.description.g.a()));
            u<com.avito.android.vas_discount.ui.items.button.e> uVarD3 = dagger.internal.g.d(com.avito.android.vas_discount.ui.items.button.f.a());
            this.f319636j = uVarD3;
            this.f319637k = dagger.internal.g.d(new com.avito.android.vas_discount.ui.items.button.c(uVarD3));
            A.b bVarA = A.a(4, 1);
            u<TV0.b<?, ?>> uVar = this.f319631e;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f319633g);
            bVarA.f393938b.add(this.f319634h);
            list.add(this.f319635i);
            list.add(this.f319637k);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f319638l = uVarK;
            this.f319639m = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f319640n = dagger.internal.g.d(new j(iVar));
            u<com.avito.android.vas_discount.business.d> uVarD4 = dagger.internal.g.d(com.avito.android.vas_discount.business.f.a());
            this.f319641o = uVarD4;
            u<P0.c> uVarD5 = dagger.internal.g.d(new com.avito.android.vas_discount.ui.dialog.g(uVarD4, this.f319640n, new b(hVar)));
            this.f319643q = uVarD5;
            this.f319644r = dagger.internal.g.d(new p(iVar, uVarD5));
            this.f319645s = dagger.internal.g.d(new o(iVar, this.f319630d));
            this.f319646t = dagger.internal.g.d(com.avito.android.vas_discount.ui.items.description.g.a());
        }

        @Override // com.avito.android.vas_discount.di.g
        public final void a(DiscountDialogFragment discountDialogFragment) {
            discountDialogFragment.f319681i0 = this.f319638l.get();
            discountDialogFragment.f319682j0 = this.f319639m.get();
            discountDialogFragment.f319683k0 = this.f319644r.get();
            z zVar = new z(4);
            zVar.a(this.f319645s.get());
            zVar.a(this.f319646t.get());
            zVar.a(this.f319636j.get());
            zVar.a(this.f319632f.get());
            discountDialogFragment.f319684l0 = zVar.c();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f319627a.u4();
            t.c(aVarU4);
            discountDialogFragment.f319685m0 = aVarU4;
        }
    }

    public static g.a a() {
        return new b();
    }
}
