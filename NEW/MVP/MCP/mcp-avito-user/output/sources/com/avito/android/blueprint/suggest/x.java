package com.avito.android.blueprint.suggest;

import androidx.view.InterfaceC22983P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import javax.inject.Provider;

/* compiled from: PublishInputWithSuggestsPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.ui.widget.tagged_input.m> f105755a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC22983P> f105756b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<hJ.h> f105757c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<HtmlEditorViewModel> f105758d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f105759e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f105760f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f105761g;

    public x(Provider provider, Provider provider2, Provider provider3, Provider provider4, dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f105755a = provider;
        this.f105756b = provider2;
        this.f105757c = provider3;
        this.f105758d = provider4;
        this.f105759e = uVar;
        this.f105760f = uVar2;
        this.f105761g = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f105755a.get(), this.f105756b.get(), this.f105757c.get(), this.f105758d.get(), (InterfaceC28373a) this.f105759e.get(), (Q1) this.f105760f.get(), (LlmDescriptionPresenter) this.f105761g.get());
    }
}
