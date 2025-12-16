package com.avito.android.rating_form.mvi;

import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Comparisons.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class r<T> implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f248804b;

    public r(q qVar) {
        this.f248804b = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        RatingFormAddValueType ratingFormAddValueType = (RatingFormAddValueType) t12;
        int i12 = q.f248799e;
        this.f248804b.getClass();
        int i13 = 2;
        Integer numValueOf = Integer.valueOf(ratingFormAddValueType instanceof RatingFormAddValueType.DraftCreated ? 0 : ratingFormAddValueType instanceof RatingFormAddValueType.StepsList ? 1 : 2);
        RatingFormAddValueType ratingFormAddValueType2 = (RatingFormAddValueType) t13;
        if (ratingFormAddValueType2 instanceof RatingFormAddValueType.DraftCreated) {
            i13 = 0;
        } else if (ratingFormAddValueType2 instanceof RatingFormAddValueType.StepsList) {
            i13 = 1;
        }
        return kotlin.comparisons.a.b(numValueOf, Integer.valueOf(i13));
    }
}
