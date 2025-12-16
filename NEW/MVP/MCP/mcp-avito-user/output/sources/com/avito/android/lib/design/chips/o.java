package com.avito.android.lib.design.chips;

import com.avito.android.lib.design.chips.Chips;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: Chips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class o extends H implements Y41.l<h, G0> {
    @Override // Y41.l
    public final G0 invoke(h hVar) {
        h hVar2 = hVar;
        Chips.e eVar = ((Chips) this.receiver).chipsOnRightDrawableClickedListener;
        if (eVar == null) {
            return null;
        }
        eVar.a(hVar2);
        return G0.f406611a;
    }
}
