package com.avito.android.extended_profile;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileMviView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class K extends kotlin.jvm.internal.H implements Y41.l<RecyclerView, G0> {
    @Override // Y41.l
    public final G0 invoke(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        A a12 = (A) this.receiver;
        Parcelable parcelable = a12.f149236U;
        if (parcelable != null) {
            RecyclerView.m layoutManager = recyclerView2.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.X0(parcelable);
            }
            a12.f149236U = null;
        }
        recyclerView2.o(a12.f149238W);
        recyclerView2.l(a12.f149227L, -1);
        recyclerView2.l(a12.f149228M, -1);
        recyclerView2.l(a12.f149226K, -1);
        return G0.f406611a;
    }
}
