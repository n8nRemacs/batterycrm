package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ColorFunctions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/function/k;", "Lcom/yandex/div/evaluable/g;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38074k extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f369770b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.yandex.div.evaluable.h> f369771c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final EvaluableType f369772d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f369773e;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC38074k(@Y61.k Y41.p<? super com.yandex.div.evaluable.types.a, ? super Double, com.yandex.div.evaluable.types.a> pVar) {
        super(null, 1, null);
        this.f369770b = (kotlin.jvm.internal.N) pVar;
        EvaluableType evaluableType = EvaluableType.COLOR;
        this.f369771c = C42745f0.U(new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(EvaluableType.NUMBER, false, 2, null));
        this.f369772d = evaluableType;
        this.f369773e = true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        int i12 = ((com.yandex.div.evaluable.types.a) list.get(0)).f369991a;
        Double d12 = (Double) list.get(1);
        d12.getClass();
        try {
            return com.yandex.div.evaluable.types.a.a(((com.yandex.div.evaluable.types.a) this.f369770b.invoke(com.yandex.div.evaluable.types.a.a(i12), d12)).f369991a);
        } catch (IllegalArgumentException unused) {
            com.yandex.div.evaluable.d.d(getF369935b(), "Value out of range 0..1.", C42745f0.U(com.yandex.div.evaluable.types.a.b(i12), d12));
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return this.f369771c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final EvaluableType getF369772d() {
        return this.f369772d;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f, reason: from getter */
    public final boolean getF369773e() {
        return this.f369773e;
    }
}
