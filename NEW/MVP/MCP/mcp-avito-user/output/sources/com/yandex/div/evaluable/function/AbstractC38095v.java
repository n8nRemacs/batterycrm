package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.a;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ColorFunctions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/function/v;", "Lcom/yandex/div/evaluable/g;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38095v extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC38072j f369885b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.yandex.div.evaluable.h> f369886c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final EvaluableType f369887d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f369888e;

    public AbstractC38095v(@Y61.k AbstractC38072j abstractC38072j) {
        super(null, 1, null);
        this.f369885b = abstractC38072j;
        this.f369886c = Collections.singletonList(new com.yandex.div.evaluable.h(EvaluableType.STRING, false, 2, null));
        this.f369887d = EvaluableType.NUMBER;
        this.f369888e = true;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        String str = (String) C42745f0.E(list);
        try {
            com.yandex.div.evaluable.types.a.f369990b.getClass();
            return this.f369885b.e(Collections.singletonList(com.yandex.div.evaluable.types.a.a(a.C10920a.b(str))));
        } catch (IllegalArgumentException e12) {
            com.yandex.div.evaluable.d.c(getF369935b(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e12);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return this.f369886c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final EvaluableType getF369887d() {
        return this.f369887d;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f, reason: from getter */
    public final boolean getF369888e() {
        return this.f369888e;
    }
}
