package com.avito.android.verification.inn.list.select;

import Y41.l;
import android.view.View;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "tooltipView", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f324091l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SelectItem f324092m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, SelectItem selectItem) {
        super(1);
        this.f324091l = kVar;
        this.f324092m = selectItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(View view) {
        r.b bVar = new r.b(new i.a(null, 1, 0 == true ? 1 : 0));
        bVar.j(y6.b(-12));
        bVar.f181267g = y6.b(-3);
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(this.f324091l.f324095c.getContext(), 0, 0, 6, null);
        int iB2 = y6.b(320);
        int i12 = kVar.f181229o;
        kVar.f181228n = iB2;
        kVar.f181229o = i12;
        kVar.f181224j = bVar;
        p.a(kVar, new i(this.f324092m));
        kVar.f(view);
        return G0.f406611a;
    }
}
