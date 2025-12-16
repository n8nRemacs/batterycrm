package com.avito.android.photo_list_view_groups;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.Purpose;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoItemGroupsMenuBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/o;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f218634a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f218635b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.k Context context, @Y61.k Y41.l<? super Purpose, G0> lVar) {
        this.f218634a = context;
        this.f218635b = (N) lVar;
    }

    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d a(@Y61.k ArrayList arrayList) {
        Context context = this.f218634a;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setClipToPadding(false);
        linearLayout.setClipChildren(false);
        D6.f(linearLayout, 0, linearLayout.getResources().getDimensionPixelOffset(R.dimen.photo_item_groups_image_menu_container_padding), 0, linearLayout.getResources().getDimensionPixelOffset(R.dimen.photo_item_groups_image_menu_container_padding_bottom), 5);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ImageAction imageAction = (ImageAction) it.next();
            View viewInflate = View.inflate(context, R.layout.photo_item_groups_image_menu_action, null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.icon);
            Integer numM = com.avito.android.lib.util.f.m(imageAction.getIconName());
            if (numM != null) {
                int iIntValue = numM.intValue();
                FV.a.f4720a.getClass();
                FV.a.c(textView, iIntValue);
            }
            I5.a((TextView) viewInflate.findViewById(R.id.title), imageAction.getTitle(), false);
            viewInflate.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(17, this, imageAction));
            linearLayout.addView(viewInflate);
        }
        dVar.G(linearLayout, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.util.g.a(dVar);
        dVar.s();
        return dVar;
    }
}
