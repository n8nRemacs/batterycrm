package com.avito.android.publish.analytics;

import com.avito.android.category_parameters.ParameterElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishInputsAnalyticTracker.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002(\u0010\u0005\u001a$\u0012\u000f\u0012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u0003\u0012\u000f\u0012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "Lkotlin/Q;", "", "Lkotlin/internal/i;", "wasNowPair", "", "apply", "(Lkotlin/Q;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class I<T, R> implements l41.o {
    @Override // l41.o
    public final Object apply(Object obj) {
        T next;
        kotlin.Q q12 = (kotlin.Q) obj;
        List list = (List) q12.f406619b;
        List list2 = (List) q12.f406620c;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        ParameterElement parameterElement = (ParameterElement) it.next();
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = (T) null;
                break;
            }
            next = it2.next();
            if (kotlin.jvm.internal.L.f(((ParameterElement) next).f117181b, parameterElement.f117181b)) {
                break;
            }
        }
        throw null;
    }
}
