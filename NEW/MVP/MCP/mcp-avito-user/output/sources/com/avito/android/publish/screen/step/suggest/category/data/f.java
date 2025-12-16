package com.avito.android.publish.screen.step.suggest.category.data;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: SuggestCategoryRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/data/f;", "Lcom/avito/android/publish/screen/step/suggest/category/data/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H0 f242283a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C50213a f242284b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CategoryParametersConverter f242285c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Q1 f242286d;

    @Inject
    public f(@k H0 h02, @k C50213a c50213a, @k CategoryParametersConverter categoryParametersConverter, @k Q1 q12) {
        this.f242283a = h02;
        this.f242284b = c50213a;
        this.f242285c = categoryParametersConverter;
        this.f242286d = q12;
    }

    @Override // com.avito.android.publish.screen.step.suggest.category.data.e
    @k
    public final z a(@k Navigation navigation2, @k CategoryParameters categoryParameters) {
        boolean zBooleanValue = this.f242286d.z().invoke().booleanValue();
        C50213a c50213a = this.f242284b;
        H0 h02 = this.f242283a;
        CategoryParametersConverter categoryParametersConverter = this.f242285c;
        return zBooleanValue ? h02.q(categoryParametersConverter.convertToFieldMap(navigation2), categoryParametersConverter.convertToFieldMap(categoryParameters.getParametersExceptOwnedBySlots()), c50213a.b()) : h02.r(categoryParametersConverter.convertToFieldMap(navigation2), categoryParametersConverter.convertToFieldMap(categoryParameters.getParametersExceptOwnedBySlots()), c50213a.b());
    }
}
