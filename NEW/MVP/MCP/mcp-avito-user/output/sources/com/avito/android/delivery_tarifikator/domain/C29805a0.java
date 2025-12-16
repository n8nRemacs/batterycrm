package com.avito.android.delivery_tarifikator.domain;

import Ov.l;
import com.avito.android.delivery_tarifikator.domain.Y;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: TariffUsageChecker.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/a0;", "Lcom/avito/android/delivery_tarifikator/domain/Z;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: com.avito.android.delivery_tarifikator.domain.a0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29805a0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l0 f135267a;

    @Inject
    public C29805a0(@Y61.k l0 l0Var) {
        this.f135267a = l0Var;
    }

    public static ArrayList b(long j12, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ov.g gVar = (Ov.g) it.next();
            Ov.l lVar = gVar.f12685b;
            Ov.d dVar = null;
            l.b bVar = lVar instanceof l.b ? (l.b) lVar : null;
            Long lValueOf = bVar != null ? Long.valueOf(bVar.f12697a) : null;
            if (lValueOf != null && j12 == lValueOf.longValue()) {
                dVar = gVar.f12684a;
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.Z
    @Y61.k
    public final Y a(long j12) {
        H hE2 = this.f135267a.e();
        ArrayList arrayListB = b(j12, hE2.f135242b);
        if (!arrayListB.isEmpty()) {
            return Y.b.a(arrayListB);
        }
        ArrayList arrayListB2 = b(j12, hE2.f135241a);
        return !arrayListB2.isEmpty() ? Y.b.a(arrayListB2) : Y.a.f135265a;
    }
}
