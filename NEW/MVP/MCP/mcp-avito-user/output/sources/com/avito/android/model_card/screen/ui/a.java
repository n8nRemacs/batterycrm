package com.avito.android.model_card.screen.ui;

import FZ.a;
import android.view.View;
import com.avito.android.model_card.screen.ui.ModelCardFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f198145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelCardFragment f198146c;

    public /* synthetic */ a(ModelCardFragment modelCardFragment, int i12) {
        this.f198145b = i12;
        this.f198146c = modelCardFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ModelCardFragment modelCardFragment = this.f198146c;
        switch (this.f198145b) {
            case 0:
                ModelCardFragment.a aVar = ModelCardFragment.f198116H0;
                modelCardFragment.requireActivity().onBackPressed();
                break;
            default:
                ModelCardFragment.a aVar2 = ModelCardFragment.f198116H0;
                ((d) modelCardFragment.f198126o0.getValue()).accept(a.C0293a.f4774a);
                break;
        }
    }
}
