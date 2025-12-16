package com.avito.android.llm.di;

import com.avito.android.llm.ui.LlmDescriptionPresenter;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LlmDescriptionModule_ProvideLlmDescriptionPresenterFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<LlmDescriptionPresenter> {

    /* compiled from: LlmDescriptionModule_ProvideLlmDescriptionPresenterFactory.java */
    public static final class a {
        static {
            new b();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.llm.di.a.f181675a.getClass();
        return new com.avito.android.llm.ui.b();
    }
}
