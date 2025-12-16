package com.avito.android.beduin.common.component.badge;

import Ui.InterfaceC15523b;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.deprecated_design.badge_bar.BadgeView;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V2;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import sK0.C48063a;

/* compiled from: BeduinBadgeComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/badge/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/badge/BeduinBadgeModel;", "Lcom/avito/android/lib/deprecated_design/badge_bar/BadgeView;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinBadgeModel, BadgeView> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C3022a f100673g = new C3022a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final List<String> f100674h = Collections.singletonList("badge");

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final Class<BeduinBadgeModel> f100675i = BeduinBadgeModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f100676e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinBadgeModel f100677f;

    /* compiled from: BeduinBadgeComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/badge/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.badge.a$a, reason: collision with other inner class name */
    public static final class C3022a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3022a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinBadgeModel> S() {
            return a.f100675i;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f100674h;
        }

        public C3022a() {
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinBadgeModel beduinBadgeModel) {
        this.f100676e = interfaceC15523b;
        this.f100677f = beduinBadgeModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100677f;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        BadgeView badgeView = new BadgeView(viewGroup.getContext(), null, 0, 0, 14, null);
        badgeView.setId(View.generateViewId());
        layoutParams.width = -2;
        layoutParams.height = -2;
        badgeView.setLayoutParams(layoutParams);
        return badgeView;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        int i12;
        BadgeView badgeView = (BadgeView) view;
        BeduinBadgeModel beduinBadgeModel = this.f100677f;
        badgeView.setTag(beduinBadgeModel.getF100853b());
        badgeView.setText(beduinBadgeModel.getTitle());
        String style = beduinBadgeModel.getStyle();
        if (L.f(style, Constants.SMALL)) {
            i12 = R.style.Design_Widget_BadgeView_Small;
        } else if (L.f(style, "medium")) {
            i12 = R.style.Design_Widget_BadgeView_Medium;
        } else {
            V2.f318762a.b("Badge style is not supported - " + beduinBadgeModel.getStyle(), null);
            i12 = R.style.Design_Widget_BadgeView;
        }
        badgeView.setAppearance(i12);
        C48063a c48063a = C48063a.f437606a;
        badgeView.setBackgroundColor(c48063a.a(badgeView.getContext(), beduinBadgeModel.getColor()));
        badgeView.setTextColor(beduinBadgeModel.getTextColor() != null ? c48063a.a(badgeView.getContext(), beduinBadgeModel.getTextColor()) : C35835l0.d(R.attr.black, badgeView.getContext()));
        j.a(badgeView, beduinBadgeModel.getActions(), this.f100676e);
    }
}
