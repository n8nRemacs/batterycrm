package com.avito.android.publish.details.parameters_filter;

import Y61.k;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.details.S0;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.select.Arguments;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishSelectRepositoryImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/parameters_filter/c;", "LZp0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements Zp0.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H0 f234874a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CategoryParametersConverter f234875b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributesTreeConverter f234876c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C50213a f234877d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final S0 f234878e;

    @Inject
    public c(@k H0 h02, @k CategoryParametersConverter categoryParametersConverter, @k AttributesTreeConverter attributesTreeConverter, @k C50213a c50213a, @k S0 s02) {
        this.f234874a = h02;
        this.f234875b = categoryParametersConverter;
        this.f234876c = attributesTreeConverter;
        this.f234877d = c50213a;
        this.f234878e = s02;
    }

    @Override // Zp0.d
    @k
    public final InterfaceC19588c<? super InterfaceC19587b> a(@k Arguments arguments) {
        return new f(this.f234874a, arguments.getRequestId(), this.f234875b, this.f234876c, this.f234877d, this.f234878e);
    }
}
