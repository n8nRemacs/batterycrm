package com.avito.android.screens.bbip_private_v2.data;

import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Comparisons.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class c<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        BbipPrivateV2State.b.a.C7820a c7820a = (BbipPrivateV2State.b.a.C7820a) t12;
        Long l12 = c7820a.f261056h;
        Long lValueOf = Long.valueOf((l12 == null && (l12 = c7820a.f261057i) == null) ? c7820a.f261049a : l12.longValue());
        BbipPrivateV2State.b.a.C7820a c7820a2 = (BbipPrivateV2State.b.a.C7820a) t13;
        Long l13 = c7820a2.f261056h;
        return kotlin.comparisons.a.b(lValueOf, Long.valueOf((l13 == null && (l13 = c7820a2.f261057i) == null) ? c7820a2.f261049a : l13.longValue()));
    }
}
