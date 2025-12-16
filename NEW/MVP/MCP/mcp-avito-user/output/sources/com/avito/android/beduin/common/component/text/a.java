package com.avito.android.beduin.common.component.text;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin.common.utils.E;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BeduinTextComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/text/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/text/BeduinTextModel;", "Landroid/widget/TextView;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinTextModel, TextView> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102775e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinTextModel f102776f;

    /* compiled from: BeduinTextComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/text/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.text.a$a, reason: collision with other inner class name */
    public static final class C3081a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f102777a = C42745f0.U("text", "attributedText");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f102778b = BeduinTextModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f102778b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f102777a;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinTextModel beduinTextModel) {
        this.f102775e = interfaceC15523b;
        this.f102776f = beduinTextModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102776f;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        BeduinComponentTheme theme = this.f102776f.getTheme();
        Context context = viewGroup.getContext();
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(theme != null ? new ContextThemeWrapper(context, theme.f100608b) : context, null, 0, 0, 14, null);
        aVar.setId(R.id.beduin_text);
        aVar.setLayoutParams(layoutParams);
        return aVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        TextView textView = (TextView) view;
        BeduinTextModel beduinTextModel = this.f102776f;
        textView.setTag(beduinTextModel.getF100853b());
        InterfaceC15523b<BeduinAction> interfaceC15523b = this.f102775e;
        E.a(textView, interfaceC15523b, beduinTextModel);
        j.a(textView, beduinTextModel.getActions(), interfaceC15523b);
    }
}
