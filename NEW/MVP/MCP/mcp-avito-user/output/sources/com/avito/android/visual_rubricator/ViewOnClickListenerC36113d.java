package com.avito.android.visual_rubricator;

import android.view.View;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.visual_rubricator.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class ViewOnClickListenerC36113d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f327350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f327351c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VisualRubricatorWidgetElementItem f327352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f327353e;

    public /* synthetic */ ViewOnClickListenerC36113d(T t12, VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem, int i12, int i13) {
        this.f327350b = i13;
        this.f327351c = t12;
        this.f327352d = visualRubricatorWidgetElementItem;
        this.f327353e = i12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem = this.f327352d;
        T t12 = this.f327351c;
        int i12 = this.f327353e;
        switch (this.f327350b) {
            case 0:
                int i13 = C36116g.f327415m;
                t12.k(visualRubricatorWidgetElementItem, Integer.valueOf(i12 + 1));
                break;
            case 1:
                int i14 = C36116g.f327415m;
                t12.k(visualRubricatorWidgetElementItem, Integer.valueOf(i12 + 1));
                break;
            default:
                int i15 = C36116g.f327415m;
                t12.k(visualRubricatorWidgetElementItem, Integer.valueOf(i12));
                break;
        }
    }
}
