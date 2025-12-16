package com.avito.android.beduin.common.component.icon_button;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.icon_button.BeduinIconButtonModel;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: BeduinIconButtonComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/icon_button/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel;", "Lcom/avito/android/beduin/common/component/icon_button/f;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinIconButtonModel, f> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101436e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinIconButtonModel f101437f;

    /* compiled from: BeduinIconButtonComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/icon_button/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.icon_button.a$a, reason: collision with other inner class name */
    public static final class C3040a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3040a f101438a = new C3040a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f101439b = Collections.singletonList("iconButton");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<? extends BeduinModel> f101440c = BeduinIconButtonModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return f101440c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f101439b;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinIconButtonModel beduinIconButtonModel) {
        this.f101436e = interfaceC15523b;
        this.f101437f = beduinIconButtonModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101437f;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        f fVar = new f(viewGroup.getContext(), null, 0, 6, null);
        fVar.setId(R.id.beduin_icon_button_container);
        layoutParams.width = -2;
        layoutParams.height = -2;
        fVar.setLayoutParams(layoutParams);
        return fVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        f fVar = (f) view;
        BeduinIconButtonModel beduinIconButtonModel = this.f101437f;
        fVar.setTag(beduinIconButtonModel.getId());
        BeduinIconButtonModel.Size size = beduinIconButtonModel.getSize();
        ColorStateList colorStateListValueOf = null;
        Integer width = size != null ? size.getWidth() : null;
        BeduinIconButtonModel.Size size2 = beduinIconButtonModel.getSize();
        Integer height = size2 != null ? size2.getHeight() : null;
        LayoutMode layoutMode = beduinIconButtonModel.getLayoutMode();
        Button button = fVar.button;
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        layoutParams.width = width != null ? y6.b(width.intValue()) : (layoutMode != LayoutMode.BY_CONTENT_SIZE && layoutMode == LayoutMode.FILL_WIDTH) ? -1 : -2;
        layoutParams.height = height != null ? y6.b(height.intValue()) : -2;
        button.setLayoutParams(layoutParams);
        fVar.a(beduinIconButtonModel.getStyle());
        LocalIcon localIcon = beduinIconButtonModel.getLocalIcon();
        Q<Drawable, Integer> qA2 = v.a(fVar.getContext(), localIcon, beduinIconButtonModel.getBase64Icon());
        Drawable drawable = qA2.f406619b;
        Integer num = qA2.f406620c;
        if (localIcon != null && num != null) {
            colorStateListValueOf = ColorStateList.valueOf(num.intValue());
        }
        button.setIconColor(colorStateListValueOf);
        button.setImageDrawable(drawable);
        Boolean boolIsEnabled = beduinIconButtonModel.isEnabled();
        fVar.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        Boolean boolIsLoading = beduinIconButtonModel.isLoading();
        fVar.setLoading(boolIsLoading != null ? boolIsLoading.booleanValue() : false);
        fVar.setButtonClickListener(new b(this));
    }
}
