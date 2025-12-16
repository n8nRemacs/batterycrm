package com.avito.android.publish.analytics;

import com.avito.android.category_parameters.ParameterElement;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PublishInputsAnalyticTracker.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00070\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0006\b\u0001\u0012\u00020\u0003 \u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "LUV0/a;", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "params", "", "Lkotlin/internal/i;", "apply", "(LUV0/a;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class L<T, R> implements l41.o {
    static {
        new L();
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        UV0.b bVarB = com.avito.konveyor.util.g.b((UV0.a) obj);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = bVarB.iterator();
        if (it.hasNext()) {
            it.next();
            kotlin.jvm.internal.L.l();
            throw null;
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((ParameterElement) it2.next());
        }
        return arrayList2;
    }
}
