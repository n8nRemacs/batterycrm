package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: IntegerArithmeticFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/x0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.x0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38100x0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C38100x0 f369915b = new C38100x0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369916c = "copySign";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369917d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369918e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369919f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f369917d = C42745f0.U(new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        f369918e = evaluableType;
        f369919f = true;
    }

    public C38100x0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        Long l12 = (Long) C42745f0.E(list);
        long jLongValue = l12.longValue();
        int iSignum = Long.signum(((Long) C42745f0.Q(list)).longValue());
        if (iSignum == 0) {
            return l12;
        }
        if (jLongValue != Long.MIN_VALUE) {
            return Long.valueOf(Math.abs(jLongValue) * iSignum);
        }
        if (iSignum == -1) {
            return l12;
        }
        com.yandex.div.evaluable.d.d(f369916c, "Integer overflow.", list);
        throw null;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369917d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369916c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369918e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369919f;
    }
}
