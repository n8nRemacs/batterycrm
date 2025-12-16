package com.avito.android.passport.profile_add.create_flow.select_vertical.recycler;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectVerticalPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/q;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements com.avito.android.recycler.data_aware.a {
    @Inject
    public q() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        v vVar = null;
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF186614b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF186614b()) : null)) {
            return null;
        }
        if ((aVar instanceof u) && (aVar2 instanceof u)) {
            u uVar = (u) aVar2;
            boolean z12 = uVar.f212021c;
            boolean z13 = ((u) aVar).f212022d;
            boolean z14 = uVar.f212022d;
            vVar = new v(z12, z13 != z14, z14);
        }
        return vVar;
    }
}
