package com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel;

import aC0.C19756a;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureSubCategoriesConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/subcategories/viewmodel/b;", "Lcom/avito/android/tariff_lf_constructor/configure/subcategories/viewmodel/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.checkbox_selector.a f300483a;

    @Inject
    public b(@Y61.k com.avito.android.tariff_lf_constructor.configure.checkbox_selector.a aVar) {
        this.f300483a = aVar;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.a
    @Y61.k
    public final ED0.a a(@Y61.k C19756a c19756a) {
        return new ED0.a(new ED0.b(c19756a.getTitle(), c19756a.getCategory()), this.f300483a.a(c19756a.d(), true), c19756a.getButton(), c19756a.getAlertInfo());
    }
}
