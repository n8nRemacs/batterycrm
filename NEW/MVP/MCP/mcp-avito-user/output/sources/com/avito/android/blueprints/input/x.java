package com.avito.android.blueprints.input;

import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.util.InterfaceC35807h4;
import javax.inject.Provider;

/* compiled from: MultiStateInputItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class x implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f105988a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<hJ.h> f105989b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<HtmlEditorViewModel> f105990c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f105991d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f105992e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Q1> f105993f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f105994g;

    public x(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f105988a = provider;
        this.f105989b = provider2;
        this.f105990c = provider3;
        this.f105991d = provider4;
        this.f105992e = provider5;
        this.f105993f = provider6;
        this.f105994g = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f105988a.get(), this.f105989b.get(), this.f105990c.get(), this.f105991d.get(), this.f105992e.get(), this.f105993f.get(), (LlmDescriptionPresenter) this.f105994g.get());
    }
}
