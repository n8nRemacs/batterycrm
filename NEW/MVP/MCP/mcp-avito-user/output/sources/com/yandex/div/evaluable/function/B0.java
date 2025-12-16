package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IntegerArithmeticFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/B0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class B0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final B0 f369430b = new B0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369431c = "min";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369432d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369433e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369434f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f369432d = Collections.singletonList(new com.yandex.div.evaluable.h(evaluableType, true));
        f369433e = evaluableType;
        f369434f = true;
    }

    public B0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        if (list.isEmpty()) {
            String str = f369431c;
            com.yandex.div.evaluable.d.d(str, String.format("Non empty argument list is required for function '%s'.", Arrays.copyOf(new Object[]{str}, 1)), list);
            throw null;
        }
        Long lValueOf = Long.MAX_VALUE;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            lValueOf = Long.valueOf(Math.min(lValueOf.longValue(), ((Long) it.next()).longValue()));
        }
        return lValueOf;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369432d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369431c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369901d() {
        return f369433e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369434f;
    }
}
