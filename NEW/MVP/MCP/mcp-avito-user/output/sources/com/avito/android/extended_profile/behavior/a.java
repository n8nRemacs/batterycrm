package com.avito.android.extended_profile.behavior;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f149400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f149401c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f149402d;

    public /* synthetic */ a(LinearLayoutManager linearLayoutManager, Integer num, int i12) {
        this.f149400b = i12;
        this.f149401c = linearLayoutManager;
        this.f149402d = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f149400b) {
            case 0:
                int iIntValue = this.f149402d.intValue() - 1;
                LinearLayoutManager linearLayoutManager = this.f149401c;
                View viewZ = linearLayoutManager.Z(iIntValue);
                linearLayoutManager.b2(r0.intValue() - 1, -(viewZ != null ? viewZ.getBottom() - viewZ.getTop() : 0));
                break;
            default:
                int iIntValue2 = this.f149402d.intValue() - 1;
                LinearLayoutManager linearLayoutManager2 = this.f149401c;
                View viewZ2 = linearLayoutManager2.Z(iIntValue2);
                linearLayoutManager2.b2(r0.intValue() - 1, -(viewZ2 != null ? viewZ2.getBottom() - viewZ2.getTop() : 0));
                break;
        }
    }
}
