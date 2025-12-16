package com.avito.android.category.element;

import android.view.View;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.android.flexbox.FlexboxLayout;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f116614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.p f116615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f116616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f116617e;

    public /* synthetic */ m(Y41.p pVar, CategoryWidgetElementItem categoryWidgetElementItem, String str, int i12) {
        this.f116614b = i12;
        this.f116615c = pVar;
        this.f116616d = categoryWidgetElementItem;
        this.f116617e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageAction action;
        ImageAction action2;
        Y41.p pVar = this.f116615c;
        Object obj = this.f116617e;
        DeepLink deepLink = null;
        Object obj2 = this.f116616d;
        switch (this.f116614b) {
            case 0:
                int i12 = n.f116618h;
                ActionedImage actionedImage = ((CategoryWidgetElementItem) obj2).f116599f;
                if (actionedImage != null && (action = actionedImage.getAction()) != null) {
                    deepLink = action.getDeepLink();
                }
                pVar.invoke(deepLink, (String) obj);
                break;
            case 1:
                int i13 = n.f116618h;
                ActionedImage actionedImage2 = ((CategoryWidgetElementItem) obj2).f116599f;
                if (actionedImage2 != null && (action2 = actionedImage2.getAction()) != null) {
                    deepLink = action2.getDeepLink();
                }
                pVar.invoke(deepLink, (String) obj);
                break;
            default:
                int i14 = n.f116618h;
                n nVar = (n) obj2;
                View view2 = nVar.f116619b;
                com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(view2.getContext(), 0, 2, null);
                com.avito.android.lib.design.bottom_sheet.j.c(dVar, nVar.f116620c.getText(), true, view2.getResources().getDimensionPixelOffset(R.dimen.vertical_category_bottomsheet_margin), 0, 0, 112);
                View viewInflate = View.inflate(dVar.getContext(), R.layout.bx_content_widget_category_item_element_bottom_sheet_layout, null);
                FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate.findViewById(R.id.actions_root);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    nVar.B80(flexboxLayout, (CategoryItemAction) it.next(), new o(dVar, pVar));
                }
                com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
                dVar.G(viewInflate, true);
                com.avito.android.lib.util.g.a(dVar);
                break;
        }
    }

    public /* synthetic */ m(n nVar, List list, Y41.p pVar) {
        this.f116614b = 2;
        this.f116616d = nVar;
        this.f116617e = list;
        this.f116615c = pVar;
    }
}
