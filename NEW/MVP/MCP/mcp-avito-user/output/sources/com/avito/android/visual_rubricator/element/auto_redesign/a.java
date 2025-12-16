package com.avito.android.visual_rubricator.element.auto_redesign;

import TV0.d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.visual_rubricator.Space;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: RedesignVisualRubricatorWidgetElementBlueprintImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/element/auto_redesign/a;", "Lcom/avito/android/visual_rubricator/element/b;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.visual_rubricator.element.b {

    /* compiled from: RedesignVisualRubricatorWidgetElementBlueprintImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/visual_rubricator/element/auto_redesign/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/visual_rubricator/element/auto_redesign/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.visual_rubricator.element.auto_redesign.a$a, reason: collision with other inner class name */
    public static final class C10150a extends N implements p<ViewGroup, View, b> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10150a f327384l = new C10150a();

        public C10150a() {
            super(2);
        }

        @Override // Y41.p
        public final b invoke(ViewGroup viewGroup, View view) {
            return new b(view);
        }
    }

    @Override // TV0.b
    public final /* bridge */ /* synthetic */ d a() {
        return null;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.bx_content_redesign_widget_visual_rubricator_visual_rubricator_category_item, C10150a.f327384l);
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof VisualRubricatorWidgetElementItem) {
            VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem = (VisualRubricatorWidgetElementItem) aVar;
            if (!L.f(visualRubricatorWidgetElementItem.getF322965b(), "item_all_categories")) {
                Space f327373p = visualRubricatorWidgetElementItem.getF327373p();
                f327373p.getClass();
                if (f327373p == Space.f327308n) {
                    return true;
                }
            }
        }
        return false;
    }
}
