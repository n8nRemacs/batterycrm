package com.avito.android.short_term_rent.utils;

import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.validation.g1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrSoftBookingParametersValidatorResourceProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/utils/k;", "Lcom/avito/android/validation/g1;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements g1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f283022a;

    @Inject
    public k(@Y61.k q qVar) {
        this.f283022a = qVar;
    }

    @Override // com.avito.android.validation.g1
    @Y61.k
    public final String a(@Y61.k EditableParameter<?> editableParameter) {
        boolean z12 = editableParameter instanceof CharParameter;
        q qVar = this.f283022a;
        return z12 ? qVar.f283036a : editableParameter instanceof PhoneParameter ? qVar.f283037b : editableParameter instanceof EmailParameter ? qVar.f283038c : qVar.f283039d;
    }
}
