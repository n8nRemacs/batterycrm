package de0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.publish.EditAdvertResult;
import io.reactivex.rxjava3.core.I;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: EditAdvertRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lde0/e;", "Lde0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements InterfaceC39719d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC39718c f393988a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CategoryParametersConverter f393989b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C50213a f393990c;

    @Inject
    public e(@k InterfaceC39718c interfaceC39718c, @k CategoryParametersConverter categoryParametersConverter, @k C50213a c50213a) {
        this.f393988a = interfaceC39718c;
        this.f393989b = categoryParametersConverter;
        this.f393990c = c50213a;
    }

    @Override // de0.InterfaceC39719d
    @k
    public final I<TypedResult<EditAdvertResult>> a(@k String str, @k String str2, @k Navigation navigation2, @l String str3, @k CategoryParameters categoryParameters, @l String str4) {
        List<ParameterSlot> parametersExceptOwnedBySlots = categoryParameters.getParametersExceptOwnedBySlots();
        CategoryParametersConverter categoryParametersConverter = this.f393989b;
        Map<String, String> mapConvertToFieldMap = categoryParametersConverter.convertToFieldMap(parametersExceptOwnedBySlots);
        return this.f393988a.a(str, str2, categoryParametersConverter.convertToFieldMap(navigation2), str3, mapConvertToFieldMap, this.f393990c.b(), str4);
    }
}
