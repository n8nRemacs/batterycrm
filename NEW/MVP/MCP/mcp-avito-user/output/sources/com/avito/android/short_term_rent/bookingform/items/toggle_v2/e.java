package com.avito.android.short_term_rent.bookingform.items.toggle_v2;

import Y41.l;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToggleV2Presenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/ToggleV2Options;", "option", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/ToggleV2Options;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<ToggleV2Options, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f281736l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ToggleV2Item f281737m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ToggleV2Item toggleV2Item) {
        super(1);
        this.f281736l = fVar;
        this.f281737m = toggleV2Item;
    }

    @Override // Y41.l
    public final G0 invoke(ToggleV2Options toggleV2Options) {
        ToggleV2Options toggleV2Options2 = toggleV2Options;
        l<com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> lVar = this.f281736l.f281738b;
        ToggleV2Item toggleV2Item = this.f281737m;
        lVar.invoke(new a.r(toggleV2Item.f281722b, toggleV2Options2.f281725b, new a.r.InterfaceC8403a.C8404a(toggleV2Options2.f281728e), toggleV2Item.f281723c));
        return G0.f406611a;
    }
}
