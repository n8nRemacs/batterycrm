package com.avito.android.short_term_rent.bookingform.items.toggle;

import Y41.r;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AbsToggleOptionsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle/ToggleOptionItem;", "selectedToggleChip", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/short_term_rent/bookingform/items/toggle/ToggleOptionItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.l<ToggleOptionItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f281710l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ToggleOptionsItem f281711m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ToggleOptionsItem toggleOptionsItem) {
        super(1);
        this.f281710l = bVar;
        this.f281711m = toggleOptionsItem;
    }

    @Override // Y41.l
    public final G0 invoke(ToggleOptionItem toggleOptionItem) {
        ToggleOptionItem toggleOptionItem2 = toggleOptionItem;
        r<String, String, a.r.InterfaceC8403a, Boolean, G0> rVar = this.f281710l.f281707b;
        ToggleOptionsItem toggleOptionsItem = this.f281711m;
        rVar.invoke(toggleOptionsItem.f281700c, toggleOptionItem2.f281691b, new a.r.InterfaceC8403a.C8404a(toggleOptionItem2.f281695f), Boolean.valueOf(toggleOptionsItem.f281704g));
        return G0.f406611a;
    }
}
