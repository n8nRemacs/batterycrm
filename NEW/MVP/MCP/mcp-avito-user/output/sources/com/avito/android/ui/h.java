package com.avito.android.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SpacingListDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/h;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f304625b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304626c;

    /* renamed from: d, reason: collision with root package name */
    public final int f304627d;

    /* renamed from: e, reason: collision with root package name */
    public final int f304628e;

    public h() {
        this(0, 0, 0, 0, 15, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int iB2 = zVar.b() - 1;
        if (iB2 < 0) {
            iB2 = 0;
        }
        int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
        int i12 = this.f304628e;
        int i13 = bindingAdapterPosition == 0 ? this.f304626c : i12;
        if (bindingAdapterPosition == iB2) {
            i12 = this.f304627d;
        }
        int i14 = this.f304625b;
        if (i14 == 0) {
            rect.set(i13, 0, i12, 0);
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("Orientation must be one of [RecyclerView.VERTICAL, RecyclerView.HORIZONTAL]");
            }
            rect.set(0, i13, 0, i12);
        }
    }

    public /* synthetic */ h(int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
        this((i16 & 1) != 0 ? 1 : i12, (i16 & 2) != 0 ? 0 : i13, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }

    public h(int i12, @U int i13, @U int i14, @U int i15) {
        this.f304625b = i12;
        this.f304626c = i13;
        this.f304627d = i14;
        this.f304628e = i15 / 2;
    }
}
