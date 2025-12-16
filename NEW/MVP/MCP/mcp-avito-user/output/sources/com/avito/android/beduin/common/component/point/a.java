package com.avito.android.beduin.common.component.point;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.point.Point;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.y6;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: BeduinPointComponent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/point/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/point/BeduinPointModel;", "Lcom/avito/android/lib/design/point/Point;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinPointModel, Point> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinPointModel f102117e;

    public a(@k BeduinPointModel beduinPointModel) {
        this.f102117e = beduinPointModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102117e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Point point = new Point(viewGroup.getContext(), null, 0, 0, 14, null);
        point.setId(View.generateViewId());
        layoutParams.width = -2;
        layoutParams.height = -2;
        point.setLayoutParams(layoutParams);
        return point;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0139  */
    @Override // com.avito.android.beduin.common.component.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r7) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.point.a.q(android.view.View):void");
    }

    public final void u(Point point, boolean z12) {
        UniversalColor color;
        Integer width;
        int size = z12 ? point.getSize() : 0;
        int color2 = z12 ? point.getColor() : 0;
        int strokeWidth = z12 ? point.getStrokeWidth() : 0;
        int strokeColor = z12 ? point.getStrokeColor() : 0;
        BeduinPointModel beduinPointModel = this.f102117e;
        Integer size2 = beduinPointModel.getSize();
        if (size2 != null) {
            size = y6.b(size2.intValue());
        }
        point.setSize(size);
        UniversalColor color3 = beduinPointModel.getColor();
        if (color3 != null) {
            color2 = C48063a.f437606a.a(point.getContext(), color3);
        }
        point.setColor(color2);
        BeduinPointStroke stroke = beduinPointModel.getStroke();
        if (stroke != null && (width = stroke.getWidth()) != null) {
            strokeWidth = y6.b(width.intValue());
        }
        point.setStrokeWidth(strokeWidth);
        point.setWithStroke(point.getStrokeWidth() > 0);
        BeduinPointStroke stroke2 = beduinPointModel.getStroke();
        if (stroke2 != null && (color = stroke2.getColor()) != null) {
            strokeColor = C48063a.f437606a.a(point.getContext(), color);
        }
        point.setStrokeColor(strokeColor);
    }
}
