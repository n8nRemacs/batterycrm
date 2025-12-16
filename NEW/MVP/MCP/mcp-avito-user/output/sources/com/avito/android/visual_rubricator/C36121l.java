package com.avito.android.visual_rubricator;

import android.content.res.Resources;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementLayout;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: NoRecsVisualRubricatorSpanProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/visual_rubricator/l;", "Lcom/avito/android/visual_rubricator/J;", "<init>", "()V", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.visual_rubricator.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36121l implements J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public UV0.c f327435a = new UV0.c(C42784z0.f406748b);

    /* compiled from: NoRecsVisualRubricatorSpanProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.visual_rubricator.l$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f327436a;

        static {
            int[] iArr = new int[VisualRubricatorWidgetElementLayout.values().length];
            try {
                iArr[VisualRubricatorWidgetElementLayout.X_LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisualRubricatorWidgetElementLayout.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VisualRubricatorWidgetElementLayout.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f327436a = iArr;
        }
    }

    @Override // com.avito.android.visual_rubricator.J
    public final void c(@Y61.k UV0.a<VisualRubricatorWidgetElementItem> aVar) {
        this.f327435a = (UV0.c) aVar;
    }

    @Override // com.avito.android.serp.adapter.g1
    public final int d(int i12) {
        if (i12 < 0 || i12 >= this.f327435a.getCount()) {
            return 1;
        }
        int i13 = a.f327436a[((VisualRubricatorWidgetElementItem) this.f327435a.f16399b.get(i12)).getF327366i().ordinal()];
        if (i13 == 1) {
            return 6;
        }
        if (i13 != 2) {
            return i13 != 3 ? 2 : 3;
        }
        return 4;
    }

    @Override // com.avito.android.visual_rubricator.J
    public final int g(boolean z12) {
        return z12 ? 14 : 7;
    }

    @Override // com.avito.android.visual_rubricator.J
    public final void b(@Y61.k Resources resources) {
    }
}
