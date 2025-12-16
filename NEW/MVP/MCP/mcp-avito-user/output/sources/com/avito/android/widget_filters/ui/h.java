package com.avito.android.widget_filters.ui;

import Y41.l;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersTooltipHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements l<o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f330313l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f330314m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f330315n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f330316o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f330317p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, String str2, boolean z12, i iVar, Y41.a<G0> aVar) {
        super(1);
        this.f330313l = str;
        this.f330314m = str2;
        this.f330315n = z12;
        this.f330316o = iVar;
        this.f330317p = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(o oVar) {
        o oVar2 = oVar;
        String str = this.f330313l;
        oVar2.i(str);
        D6.G(oVar2.f181253b, !(str == null || str.length() == 0));
        String str2 = this.f330314m;
        oVar2.b(str2);
        D6.G(oVar2.f181254c, !(str2 == null || str2.length() == 0));
        oVar2.f(this.f330315n);
        oVar2.e(new g(0, this.f330316o, this.f330317p));
        return G0.f406611a;
    }
}
