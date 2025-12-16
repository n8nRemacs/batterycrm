package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.u;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileBeduinNativeItemPaddingDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Integer f151354b = null;

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        Integer num;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        d dVar = adapter instanceof d ? (d) adapter : null;
        if (dVar == null) {
            return;
        }
        int iU2 = RecyclerView.U(view);
        Object obj = dVar.f53650c.f53994f.get(iU2);
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            u.a aVar = uVar.f151422b;
            Integer num2 = aVar.f151423a;
            if (num2 != null) {
                rect.top = num2.intValue();
            }
            Integer num3 = aVar.f151424b;
            if (num3 != null) {
                rect.bottom = num3.intValue();
            }
        }
        if (iU2 != dVar.getItemCount() - 1 || (num = this.f151354b) == null) {
            return;
        }
        rect.bottom = num.intValue();
    }
}
