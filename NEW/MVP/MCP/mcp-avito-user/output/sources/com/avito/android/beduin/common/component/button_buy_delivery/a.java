package com.avito.android.beduin.common.component.button_buy_delivery;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.AbstractC35201t;
import com.avito.android.R;
import com.avito.android.beduin.common.component.button.LayoutMode;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.m;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.common.component.adapter.g;
import com.avito.android.lib.deprecated_design.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.R0;
import hZ.InterfaceC40895a;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: BeduinBuyWithDeliveryButtonComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/button_buy_delivery/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/button_buy_delivery/BeduinBuyWithDeliveryButtonModel;", "Lcom/avito/android/lib/design/button/Button;", "Lcom/avito/android/beduin_shared/common/component/adapter/g;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinBuyWithDeliveryButtonModel, Button> implements g {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinBuyWithDeliveryButtonModel f100810e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final R0 f100811f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC40895a f100812g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final AbstractC35201t f100813h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f100814i = new m();

    /* renamed from: j, reason: collision with root package name */
    @l
    public N0 f100815j;

    /* compiled from: BeduinBuyWithDeliveryButtonComponent.kt */
    @com.avito.android.beduin.common.component.l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/button_buy_delivery/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.button_buy_delivery.a$a, reason: collision with other inner class name */
    public static final class C3027a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f100816a = Collections.singletonList("buyWithDeliveryButton");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f100817b = BeduinBuyWithDeliveryButtonModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f100817b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f100816a;
        }
    }

    /* compiled from: BeduinBuyWithDeliveryButtonComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100818a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f100819b;

        static {
            int[] iArr = new int[LayoutMode.values().length];
            try {
                iArr[LayoutMode.FILL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutMode.BY_CONTENT_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100818a = iArr;
            int[] iArr2 = new int[IconPosition.values().length];
            try {
                iArr2[IconPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f100819b = iArr2;
        }
    }

    public a(@k BeduinBuyWithDeliveryButtonModel beduinBuyWithDeliveryButtonModel, @k R0 r02, @k InterfaceC40895a interfaceC40895a, @k AbstractC35201t abstractC35201t) {
        this.f100810e = beduinBuyWithDeliveryButtonModel;
        this.f100811f = r02;
        this.f100812g = interfaceC40895a;
        this.f100813h = abstractC35201t;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100810e;
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void c(@k RecyclerView.C c12) {
        N0 n02 = this.f100815j;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f100815j = null;
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void d(@k RecyclerView.C c12) {
        this.f100814i.getClass();
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void e(@k RecyclerView.C c12) {
        this.f100814i.getClass();
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Button button = new Button(new ContextThemeWrapper(viewGroup.getContext(), f.b(R.style.Theme_DesignSystem_Legacy, this.f100810e.getTheme())), null, 0, 0, 14, null);
        button.setId(R.id.beduin_button);
        button.setLayoutParams(layoutParams);
        return button;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    @Override // com.avito.android.beduin.common.component.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r8) {
        /*
            r7 = this;
            com.avito.android.lib.design.button.Button r8 = (com.avito.android.lib.design.button.Button) r8
            java.lang.String r0 = "buy_with_delivery_tag"
            r8.setTag(r0)
            com.avito.android.beduin.common.component.button_buy_delivery.BeduinBuyWithDeliveryButtonModel r0 = r7.f100810e
            java.lang.String r1 = r0.getStyle()
            if (r1 == 0) goto L16
            int r1 = com.avito.android.lib.util.f.d(r1)
            r8.setAppearanceFromAttr(r1)
        L16:
            java.lang.String r1 = r0.getTitle()
            if (r1 != 0) goto L1e
            java.lang.String r1 = ""
        L1e:
            r8.setText(r1)
            java.lang.Boolean r1 = r0.isEnabled()
            r2 = 1
            if (r1 == 0) goto L2d
            boolean r1 = r1.booleanValue()
            goto L2e
        L2d:
            r1 = r2
        L2e:
            r8.setEnabled(r1)
            java.lang.Boolean r1 = r0.isLoading()
            r3 = 0
            if (r1 == 0) goto L3d
            boolean r1 = r1.booleanValue()
            goto L3e
        L3d:
            r1 = r3
        L3e:
            r8.setLoading(r1)
            com.avito.android.t r1 = r7.f100813h
            DE0.a r1 = r1.y()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L89
            hZ.a r1 = r7.f100812g
            u3.l r1 = r1.a()
            u3.m<T> r1 = r1.f439745a
            T r1 = r1.f439749b
            com.avito.android.messenger_icebreakers_dialog.config.MessengerIcebreakerDialogTestGroup r1 = (com.avito.android.messenger_icebreakers_dialog.config.MessengerIcebreakerDialogTestGroup) r1
            r1.getClass()
            com.avito.android.messenger_icebreakers_dialog.config.MessengerIcebreakerDialogTestGroup r4 = com.avito.android.messenger_icebreakers_dialog.config.MessengerIcebreakerDialogTestGroup.f197542c
            if (r1 != r4) goto L89
            kotlinx.coroutines.N0 r1 = r7.f100815j
            r4 = 0
            if (r1 == 0) goto L70
            kotlinx.coroutines.V0 r1 = (kotlinx.coroutines.V0) r1
            r1.c(r4)
        L70:
            r7.f100815j = r4
            com.avito.android.util.R0 r1 = r7.f100811f
            kotlinx.coroutines.d1 r1 = r1.b()
            kotlinx.coroutines.internal.h r1 = kotlinx.coroutines.U.a(r1)
            com.avito.android.beduin.common.component.button_buy_delivery.b r5 = new com.avito.android.beduin.common.component.button_buy_delivery.b
            r5.<init>(r7, r8, r4)
            r6 = 3
            kotlinx.coroutines.N0 r1 = kotlinx.coroutines.C43259k.d(r1, r4, r4, r5, r6)
            r7.f100815j = r1
            goto L9c
        L89:
            android.content.Context r1 = r8.getContext()
            com.avito.android.beduin.common.component.model.icon.LocalIcon r4 = r0.getLocalIcon()
            com.avito.android.beduin.common.component.model.icon.IconBase64 r5 = r0.getBase64Icon()
            android.graphics.drawable.Drawable r1 = com.avito.android.beduin.common.utils.v.c(r1, r4, r5)
            r7.u(r8, r1)
        L9c:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            com.avito.android.beduin.common.component.button.LayoutMode r4 = r0.getLayoutMode()
            r5 = -1
            if (r4 != 0) goto La9
            r4 = r5
            goto Lb1
        La9:
            int[] r6 = com.avito.android.beduin.common.component.button_buy_delivery.a.b.f100818a
            int r4 = r4.ordinal()
            r4 = r6[r4]
        Lb1:
            if (r4 == r2) goto Lbe
            r5 = 2
            if (r4 == r5) goto Lbd
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            int r5 = r4.width
            goto Lbe
        Lbd:
            r5 = -2
        Lbe:
            r1.width = r5
            r8.setLayoutParams(r1)
            com.avito.android.autoteka.presentation.reportGeneration.a r1 = new com.avito.android.autoteka.presentation.reportGeneration.a
            r4 = 4
            r1.<init>(r7, r4)
            r8.setOnClickListener(r1)
            java.lang.Boolean r0 = r0.isLoading()
            if (r0 == 0) goto Ld6
            boolean r3 = r0.booleanValue()
        Ld6:
            r0 = r3 ^ 1
            r8.setClickable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.button_buy_delivery.a.q(android.view.View):void");
    }

    public final void u(Button button, Drawable drawable) {
        if (drawable != null) {
            IconPosition iconPosition = this.f100810e.getIconPosition();
            if ((iconPosition == null ? -1 : b.f100819b[iconPosition.ordinal()]) == 1) {
                Button.g(button, drawable, null, false, null, 8);
            } else {
                Button.g(button, null, drawable, false, null, 8);
            }
        }
    }
}
