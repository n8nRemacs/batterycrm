package com.yandex.div.state;

import com.yandex.div.state.db.j;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DivStateDatabase.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/yandex/div/state/db/f;", "invoke", "()Lcom/yandex/div/state/db/f;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class d extends N implements Y41.a<com.yandex.div.state.db.f> {
    @Override // Y41.a
    public final com.yandex.div.state.db.f invoke() {
        com.yandex.div.state.db.f fVar = new com.yandex.div.state.db.f(new j(null, null, null, 1).getWritableDatabase());
        fVar.a(System.currentTimeMillis() - c.f370582a);
        return fVar;
    }
}
