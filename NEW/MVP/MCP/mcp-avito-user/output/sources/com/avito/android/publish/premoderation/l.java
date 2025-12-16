package com.avito.android.publish.premoderation;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: AdvertProactiveModerationInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/premoderation/l;", "Lcom/avito/android/publish/premoderation/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H0 f238315a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f238316b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f238317c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C50213a f238318d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Q1 f238319e;

    @Inject
    public l(@Y61.k H0 h02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k C50213a c50213a, @Y61.k Q1 q12) {
        this.f238315a = h02;
        this.f238316b = interfaceC35745a5;
        this.f238317c = categoryParametersConverter;
        this.f238318d = c50213a;
        this.f238319e = q12;
    }

    @Override // com.avito.android.publish.premoderation.k
    @Y61.k
    public final W a(@Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters, @Y61.l String str) {
        Q1 q12 = this.f238319e;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[2];
        boolean zBooleanValue = ((Boolean) q12.f67480d.a().invoke()).booleanValue();
        C50213a c50213a = this.f238318d;
        H0 h02 = this.f238315a;
        CategoryParametersConverter categoryParametersConverter = this.f238317c;
        return g1.a(zBooleanValue ? h02.z(categoryParametersConverter.convertToFieldMap(navigation2), categoryParametersConverter.convertToFieldMap(categoryParameters.getParametersExceptOwnedBySlots()), c50213a.b(), str) : h02.C(categoryParametersConverter.convertToFieldMap(navigation2), categoryParametersConverter.convertToFieldMap(categoryParameters.getParametersExceptOwnedBySlots()), c50213a.b(), str)).z(this.f238316b.a());
    }
}
