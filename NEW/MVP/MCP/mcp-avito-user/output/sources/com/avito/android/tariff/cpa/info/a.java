package com.avito.android.tariff.cpa.info;

import android.view.View;
import bB0.InterfaceC25488a;
import com.avito.android.lib.design.input.Input;
import com.avito.android.tariff.cpa.info.CpaInfoFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f294618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CpaInfoFragment f294619c;

    public /* synthetic */ a(CpaInfoFragment cpaInfoFragment, int i12) {
        this.f294618b = i12;
        this.f294619c = cpaInfoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String deformattedText;
        CpaInfoFragment cpaInfoFragment = this.f294619c;
        switch (this.f294618b) {
            case 0:
                CpaInfoFragment.a aVar = CpaInfoFragment.f294596A0;
                cpaInfoFragment.q5(InterfaceC25488a.C1995a.f56980a);
                break;
            default:
                Input input = cpaInfoFragment.f294608y0;
                if (input != null && (deformattedText = input.getDeformattedText()) != null) {
                    cpaInfoFragment.q5(new InterfaceC25488a.g(deformattedText));
                    break;
                }
                break;
        }
    }
}
