package com.avito.android.lib.design.bottom_sheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetListView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/m;", "Lcom/avito/android/lib/util/t;", "Lcom/avito/android/lib/design/bottom_sheet/k;", "Lcom/avito/android/lib/design/list_item/ListItem;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m extends com.avito.android.lib.util.t<k, ListItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f178555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f178556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f178557c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public N f178558d;

    public m(@Y61.k LinearLayout linearLayout, int i12) {
        this.f178555a = linearLayout;
        this.f178556b = i12;
        this.f178557c = linearLayout.getContext();
    }

    @Override // com.avito.android.lib.util.t
    public final void a(View view, Object obj) {
        ListItem listItem = (ListItem) view;
        k kVar = (k) obj;
        listItem.setTitle(kVar.f178542b);
        ColorStateList colorStateList = kVar.f178543c;
        if (colorStateList != null) {
            listItem.setTitleColor(colorStateList);
        }
        listItem.setSubtitle(kVar.f178544d);
        ColorStateList colorStateList2 = kVar.f178545e;
        if (colorStateList2 != null) {
            listItem.setSubtitleColor(colorStateList2);
        }
        listItem.setMessage(kVar.f178546f);
        ColorStateList colorStateList3 = kVar.f178547g;
        if (colorStateList3 != null) {
            listItem.setMessageColor(colorStateList3);
        }
        listItem.setLink(kVar.f178548h);
        ColorStateList colorStateList4 = kVar.f178549i;
        if (colorStateList4 != null) {
            listItem.setLinkColor(colorStateList4);
        }
        listItem.setLinkClickedListener(new l(kVar));
        listItem.g(kVar.f178551k, kVar.f178552l);
        listItem.setOnClickListener(new t(2, this, kVar));
    }

    @Override // com.avito.android.lib.util.t
    public final View b() {
        ListItem listItem = new ListItem(this.f178557c, null);
        D6.f(listItem, D6.j(listItem, 16), 0, 0, 0, 14);
        listItem.setAppearance(this.f178556b);
        return listItem;
    }
}
