package com.avito.android.beduin.common.component.master_plan;

import Ui.InterfaceC15523b;
import Y61.k;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.beduin.common.action.BeduinLogEventAction;
import com.avito.android.beduin.common.action.BeduinOpenMasterPlanAction;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.lib.design.master_plan_view.MasterPlanView;
import com.avito.android.remote.model.Image;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinMasterPlanComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/master_plan/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/master_plan/BeduinMasterPlanComponentModel;", "Lcom/avito/android/beduin/common/component/master_plan/g;", "Lcom/avito/android/beduin/common/component/master_plan/h;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinMasterPlanComponentModel, g> implements h {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101762e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinMasterPlanComponentModel f101763f;

    /* compiled from: BeduinMasterPlanComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/master_plan/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.master_plan.a$a, reason: collision with other inner class name */
    public static final class C3051a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3051a f101764a = new C3051a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f101765b = Collections.singletonList("developmentGenplanPreview");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinMasterPlanComponentModel> f101766c = BeduinMasterPlanComponentModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinMasterPlanComponentModel> S() {
            return f101766c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f101765b;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinMasterPlanComponentModel beduinMasterPlanComponentModel) {
        this.f101762e = interfaceC15523b;
        this.f101763f = beduinMasterPlanComponentModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101763f;
    }

    @Override // com.avito.android.lib.design.master_plan_view.MasterPlanView.a
    public final void a(@k MasterPlanPin masterPlanPin, float f12) {
        u("korpus_click_preview", masterPlanPin.getId());
        BeduinMasterPlanComponentModel beduinMasterPlanComponentModel = this.f101763f;
        this.f101762e.o(new BeduinOpenMasterPlanAction(beduinMasterPlanComponentModel.getImage(), beduinMasterPlanComponentModel.getPins(), f12, masterPlanPin, beduinMasterPlanComponentModel.getDevelopmentId(), null, 32, null));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        g gVar = new g(viewGroup.getContext(), null, 0, 6, null);
        gVar.setId(View.generateViewId());
        gVar.setLayoutParams(layoutParams);
        return gVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        g gVar = (g) view;
        BeduinMasterPlanComponentModel beduinMasterPlanComponentModel = this.f101763f;
        Image image = beduinMasterPlanComponentModel.getImage();
        List<MasterPlanPin> pins = beduinMasterPlanComponentModel.getPins();
        gVar.f101769b.setRadius(y6.b(beduinMasterPlanComponentModel.getCornerRadius() != null ? r3.intValue() : 16));
        int i12 = gVar.f101772e;
        Uri uriFindUri = image.findUri((i12 * 16) / 9, i12);
        MasterPlanView masterPlanView = gVar.f101770c;
        if (uriFindUri != null) {
            ImageView imageView = masterPlanView.f179665b;
            if (imageView != null) {
                com.avito.android.image_loader.glide.utils.b.c(imageView, uriFindUri);
            }
            if (imageView != null) {
                imageView.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(masterPlanView, 17));
            }
        }
        if (pins == null) {
            pins = C42784z0.f406748b;
        }
        masterPlanView.a(pins);
        masterPlanView.setScroll(0.5f);
        masterPlanView.setOnPinClickListener(this);
        masterPlanView.setInteractionListener(new e(gVar));
        masterPlanView.setSwipeListener(new f(this));
        BeduinContainerIndent padding = beduinMasterPlanComponentModel.getPadding();
        if (padding != null) {
            J.b(gVar, padding);
        }
    }

    public final void u(String str, String str2) {
        LinkedHashMap linkedHashMapW = AK.c.w("catalog_jk_source", "masterplan");
        linkedHashMapW.put("development_id", this.f101763f.getDevelopmentId());
        linkedHashMapW.put("catalog_jk_action", str);
        if (str2 != null) {
            linkedHashMapW.put("korpus_id", str2);
        }
        G0 g02 = G0.f406611a;
        this.f101762e.o(new BeduinLogEventAction(9974, 1, linkedHashMapW, null, Boolean.FALSE));
    }
}
