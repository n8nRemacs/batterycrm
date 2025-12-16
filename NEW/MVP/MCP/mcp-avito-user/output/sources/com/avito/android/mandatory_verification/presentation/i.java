package com.avito.android.mandatory_verification.presentation;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.mandatory_verification.items.uploader.m;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: UploaderDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/i;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f184746b;

    /* renamed from: c, reason: collision with root package name */
    public final int f184747c = y6.b(135);

    public i(int i12) {
        this.f184746b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof m) {
            rect.bottom = this.f184746b + this.f184747c;
        }
    }
}
