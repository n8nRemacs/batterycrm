package com.avito.android.code_confirmation.code_confirmation;

import Bi0.C13154c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.Kundle;
import hD.C40806a;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: CodeConfirmationPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class U implements dagger.internal.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC29394g> f119466a;

    /* renamed from: b, reason: collision with root package name */
    public final C13154c f119467b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f119468c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f119469d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<W> f119470e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<Long>> f119471f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.code_confirmation.code_confirmation.timer.a> f119472g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<g0> f119473h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<C40806a> f119474i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC50647a> f119475j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC30274a> f119476k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f119477l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f119478m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.l f119479n;

    public U(Provider provider, C13154c c13154c, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, dagger.internal.l lVar) {
        this.f119466a = provider;
        this.f119467b = c13154c;
        this.f119468c = provider2;
        this.f119469d = provider3;
        this.f119470e = provider4;
        this.f119471f = provider5;
        this.f119472g = provider6;
        this.f119473h = provider7;
        this.f119474i = provider8;
        this.f119475j = provider9;
        this.f119476k = provider10;
        this.f119477l = provider11;
        this.f119478m = provider12;
        this.f119479n = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new T(this.f119466a.get(), dagger.internal.g.b(this.f119467b), this.f119468c.get(), this.f119469d.get(), this.f119470e.get(), this.f119471f.get(), this.f119472g.get(), this.f119473h.get(), this.f119474i.get(), this.f119475j.get(), this.f119476k.get(), this.f119477l.get(), this.f119478m.get(), (Kundle) this.f119479n.f393949a);
    }
}
