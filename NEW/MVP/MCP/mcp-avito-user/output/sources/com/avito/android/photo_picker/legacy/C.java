package com.avito.android.photo_picker.legacy;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class C implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f219575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f219576c;

    public /* synthetic */ C(E e12, int i12) {
        this.f219575b = i12;
        this.f219576c = e12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f219575b) {
            case 0:
                this.f219576c.f219579b.e();
                break;
            case 1:
                this.f219576c.f219579b.D();
                break;
            case 2:
                this.f219576c.f219579b.q();
                break;
            case 3:
                this.f219576c.f219579b.d();
                break;
            default:
                this.f219576c.f219579b.z();
                break;
        }
    }
}
