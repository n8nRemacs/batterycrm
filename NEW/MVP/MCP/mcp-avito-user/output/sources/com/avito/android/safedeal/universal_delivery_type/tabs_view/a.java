package com.avito.android.safedeal.universal_delivery_type.tabs_view;

import Y61.k;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.h;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsTabsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/tabs_view/a;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f256857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.offlinization.ui.a f256858b;

    public a(b bVar, com.avito.android.offlinization.ui.a aVar) {
        this.f256857a = bVar;
        this.f256858b = aVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@k h hVar) {
        Integer num = (Integer) C42745f0.G(this.f256857a.f256859a.n());
        if (num != null) {
            this.f256858b.c(num.intValue());
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@k h hVar) {
    }
}
