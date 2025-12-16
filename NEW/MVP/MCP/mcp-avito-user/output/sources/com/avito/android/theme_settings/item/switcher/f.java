package com.avito.android.theme_settings.item.switcher;

import Y61.k;
import jE0.InterfaceC42241a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SwitcherItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/theme_settings/item/switcher/f;", "Lcom/avito/android/theme_settings/item/switcher/d;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<InterfaceC42241a.AbstractC11555a> f301346b = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setChecked(aVar2.f301339e.f301368b);
        hVar.setTitle(aVar2.f301337c);
        hVar.f(aVar2.f301338d);
        hVar.a(new e(this, aVar2));
    }

    @Override // jE0.InterfaceC42241a
    /* renamed from: getActions, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF301360b() {
        return this.f301346b;
    }
}
