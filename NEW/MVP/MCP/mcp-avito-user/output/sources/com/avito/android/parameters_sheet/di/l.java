package com.avito.android.parameters_sheet.di;

import android.content.res.Resources;
import com.avito.android.R;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ParametersListDialogModule_ProvideHtmlRenderOptionsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<hJ.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f210773a;

    public l(dagger.internal.l lVar) {
        this.f210773a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f210773a.f393949a;
        d.f210761a.getClass();
        return new hJ.h((int) resources.getDimension(R.dimen.list_bullet_left_margin), (int) resources.getDimension(R.dimen.list_bullet_right_margin), (int) resources.getDimension(R.dimen.list_bullet_symbol_width), (int) resources.getDimension(R.dimen.paragraph_space_margin), "—", true);
    }
}
