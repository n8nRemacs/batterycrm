package com.avito.android.map_core.view.pin_items;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class i implements l41.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f185820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.floating_views.h f185821c;

    public /* synthetic */ i(RecyclerView recyclerView, com.avito.android.floating_views.h hVar, int i12) {
        this.f185819a = i12;
        this.f185820b = recyclerView;
        this.f185821c = hVar;
    }

    @Override // l41.f
    public final void cancel() {
        switch (this.f185819a) {
            case 0:
                this.f185820b.v0(this.f185821c);
                break;
            default:
                this.f185820b.v0(this.f185821c);
                break;
        }
    }
}
