package com.avito.android.rating_form.custom_params;

import com.avito.android.di.B;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;

/* compiled from: AddressParamsProvider.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/custom_params/b;", "Lcom/avito/android/rating_form/custom_params/i;", "Lcom/avito/android/rating_form/custom_params/a;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements i<com.avito.android.rating_form.custom_params.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.d<com.avito.android.rating_form.custom_params.a> f248014a = m0.f406844a.b(com.avito.android.rating_form.custom_params.a.class);

    /* compiled from: AddressParamsProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/custom_params/b$a;", "", "<init>", "()V", "", "PRECISION_KEY", "Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.rating_form.custom_params.i
    public final com.avito.android.rating_form.custom_params.a a(Map map) {
        AddressParameter.ValidationRules validationRules = null;
        Object[] objArr = 0;
        if (map == null) {
            return null;
        }
        Object obj = map.get("minimalPrecision");
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? new com.avito.android.rating_form.custom_params.a(validationRules, 1, objArr == true ? 1 : 0) : new com.avito.android.rating_form.custom_params.a(new AddressParameter.ValidationRules(str));
    }

    @Override // com.avito.android.rating_form.custom_params.i
    @Y61.k
    public final kotlin.reflect.d<com.avito.android.rating_form.custom_params.a> getKey() {
        return this.f248014a;
    }
}
