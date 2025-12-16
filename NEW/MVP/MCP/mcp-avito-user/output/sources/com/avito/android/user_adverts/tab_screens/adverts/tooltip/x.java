package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import android.widget.PopupWindow;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class x extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<com.avito.android.lib.design.tooltip.k> f315704l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C35695e f315705m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(l0.h<com.avito.android.lib.design.tooltip.k> hVar, C35695e c35695e) {
        super(1);
        this.f315704l = hVar;
        this.f315705m = c35695e;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        l0.h<com.avito.android.lib.design.tooltip.k> hVar = this.f315704l;
        com.avito.android.lib.design.tooltip.k kVar = hVar.f406842b;
        if (kVar != null) {
            kVar.setOnDismissListener((PopupWindow.OnDismissListener) this.f315705m.f315636c.getValue());
        }
        com.avito.android.lib.design.tooltip.k kVar2 = hVar.f406842b;
        if (kVar2 != null) {
            kVar2.dismiss();
        }
        return G0.f406611a;
    }
}
