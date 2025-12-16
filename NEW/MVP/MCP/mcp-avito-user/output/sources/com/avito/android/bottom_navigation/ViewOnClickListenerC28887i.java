package com.avito.android.bottom_navigation;

import android.view.View;
import com.avito.android.ui.TooltipWithCloseCause;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.bottom_navigation.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class ViewOnClickListenerC28887i implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f107023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TooltipWithCloseCause f107024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C28890l f107025d;

    public /* synthetic */ ViewOnClickListenerC28887i(TooltipWithCloseCause tooltipWithCloseCause, C28890l c28890l, int i12) {
        this.f107023b = i12;
        this.f107024c = tooltipWithCloseCause;
        this.f107025d = c28890l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f107023b) {
            case 0:
                TooltipWithCloseCause.CloseCause closeCause = TooltipWithCloseCause.CloseCause.f304531c;
                this.f107024c.dismiss();
                this.f107025d.f107034a = null;
                break;
            case 1:
                TooltipWithCloseCause.CloseCause closeCause2 = TooltipWithCloseCause.CloseCause.f304530b;
                this.f107024c.dismiss();
                this.f107025d.f107034a = null;
                break;
            default:
                TooltipWithCloseCause.CloseCause closeCause3 = TooltipWithCloseCause.CloseCause.f304532d;
                this.f107024c.dismiss();
                this.f107025d.f107034a = null;
                break;
        }
    }
}
