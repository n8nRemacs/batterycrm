package com.avito.android.beduin.common.component.skeleton;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.skeleton.BeduinSkeletonModel;
import com.avito.android.beduin.common.component.skeleton.d;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinSkeletonComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/skeleton/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/skeleton/BeduinSkeletonModel;", "Lcom/avito/android/beduin/common/component/skeleton/d;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinSkeletonModel, d> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C3074a f102642f = new C3074a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final Class<? extends BeduinModel> f102643g = BeduinSkeletonModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinSkeletonModel f102644e;

    /* compiled from: BeduinSkeletonComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/skeleton/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.skeleton.a$a, reason: collision with other inner class name */
    public static final class C3074a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3074a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return a.f102643g;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return Collections.singletonList("skeleton");
        }

        public C3074a() {
        }
    }

    public a(@k BeduinSkeletonModel beduinSkeletonModel) {
        this.f102644e = beduinSkeletonModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102644e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(viewGroup.getContext(), null, 0, 6, null);
        dVar.setId(View.generateViewId());
        layoutParams.width = -1;
        dVar.setLayoutParams(layoutParams);
        return dVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        d dVar = (d) view;
        BeduinSkeletonModel beduinSkeletonModel = this.f102644e;
        BeduinSkeletonModel.Strategy heightStrategy = beduinSkeletonModel.getHeightStrategy();
        double heightValue = beduinSkeletonModel.getHeightValue();
        BeduinSkeletonModel.Strategy widthStrategy = beduinSkeletonModel.getWidthStrategy();
        double widthValue = beduinSkeletonModel.getWidthValue();
        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
        int[] iArr = d.a.f102648a;
        int i17 = iArr[heightStrategy.ordinal()];
        int i18 = R.id.skeleton_root;
        if (i17 != 1) {
            if (i17 == 2) {
                i12 = 2;
                i14 = 1;
                i15 = 0;
                i16 = R.id.skeleton_root;
                dVar2.k(R.id.skeleton_root, 0);
                dVar2.p(R.id.skeleton_root).f44269e.f44353z = "H," + heightValue;
            } else if (i17 != 3) {
                i12 = 2;
                i13 = 3;
                i14 = 1;
                i15 = 0;
                i16 = R.id.skeleton_root;
            } else {
                dVar2.j(R.id.skeleton_root, 3, 0, 3, 0);
                dVar2.j(R.id.skeleton_root, 4, 0, 4, 0);
                i18 = R.id.skeleton_root;
                dVar2.p(i18).f44269e.f44352y = 0.0f;
                i12 = 2;
                dVar2.p(i18).f44269e.f44311Z = 2;
                i15 = 0;
                dVar2.k(i18, 0);
                dVar2.p(i18).f44269e.f44323f0 = ((float) widthValue) / 100.0f;
                i16 = R.id.skeleton_root;
                i14 = 1;
            }
            i13 = 3;
        } else {
            i12 = 2;
            i13 = 3;
            i14 = 1;
            i15 = 0;
            i16 = R.id.skeleton_root;
            dVar2.i(R.id.skeleton_root, 3, 0, 3);
            dVar2.k(R.id.skeleton_root, y6.c(heightValue));
        }
        int i19 = iArr[widthStrategy.ordinal()];
        if (i19 == i14) {
            int i22 = i18;
            dVar2.i(i22, 6, i15, 6);
            dVar2.l(i22, y6.c(widthValue));
        } else if (i19 == i12) {
            dVar2.l(i18, i15);
            dVar2.p(i16).f44269e.f44353z = "W," + widthValue;
        } else if (i19 == i13) {
            int i23 = i18;
            dVar2.j(i18, 1, 0, 1, 0);
            dVar2.j(i23, 2, 0, 2, 0);
            dVar2.y(0.0f, i23);
            dVar2.p(i23).f44269e.f44310Y = i12;
            dVar2.l(i23, i15);
            dVar2.p(i23).f44269e.f44321e0 = ((float) widthValue) / 100.0f;
        }
        dVar2.c(dVar);
        dVar.setRadius(beduinSkeletonModel.getCorners());
    }
}
