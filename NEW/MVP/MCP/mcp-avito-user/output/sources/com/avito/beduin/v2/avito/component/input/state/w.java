package com.avito.beduin.v2.avito.component.input.state;

import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoInputStateFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/avito/component/input/state/w;", "Lcom/avito/beduin/v2/engine/component/j;", "Lcom/avito/beduin/v2/avito/component/input/state/a;", "Lcom/avito/beduin/v2/avito/component/input/state/i;", "Lcom/avito/beduin/v2/avito/component/input/state/j;", "Lcom/avito/beduin/v2/avito/component/input/state/k;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class w extends AbstractC36250j {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.o<c> f334548c;

    public w() {
        throw null;
    }

    public w(String str, com.avito.beduin.v2.theme.o oVar, C42822w c42822w) {
        super(str, false, 2, null);
        this.f334548c = oVar;
    }

    @Override // com.avito.beduin.v2.engine.component.AbstractC36250j
    public final Object a(AbstractC36250j.b bVar, String str) {
        return (AvitoInputState) E.b(bVar, bVar.f336563b, new v(bVar, this));
    }
}
