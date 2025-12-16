package com.avito.android.mortgage.util;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SpanProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/util/a;", "Lcom/avito/android/mortgage/util/f;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public UV0.c f203843a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f203844b = new LinkedHashMap();

    @Override // com.avito.android.mortgage.util.f
    public final void b(@k UV0.c cVar) {
        this.f203843a = cVar;
    }

    public abstract int c(@k com.avito.conveyor_item.a aVar);

    @Override // com.avito.android.mortgage.util.f
    public final int d(int i12) {
        UV0.c cVar = this.f203843a;
        if (cVar == null) {
            throw new IllegalStateException("Data source should be provided");
        }
        LinkedHashMap linkedHashMap = this.f203844b;
        if (i12 < 0 || i12 >= cVar.getCount()) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i12));
            if (num != null) {
                return num.intValue();
            }
            return 1;
        }
        int iMin = Math.min(((A00.d) this).f35c, c((com.avito.conveyor_item.a) cVar.f16399b.get(i12)));
        linkedHashMap.put(Integer.valueOf(i12), Integer.valueOf(iMin));
        return iMin;
    }
}
