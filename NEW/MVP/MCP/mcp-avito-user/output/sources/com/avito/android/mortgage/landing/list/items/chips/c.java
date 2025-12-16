package com.avito.android.mortgage.landing.list.items.chips;

import Y41.l;
import com.avito.android.mortgage.landing.list.items.chips.ChipsItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import w00.InterfaceC49409a;

/* compiled from: ChipsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/chips/ChipsItem$Chip;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mortgage/landing/list/items/chips/ChipsItem$Chip;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements l<ChipsItem.Chip, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f199679l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ChipsItem f199680m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ChipsItem chipsItem) {
        super(1);
        this.f199679l = dVar;
        this.f199680m = chipsItem;
    }

    @Override // Y41.l
    public final G0 invoke(ChipsItem.Chip chip) {
        this.f199679l.f199681b.invoke(new InterfaceC49409a.C49410b(this.f199680m.f199668b, chip));
        return G0.f406611a;
    }
}
