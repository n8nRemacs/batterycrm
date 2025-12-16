package com.avito.android.beduin.common.component.conditional_group.component;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ValueIsEqualCondition.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/k;", "Lkotlin/Function1;", "", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements Y41.l<Object, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Object f101095b;

    public k(@Y61.l Object obj) {
        this.f101095b = obj;
    }

    @Override // Y41.l
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(@Y61.l Object obj) {
        Object obj2 = this.f101095b;
        if (!(obj2 instanceof Number)) {
            return Boolean.valueOf(L.f(obj, obj2));
        }
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(((Number) obj2).doubleValue() == number.doubleValue());
    }
}
