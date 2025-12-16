package Nh;

import A91.p;
import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.header_button.BeduinHeaderButtonModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.deprecated_design.f;
import com.avito.android.lib.design.header_button.HeaderButton;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinHeaderButtonComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"LNh/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/header_button/BeduinHeaderButtonModel;", "Lcom/avito/android/lib/design/header_button/HeaderButton;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14576a extends h<BeduinHeaderButtonModel, HeaderButton> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinHeaderButtonModel f11706e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f11707f;

    /* compiled from: BeduinHeaderButtonComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNh/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nh.a$a, reason: collision with other inner class name */
    public static final class C0755a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f11708a = Collections.singletonList("headerButton");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f11709b = BeduinHeaderButtonModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f11709b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f11708a;
        }
    }

    public C14576a(@k BeduinHeaderButtonModel beduinHeaderButtonModel, @k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        this.f11706e = beduinHeaderButtonModel;
        this.f11707f = interfaceC15523b;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f11706e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Context context = viewGroup.getContext();
        BeduinHeaderButtonModel beduinHeaderButtonModel = this.f11706e;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, f.b(R.style.Theme_DesignSystem_Re23, beduinHeaderButtonModel.getTheme()));
        Integer numJ = com.avito.android.lib.util.f.j(beduinHeaderButtonModel.getStyle());
        HeaderButton headerButton = new HeaderButton(contextThemeWrapper, null, numJ != null ? numJ.intValue() : 0, 0, 10, null);
        headerButton.setId(R.id.beduin_header_button);
        headerButton.setLayoutParams(layoutParams);
        return headerButton;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        HeaderButton headerButton = (HeaderButton) view;
        BeduinHeaderButtonModel beduinHeaderButtonModel = this.f11706e;
        Integer numJ = com.avito.android.lib.util.f.j(beduinHeaderButtonModel.getStyle());
        if (numJ != null) {
            headerButton.setAppearanceFromAttr(numJ.intValue());
        }
        String text = beduinHeaderButtonModel.getText();
        if (text != null) {
            headerButton.setText(text);
        }
        Boolean boolIsEnabled = beduinHeaderButtonModel.isEnabled();
        headerButton.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        String icon = beduinHeaderButtonModel.getIcon();
        if (icon == null) {
            icon = "";
        }
        Integer numM = com.avito.android.lib.util.f.m(icon);
        if (numM != null) {
            headerButton.setTextIcon(numM.intValue());
        }
        headerButton.setOnClickListener(new p(this, 9));
        Boolean boolIsIconPositionEnd = beduinHeaderButtonModel.isIconPositionEnd();
        headerButton.setIconPositionEnd(boolIsIconPositionEnd != null ? boolIsIconPositionEnd.booleanValue() : true);
        headerButton.getLayoutParams().width = -2;
    }
}
