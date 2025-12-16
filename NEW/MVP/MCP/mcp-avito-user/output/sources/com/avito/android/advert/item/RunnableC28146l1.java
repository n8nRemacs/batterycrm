package com.avito.android.advert.item;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.advert.item.l1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class RunnableC28146l1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1 f77252c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.j f77253d;

    public /* synthetic */ RunnableC28146l1(I1 i12, RecyclerView.j jVar, int i13) {
        this.f77251b = i13;
        this.f77252c = i12;
        this.f77253d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f77251b) {
            case 0:
                this.f77252c.f71750x0.setItemAnimator(this.f77253d);
                break;
            default:
                this.f77252c.f71750x0.setItemAnimator(this.f77253d);
                break;
        }
    }
}
