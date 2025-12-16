package com.avito.android.rating.details.adapter;

import Y61.l;
import com.avito.android.rating_ui.aspects.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsContentPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/adapter/c;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.recycler.data_aware.a {
    @Inject
    public c() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!(aVar instanceof com.avito.android.rating_ui.aspects.a) || !(aVar2 instanceof com.avito.android.rating_ui.aspects.a)) {
            return null;
        }
        com.avito.android.rating_ui.aspects.a aVar3 = (com.avito.android.rating_ui.aspects.a) aVar2;
        com.avito.android.rating_ui.aspects.a aVar4 = (com.avito.android.rating_ui.aspects.a) aVar;
        if (aVar3.getF247679b() != aVar4.getF247679b()) {
            return null;
        }
        List<a.C7491a> list = aVar3.f249857d;
        boolean zF2 = L.f(list, aVar4.f249857d);
        boolean z12 = aVar3.f249860g;
        if (zF2 && z12 == aVar4.f249860g) {
            return null;
        }
        return new com.avito.android.rating_ui.aspects.d(list, z12);
    }
}
