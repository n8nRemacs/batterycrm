package com.avito.android.beduin.common.component.spacing;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinSpacingComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/spacing/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/spacing/BeduinSpacingModel;", "Landroid/widget/Space;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinSpacingModel, Space> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinSpacingModel f102664e;

    /* compiled from: BeduinSpacingComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/spacing/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.spacing.a$a, reason: collision with other inner class name */
    public static final class C3075a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f102665a = Collections.singletonList("spacing");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f102666b = BeduinSpacingModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f102666b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f102665a;
        }
    }

    public a(@k BeduinSpacingModel beduinSpacingModel) {
        this.f102664e = beduinSpacingModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102664e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Space space = new Space(viewGroup.getContext());
        space.setId(View.generateViewId());
        space.setLayoutParams(layoutParams);
        return space;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        Space space = (Space) view;
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        BeduinSpacingModel beduinSpacingModel = this.f102664e;
        Integer width = beduinSpacingModel.getWidth();
        layoutParams.width = width != null ? y6.d(width.intValue()) : -1;
        Integer height = beduinSpacingModel.getHeight();
        layoutParams.height = height != null ? y6.d(height.intValue()) : -1;
        space.setLayoutParams(layoutParams);
    }
}
