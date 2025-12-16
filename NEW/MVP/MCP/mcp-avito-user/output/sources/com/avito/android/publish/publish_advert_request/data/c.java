package com.avito.android.publish.publish_advert_request.data;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.U;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishAdvertRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/data/c;", "Lcom/avito/android/publish/publish_advert_request/data/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H0 f238967a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C50213a f238968b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CategoryParametersConverter f238969c;

    @Inject
    public c(@k H0 h02, @k C50213a c50213a, @k CategoryParametersConverter categoryParametersConverter) {
        this.f238967a = h02;
        this.f238968b = c50213a;
        this.f238969c = categoryParametersConverter;
    }

    @Override // com.avito.android.publish.publish_advert_request.data.a
    @k
    public final U a(@k Navigation navigation2, @k CategoryParameters categoryParameters, @l String str, @l String str2) {
        CategoryParametersConverter categoryParametersConverter = this.f238969c;
        return g1.a(this.f238967a.Q(categoryParametersConverter.convertToFieldMap(navigation2), categoryParametersConverter.convertToFieldMap(categoryParameters.getParametersExceptOwnedBySlots()), this.f238968b.b(), str, str2)).r(b.f238966b).u(new C32102w0(11));
    }
}
