package com.avito.android.advert.item.complementary;

import Y41.l;
import android.view.View;
import com.avito.android.advert_core.advert.q;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComplementaryBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class a extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f74570l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f74570l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        b bVar = this.f74570l;
        bVar.f74578L = new f(view2, bVar.f74571E, (com.avito.konveyor.adapter.a) bVar.f74572F.get(), bVar.f74573G.get(), bVar.f74574H.get(), new q(bVar.f74571E.getF80221j(), view2.getResources(), bVar.f74576J, y6.b(12)), bVar.f74575I);
        bVar.f74577K.a(view2, bVar);
        return G0.f406611a;
    }
}
