package com.avito.android.beduin.common.component.skeleton;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.component.skeleton.BeduinSkeletonModel;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.google.android.material.shape.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinSkeletonLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/skeleton/d;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/avito/android/beduin/common/container/Corners;", "corners", "Lkotlin/G0;", "setRadius", "(Lcom/avito/android/beduin/common/container/Corners;)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f102646b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ColorStateList f102647c;

    /* compiled from: BeduinSkeletonLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102648a;

        static {
            int[] iArr = new int[BeduinSkeletonModel.Strategy.values().length];
            try {
                iArr[BeduinSkeletonModel.Strategy.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinSkeletonModel.Strategy.RATIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinSkeletonModel.Strategy.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102648a = iArr;
        }
    }

    public d(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.beduin_component_skeleton, (ViewGroup) this, true);
        this.f102646b = findViewById(R.id.skeleton_view);
        this.f102647c = C35835l0.e(R.attr.gray12, context);
        setRadius(new Corners(Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.skeleton_default_corner_radius)), null, null, null, null, null, 32, null));
    }

    public final void setRadius(@l Corners corners) {
        q qVarA;
        if (corners == null) {
            float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.skeleton_default_corner_radius);
            q.b bVar = new q.b();
            bVar.d(dimensionPixelSize);
            qVarA = bVar.a();
        } else {
            q.b bVar2 = new q.b();
            bVar2.k(corners.g() != null ? y6.a(r1.intValue()) : 0.0f);
            bVar2.e(corners.d() != null ? y6.a(r1.intValue()) : 0.0f);
            bVar2.h(corners.e() != null ? y6.a(r1.intValue()) : 0.0f);
            bVar2.n(corners.h() != null ? y6.a(r4.intValue()) : 0.0f);
            qVarA = bVar2.a();
        }
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(qVarA);
        kVar.n(this.f102647c);
        this.f102646b.setBackground(kVar);
    }
}
