package com.avito.android.visual_rubricator.element;

import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.y6;
import com.avito.android.verification.verification_input_inn.o;
import com.avito.android.visual_rubricator.I;
import com.avito.android.visual_rubricator.Space;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VisualRubricatorWidgetElementPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/visual_rubricator/element/j;", "Lcom/avito/android/visual_rubricator/element/i;", "<init>", "()V", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public I f327401b;

    /* compiled from: VisualRubricatorWidgetElementPresenterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Space.values().length];
            try {
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Space space = Space.f327296b;
                iArr[7] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        UniversalImage image;
        k kVar = (k) eVar;
        VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem = (VisualRubricatorWidgetElementItem) aVar;
        if (visualRubricatorWidgetElementItem.getF327369l()) {
            kVar.s3();
            return;
        }
        kVar.s3();
        kVar.EX(visualRubricatorWidgetElementItem.getF327360c(), visualRubricatorWidgetElementItem.getF327361d());
        kVar.AG();
        kVar.ad(R.drawable.bx_content_widget_visual_rubricator_rich_item_ripple_fg_r_16);
        if (visualRubricatorWidgetElementItem.m0() || visualRubricatorWidgetElementItem.N5()) {
            int iOrdinal = visualRubricatorWidgetElementItem.getF327373p().ordinal();
            if (iOrdinal == 7) {
                kVar.kU();
            } else if (iOrdinal == 8) {
                kVar.Sy();
            }
            if (visualRubricatorWidgetElementItem.getF327364g() != null) {
                Integer numA0 = visualRubricatorWidgetElementItem.getF327364g();
                if (numA0 != null) {
                    kVar.AK(numA0.intValue(), visualRubricatorWidgetElementItem.getF327367j(), visualRubricatorWidgetElementItem.getF327360c());
                }
            } else if (visualRubricatorWidgetElementItem.getF327372o() != null) {
                UniversalColor titleColor = visualRubricatorWidgetElementItem.getF327372o();
                if (titleColor != null) {
                    kVar.xY(visualRubricatorWidgetElementItem.getF327360c(), visualRubricatorWidgetElementItem.getF327367j(), titleColor);
                }
            } else {
                kVar.AK(R.attr.black, visualRubricatorWidgetElementItem.getF327367j(), visualRubricatorWidgetElementItem.getF327360c());
            }
        }
        UniversalColor backgroundUniversalColor = visualRubricatorWidgetElementItem.getF327371n();
        if (backgroundUniversalColor != null) {
            kVar.Ig(backgroundUniversalColor);
        }
        Integer backgroundColor = visualRubricatorWidgetElementItem.getF327363f();
        if (backgroundColor != null) {
            kVar.BY(backgroundColor.intValue());
        }
        UniversalColor titleColor2 = visualRubricatorWidgetElementItem.getF327372o();
        if (titleColor2 != null) {
            kVar.D5(titleColor2);
        }
        Integer numA02 = visualRubricatorWidgetElementItem.getF327364g();
        if (numA02 != null) {
            kVar.lA(numA02.intValue());
        }
        if (((visualRubricatorWidgetElementItem.getF327373p() != Space.f327303i && visualRubricatorWidgetElementItem.getF327373p() != Space.f327304j) || (!visualRubricatorWidgetElementItem.m0() && !visualRubricatorWidgetElementItem.N5())) && (image = visualRubricatorWidgetElementItem.getF327365h()) != null) {
            kVar.i(image);
        }
        kVar.setOnClickListener(new o(3, this, visualRubricatorWidgetElementItem));
        kVar.yY(new com.avito.android.visual_rubricator.element.a());
        kVar.tc();
        kVar.LO(visualRubricatorWidgetElementItem.getF327370m());
        Integer numY4 = visualRubricatorWidgetElementItem.getF327375r();
        if (numY4 != null) {
            kVar.O30(y6.b(numY4.intValue()));
        }
    }

    @Override // com.avito.android.visual_rubricator.element.i
    public final void l4(@Y61.k I i12) {
        this.f327401b = i12;
    }
}
