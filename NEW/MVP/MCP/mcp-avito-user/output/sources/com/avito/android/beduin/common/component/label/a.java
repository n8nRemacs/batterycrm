package com.avito.android.beduin.common.component.label;

import Ph.InterfaceC14784a;
import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinLabelComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/label/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/label/BeduinLabelModel;", "Lcom/avito/android/beduin/common/component/label/BeduinLabelLayout;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinLabelModel, BeduinLabelLayout> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final lj.e f101655e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC14784a f101656f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BeduinLabelModel f101657g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101658h;

    /* compiled from: BeduinLabelComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/label/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.label.a$a, reason: collision with other inner class name */
    public static final class C3045a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f101659a = Collections.singletonList("label");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f101660b = BeduinLabelModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f101660b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f101659a;
        }
    }

    public a(@k lj.e eVar, @k InterfaceC14784a interfaceC14784a, @k BeduinLabelModel beduinLabelModel, @k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        this.f101655e = eVar;
        this.f101656f = interfaceC14784a;
        this.f101657g = beduinLabelModel;
        this.f101658h = interfaceC15523b;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101657g;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        BeduinComponentTheme theme = this.f101657g.getTheme();
        Context context = viewGroup.getContext();
        BeduinLabelLayout beduinLabelLayout = new BeduinLabelLayout(theme != null ? new ContextThemeWrapper(context, theme.f100608b) : context, null, 0, 6, null);
        beduinLabelLayout.setId(R.id.beduin_label);
        beduinLabelLayout.setLayoutParams(layoutParams);
        return beduinLabelLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    @Override // com.avito.android.beduin.common.component.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r12) {
        /*
            r11 = this;
            com.avito.android.beduin.common.component.label.BeduinLabelLayout r12 = (com.avito.android.beduin.common.component.label.BeduinLabelLayout) r12
            com.avito.android.beduin.common.component.label.BeduinLabelModel r6 = r11.f101657g
            java.lang.String r0 = r6.getF100853b()
            r12.setTag(r0)
            android.content.Context r0 = r12.getContext()
            java.util.List r1 = r6.getTokens()
            java.lang.String r2 = r6.getSeparator()
            com.avito.android.beduin.network.model.LabelTextAttributes r3 = r6.getAttributes()
            Ph.a r7 = r11.f101656f
            android.text.SpannableStringBuilder r4 = r7.a(r0, r1, r2, r3)
            int r1 = com.avito.android.beduin.common.component.label.e.a(r6)
            java.lang.Integer r0 = r6.getNumberOfLines()
            r8 = 0
            if (r0 == 0) goto L48
            int r2 = r0.intValue()
            if (r2 <= 0) goto L3f
            java.lang.Boolean r2 = r6.getExpanded()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 != 0) goto L3f
            goto L40
        L3f:
            r0 = r8
        L40:
            if (r0 == 0) goto L48
            int r0 = r0.intValue()
        L46:
            r2 = r0
            goto L4c
        L48:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L46
        L4c:
            android.text.TextUtils$TruncateAt r3 = com.avito.android.beduin.common.component.label.e.b(r6)
            int r0 = r4.length()
            java.lang.Class<android.text.style.ClickableSpan> r5 = android.text.style.ClickableSpan.class
            r9 = 0
            java.lang.Object[] r0 = r4.getSpans(r9, r0, r5)
            int r0 = r0.length
            r10 = 1
            if (r0 != 0) goto L61
            r0 = r10
            goto L62
        L61:
            r0 = r9
        L62:
            r5 = r0 ^ 1
            r0 = r12
            r0.a(r1, r2, r3, r4, r5)
            com.avito.android.beduin.network.model.ExpandToken r0 = r6.getExpandToken()
            if (r0 == 0) goto L90
            android.content.Context r1 = r12.getContext()
            com.avito.android.beduin.network.model.LabelToken$TextToken r2 = new com.avito.android.beduin.network.model.LabelToken$TextToken
            java.lang.String r3 = r0.getTitle()
            com.avito.android.beduin.network.model.LabelTextAttributes r0 = r0.getOverridenAttributes()
            r2.<init>(r3, r0)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            java.lang.String r2 = r6.getSeparator()
            com.avito.android.beduin.network.model.LabelTextAttributes r3 = r6.getAttributes()
            android.text.SpannableStringBuilder r0 = r7.a(r1, r0, r2, r3)
            goto L91
        L90:
            r0 = r8
        L91:
            com.avito.android.beduin.network.model.ExpandToken r1 = r6.getExpandToken()
            if (r1 == 0) goto La6
            java.lang.Integer r1 = r1.getOffsetFromText()
            if (r1 == 0) goto La6
            int r1 = r1.intValue()
            int r1 = com.avito.android.util.y6.b(r1)
            goto La7
        La6:
            r1 = r9
        La7:
            com.avito.android.beduin.network.model.ExpandToken r2 = r6.getExpandToken()
            if (r2 == 0) goto Lb3
            com.avito.android.beduin.network.model.Style r2 = r2.getStyle()
            if (r2 != 0) goto Lb5
        Lb3:
            com.avito.android.beduin.network.model.Style r2 = com.avito.android.beduin.network.model.Style.DEFAULT
        Lb5:
            com.avito.android.beduin.common.component.label.b r3 = new com.avito.android.beduin.common.component.label.b
            r3.<init>(r11)
            android.widget.TextView r4 = r12.f101651c
            r4.setText(r0)
            r4.setPadding(r9, r1, r9, r9)
            com.avito.android.advertising.adapter.items.buzzoola.media_x2.d r0 = new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d
            r1 = 23
            r0.<init>(r1, r12, r3)
            r4.setOnClickListener(r0)
            int[] r0 = com.avito.android.beduin.common.component.label.BeduinLabelLayout.a.f101653a
            int r1 = r2.ordinal()
            r0 = r0[r1]
            if (r0 != r10) goto Lf1
            r0 = 2131234037(0x7f080cf5, float:1.8084228E38)
            r4.setCompoundDrawablesWithIntrinsicBounds(r9, r9, r0, r9)
            android.content.Context r12 = r12.getContext()
            r0 = 2130971377(0x7f040af1, float:1.755149E38)
            int r12 = com.avito.android.util.C35835l0.d(r0, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0 = 11
            com.avito.android.util.I5.e(r4, r8, r12, r0)
            goto Lf4
        Lf1:
            r4.setCompoundDrawablesWithIntrinsicBounds(r9, r9, r9, r9)
        Lf4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.label.a.q(android.view.View):void");
    }
}
