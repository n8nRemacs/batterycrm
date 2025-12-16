package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import android.content.Context;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class v extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35693c.b f315697l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f315698m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.h<com.avito.android.lib.design.tooltip.k> f315699n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C35695e f315700o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f315701p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(InterfaceC35693c.b bVar, Context context, l0.h hVar, C35695e c35695e, kotlinx.coroutines.r rVar) {
        super(1);
        this.f315697l = bVar;
        this.f315698m = context;
        this.f315699n = hVar;
        this.f315700o = c35695e;
        this.f315701p = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        InterfaceC35693c.b bVar = this.f315697l;
        PrintableText printableText = bVar.f315622b;
        Context context = this.f315698m;
        oVar2.i(printableText.k0(context));
        oVar2.b(bVar.f315623c.k0(context));
        PrintableText printableText2 = bVar.f315624d;
        oVar2.d(printableText2 != null ? printableText2.k0(context) : null);
        oVar2.c(new u(this.f315699n, this.f315700o, this.f315701p, bVar));
        return G0.f406611a;
    }
}
