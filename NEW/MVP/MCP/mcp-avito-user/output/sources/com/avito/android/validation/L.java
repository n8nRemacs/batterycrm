package com.avito.android.validation;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideHtmlRenderOptionsFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class L implements dagger.internal.h<hJ.h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f319273a;

    public L(Provider<Resources> provider) {
        this.f319273a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = this.f319273a.get();
        A.f319242a.getClass();
        return new hJ.h((int) resources.getDimension(R.dimen.list_bullet_left_margin), (int) resources.getDimension(R.dimen.list_bullet_right_margin), (int) resources.getDimension(R.dimen.list_bullet_symbol_width), (int) resources.getDimension(R.dimen.paragraph_space_margin), "—", true);
    }
}
