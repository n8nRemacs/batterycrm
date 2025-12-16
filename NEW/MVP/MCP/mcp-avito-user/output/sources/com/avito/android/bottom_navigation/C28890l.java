package com.avito.android.bottom_navigation;

import KV.a;
import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.ui.TooltipWithCloseCause;
import kotlin.Metadata;

/* compiled from: BottomNavigationTooltipDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/l;", "", "<init>", "()V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bottom_navigation.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28890l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public TooltipWithCloseCause f107034a;

    public final void a() {
        TooltipWithCloseCause tooltipWithCloseCause = this.f107034a;
        if (tooltipWithCloseCause != null) {
            tooltipWithCloseCause.setOnDismissListener(null);
        }
        TooltipWithCloseCause tooltipWithCloseCause2 = this.f107034a;
        if (tooltipWithCloseCause2 != null) {
            tooltipWithCloseCause2.dismiss();
        }
        this.f107034a = null;
    }

    public final void b(@Y61.k Context context, @Y61.k View view, @j.U int i12, @Y61.l String str, @Y61.l String str2, @Y61.l ButtonAction buttonAction, @Y61.l Boolean bool, int i13, @Y61.l Integer num) {
        Resources resources = context.getResources();
        TooltipWithCloseCause tooltipWithCloseCause = new TooltipWithCloseCause(context, 0, 0, null, 14, null);
        this.f107034a = tooltipWithCloseCause;
        if (num != null) {
            a.C0572a c0572a = KV.a.f9464v;
            ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
            int iIntValue = num.intValue();
            c0572a.getClass();
            tooltipWithCloseCause.c(a.C0572a.b(iIntValue, contextThemeWrapperB));
        }
        r.d dVar = new r.d(new i.a(new b.a()));
        dVar.j(i12);
        dVar.m(resources.getDimensionPixelSize(R.dimen.bottom_nav_tab_tooltip_display_paddings));
        tooltipWithCloseCause.f181224j = dVar;
        int i14 = tooltipWithCloseCause.f181229o;
        tooltipWithCloseCause.f181228n = i13;
        tooltipWithCloseCause.f181229o = i14;
        com.avito.android.lib.design.tooltip.p.a(tooltipWithCloseCause, new C28889k(str, str2, bool, buttonAction, tooltipWithCloseCause, this));
        tooltipWithCloseCause.d(new ViewOnClickListenerC28887i(tooltipWithCloseCause, this, 0));
        tooltipWithCloseCause.setTouchable(true);
        tooltipWithCloseCause.setOutsideTouchable(true);
        tooltipWithCloseCause.setOnDismissListener(new C28888j(tooltipWithCloseCause, this));
        tooltipWithCloseCause.f(view);
    }
}
