package com.avito.android.lib.beduin_v2.beduin_item.stateful;

import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;

/* compiled from: BeduinItemStatefulViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/beduin_item/stateful/k;", "Lcom/avito/android/lib/beduin_v2/beduin_item/stateful/i;", "Lcom/avito/konveyor/util/d;", "Lcom/avito/android/lib/beduin_v2/beduin_item/stateful/a;", "_design-modules_beduin-v2_beduin-item_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k extends i implements com.avito.konveyor.util.d<a> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public C43238h f175460b;

    public k() {
        throw null;
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        C43238h c43238h = this.f175460b;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        C43238h c43238hA = U.a(K.f411877a.y());
        C43259k.d(c43238hA, null, null, new j(this, null), 3);
        this.f175460b = c43238hA;
        throw null;
    }
}
