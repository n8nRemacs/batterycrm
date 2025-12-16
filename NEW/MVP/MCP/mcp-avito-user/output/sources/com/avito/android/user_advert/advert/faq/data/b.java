package com.avito.android.user_advert.advert.faq.data;

import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import yH0.C50115a;

/* compiled from: AdvertFaqSurveyApiMapper.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/faq/data/b;", "Lcom/avito/android/user_advert/advert/faq/data/a;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.user_advert.advert.faq.data.a
    @Y61.k
    public final Ul0.c a(@Y61.k List<C50115a> list) {
        List<C50115a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (C50115a c50115a : list2) {
            arrayList.add(new Ul0.b(c50115a.f443012d, c50115a.f443010b, c50115a.f443009a, c50115a.f443011c));
        }
        return new Ul0.c(arrayList);
    }
}
