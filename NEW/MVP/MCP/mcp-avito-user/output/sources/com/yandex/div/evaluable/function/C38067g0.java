package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: VariableFunctions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/function/g0;", "Lcom/yandex/div/evaluable/g;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.g0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38067g0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.expression.f f369722b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.yandex.div.evaluable.h> f369723c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final EvaluableType f369724d;

    public C38067g0(@Y61.k com.yandex.div.core.expression.f fVar) {
        super(fVar);
        this.f369722b = fVar;
        com.yandex.div.evaluable.h hVar = new com.yandex.div.evaluable.h(EvaluableType.STRING, false, 2, null);
        EvaluableType evaluableType = EvaluableType.INTEGER;
        this.f369723c = C42745f0.U(hVar, new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        this.f369724d = evaluableType;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        String str = (String) list.get(0);
        Long l12 = (Long) list.get(1);
        l12.getClass();
        Object obj = this.f369722b.get(str);
        Long l13 = obj instanceof Long ? (Long) obj : null;
        return l13 == null ? l12 : l13;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return this.f369723c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return "getIntegerValue";
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final EvaluableType getF369862d() {
        return this.f369724d;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return false;
    }
}
