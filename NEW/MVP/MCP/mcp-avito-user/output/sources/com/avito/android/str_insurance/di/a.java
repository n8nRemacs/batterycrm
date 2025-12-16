package com.avito.android.str_insurance.di;

import Xy0.h;
import Xy0.j;
import androidx.appcompat.app.m;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.remote.d1;
import com.avito.android.str_insurance.InsuranceData;
import com.avito.android.str_insurance.StrInsuranceActivity;
import com.avito.android.str_insurance.di.b;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerStrInsuranceComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrInsuranceComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_insurance.di.b.a
        public final com.avito.android.str_insurance.di.b a(com.avito.android.str_insurance.di.c cVar, InterfaceC39417a interfaceC39417a, StrInsuranceActivity strInsuranceActivity, InsuranceData insuranceData) {
            interfaceC39417a.getClass();
            return new c(new f(), cVar, interfaceC39417a, strInsuranceActivity, insuranceData, null);
        }
    }

    /* compiled from: DaggerStrInsuranceComponent.java */
    public static final class c implements com.avito.android.str_insurance.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.str_insurance.di.c f288551a;

        /* renamed from: b, reason: collision with root package name */
        public final InsuranceData f288552b;

        /* renamed from: c, reason: collision with root package name */
        public final u<FragmentManager> f288553c;

        /* renamed from: d, reason: collision with root package name */
        public final u<h> f288554d;

        public c(f fVar, com.avito.android.str_insurance.di.c cVar, cv.b bVar, m mVar, InsuranceData insuranceData, C8676a c8676a) {
            this.f288551a = cVar;
            this.f288552b = insuranceData;
            u<FragmentManager> uVarD = dagger.internal.g.d(new g(fVar, l.a(mVar)));
            this.f288553c = uVarD;
            this.f288554d = dagger.internal.g.d(new j(uVarD));
        }

        @Override // com.avito.android.str_insurance.di.b
        public final void Nd(StrInsuranceActivity strInsuranceActivity) {
            strInsuranceActivity.f288540m = this.f288554d.get();
        }

        @Override // com.avito.android.str_insurance.screen.di.g
        public final InsuranceData Rg() {
            return this.f288552b;
        }

        @Override // com.avito.android.str_insurance.screen.di.g
        public final h We() {
            return this.f288554d.get();
        }

        @Override // com.avito.android.str_insurance.screen.di.g
        public final d1 a0() {
            d1 d1VarA0 = this.f288551a.a0();
            t.c(d1VarA0);
            return d1VarA0;
        }

        @Override // com.avito.android.str_insurance.screen.di.g
        public final InterfaceC28481c b() {
            InterfaceC28481c interfaceC28481cB = this.f288551a.b();
            t.c(interfaceC28481cB);
            return interfaceC28481cB;
        }

        @Override // com.avito.android.str_insurance.screen.di.g
        public final R0 c() {
            R0 r0C = this.f288551a.c();
            t.c(r0C);
            return r0C;
        }

        @Override // com.avito.android.str_insurance.screen.di.g
        public final com.avito.android.util.text.a e() {
            com.avito.android.util.text.a aVarE = this.f288551a.e();
            t.c(aVarE);
            return aVarE;
        }

        @Override // com.avito.android.str_insurance.screen.di.g
        public final InterfaceC35863o4 m() {
            InterfaceC35863o4 interfaceC35863o4M = this.f288551a.m();
            t.c(interfaceC35863o4M);
            return interfaceC35863o4M;
        }

        @Override // com.avito.android.str_insurance.screen.di.g
        public final com.avito.android.remote.error.f o() {
            return this.f288551a.o();
        }
    }

    public static b.a a() {
        return new b();
    }
}
