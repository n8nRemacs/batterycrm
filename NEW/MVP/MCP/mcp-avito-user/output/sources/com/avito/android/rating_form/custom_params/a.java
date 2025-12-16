package com.avito.android.rating_form.custom_params;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddressParamsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/custom_params/a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final AddressParameter.ValidationRules f248013a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f248013a, ((a) obj).f248013a);
    }

    public final int hashCode() {
        AddressParameter.ValidationRules validationRules = this.f248013a;
        if (validationRules == null) {
            return 0;
        }
        return validationRules.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "AddressParams(minimalPrecision=" + this.f248013a + ')';
    }

    public a(@Y61.l AddressParameter.ValidationRules validationRules) {
        this.f248013a = validationRules;
    }

    public /* synthetic */ a(AddressParameter.ValidationRules validationRules, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : validationRules);
    }
}
