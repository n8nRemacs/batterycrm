package com.avito.android.lib.beduin_v2.component.input;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InputCompose.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class j extends kotlin.jvm.internal.H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        Y41.a<G0> aVar = ((k) this.receiver).onDone;
        if (aVar != null) {
            aVar.invoke();
        }
        return G0.f406611a;
    }
}
