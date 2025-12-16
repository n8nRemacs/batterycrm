package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ColorFunctions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/function/w;", "Lcom/yandex/div/evaluable/g;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38097w extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC38074k f369899b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.yandex.div.evaluable.h> f369900c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final EvaluableType f369901d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f369902e;

    public AbstractC38097w(@Y61.k AbstractC38074k abstractC38074k) {
        super(null, 1, null);
        this.f369899b = abstractC38074k;
        this.f369900c = C42745f0.U(new com.yandex.div.evaluable.h(EvaluableType.STRING, false, 2, null), new com.yandex.div.evaluable.h(EvaluableType.NUMBER, false, 2, null));
        this.f369901d = EvaluableType.COLOR;
        this.f369902e = true;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        String str = (String) list.get(0);
        try {
            com.yandex.div.evaluable.types.a.f369990b.getClass();
            return this.f369899b.e(C42745f0.U(com.yandex.div.evaluable.types.a.a(a.C10920a.b(str)), list.get(1)));
        } catch (IllegalArgumentException e12) {
            com.yandex.div.evaluable.d.c(getF369935b(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e12);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return this.f369900c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final EvaluableType getF369901d() {
        return this.f369901d;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f, reason: from getter */
    public final boolean getF369902e() {
        return this.f369902e;
    }
}
