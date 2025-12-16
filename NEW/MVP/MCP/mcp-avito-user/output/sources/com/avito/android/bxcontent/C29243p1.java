package com.avito.android.bxcontent;

import android.view.View;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: BxContentView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/p1;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.p1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29243p1 extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C29240o1 f112814b;

    public C29243p1(C29240o1 c29240o1) {
        this.f112814b = c29240o1;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@Y61.k View view, float f12) {
        C29240o1 c29240o1 = this.f112814b;
        c29240o1.f112761u0.b();
        c29240o1.f112693U.K5(new InterfaceC29127b.C29145j(f12));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@Y61.k View view, int i12) {
        if (i12 == 3 || i12 == 4 || i12 == 5) {
            this.f112814b.f112693U.K5(new InterfaceC29127b.C29147k(i12, true));
        }
    }
}
