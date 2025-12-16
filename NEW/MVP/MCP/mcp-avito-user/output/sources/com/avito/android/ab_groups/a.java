package com.avito.android.ab_groups;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: AbExperimentsActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class a extends H implements Y41.l<Boolean, G0> {
    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        p pVar = (p) this.receiver;
        pVar.f67669d = zBooleanValue;
        pVar.notifyDataSetChanged();
        return G0.f406611a;
    }
}
