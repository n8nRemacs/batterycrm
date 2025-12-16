package mE0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ThemeSettingsPaddingDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmE0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mE0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43954a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public int f414432b;

    /* renamed from: c, reason: collision with root package name */
    public int f414433c;

    /* renamed from: d, reason: collision with root package name */
    public int f414434d;

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12 = this.f414433c / 2;
        int i13 = this.f414434d / 2;
        if (((GridLayoutManager.b) view.getLayoutParams()).f53670g == 2) {
            return;
        }
        int i14 = ((GridLayoutManager.b) view.getLayoutParams()).f53669f % 2;
        int i15 = this.f414432b;
        rect.left = i14 == 0 ? i15 : i12;
        if (((GridLayoutManager.b) view.getLayoutParams()).f53669f % 2 == 1) {
            i12 = i15;
        }
        rect.right = i12;
        rect.top = i13;
        rect.bottom = i13;
    }
}
