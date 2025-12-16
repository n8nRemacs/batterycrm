package com.avito.android.mortgage.manager_usp.mapper;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import p00.C44968a;
import p00.C44969b;
import p00.C44970c;
import z00.C50332a;
import z00.f;
import z00.g;

/* compiled from: ManagerUspDataMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/mapper/b;", "Lcom/avito/android/mortgage/manager_usp/mapper/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.mortgage.manager_usp.mapper.a
    @k
    public final f a(@k C44968a c44968a) {
        String title = c44968a.getTitle();
        List<C44969b> listC = c44968a.c();
        if (listC == null) {
            listC = C42784z0.f406748b;
        }
        List<C44969b> list = listC;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C44969b c44969b : list) {
            arrayList.add(new g(c44969b.getTitle(), c44969b.getDescription(), c44969b.getIconName()));
        }
        C44970c action = c44968a.getAction();
        return new f(title, arrayList, action != null ? new C50332a(action.getTitle(), action.getUri()) : null);
    }
}
