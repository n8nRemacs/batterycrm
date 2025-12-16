package com.avito.android.verification.verification_form_builder;

import TM0.a;
import YM0.a;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.verification_form_builder.FormBuilderFragment;
import com.avito.android.verification.verification_status_list.VerificationStatusListFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements com.avito.android.verification.inn.list.button.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f325368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f325369c;

    public /* synthetic */ a(BaseFragment baseFragment, int i12) {
        this.f325368b = i12;
        this.f325369c = baseFragment;
    }

    @Override // com.avito.android.verification.inn.list.button.c
    public final void E7(ButtonItem buttonItem) {
        BaseFragment baseFragment = this.f325369c;
        switch (this.f325368b) {
            case 0:
                FormBuilderFragment.a aVar = FormBuilderFragment.f325335u0;
                ((FormBuilderFragment) baseFragment).q5().accept(new a.e(buttonItem));
                break;
            default:
                VerificationStatusListFragment.a aVar2 = VerificationStatusListFragment.f325745s0;
                ((com.avito.android.verification.verification_status_list.k) ((VerificationStatusListFragment) baseFragment).f325749q0.getValue()).accept(new a.C1376a(buttonItem.f323903d));
                break;
        }
    }
}
