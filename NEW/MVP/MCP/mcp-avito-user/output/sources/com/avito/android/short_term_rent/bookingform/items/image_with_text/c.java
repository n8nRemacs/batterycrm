package com.avito.android.short_term_rent.bookingform.items.image_with_text;

import com.avito.android.short_term_rent.bookingform.items.ItemAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AbsImageWithTextPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ImageWithTextItem f281510l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f281511m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ImageWithTextItem imageWithTextItem, e eVar) {
        super(0);
        this.f281510l = imageWithTextItem;
        this.f281511m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ItemAction itemAction = this.f281510l.f281505e;
        if (itemAction != null) {
            ((k) this.f281511m.f281514b).invoke(itemAction.f281446b);
        }
        return G0.f406611a;
    }
}
