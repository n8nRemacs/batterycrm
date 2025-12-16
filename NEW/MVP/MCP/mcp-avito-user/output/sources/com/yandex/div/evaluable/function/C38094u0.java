package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: VariableFunctions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/function/u0;", "Lcom/yandex/div/evaluable/g;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.u0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38094u0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.expression.f f369877b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.yandex.div.evaluable.h> f369878c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final EvaluableType f369879d;

    public C38094u0(@Y61.k com.yandex.div.core.expression.f fVar) {
        super(fVar);
        this.f369877b = fVar;
        EvaluableType evaluableType = EvaluableType.STRING;
        this.f369878c = C42745f0.U(new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        this.f369879d = evaluableType;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        String str = (String) list.get(0);
        String str2 = (String) list.get(1);
        Object obj = this.f369877b.get(str);
        String str3 = obj instanceof String ? (String) obj : null;
        return str3 == null ? str2 : str3;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return this.f369878c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return "getStringValue";
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final EvaluableType getF369879d() {
        return this.f369879d;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return false;
    }
}
