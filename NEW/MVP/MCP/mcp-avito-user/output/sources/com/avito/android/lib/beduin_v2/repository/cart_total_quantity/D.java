package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import Lm.C14411b;
import java.util.List;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CartMenuIconStorage.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "kotlin.jvm.PlatformType", "categories", "Ljava/util/Optional;", "", "quantity", "LLm/b;", "apply", "(Ljava/util/List;Ljava/util/Optional;)LLm/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class D<T1, T2, R> implements l41.c {

    /* renamed from: b, reason: collision with root package name */
    public static final D<T1, T2, R> f176445b = new D<>();

    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        return new C14411b((Integer) ((Optional) obj2).orElse(null), list.isEmpty() ? null : list);
    }
}
