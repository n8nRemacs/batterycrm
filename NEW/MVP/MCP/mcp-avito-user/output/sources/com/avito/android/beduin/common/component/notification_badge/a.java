package com.avito.android.beduin.common.component.notification_badge;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.f;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: BeduinNotificationBadgeComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/notification_badge/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/notification_badge/BeduinNotificationBadgeModel;", "Lcom/avito/android/lib/design/badge/Badge;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinNotificationBadgeModel, Badge> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C3052a f101779g = new C3052a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final List<String> f101780h = Collections.singletonList("notificationBadge");

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final Class<BeduinNotificationBadgeModel> f101781i = BeduinNotificationBadgeModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101782e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinNotificationBadgeModel f101783f;

    /* compiled from: BeduinNotificationBadgeComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/notification_badge/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.notification_badge.a$a, reason: collision with other inner class name */
    public static final class C3052a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3052a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinNotificationBadgeModel> S() {
            return a.f101781i;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f101780h;
        }

        public C3052a() {
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinNotificationBadgeModel beduinNotificationBadgeModel) {
        this.f101782e = interfaceC15523b;
        this.f101783f = beduinNotificationBadgeModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101783f;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Context context = viewGroup.getContext();
        BeduinNotificationBadgeModel beduinNotificationBadgeModel = this.f101783f;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, com.avito.android.beduin.common.component.a.a(beduinNotificationBadgeModel.getTheme()));
        Badge badge = new Badge(contextThemeWrapper, null, 0, f.a(contextThemeWrapper, beduinNotificationBadgeModel.getStyle()), 6, null);
        badge.setId(R.id.beduin_notification_badge);
        layoutParams.width = -2;
        layoutParams.height = -2;
        badge.setLayoutParams(layoutParams);
        return badge;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) throws Resources.NotFoundException {
        UniversalColor color;
        Badge badge = (Badge) view;
        Context context = badge.getContext();
        BeduinNotificationBadgeModel beduinNotificationBadgeModel = this.f101783f;
        int iA2 = f.a(new ContextThemeWrapper(context, com.avito.android.beduin.common.component.a.a(beduinNotificationBadgeModel.getTheme())), beduinNotificationBadgeModel.getStyle());
        BeduinNotificationBadgeStroke stroke = beduinNotificationBadgeModel.getStroke();
        Integer numValueOf = stroke != null ? Integer.valueOf(y6.b(stroke.getWidth())) : null;
        BeduinNotificationBadgeStroke stroke2 = beduinNotificationBadgeModel.getStroke();
        ColorStateList colorStateListValueOf = (stroke2 == null || (color = stroke2.getColor()) == null) ? null : ColorStateList.valueOf(C48063a.f437606a.a(badge.getContext(), color));
        TypedArray typedArrayObtainStyledAttributes = badge.getContext().obtainStyledAttributes(iA2, d.n.f178964e);
        badge.a(typedArrayObtainStyledAttributes, null, null, numValueOf, colorStateListValueOf);
        typedArrayObtainStyledAttributes.recycle();
        badge.requestLayout();
        badge.setTitleText(beduinNotificationBadgeModel.getText());
        j.a(badge, beduinNotificationBadgeModel.getOnTapActions(), this.f101782e);
    }
}
