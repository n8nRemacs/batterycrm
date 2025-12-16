package com.avito.android.bottom_navigation;

import com.avito.android.remote.model.ButtonAction;
import com.avito.android.ui.TooltipWithCloseCause;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BottomNavigationTooltipDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bottom_navigation.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28889k extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f107028l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f107029m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Boolean f107030n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ButtonAction f107031o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TooltipWithCloseCause f107032p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C28890l f107033q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28889k(String str, String str2, Boolean bool, ButtonAction buttonAction, TooltipWithCloseCause tooltipWithCloseCause, C28890l c28890l) {
        super(1);
        this.f107028l = str;
        this.f107029m = str2;
        this.f107030n = bool;
        this.f107031o = buttonAction;
        this.f107032p = tooltipWithCloseCause;
        this.f107033q = c28890l;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        oVar2.i(this.f107028l);
        oVar2.b(this.f107029m);
        Boolean bool = this.f107030n;
        oVar2.f(bool != null ? bool.booleanValue() : true);
        TooltipWithCloseCause tooltipWithCloseCause = this.f107032p;
        C28890l c28890l = this.f107033q;
        oVar2.e(new ViewOnClickListenerC28887i(tooltipWithCloseCause, c28890l, 1));
        ButtonAction buttonAction = this.f107031o;
        oVar2.d(buttonAction != null ? buttonAction.getTitle() : null);
        oVar2.c(new ViewOnClickListenerC28887i(tooltipWithCloseCause, c28890l, 2));
        return G0.f406611a;
    }
}
