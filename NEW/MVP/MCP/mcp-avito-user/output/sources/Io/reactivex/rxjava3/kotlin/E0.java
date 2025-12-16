package io.reactivex.rxjava3.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: observable.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0001*\u00020\u00042,\u0010\u0005\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "R", "kotlin.jvm.PlatformType", "T", "", "it", "", "apply", "([Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class E0<T, R> implements l41.o<Object[], R> {
    @Override // l41.o
    public final Object apply(Object[] objArr) {
        List listAsList = Arrays.asList(objArr);
        ArrayList arrayList = new ArrayList(C42745f0.q(listAsList, 10));
        for (T t12 : listAsList) {
            if (t12 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T");
            }
            arrayList.add(t12);
        }
        throw null;
    }
}
