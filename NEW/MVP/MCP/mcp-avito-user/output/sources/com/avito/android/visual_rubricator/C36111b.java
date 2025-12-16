package com.avito.android.visual_rubricator;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: DoubleRowsVisualRubricatorBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/b;", "Lcom/avito/android/visual_rubricator/a;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.visual_rubricator.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36111b implements InterfaceC36110a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Q f327348a;

    /* compiled from: DoubleRowsVisualRubricatorBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/visual_rubricator/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/visual_rubricator/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.visual_rubricator.b$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, C36116g> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C36116g invoke(ViewGroup viewGroup, View view) {
            Q q12 = C36111b.this.f327348a;
            return new C36116g(view, q12, q12);
        }
    }

    public C36111b(@Y61.k Q q12) {
        this.f327348a = q12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f327348a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.bx_content_widget_visual_rubricator_big_visual_rubricator_double_rows, new a());
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
            VisualRubricatorWidgetItem visualRubricatorWidgetItem = (VisualRubricatorWidgetItem) aVar;
            Space f327323d = visualRubricatorWidgetItem.getF327323d();
            f327323d.getClass();
            if (f327323d != Space.f327296b) {
                Space f327323d2 = visualRubricatorWidgetItem.getF327323d();
                f327323d2.getClass();
                if (f327323d2 != Space.f327298d) {
                    Space f327323d3 = visualRubricatorWidgetItem.getF327323d();
                    f327323d3.getClass();
                    if (f327323d3 == Space.f327305k) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
