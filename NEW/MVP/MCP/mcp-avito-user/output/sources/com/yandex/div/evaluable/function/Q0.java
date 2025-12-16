package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: StringFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/Q0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class Q0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Q0 f369569b = new Q0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369570c = "padEnd";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369571d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369572e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369573f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        f369571d = C42745f0.U(new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(EvaluableType.INTEGER, false, 2, null), new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        f369572e = evaluableType;
        f369573f = true;
    }

    public Q0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        return kotlin.jvm.internal.L.j(f1.a((int) (((Long) list.get(1)).longValue() - r0.length()), (String) list.get(2)), (String) list.get(0));
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369571d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369570c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369879d() {
        return f369572e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369573f;
    }
}
