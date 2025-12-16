package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi;

import com.avito.android.iac_problems.public_module.models.IacProblem;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: Comparisons.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class m<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        int i12;
        int i13 = 1;
        switch (((IacProblem) t12).ordinal()) {
            case 0:
                i12 = 1;
                break;
            case 1:
                i12 = 2;
                break;
            case 2:
                i12 = 3;
                break;
            case 3:
                i12 = 5;
                break;
            case 4:
                i12 = 6;
                break;
            case 5:
                i12 = 7;
                break;
            case 6:
                i12 = 4;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Integer numValueOf = Integer.valueOf(i12);
        switch (((IacProblem) t13).ordinal()) {
            case 0:
                break;
            case 1:
                i13 = 2;
                break;
            case 2:
                i13 = 3;
                break;
            case 3:
                i13 = 5;
                break;
            case 4:
                i13 = 6;
                break;
            case 5:
                i13 = 7;
                break;
            case 6:
                i13 = 4;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return kotlin.comparisons.a.b(numValueOf, Integer.valueOf(i13));
    }
}
