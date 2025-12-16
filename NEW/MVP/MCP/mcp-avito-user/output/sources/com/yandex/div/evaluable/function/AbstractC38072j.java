package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ColorFunctions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/function/j;", "Lcom/yandex/div/evaluable/g;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38072j extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f369756b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.yandex.div.evaluable.h> f369757c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final EvaluableType f369758d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f369759e;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC38072j(@Y61.k Y41.l<? super com.yandex.div.evaluable.types.a, Integer> lVar) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f369756b = (kotlin.jvm.internal.N) lVar;
        this.f369757c = Collections.singletonList(new com.yandex.div.evaluable.h(EvaluableType.COLOR, false, 2, null));
        this.f369758d = EvaluableType.NUMBER;
        this.f369759e = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        int iIntValue = ((Number) this.f369756b.invoke((com.yandex.div.evaluable.types.a) C42745f0.E(list))).intValue();
        if (iIntValue < 0 || iIntValue >= 256) {
            throw new IllegalArgumentException("Value out of channel range 0..255");
        }
        return Double.valueOf(iIntValue / 255.0f);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return this.f369757c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final EvaluableType getF369758d() {
        return this.f369758d;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f, reason: from getter */
    public final boolean getF369759e() {
        return this.f369759e;
    }
}
