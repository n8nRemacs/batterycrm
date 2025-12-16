package com.avito.android.mandatory_verification.presentation;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f184744b;

    public g(e eVar) {
        this.f184744b = eVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        view.removeOnLayoutChangeListener(this);
        int height = view.getHeight();
        e eVar = this.f184744b;
        if (height <= 0) {
            int i22 = e.f184735g;
            eVar.getClass();
        } else {
            RecyclerView recyclerView = eVar.f184738c;
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.l(new i(height), -1);
            }
        }
    }
}
