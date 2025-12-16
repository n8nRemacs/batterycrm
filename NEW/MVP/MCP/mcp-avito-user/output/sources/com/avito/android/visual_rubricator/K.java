package com.avito.android.visual_rubricator;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementLayout;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: VisualRubricatorSpanProvider.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/visual_rubricator/K;", "Lcom/avito/android/visual_rubricator/J;", "<init>", "()V", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class K implements J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public UV0.c f327284a = new UV0.c(C42784z0.f406748b);

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Resources f327285b;

    /* compiled from: VisualRubricatorSpanProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f327286a;

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
            f327286a = iArr;
        }
    }

    @Override // com.avito.android.visual_rubricator.J
    public final void b(@Y61.k Resources resources) {
        this.f327285b = resources;
    }

    @Override // com.avito.android.visual_rubricator.J
    public final void c(@Y61.k UV0.a<VisualRubricatorWidgetElementItem> aVar) {
        this.f327284a = (UV0.c) aVar;
    }

    @Override // com.avito.android.serp.adapter.g1
    public final int d(int i12) {
        Resources resources = this.f327285b;
        if (resources == null) {
            throw new IllegalStateException("Resources should be provided");
        }
        if (i12 < 0 || i12 >= this.f327284a.getCount()) {
            return 1;
        }
        VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem = (VisualRubricatorWidgetElementItem) this.f327284a.f16399b.get(i12);
        if (resources.getConfiguration().orientation == 2 || resources.getBoolean(R.bool.is_tablet)) {
            return 3;
        }
        int i13 = a.f327286a[visualRubricatorWidgetElementItem.getF327366i().ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? 2 : 3;
        }
        return 6;
    }

    @Override // com.avito.android.visual_rubricator.J
    public final int g(boolean z12) {
        return z12 ? 12 : 6;
    }
}
