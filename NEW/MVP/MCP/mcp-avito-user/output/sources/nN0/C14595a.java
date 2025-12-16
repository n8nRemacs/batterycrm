package Nn0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MarginItemDecorationAtPositions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNn0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nn0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14595a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f11749b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11750c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11751d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11752e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Set<Integer> f11753f;

    public C14595a() {
        throw null;
    }

    public C14595a(int i12, int i13, int i14, int i15, Set set, int i16, C42822w c42822w) {
        i12 = (i16 & 1) != 0 ? 0 : i12;
        i13 = (i16 & 2) != 0 ? 0 : i13;
        i14 = (i16 & 4) != 0 ? 0 : i14;
        i15 = (i16 & 8) != 0 ? 0 : i15;
        this.f11749b = i12;
        this.f11750c = i13;
        this.f11751d = i14;
        this.f11752e = i15;
        this.f11753f = set;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        if (this.f11753f.contains(Integer.valueOf(RecyclerView.U(view)))) {
            rect.top = this.f11749b;
            rect.left = this.f11751d;
            rect.right = this.f11752e;
            rect.bottom = this.f11750c;
        }
    }
}
