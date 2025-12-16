package com.avito.android.inline_filters.dialog.calendar.konveyor.items.day;

import android.view.View;
import java.util.Date;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f171227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l41.g f171228c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Date f171229d;

    public /* synthetic */ f(l41.g gVar, Date date, int i12) {
        this.f171227b = i12;
        this.f171228c = gVar;
        this.f171229d = date;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Date date = this.f171229d;
        l41.g gVar = this.f171228c;
        switch (this.f171227b) {
            case 0:
                int i12 = g.f171230f;
                gVar.accept(date);
                break;
            default:
                int i13 = com.avito.android.vas_planning_calendar.view.konveyor.items.day.f.f322711f;
                gVar.accept(date);
                break;
        }
    }
}
