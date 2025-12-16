package com.avito.android.advert_core.body_condition;

import androidx.camera.core.impl.r0;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.deep_linking.links.BodyConditionPoint;
import com.avito.android.deep_linking.links.BodyConditionSide;
import com.avito.android.remote.model.AdvertParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsCarBodyConditionParamsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/body_condition/d;", "Lcom/avito/android/advert_core/body_condition/c;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r0 f83037a = new r0(4);

    @Inject
    public d() {
    }

    @Override // com.avito.android.advert_core.body_condition.c
    @Y61.l
    public final List<AdvertParameters.Parameter> a(@Y61.l BodyCondition bodyCondition) {
        if (bodyCondition == null) {
            return null;
        }
        List<BodyConditionSide> sides = bodyCondition.getSides();
        ArrayList arrayList = new ArrayList(C42745f0.q(sides, 10));
        Iterator<T> it = sides.iterator();
        while (it.hasNext()) {
            arrayList.add(b((BodyConditionSide) it.next()));
        }
        return C42745f0.B0(C42745f0.H(arrayList), this.f83037a);
    }

    @Override // com.avito.android.advert_core.body_condition.c
    @Y61.k
    public final ArrayList b(@Y61.k BodyConditionSide bodyConditionSide) {
        List<BodyConditionPoint> points = bodyConditionSide.getPoints();
        ArrayList arrayList = new ArrayList(C42745f0.q(points, 10));
        for (BodyConditionPoint bodyConditionPoint : points) {
            arrayList.add(new AdvertParameters.Parameter(bodyConditionPoint.getParamsTitle(), C42784z0.f406748b, bodyConditionPoint.getParamsValue(), null, null, null, null, 104, null));
        }
        return arrayList;
    }
}
