package com.avito.android.theme_settings.viewmodel;

import Y61.k;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.util.darkTheme.a;
import com.avito.android.serp.adapter.i1;
import com.avito.android.theme_settings.analytics.ThemeSettingsEvent;
import io.reactivex.rxjava3.core.z;
import jE0.InterfaceC42241a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import nE0.InterfaceC44242a;

/* compiled from: ThemeSettingsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/theme_settings/viewmodel/h;", "Lcom/avito/android/theme_settings/viewmodel/e;", "Landroidx/lifecycle/M0;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends M0 implements e {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.lib.util.darkTheme.a f301379E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final b f301380J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final InterfaceC44242a f301381K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final InterfaceC28373a f301382L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f301383M = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: N, reason: collision with root package name */
    @k
    public final C23038g0<List<i1>> f301384N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final C23038g0 f301385O;

    /* compiled from: ThemeSettingsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LjE0/a$a;", "action", "Lkotlin/G0;", "accept", "(LjE0/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC42241a.AbstractC11555a abstractC11555a = (InterfaceC42241a.AbstractC11555a) obj;
            if (abstractC11555a instanceof InterfaceC42241a.AbstractC11555a.C11556a) {
                InterfaceC42241a.AbstractC11555a.C11556a c11556a = (InterfaceC42241a.AbstractC11555a.C11556a) abstractC11555a;
                h hVar = h.this;
                InterfaceC44242a interfaceC44242a = hVar.f301381K;
                boolean z12 = c11556a.f405530b;
                a.AbstractC5328a abstractC5328a = (z12 || !interfaceC44242a.getF414949b()) ? (z12 || interfaceC44242a.getF414949b()) ? c11556a.f405529a : a.AbstractC5328a.d.f181344b : a.AbstractC5328a.b.f181342b;
                com.avito.android.lib.util.darkTheme.a aVar = hVar.f301379E;
                aVar.c(abstractC5328a);
                hVar.Qc();
                a.AbstractC5328a abstractC5328aA = aVar.a();
                ThemeSettingsEvent.Mode mode = L.f(abstractC5328aA, a.AbstractC5328a.d.f181344b) ? ThemeSettingsEvent.Mode.f301301d : L.f(abstractC5328aA, a.AbstractC5328a.b.f181342b) ? ThemeSettingsEvent.Mode.f301302e : ThemeSettingsEvent.Mode.f301300c;
                ThemeSettingsEvent.Screen[] screenArr = ThemeSettingsEvent.Screen.f301306b;
                hVar.f301382L.c(new ThemeSettingsEvent(mode));
            }
        }
    }

    public h(@k com.avito.android.lib.util.darkTheme.a aVar, @k b bVar, @k InterfaceC44242a interfaceC44242a, @k InterfaceC28373a interfaceC28373a) {
        this.f301379E = aVar;
        this.f301380J = bVar;
        this.f301381K = interfaceC44242a;
        this.f301382L = interfaceC28373a;
        C23038g0<List<i1>> c23038g0 = new C23038g0<>();
        this.f301384N = c23038g0;
        this.f301385O = c23038g0;
        Qc();
    }

    @Override // com.avito.android.theme_settings.viewmodel.e
    @k
    /* renamed from: P3, reason: from getter */
    public final C23038g0 getF301385O() {
        return this.f301385O;
    }

    @Override // com.avito.android.theme_settings.viewmodel.e
    public final void Qc() {
        com.avito.android.lib.util.darkTheme.a aVar = this.f301379E;
        a.AbstractC5328a abstractC5328aA = aVar.a();
        List<a.AbstractC5328a> listD = aVar.d();
        ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
        for (a.AbstractC5328a abstractC5328a : listD) {
            arrayList.add(new com.avito.android.theme_settings.viewmodel.a(abstractC5328a, L.f(abstractC5328a, abstractC5328aA)));
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.f301380J.a((com.avito.android.theme_settings.viewmodel.a) it.next()));
        }
        this.f301384N.setValue(arrayList2);
    }

    @Override // com.avito.android.theme_settings.viewmodel.e
    public final void a(@k Set<? extends InterfaceC42241a> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f301383M;
        cVar.e();
        Set<? extends InterfaceC42241a> set2 = set;
        ArrayList arrayList = new ArrayList(C42745f0.q(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC42241a) it.next()).getF301360b());
        }
        cVar.b(z.X(arrayList).T(io.reactivex.rxjava3.internal.functions.a.f401991a, Integer.MAX_VALUE).t0(new a()));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f301383M.e();
    }
}
