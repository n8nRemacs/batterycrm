package com.avito.android.error_reporting.error_reporter;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultipleTargetsErrorReporter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class s extends N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f147904l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ArrayList arrayList) {
        super(0);
        this.f147904l = arrayList;
    }

    @Override // Y41.a
    public final Integer invoke() {
        Integer num;
        Iterator it = this.f147904l.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((n) it.next()).d());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((n) it.next()).d());
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        return Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
    }
}
