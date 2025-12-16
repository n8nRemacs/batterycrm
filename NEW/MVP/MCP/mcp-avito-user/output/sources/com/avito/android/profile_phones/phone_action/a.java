package com.avito.android.profile_phones.phone_action;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f227262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhoneActionFragment f227263c;

    public /* synthetic */ a(PhoneActionFragment phoneActionFragment, int i12) {
        this.f227262b = i12;
        this.f227263c = phoneActionFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f227262b) {
            case 0:
                com.avito.android.profile_phones.phone_action.view_model.a aVar = this.f227263c.f227256s0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.A2();
                break;
            default:
                com.avito.android.profile_phones.phone_action.view_model.a aVar2 = this.f227263c.f227256s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.rd();
                break;
        }
    }
}
