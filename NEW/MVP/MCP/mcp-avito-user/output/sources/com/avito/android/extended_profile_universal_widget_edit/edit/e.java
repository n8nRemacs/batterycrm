package com.avito.android.extended_profile_universal_widget_edit.edit;

import android.view.View;
import com.avito.android.extended_profile_universal_widget_edit.edit.UniversalWidgetEditFragment;
import iB.InterfaceC41263a;
import jB.InterfaceC42227a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f153823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f153824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41263a.C11369a f153825d;

    public /* synthetic */ e(g gVar, InterfaceC41263a.C11369a c11369a, int i12) {
        this.f153823b = i12;
        this.f153824c = gVar;
        this.f153825d = c11369a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f153823b) {
            case 0:
                ((UniversalWidgetEditFragment.e) this.f153824c.f153832e).invoke(new InterfaceC42227a.f(this.f153825d));
                break;
            default:
                ((UniversalWidgetEditFragment.e) this.f153824c.f153832e).invoke(new InterfaceC42227a.f(this.f153825d));
                break;
        }
    }
}
