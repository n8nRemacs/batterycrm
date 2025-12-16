package com.avito.android.beduin.common.component.progress_bar;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import sK0.C48063a;

/* compiled from: BeduinProgressBarComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/progress_bar/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/progress_bar/BeduinProgressBarModel;", "Lcom/avito/android/lib/design/progress_bar/ProgressBar;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinProgressBarModel, ProgressBar> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C3059a f102176f = new C3059a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final List<String> f102177g = Collections.singletonList("progressBar");

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final Class<BeduinProgressBarModel> f102178h = BeduinProgressBarModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinProgressBarModel f102179e;

    /* compiled from: BeduinProgressBarComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/progress_bar/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.progress_bar.a$a, reason: collision with other inner class name */
    public static final class C3059a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3059a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinProgressBarModel> S() {
            return a.f102178h;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f102177g;
        }

        public C3059a() {
        }
    }

    public a(@k BeduinProgressBarModel beduinProgressBarModel) {
        this.f102179e = beduinProgressBarModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102179e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        ProgressBar progressBar = new ProgressBar(viewGroup.getContext(), null, 0, 0, 14, null);
        progressBar.setId(View.generateViewId());
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        ProgressBar progressBar = (ProgressBar) view;
        BeduinProgressBarModel beduinProgressBarModel = this.f102179e;
        progressBar.setProgress(beduinProgressBarModel.getProgress());
        Double height = beduinProgressBarModel.getHeight();
        progressBar.setBarHeight(y6.d(height != null ? (int) height.doubleValue() : 4));
        C48063a c48063a = C48063a.f437606a;
        progressBar.setEmptyColor(c48063a.a(progressBar.getContext(), beduinProgressBarModel.getRemainedColor()));
        progressBar.setFillColor(c48063a.a(progressBar.getContext(), beduinProgressBarModel.getPassedColor()));
        Double spacingWidth = beduinProgressBarModel.getSpacingWidth();
        progressBar.setSeparatorWidth(y6.d(spacingWidth != null ? (int) spacingWidth.doubleValue() : 2));
    }
}
