package com.avito.android.beduin.common.component.grid_snippet_skeleton;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BeduinGridSnippetSkeletonComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_snippet_skeleton/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/grid_snippet_skeleton/BeduinGridSnippetSkeletonModel;", "Lcom/avito/android/beduin/common/component/grid_snippet_skeleton/e;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinGridSnippetSkeletonModel, e> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinGridSnippetSkeletonModel f101416e;

    /* compiled from: BeduinGridSnippetSkeletonComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_snippet_skeleton/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.grid_snippet_skeleton.a$a, reason: collision with other inner class name */
    public static final class C3039a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3039a f101417a = new C3039a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f101418b = Collections.singletonList("gridSnippetSkeleton");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinGridSnippetSkeletonModel> f101419c = BeduinGridSnippetSkeletonModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinGridSnippetSkeletonModel> S() {
            return f101419c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f101418b;
        }
    }

    public a(@k BeduinGridSnippetSkeletonModel beduinGridSnippetSkeletonModel) {
        this.f101416e = beduinGridSnippetSkeletonModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101416e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        e eVar = new e(viewGroup.getContext(), null, 0, 6, null);
        eVar.setId(View.generateViewId());
        eVar.setLayoutParams(layoutParams);
        return eVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        e eVar = (e) view;
        BeduinGridSnippetSkeletonModel beduinGridSnippetSkeletonModel = this.f101416e;
        eVar.setTag(beduinGridSnippetSkeletonModel.getF100853b());
        BeduinContainerBackground imageBackground = beduinGridSnippetSkeletonModel.getImageBackground();
        if (imageBackground == null) {
            imageBackground = f.f101429f;
        }
        SimpleDraweeView simpleDraweeView = eVar.f101421b;
        f.a(simpleDraweeView, imageBackground);
        Float imageRatio = beduinGridSnippetSkeletonModel.getImageRatio();
        simpleDraweeView.setAspectRatio(imageRatio != null ? imageRatio.floatValue() : 1.34f);
        BeduinContainerBackground imageBackground2 = beduinGridSnippetSkeletonModel.getImageBackground();
        if (imageBackground2 == null) {
            imageBackground2 = f.f101430g;
        }
        SimpleDraweeView simpleDraweeView2 = eVar.f101422c;
        f.a(simpleDraweeView2, imageBackground2);
        ViewGroup.LayoutParams layoutParams = simpleDraweeView2.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            Float titleWidth = beduinGridSnippetSkeletonModel.getTitleWidth();
            if (titleWidth == null) {
                titleWidth = Float.valueOf(1.0f);
            }
            bVar.f44172S = titleWidth.floatValue();
        }
        ViewGroup.LayoutParams layoutParams2 = simpleDraweeView2.getLayoutParams();
        Integer titleHeight = beduinGridSnippetSkeletonModel.getTitleHeight();
        layoutParams2.height = titleHeight != null ? y6.b(titleHeight.intValue()) : f.f101425b;
        Integer imageSpacing = beduinGridSnippetSkeletonModel.getImageSpacing();
        D6.c(eVar.f101422c, null, Integer.valueOf(imageSpacing != null ? y6.b(imageSpacing.intValue()) : f.f101424a), null, null, 13);
        List<Float> lineWidths = beduinGridSnippetSkeletonModel.getLineWidths();
        if (lineWidths == null) {
            lineWidths = f.f101428e;
        }
        ArrayList arrayList = eVar.f101423d;
        int i12 = 0;
        if (arrayList.size() != lineWidths.size()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                D6.z((SimpleDraweeView) it.next());
            }
            arrayList.clear();
            int size = lineWidths.size();
            Integer num = null;
            int i13 = 0;
            while (i13 < size) {
                ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, 0);
                Integer lineSpacing = beduinGridSnippetSkeletonModel.getLineSpacing();
                ((ViewGroup.MarginLayoutParams) bVar2).topMargin = lineSpacing != null ? y6.b(lineSpacing.intValue()) : f.f101427d;
                bVar2.f44189f = 0;
                bVar2.f44195i = 0;
                bVar2.f44159F = 0.0f;
                bVar2.f44177X = true;
                bVar2.f44199k = num != null ? num.intValue() : simpleDraweeView2.getId();
                SimpleDraweeView simpleDraweeView3 = new SimpleDraweeView(eVar.getContext());
                simpleDraweeView3.setLayoutParams(bVar2);
                int iGenerateViewId = View.generateViewId();
                Integer numValueOf = Integer.valueOf(iGenerateViewId);
                simpleDraweeView3.setId(iGenerateViewId);
                arrayList.add(simpleDraweeView3);
                eVar.addView(simpleDraweeView3);
                i13++;
                num = numValueOf;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int i14 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) next;
            SimpleDraweeView simpleDraweeView5 = simpleDraweeView4 != null ? simpleDraweeView4 : null;
            if (simpleDraweeView5 != null) {
                ViewGroup.LayoutParams layoutParams3 = simpleDraweeView4.getLayoutParams();
                ConstraintLayout.b bVar3 = layoutParams3 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams3 : null;
                if (bVar3 != null) {
                    bVar3.f44172S = lineWidths.get(i12).floatValue();
                }
                Integer lineSpacing2 = beduinGridSnippetSkeletonModel.getLineSpacing();
                D6.c(simpleDraweeView5, null, Integer.valueOf(lineSpacing2 != null ? y6.b(lineSpacing2.intValue()) : f.f101427d), null, null, 13);
                ViewGroup.LayoutParams layoutParams4 = simpleDraweeView5.getLayoutParams();
                Integer lineHeight = beduinGridSnippetSkeletonModel.getLineHeight();
                layoutParams4.height = lineHeight != null ? y6.b(lineHeight.intValue()) : f.f101426c;
                f.a(simpleDraweeView5, imageBackground2);
            }
            i12 = i14;
        }
    }
}
