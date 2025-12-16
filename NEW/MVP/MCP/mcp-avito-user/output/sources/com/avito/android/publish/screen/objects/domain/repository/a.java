package com.avito.android.publish.screen.objects.domain.repository;

import android.os.Bundle;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ObjectCategoryRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/domain/repository/a;", "Lcom/avito/android/details/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a extends com.avito.android.details.a {
    @Y61.l
    G0 C1();

    void C7();

    @Y61.k
    ObjectsParameter Dc();

    int Kb();

    void L6(@Y61.k CategoryParameters categoryParameters);

    @Y61.k
    Bundle P();

    boolean T0();

    @Y61.l
    G0 Tc(@Y61.k PretendResult pretendResult);

    @Y61.l
    String Z5();

    void b(@Y61.l Bundle bundle);

    @Y61.l
    String b8();

    @Y61.l
    String dc();
}
