package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IntervalFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/k0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.k0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38075k0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C38075k0 f369774b = new C38075k0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369775c = "getIntervalTotalDays";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369776d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369777e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369778f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f369776d = Collections.singletonList(new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        f369777e = evaluableType;
        f369778f = true;
    }

    public C38075k0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        long jLongValue = ((Long) list.get(0)).longValue();
        if (jLongValue < 0) {
            throw new EvaluableException("Failed to evaluate [getIntervalTotalDays(-1)]. Expecting non-negative number of milliseconds.", null, 2, null);
        }
        long j12 = 60;
        return Long.valueOf((((jLongValue / 1000) / j12) / j12) / 24);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369776d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369775c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369772d() {
        return f369777e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369773e() {
        return f369778f;
    }
}
