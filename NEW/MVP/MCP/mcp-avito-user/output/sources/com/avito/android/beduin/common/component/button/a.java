package com.avito.android.beduin.common.component.button;

import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.AbstractC35201t;
import com.avito.android.R;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.m;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.common.component.adapter.g;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.R0;
import hZ.InterfaceC40895a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: BeduinButtonComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/button/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/button/BeduinButtonModel;", "Lcom/avito/android/lib/design/button/Button;", "Lcom/avito/android/beduin_shared/common/component/adapter/g;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinButtonModel, Button> implements g {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f100782e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinButtonModel f100783f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f100784g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final R0 f100785h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC40895a f100786i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final AbstractC35201t f100787j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f100788k = new m();

    /* renamed from: l, reason: collision with root package name */
    @l
    public N0 f100789l;

    /* compiled from: BeduinButtonComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/button/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.button.a$a, reason: collision with other inner class name */
    public static final class C3026a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f100790a = Collections.singletonList("button");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f100791b = BeduinButtonModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f100791b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f100790a;
        }
    }

    /* compiled from: BeduinButtonComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100792a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f100793b;

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
            f100792a = iArr;
            int[] iArr2 = new int[IconPosition.values().length];
            try {
                iArr2[IconPosition.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IconPosition.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f100793b = iArr2;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinButtonModel beduinButtonModel, @k com.avito.android.util.text.a aVar, @k R0 r02, @k InterfaceC40895a interfaceC40895a, @k AbstractC35201t abstractC35201t) {
        this.f100782e = interfaceC15523b;
        this.f100783f = beduinButtonModel;
        this.f100784g = aVar;
        this.f100785h = r02;
        this.f100786i = interfaceC40895a;
        this.f100787j = abstractC35201t;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100783f;
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void c(@k RecyclerView.C c12) {
        N0 n02 = this.f100789l;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f100789l = null;
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void d(@k RecyclerView.C c12) {
        this.f100788k.getClass();
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void e(@k RecyclerView.C c12) {
        this.f100788k.getClass();
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinButtonModel beduinButtonModel = (BeduinButtonModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        ButtonChange[] buttonChangeArrValues = ButtonChange.values();
        if (buttonChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, ButtonChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(buttonChangeArrValues));
        BeduinButtonModel beduinButtonModel2 = this.f100783f;
        if (!L.f(fVar.invoke(beduinButtonModel2), fVar.invoke(beduinButtonModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ButtonChange buttonChange : buttonChangeArrValues) {
            if (!L.f(buttonChange.b().invoke(beduinButtonModel2), buttonChange.b().invoke(beduinButtonModel))) {
                arrayList.add(buttonChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Button button = new Button(new ContextThemeWrapper(viewGroup.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, this.f100783f.getTheme())), null, 0, 0, 14, null);
        button.setId(R.id.beduin_button);
        button.setLayoutParams(layoutParams);
        return button;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    @Override // com.avito.android.beduin.common.component.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.button.a.q(android.view.View):void");
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        c cVar = new c((Button) view, this);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(cVar, list);
    }

    public final void u(Button button, Drawable drawable) {
        if (drawable == null) {
            Button.g(button, null, null, false, null, 12);
            return;
        }
        IconPosition iconPosition = this.f100783f.getIconPosition();
        int i12 = iconPosition == null ? -1 : b.f100793b[iconPosition.ordinal()];
        if (i12 != -1) {
            if (i12 == 1) {
                Button.g(button, null, drawable, false, null, 8);
                return;
            } else if (i12 != 2) {
                return;
            }
        }
        Button.g(button, drawable, null, false, null, 8);
    }
}
