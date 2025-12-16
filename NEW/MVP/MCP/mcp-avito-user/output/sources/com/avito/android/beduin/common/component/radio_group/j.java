package com.avito.android.beduin.common.component.radio_group;

import Ui.InterfaceC15523b;
import Wh.AbstractC15764a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.C22829k0;
import bi.C25654c;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;

/* compiled from: BeduinRadioListComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/radio_group/j;", "LWh/a;", "Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupModel;", "Landroid/widget/LinearLayout;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends AbstractC15764a<BeduinRadioGroupModel, LinearLayout> {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f102217n = 0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C25654c f102218f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final lj.e f102219g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f102220h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final BeduinRadioGroupModel f102221i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f102222j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f102223k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f102224l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f102225m = true;

    /* compiled from: BeduinRadioListComponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/radio_group/j$a;", "", "<init>", "()V", "", "ERROR_TEXT_VIEW_TAG", "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinRadioListComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements w, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C42801a f102226b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            this.f102226b = (C42801a) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof w) && (obj instanceof D)) {
                return this.f102226b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f102226b;
        }

        public final int hashCode() {
            return this.f102226b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.a] */
        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f102226b.invoke(deepLink);
        }
    }

    static {
        new a(null);
    }

    public j(@Y61.k C25654c c25654c, @Y61.k lj.e eVar, @Y61.k InterfaceC15523b interfaceC15523b, @Y61.k BeduinRadioGroupModel beduinRadioGroupModel, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, boolean z12) {
        this.f102218f = c25654c;
        this.f102219g = eVar;
        this.f102220h = interfaceC15523b;
        this.f102221i = beduinRadioGroupModel;
        this.f102222j = aVar;
        this.f102223k = aVar2;
        this.f102224l = z12;
    }

    public static final void y(j jVar, LinearLayout linearLayout, Y41.l lVar) {
        jVar.getClass();
        C43025h.a aVar = new C43025h.a(C43033p.i(new C22829k0(linearLayout), k.f102227l));
        while (aVar.hasNext()) {
            lVar.invoke(aVar.next());
        }
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102221i;
    }

    @Override // Wh.AbstractC15764a, ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF100625g() {
        return this.f102225m;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinRadioGroupModel beduinRadioGroupModel = (BeduinRadioGroupModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        BeduinRadioGroupChange[] beduinRadioGroupChangeArrValues = BeduinRadioGroupChange.values();
        if (beduinRadioGroupChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, BeduinRadioGroupChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(beduinRadioGroupChangeArrValues));
        BeduinRadioGroupModel beduinRadioGroupModel2 = this.f102221i;
        if (!L.f(fVar.invoke(beduinRadioGroupModel2), fVar.invoke(beduinRadioGroupModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BeduinRadioGroupChange beduinRadioGroupChange : beduinRadioGroupChangeArrValues) {
            if (!L.f(beduinRadioGroupChange.b().invoke(beduinRadioGroupModel2), beduinRadioGroupChange.b().invoke(beduinRadioGroupModel))) {
                arrayList.add(beduinRadioGroupChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setId(R.id.beduin_radio_group);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        BeduinRadioGroupModel beduinRadioGroupModel = this.f102221i;
        linearLayout.setTag(beduinRadioGroupModel.getF100853b());
        Context context = linearLayout.getContext();
        BeduinComponentTheme theme = beduinRadioGroupModel.getTheme();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme != null ? theme.f100608b : BeduinComponentTheme.AVITO_LOOK_AND_FEEL.f100608b);
        for (Option option : beduinRadioGroupModel.getOptions()) {
            ListItemRadio bVar = this.f102224l ? new com.avito.android.lib.design.list_item.b(contextThemeWrapper, null) : new ListItemRadio(contextThemeWrapper, null);
            bVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            bVar.setTag(option.getId());
            bVar.setId(View.generateViewId());
            D6.f(bVar, this.f395324b, 0, this.f395325c, 0, 10);
            Boolean boolIsEnabled = beduinRadioGroupModel.isEnabled();
            bVar.setEnabled((boolIsEnabled == null && (boolIsEnabled = option.isEnabled()) == null) ? true : boolIsEnabled.booleanValue());
            if (option.getTitleIconButton() != null) {
                Q<Drawable, Integer> qA2 = v.a(bVar.getContext(), option.getTitleIconButton().getLocalIcon(), option.getTitleIconButton().getBase64Icon());
                Drawable drawable = qA2.f406619b;
                Integer num = qA2.f406620c;
                ImageView imageView = new ImageView(bVar.getContext());
                imageView.setImageDrawable(drawable);
                imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                D6.c(imageView, Integer.valueOf(D6.i(6, imageView.getContext())), null, null, null, 14);
                if (num != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(num.intValue()));
                }
                imageView.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(24, option, this));
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                FrameLayout frameLayout = bVar.f179553t;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                if (frameLayout != null) {
                    frameLayout.addView(imageView, layoutParams);
                }
            }
            linearLayout.addView(bVar);
            n nVar = new n(this, option, linearLayout);
            bVar.i();
            nVar.invoke(bVar);
            bVar.e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(2, bVar, this));
        }
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(contextThemeWrapper, null, 0, 0, 14, null);
        aVar.setTag("error_text_view");
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = y6.b(6);
        aVar.setLayoutParams(layoutParams2);
        D6.f(aVar, this.f395324b, 0, this.f395325c, 0, 10);
        aVar.setTextAppearance(com.avito.android.lib.util.f.r(aVar.getContext(), "s2"));
        aVar.setTextColor(C35835l0.d(R.attr.red600, aVar.getContext()));
        I5.a(aVar, beduinRadioGroupModel.getErrorMessageToDisplay(), false);
        linearLayout.addView(aVar);
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        r rVar = new r(this, (LinearLayout) view);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(rVar, list);
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC15523b<BeduinAction> v() {
        return this.f102220h;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w() {
        return this.f102218f;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final lj.e getF100888i() {
        return this.f102219g;
    }
}
