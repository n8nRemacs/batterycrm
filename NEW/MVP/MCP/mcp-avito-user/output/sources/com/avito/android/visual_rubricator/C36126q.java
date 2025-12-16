package com.avito.android.visual_rubricator;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: OneLineScrollableVisualRubricatorWidgetItemBlueprintImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/q;", "Lcom/avito/android/visual_rubricator/p;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.visual_rubricator.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36126q implements InterfaceC36125p {

    /* compiled from: OneLineScrollableVisualRubricatorWidgetItemBlueprintImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/visual_rubricator/t;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/visual_rubricator/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.visual_rubricator.q$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, C36128t> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C36128t invoke(ViewGroup viewGroup, View view) {
            C36126q.this.getClass();
            throw null;
        }
    }

    @Override // TV0.b
    public final /* bridge */ /* synthetic */ TV0.d a() {
        return null;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.bx_content_widget_visual_rubricator_big_visual_rubricator_with_page_indicator, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof VisualRubricatorWidgetItem) {
            Space f327323d = ((VisualRubricatorWidgetItem) aVar).getF327323d();
            f327323d.getClass();
            if (f327323d == Space.f327308n) {
                return true;
            }
        }
        return false;
    }
}
