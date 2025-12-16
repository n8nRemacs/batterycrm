package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.e;
import com.yandex.div.evaluable.internal.b;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: NumberArithmeticFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/S;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class S extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final S f369579b = new S();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369580c = "sum";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369581d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369582e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369583f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        f369581d = Collections.singletonList(new com.yandex.div.evaluable.h(evaluableType, true));
        f369582e = evaluableType;
        f369583f = true;
    }

    public S() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        Double dValueOf = Double.valueOf(0.0d);
        for (Object obj : list) {
            double dDoubleValue = dValueOf.doubleValue();
            e.a aVar = com.yandex.div.evaluable.e.f369413c;
            b.d.a.f.C10915b c10915b = b.d.a.f.C10915b.f369974a;
            Double dValueOf2 = Double.valueOf(dDoubleValue);
            aVar.getClass();
            dValueOf = (Double) e.a.b(c10915b, dValueOf2, obj);
            dValueOf.getClass();
        }
        return dValueOf;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369581d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369580c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369901d() {
        return f369582e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369583f;
    }
}
