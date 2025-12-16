package com.avito.android.short_term_rent.bookingform.items.text;

import com.avito.android.short_term_rent.bookingform.items.ItemAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AbsFormTextPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FormTextItem f281679l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f281680m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FormTextItem formTextItem, e eVar) {
        super(0);
        this.f281679l = formTextItem;
        this.f281680m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ItemAction itemAction = this.f281679l.f281672d;
        if (itemAction != null) {
            this.f281680m.f281681b.invoke(itemAction.f281446b);
        }
        return G0.f406611a;
    }
}
