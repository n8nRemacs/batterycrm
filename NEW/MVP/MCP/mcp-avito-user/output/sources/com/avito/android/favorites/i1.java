package com.avito.android.favorites;

import android.content.DialogInterface;
import iR.C41336a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class i1 implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f157372b;

    public /* synthetic */ i1(int i12) {
        this.f157372b = i12;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i12) {
        switch (this.f157372b) {
            case 0:
                C41336a.C11375a.a();
                break;
            case 1:
                C41336a.C11375a.a();
                break;
            case 2:
                C41336a.C11375a.a();
                break;
            case 3:
                C41336a.C11375a.a();
                dialogInterface.dismiss();
                break;
            default:
                ru.cyberity.cbr.presentation.screen.preview.applicantdata.b.a(dialogInterface, i12);
                break;
        }
    }
}
