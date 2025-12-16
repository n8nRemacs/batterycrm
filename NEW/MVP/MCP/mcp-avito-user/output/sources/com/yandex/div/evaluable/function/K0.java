package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ToString.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/K0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class K0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final K0 f369515b = new K0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369516c = "toString";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369517d = Collections.singletonList(new com.yandex.div.evaluable.h(EvaluableType.INTEGER, false, 2, null));

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369518e = EvaluableType.STRING;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369519f = true;

    public K0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        return String.valueOf(((Long) C42745f0.E(list)).longValue());
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369517d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369516c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369901d() {
        return f369518e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369519f;
    }
}
