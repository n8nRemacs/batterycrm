package com.avito.android.short_term_rent.bookingform.items.button;

import Y41.l;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ButtonItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f281476l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ButtonItem f281477m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ButtonItem buttonItem) {
        super(0);
        this.f281476l = dVar;
        this.f281477m = buttonItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        l<com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> lVar = this.f281476l.f281478b;
        ButtonItem buttonItem = this.f281477m;
        lVar.invoke(new a.h(buttonItem.f281471g, buttonItem.f281470f));
        return G0.f406611a;
    }
}
