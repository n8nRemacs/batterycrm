package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: VariableFunctions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/function/c0;", "Lcom/yandex/div/evaluable/g;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.c0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38059c0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.expression.f f369677b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.yandex.div.evaluable.h> f369678c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final EvaluableType f369679d;

    public C38059c0(@Y61.k com.yandex.div.core.expression.f fVar) {
        super(fVar);
        this.f369677b = fVar;
        EvaluableType evaluableType = EvaluableType.STRING;
        this.f369678c = C42745f0.U(new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        this.f369679d = EvaluableType.COLOR;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        String str = (String) list.get(0);
        a.C10920a c10920a = com.yandex.div.evaluable.types.a.f369990b;
        String str2 = (String) list.get(1);
        c10920a.getClass();
        int iB2 = a.C10920a.b(str2);
        Object obj = this.f369677b.get(str);
        com.yandex.div.evaluable.types.a aVar = obj instanceof com.yandex.div.evaluable.types.a ? (com.yandex.div.evaluable.types.a) obj : null;
        return aVar == null ? com.yandex.div.evaluable.types.a.a(iB2) : aVar;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return this.f369678c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return "getColorValue";
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final EvaluableType getF369679d() {
        return this.f369679d;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return false;
    }
}
