package com.avito.android.dialog;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class d implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f144763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.s f144764c;

    public /* synthetic */ d(io.reactivex.rxjava3.core.s sVar, int i12) {
        this.f144763b = i12;
        this.f144764c = sVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f144763b) {
            case 0:
                this.f144764c.e();
                break;
            default:
                this.f144764c.e();
                break;
        }
    }
}
