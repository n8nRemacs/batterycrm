package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.e;
import com.yandex.div.evaluable.internal.b;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: IntegerArithmeticFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/E0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class E0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final E0 f369455b = new E0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369456c = "mul";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369457d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369458e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369459f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f369457d = Collections.singletonList(new com.yandex.div.evaluable.h(evaluableType, true));
        f369458e = evaluableType;
        f369459f = true;
    }

    public E0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        Long l12 = 0L;
        int i12 = 0;
        for (Object objA : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            long jLongValue = l12.longValue();
            if (i12 != 0) {
                e.a aVar = com.yandex.div.evaluable.e.f369413c;
                b.d.a.c.C10910c c10910c = b.d.a.c.C10910c.f369969a;
                Long lValueOf = Long.valueOf(jLongValue);
                aVar.getClass();
                objA = e.a.a(c10910c, lValueOf, objA);
            }
            l12 = (Long) objA;
            l12.getClass();
            i12 = i13;
        }
        return l12;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369457d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369456c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369458e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369459f;
    }
}
