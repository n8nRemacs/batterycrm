package com.avito.android.ux.feedback.impl;

import Cb1.i;
import Cb1.j;
import Fc1.C13641j;
import Fc1.C13651k0;
import Fc1.J2;
import Fc1.Q;
import android.app.Application;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoUxFeedbackFactory.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ux/feedback/impl/b;", "", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f319136a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f319137b;

    /* compiled from: AvitoUxFeedbackFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h31.e<n> f319138l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC28373a f319139m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Application f319140n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b f319141o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ VK0.a f319142p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h31.e<n> eVar, InterfaceC28373a interfaceC28373a, Application application, b bVar, VK0.a aVar) {
            super(0);
            this.f319138l = eVar;
            this.f319139m = interfaceC28373a;
            this.f319140n = application;
            this.f319141o = bVar;
            this.f319142p = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            n nVar = this.f319138l.get();
            Cb1.h.f2300r.getClass();
            Cb1.h hVar = new Cb1.h(false, false, 0, 0, 0, false, null, 0, 0, null, 0, 0, 0, null, null, null, null, 131071, null);
            nVar.getClass();
            hVar.f2304d = 3;
            hVar.f2303c = 30;
            nVar.f319164a.o().getClass();
            hVar.f2301a = false;
            hVar.f2311k = 76;
            hVar.f2308h = 76;
            hVar.f2302b = true;
            hVar.f2306f = true;
            v vVar = new v(this.f319139m);
            q qVar = new q(vVar);
            try {
                j.a.a(Cb1.j.f2347a, this.f319140n, nVar.f319165b, hVar, qVar);
            } catch (Exception unused) {
                if (vVar.f319182e) {
                    vVar.f319178a.c(new UK0.a());
                }
            }
            Cb1.j.f2347a.getClass();
            C13651k0 c13651k0 = j.a.f2349b;
            if (c13651k0 != null) {
                InterfaceC28373a interfaceC28373a = this.f319139m;
                VK0.a aVar = this.f319142p;
                C13641j c13641j = c13651k0.f5621b;
                if (c13641j == null) {
                    c13641j = null;
                }
                J2 j22 = c13641j.f5587d;
                if (j22 == null) {
                    j22 = null;
                }
                qVar.f319167b = new s(interfaceC28373a, j22.f5034a, aVar);
                Cb1.i.f2318C.getClass();
                Cb1.i iVarA = i.a.a(R.style.UxFeedbackTheme);
                Q q12 = c13651k0.f5623d;
                Q q13 = q12 != null ? q12 : null;
                q13.getClass();
                q13.f5152a = iVarA;
            }
            this.f319141o.f319136a = true;
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k Application application, @Y61.k h31.e<n> eVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k VK0.a aVar) {
        this.f319137b = C42727D.b(LazyThreadSafetyMode.f406614b, new a(eVar, interfaceC28373a, application, this, aVar));
    }
}
