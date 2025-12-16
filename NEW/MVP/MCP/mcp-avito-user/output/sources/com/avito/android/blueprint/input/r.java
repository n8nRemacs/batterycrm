package com.avito.android.blueprint.input;

import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishInputPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<hJ.h> f105554a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<HtmlEditorViewModel> f105555b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f105556c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Q1> f105557d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<LlmDescriptionPresenter> f105558e;

    public r(Provider<hJ.h> provider, Provider<HtmlEditorViewModel> provider2, Provider<InterfaceC28373a> provider3, Provider<Q1> provider4, Provider<LlmDescriptionPresenter> provider5) {
        this.f105554a = provider;
        this.f105555b = provider2;
        this.f105556c = provider3;
        this.f105557d = provider4;
        this.f105558e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f105554a.get(), this.f105555b.get(), this.f105556c.get(), this.f105557d.get(), this.f105558e.get());
    }
}
