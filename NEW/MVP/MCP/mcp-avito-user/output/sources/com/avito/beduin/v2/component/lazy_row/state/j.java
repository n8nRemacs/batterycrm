package com.avito.beduin.v2.component.lazy_row.state;

import Y61.k;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import kotlin.Metadata;

/* compiled from: LazyRowStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/state/j;", "Lcom/avito/beduin/v2/engine/component/j;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends AbstractC36250j {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final j f336094c = new j();

    public j() {
        super("LazyRow", false, 2, null);
    }

    @Override // com.avito.beduin.v2.engine.component.AbstractC36250j
    public final Object a(AbstractC36250j.b bVar, String str) {
        return (a) E.b(bVar, bVar.f336563b, new i(bVar));
    }
}
