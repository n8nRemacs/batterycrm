package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: NumberArithmeticFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/G;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class G extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final G f369470b = new G();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369471c = "div";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369472d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369473e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369474f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        f369472d = C42745f0.U(new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        f369473e = evaluableType;
        f369474f = true;
    }

    public G() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        double dDoubleValue = ((Double) C42745f0.E(list)).doubleValue();
        double dDoubleValue2 = ((Double) C42745f0.Q(list)).doubleValue();
        if (dDoubleValue2 != 0.0d) {
            return Double.valueOf(dDoubleValue / dDoubleValue2);
        }
        com.yandex.div.evaluable.d.d(f369471c, "Division by zero is not supported.", list);
        throw null;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369472d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369471c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369473e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369474f;
    }
}
