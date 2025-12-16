package com.yandex.div.core.view2.divs.tabs;

import android.content.Context;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.r;
import com.yandex.div.core.view2.P;
import com.yandex.div.core.view2.X;
import com.yandex.div.core.view2.divs.C37955g;
import com.yandex.div.core.view2.divs.C38006w;
import com.yandex.div.internal.widget.tabs.s;
import dagger.internal.u;

/* compiled from: DivTabsBinder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class k implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f368798a;

    /* renamed from: b, reason: collision with root package name */
    public final u f368799b;

    /* renamed from: c, reason: collision with root package name */
    public final u f368800c;

    /* renamed from: d, reason: collision with root package name */
    public final u f368801d;

    /* renamed from: e, reason: collision with root package name */
    public final u f368802e;

    /* renamed from: f, reason: collision with root package name */
    public final r f368803f;

    /* renamed from: g, reason: collision with root package name */
    public final u f368804g;

    /* renamed from: h, reason: collision with root package name */
    public final u f368805h;

    /* renamed from: i, reason: collision with root package name */
    public final u f368806i;

    public k(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, r rVar, u uVar6, u uVar7, u uVar8) {
        this.f368798a = uVar;
        this.f368799b = uVar2;
        this.f368800c = uVar3;
        this.f368801d = uVar4;
        this.f368802e = uVar5;
        this.f368803f = rVar;
        this.f368804g = uVar6;
        this.f368805h = uVar7;
        this.f368806i = uVar8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((C38006w) this.f368798a.get(), (P) this.f368799b.get(), (com.yandex.div.internal.viewpool.h) this.f368800c.get(), (s) this.f368801d.get(), (C37955g) this.f368802e.get(), (InterfaceC37915j) this.f368803f.get(), (X) this.f368804g.get(), (com.yandex.div.core.downloader.k) this.f368805h.get(), (Context) this.f368806i.get());
    }
}
