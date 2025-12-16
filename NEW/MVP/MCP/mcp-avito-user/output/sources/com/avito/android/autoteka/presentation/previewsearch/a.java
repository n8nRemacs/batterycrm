package com.avito.android.autoteka.presentation.previewsearch;

import android.view.View;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AutotekaPreviewSearchActivity f97553c;

    public /* synthetic */ a(AutotekaPreviewSearchActivity autotekaPreviewSearchActivity, int i12) {
        this.f97552b = i12;
        this.f97553c = autotekaPreviewSearchActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AutotekaPreviewSearchActivity autotekaPreviewSearchActivity = this.f97553c;
        switch (this.f97552b) {
            case 0:
                com.avito.android.autoteka.items.payment.h hVar = AutotekaPreviewSearchActivity.f97529x;
                autotekaPreviewSearchActivity.finish();
                break;
            default:
                com.avito.android.autoteka.items.payment.h hVar2 = AutotekaPreviewSearchActivity.f97529x;
                autotekaPreviewSearchActivity.a2().accept(AutotekaPreviewSearchAction.ClickToPurchase.f97609b);
                break;
        }
    }
}
