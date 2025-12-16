package com.avito.android.beduin.common.component.service_order_button;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.button.LayoutMode;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.l;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.deprecated_design.f;
import com.avito.android.lib.design.button.Button;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinServiceOrderButtonComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/service_order_button/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/service_order_button/BeduinServiceOrderButtonModel;", "Lcom/avito/android/lib/design/button/Button;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinServiceOrderButtonModel, Button> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinServiceOrderButtonModel f102632e;

    /* compiled from: BeduinServiceOrderButtonComponent.kt */
    @l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/service_order_button/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.service_order_button.a$a, reason: collision with other inner class name */
    public static final class C3073a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3073a f102633a = new C3073a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f102634b = Collections.singletonList("serviceOrderButton");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinServiceOrderButtonModel> f102635c = BeduinServiceOrderButtonModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinServiceOrderButtonModel> S() {
            return f102635c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f102634b;
        }
    }

    /* compiled from: BeduinServiceOrderButtonComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102636a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f102637b;

        static {
            int[] iArr = new int[IconPosition.values().length];
            try {
                iArr[IconPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f102636a = iArr;
            int[] iArr2 = new int[LayoutMode.values().length];
            try {
                iArr2[LayoutMode.FILL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[LayoutMode.BY_CONTENT_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f102637b = iArr2;
        }
    }

    public a(@k BeduinServiceOrderButtonModel beduinServiceOrderButtonModel) {
        this.f102632e = beduinServiceOrderButtonModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102632e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Button button = new Button(new ContextThemeWrapper(viewGroup.getContext(), f.b(R.style.Theme_DesignSystem_Legacy, this.f102632e.getTheme())), null, 0, 0, 14, null);
        button.setId(R.id.beduin_button);
        button.setLayoutParams(layoutParams);
        return button;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        Button button = (Button) view;
        button.setTag("service_order_request_tag");
        BeduinServiceOrderButtonModel beduinServiceOrderButtonModel = this.f102632e;
        button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(beduinServiceOrderButtonModel.getStyle()));
        String titleToOverride = beduinServiceOrderButtonModel.getTitleToOverride();
        if (titleToOverride == null && (titleToOverride = beduinServiceOrderButtonModel.getTitle()) == null) {
            titleToOverride = "";
        }
        button.setText(titleToOverride);
        Boolean boolIsEnabled = beduinServiceOrderButtonModel.isEnabled();
        button.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        button.setLoading(beduinServiceOrderButtonModel.isLoading());
        Drawable drawableC = v.c(button.getContext(), beduinServiceOrderButtonModel.getLocalIcon(), beduinServiceOrderButtonModel.getBase64Icon());
        if (drawableC != null) {
            IconPosition iconPosition = beduinServiceOrderButtonModel.getIconPosition();
            if ((iconPosition == null ? -1 : b.f102636a[iconPosition.ordinal()]) == 1) {
                Button.g(button, drawableC, null, false, null, 8);
            } else {
                Button.g(button, null, drawableC, false, null, 8);
            }
        }
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        LayoutMode layoutMode = beduinServiceOrderButtonModel.getLayoutMode();
        int i12 = layoutMode == null ? -1 : b.f102637b[layoutMode.ordinal()];
        layoutParams.width = i12 != 1 ? i12 != 2 ? button.getLayoutParams().width : -2 : -1;
        button.setLayoutParams(layoutParams);
        button.setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 10));
        button.setClickable(!beduinServiceOrderButtonModel.isLoading());
    }
}
