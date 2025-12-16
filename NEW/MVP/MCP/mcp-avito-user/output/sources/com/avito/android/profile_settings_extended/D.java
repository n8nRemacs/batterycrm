package com.avito.android.profile_settings_extended;

import android.os.Parcelable;
import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSettingsMviView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class D extends kotlin.jvm.internal.H implements Y41.l<RecyclerView, G0> {
    public final void f(@Y61.k RecyclerView recyclerView) {
        B b12 = (B) this.receiver;
        Parcelable parcelable = b12.f228979v;
        if (parcelable != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.X0(parcelable);
            }
            b12.f228979v = null;
        }
        recyclerView.l(new Rb0.f(recyclerView.getRootView().getContext(), b12.f228960c, 0, 0, 12, null), -1);
        recyclerView.l(new com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.b(), -1);
        int i12 = b12.f228966i;
        D6.f(recyclerView, i12, 0, i12, 0, 10);
        recyclerView.setClipToPadding(false);
        recyclerView.o(b12.f228982y);
        new C23427s(new C33512z(new C(b12))).c(recyclerView);
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(RecyclerView recyclerView) {
        f(recyclerView);
        return G0.f406611a;
    }
}
