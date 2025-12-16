package com.avito.android.beduin.common.component.albums.items;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AlbumsSpacingItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/items/g;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f100659b;

    /* renamed from: c, reason: collision with root package name */
    public final int f100660c;

    /* renamed from: d, reason: collision with root package name */
    public final int f100661d;

    public g() {
        this(0, 0, 0, 7, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        if (iU2 == 0) {
            rect.left = this.f100659b;
            return;
        }
        int iB2 = zVar.b() - 1;
        int i12 = this.f100661d;
        if (iU2 != iB2) {
            rect.left = i12;
        } else {
            rect.left = i12;
            rect.right = this.f100660c;
        }
    }

    public /* synthetic */ g(int i12, int i13, int i14, int i15, C42822w c42822w) {
        this((i15 & 1) != 0 ? 0 : i12, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? 0 : i14);
    }

    public g(int i12, int i13, int i14) {
        this.f100659b = i12;
        this.f100660c = i13;
        this.f100661d = i14;
    }
}
