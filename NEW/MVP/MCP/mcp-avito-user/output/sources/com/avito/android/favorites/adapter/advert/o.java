package com.avito.android.favorites.adapter.advert;

import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.favorites.adapter.advert.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoriteAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "quantity", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class o extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f156457l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f156458m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Stepper f156459n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, String str, Stepper stepper) {
        super(1);
        this.f156457l = pVar;
        this.f156458m = str;
        this.f156459n = stepper;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        d.a aVar = this.f156457l.f156460b;
        if (aVar != null) {
            Stepper stepper = this.f156459n;
            aVar.b(stepper.f116271b, iIntValue, this.f156458m, stepper.f116272c);
        }
        return G0.f406611a;
    }
}
