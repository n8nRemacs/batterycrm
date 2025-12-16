package com.avito.android.publish.items.tagged_input;

import androidx.view.InterfaceC22983P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.util.InterfaceC35807h4;
import javax.inject.Provider;

/* compiled from: MultiStateInputWithTagsItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.ui.widget.tagged_input.m> f237191a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC22983P> f237192b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f237193c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<hJ.h> f237194d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<HtmlEditorViewModel> f237195e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f237196f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f237197g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f237198h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f237199i;

    public y(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f237191a = provider;
        this.f237192b = provider2;
        this.f237193c = uVar;
        this.f237194d = provider3;
        this.f237195e = provider4;
        this.f237196f = uVar2;
        this.f237197g = provider5;
        this.f237198h = uVar3;
        this.f237199i = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new x(this.f237191a.get(), this.f237192b.get(), (com.avito.android.util.text.a) this.f237193c.get(), this.f237194d.get(), this.f237195e.get(), (InterfaceC28373a) this.f237196f.get(), this.f237197g.get(), (Q1) this.f237198h.get(), (LlmDescriptionPresenter) this.f237199i.get());
    }
}
