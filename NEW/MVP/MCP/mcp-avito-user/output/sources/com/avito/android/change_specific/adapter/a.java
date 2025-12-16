package com.avito.android.change_specific.adapter;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChangeSpecificPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/change_specific/adapter/a;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.recycler.data_aware.a {
    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF85702c()) : null, aVar2 != null ? Long.valueOf(aVar2.getF85702c()) : null) || !(aVar instanceof m) || !(aVar2 instanceof m)) {
            return null;
        }
        boolean z12 = ((m) aVar2).f117906c;
        ((m) aVar).getClass();
        return new n(z12, false);
    }
}
