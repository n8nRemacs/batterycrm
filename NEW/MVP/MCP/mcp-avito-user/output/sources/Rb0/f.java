package Rb0;

import Y61.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.profile_settings_extended.adapter.about.i;
import com.avito.android.profile_settings_extended.adapter.geo.l;
import com.avito.android.profile_settings_extended.adapter.link_edit.h;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileSettingsItemsDecoration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRb0/f;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f14523b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14524c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14525d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14526e;

    public f(Context context, com.avito.konveyor.a aVar, int i12, int i13, int i14, C42822w c42822w) {
        i12 = (i14 & 4) != 0 ? R.attr.photoUploaderList : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_PhotoUploaderList : i13;
        this.f14525d = aVar.Y(com.avito.android.profile_settings_extended.adapter.gallery.image.a.class);
        this.f14526e = aVar.Y(com.avito.android.profile_settings_extended.adapter.gallery.appending.a.class);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, d.n.f178981m0, i12, i13);
        this.f14523b = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.f14523b);
        this.f14524c = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, this.f14524c);
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int iU2;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        int i12 = gridLayoutManager != null ? gridLayoutManager.f53662H : 1;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (RecyclerView.U(view) == 0) {
            rect.top = y6.b(14);
        }
        RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 != null && RecyclerView.U(view) == layoutManager2.o0() - 1) {
            rect.bottom = y6.b(40);
        }
        if (cW2 instanceof h ? true : cW2 instanceof i ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.setting.k ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.count.f ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.toggle.g ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.banner.i ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.popup_banner.f ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.phones.k ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.gallery.gallery_header.g ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.select.f ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.geo_v2.header.c ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.geo_v2.address.f ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.geo_v2.footer.c ? true : cW2 instanceof l) {
            rect.left = 0;
            rect.right = 0;
            return;
        }
        if (cW2 instanceof com.avito.android.promoblock.k) {
            rect.left = y6.b(10) + (-recyclerView.getPaddingLeft());
            rect.right = y6.b(10) + (-recyclerView.getPaddingLeft());
            return;
        }
        if (!(cW2 instanceof com.avito.android.profile_settings_extended.adapter.gallery.image.g ? true : cW2 instanceof com.avito.android.profile_settings_extended.adapter.gallery.appending.g)) {
            rect.left = -recyclerView.getPaddingLeft();
            rect.right = -recyclerView.getPaddingRight();
            return;
        }
        int i13 = this.f14523b;
        int i14 = i13 / i12;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
        int i15 = bVar != null ? bVar.f53669f : 0;
        rect.left = i14 * i15;
        rect.right = ((i12 - i15) - 1) * i14;
        int i16 = i13 / 2;
        rect.top = i16;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemViewType = -1;
        if (adapter != null && (iU2 = RecyclerView.U(view)) != adapter.getItemCount() - 1) {
            itemViewType = adapter.getItemViewType(iU2 + 1);
        }
        if (itemViewType == this.f14525d || itemViewType == this.f14526e) {
            rect.bottom = i16;
        }
    }
}
