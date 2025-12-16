package com.avito.android.profile.pro.impl.screen;

import android.view.View;
import com.avito.android.profile.pro.impl.screen.ProfileProFragment;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.profile.pro.impl.screen.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class ViewOnClickListenerC33357a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f222941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f222942c;

    public /* synthetic */ ViewOnClickListenerC33357a(Object obj, int i12) {
        this.f222941b = i12;
        this.f222942c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f222942c;
        switch (this.f222941b) {
            case 0:
                int i12 = ProfileProFragment.f222861X0;
                ((com.avito.android.lib.design.bottom_sheet.d) obj).hide();
                break;
            case 1:
                int i13 = ProfileProFragment.f222861X0;
                ((com.avito.android.lib.design.bottom_sheet.d) obj).hide();
                break;
            default:
                ((ProfileProFragment.C33356a) obj).f222898f.invoke();
                break;
        }
    }
}
