package com.avito.android.visual_rubricator;

import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import kotlin.Metadata;

/* compiled from: VisualRubricatorClickInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/L;", "", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VisualRubricatorWidgetElementItem f327287a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f327288b;

    public L(@Y61.k VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem, @Y61.l Integer num) {
        this.f327287a = visualRubricatorWidgetElementItem;
        this.f327288b = num;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l12 = (L) obj;
        return kotlin.jvm.internal.L.f(this.f327287a, l12.f327287a) && kotlin.jvm.internal.L.f(this.f327288b, l12.f327288b);
    }

    public final int hashCode() {
        int iHashCode = this.f327287a.hashCode() * 31;
        Integer num = this.f327288b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VisualRubricatorClickInfo(item=");
        sb2.append(this.f327287a);
        sb2.append(", positionInRow=");
        return com.akita.compose.component.accordion.s.j(sb2, this.f327288b, ')');
    }
}
