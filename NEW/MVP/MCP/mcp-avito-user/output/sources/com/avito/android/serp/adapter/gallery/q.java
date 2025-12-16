package com.avito.android.serp.adapter.gallery;

import android.view.View;
import com.avito.android.util.K2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f270055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f270056c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f270057d;

    public /* synthetic */ q(View view, int i12, int i13) {
        this.f270055b = i13;
        this.f270056c = view;
        this.f270057d = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i12 = this.f270057d;
        View view = this.f270056c;
        switch (this.f270055b) {
            case 0:
                int i13 = t.f270060n;
                view.setVisibility(i12);
                break;
            default:
                K2.j(view, i12);
                break;
        }
    }
}
