package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.e;
import com.yandex.div.evaluable.internal.b;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: NumberArithmeticFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/Q;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class Q extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Q f369564b = new Q();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369565c = "sub";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369566d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369567e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369568f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        f369566d = Collections.singletonList(new com.yandex.div.evaluable.h(evaluableType, true));
        f369567e = evaluableType;
        f369568f = true;
    }

    public Q() {
        super(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        Double dValueOf = Double.valueOf(0.0d);
        int i12 = 0;
        for (Double dB2 : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            double dDoubleValue = dValueOf.doubleValue();
            if (i12 != 0) {
                e.a aVar = com.yandex.div.evaluable.e.f369413c;
                b.d.a.f.C10914a c10914a = b.d.a.f.C10914a.f369973a;
                Double dValueOf2 = Double.valueOf(dDoubleValue);
                aVar.getClass();
                dB2 = e.a.b(c10914a, dValueOf2, dB2);
            }
            dValueOf = dB2;
            dValueOf.getClass();
            i12 = i13;
        }
        return dValueOf;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369566d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369565c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369567e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369568f;
    }
}
