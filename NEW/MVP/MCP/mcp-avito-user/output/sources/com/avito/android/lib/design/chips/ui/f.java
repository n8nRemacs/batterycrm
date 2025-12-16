package com.avito.android.lib.design.chips.ui;

import Y61.k;
import com.avito.android.lib.design.chips.u;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.lib.design.chips.w;
import kotlin.Metadata;

/* compiled from: ChipsAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/ui/f;", "Lcom/avito/android/lib/design/chips/b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.android.lib.design.chips.b {

    /* renamed from: j, reason: collision with root package name */
    @k
    public final g f178793j;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(@k w wVar, @k g gVar) {
        g.a aVar = gVar.f178797c;
        super(wVar, null, true, false, aVar.f178801b, aVar.f178802c);
        this.f178793j = gVar;
    }

    @Override // com.avito.android.lib.design.chips.b
    public final void k(boolean z12, boolean z13, @k u uVar) {
        g gVar = this.f178793j;
        g.a aVar = z13 ? gVar.f178797c : !z12 ? gVar.f178799e : gVar.f178798d;
        VU.b bVar = aVar.f178800a;
        VU.a aVar2 = aVar.f178803d;
        if (aVar2 == null) {
            aVar2 = bVar.f17149a;
        }
        uVar.f178781b.setStyle(VU.b.a(bVar, aVar2, null, null, null, null, 0, 0, 0, 0, null, 262142));
    }
}
