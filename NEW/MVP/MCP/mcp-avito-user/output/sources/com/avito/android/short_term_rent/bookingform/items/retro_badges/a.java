package com.avito.android.short_term_rent.bookingform.items.retro_badges;

import Y41.l;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RetroBadgePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/retro_badges/entity/RetroBadgeItemHint;", "hint", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/short_term_rent/view/components/retro_badges/entity/RetroBadgeItemHint;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements l<RetroBadgeItemHint, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f281623l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f281623l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(RetroBadgeItemHint retroBadgeItemHint) {
        RetroBadgeItemHint retroBadgeItemHint2 = retroBadgeItemHint;
        if (retroBadgeItemHint2 != null) {
            this.f281623l.f281624b.invoke(new a.k(retroBadgeItemHint2));
        }
        return G0.f406611a;
    }
}
