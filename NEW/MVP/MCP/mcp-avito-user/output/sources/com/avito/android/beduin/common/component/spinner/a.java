package com.avito.android.beduin.common.component.spinner;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.util.f;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinSpinnerComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/spinner/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/spinner/BeduinSpinnerModel;", "Lcom/avito/android/beduin/common/component/spinner/e;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinSpinnerModel, e> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C3076a f102669f = new C3076a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final List<String> f102670g = Collections.singletonList("spinner");

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final Class<? extends BeduinModel> f102671h = BeduinSpinnerModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinSpinnerModel f102672e;

    /* compiled from: BeduinSpinnerComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/spinner/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.spinner.a$a, reason: collision with other inner class name */
    public static final class C3076a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3076a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return a.f102671h;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f102670g;
        }

        public C3076a() {
        }
    }

    public a(@k BeduinSpinnerModel beduinSpinnerModel) {
        this.f102672e = beduinSpinnerModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102672e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        BeduinComponentTheme theme = this.f102672e.getTheme();
        Context context = viewGroup.getContext();
        if (theme != null) {
            context = new ContextThemeWrapper(context, theme.f100608b);
        }
        e eVar = new e(context);
        eVar.setLayoutParams(layoutParams);
        return eVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) throws Resources.NotFoundException {
        Spinner spinner = ((e) view).getSpinner();
        BeduinSpinnerModel beduinSpinnerModel = this.f102672e;
        spinner.setTag(beduinSpinnerModel.getId());
        spinner.setAppearance(f.l(spinner.getContext(), beduinSpinnerModel.getStyle()));
    }
}
