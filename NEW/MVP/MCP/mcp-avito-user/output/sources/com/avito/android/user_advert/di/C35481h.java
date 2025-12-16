package com.avito.android.user_advert.di;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: BaseAdvertDetailsModule_ProvideHtmlRenderOptionsFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.di.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35481h implements dagger.internal.h<hJ.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f310906a;

    public C35481h(dagger.internal.l lVar) {
        this.f310906a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f310906a.f393949a;
        C35479f.f310904a.getClass();
        return new hJ.h((int) resources.getDimension(R.dimen.advert_details_list_bullet_left_margin), (int) resources.getDimension(R.dimen.advert_details_list_bullet_right_margin), (int) resources.getDimension(R.dimen.advert_details_list_bullet_symbol_width), "—", false, (int) resources.getDimension(R.dimen.advert_details_paragraph_space_margin), 16, null);
    }
}
