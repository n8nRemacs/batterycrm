package com.avito.android.publish.details.parameters_filter;

import Y61.k;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.details.S0;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import io.reactivex.rxjava3.internal.operators.single.O;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import yc.C50213a;

/* compiled from: PublishSelectRepositoryImpl.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/parameters_filter/f;", "LZp0/c;", "Lcom/avito/android/publish/details/parameters_filter/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements InterfaceC19588c<a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H0 f234887a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f234888b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CategoryParametersConverter f234889c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributesTreeConverter f234890d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C50213a f234891e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final S0 f234892f;

    public f(@k H0 h02, @k String str, @k CategoryParametersConverter categoryParametersConverter, @k AttributesTreeConverter attributesTreeConverter, @k C50213a c50213a, @k S0 s02) {
        this.f234887a = h02;
        this.f234888b = str;
        this.f234889c = categoryParametersConverter;
        this.f234890d = attributesTreeConverter;
        this.f234891e = c50213a;
        this.f234892f = s02;
    }

    @Override // Zp0.InterfaceC19588c
    public final O a(InterfaceC19587b interfaceC19587b) {
        a aVar = (a) interfaceC19587b;
        return c(aVar.f234872a, aVar.f234873b);
    }

    @Override // Zp0.InterfaceC19588c
    @k
    public final O b(@k String str) {
        return c(0, str);
    }

    public final O c(int i12, String str) {
        List<ParameterSlot> parametersExceptOwnedBySlots;
        String strB = this.f234891e.b();
        S0 s02 = this.f234892f;
        Map<String, String> mapConvertToFieldMap = this.f234889c.convertToFieldMap(s02.U());
        CategoryParameters categoryParametersC0 = s02.C0();
        if (categoryParametersC0 == null || (parametersExceptOwnedBySlots = categoryParametersC0.getParametersExceptOwnedBySlots()) == null) {
            parametersExceptOwnedBySlots = C42784z0.f406748b;
        }
        AttributesTreeConverter attributesTreeConverter = this.f234890d;
        return this.f234887a.e(strB, str, i12, this.f234888b, 100, mapConvertToFieldMap, attributesTreeConverter.convertToParameterFieldMap(attributesTreeConverter.convertToParameterAttributesTree(parametersExceptOwnedBySlots))).r(new e(this, i12, str));
    }
}
