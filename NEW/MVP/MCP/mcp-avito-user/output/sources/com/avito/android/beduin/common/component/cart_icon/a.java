package com.avito.android.beduin.common.component.cart_icon;

import Vm.C15692a;
import Y61.k;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.m;
import com.avito.android.R;
import com.avito.android.beduin.common.component.cart_icon.d;
import com.avito.android.beduin.common.component.cart_icon.e;
import com.avito.android.beduin.common.navigation_bar.cart_native.NavigationBarCartNative;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.di.C29972i;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N;
import com.avito.android.util.C35835l0;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import nU.InterfaceC44331a;

/* compiled from: BeduinCartIconComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_icon/a;", "Lej/a;", "Lcom/avito/android/beduin/common/component/cart_icon/BeduinCartIconModel;", "Lcom/avito/android/beduin/common/component/cart_icon/d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40112a<BeduinCartIconModel, d> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinCartIconModel f100857e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final lj.e f100858f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final e f100859g;

    public a(@k BeduinCartIconModel beduinCartIconModel, @k lj.e eVar, @k e eVar2) {
        this.f100857e = beduinCartIconModel;
        this.f100858f = eVar;
        this.f100859g = eVar2;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100857e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(R.id.beduin_cart_native);
        frameLayout.setLayoutParams(layoutParams);
        m mVarC = C35835l0.c(viewGroup.getContext());
        C15692a.f17367a.getClass();
        N nA2 = com.avito.android.cart_menu_icons.di.b.a().a((InterfaceC44331a) C29972i.a(C29972i.b(mVarC), InterfaceC44331a.class), mVarC).a();
        return new d(frameLayout, nA2, new L(mVarC, nA2, false, 4, null));
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        d dVar = (d) interfaceC40116e;
        L l12 = dVar.f100864d;
        FrameLayout frameLayout = dVar.f100862b;
        O oC2 = l12.c(frameLayout);
        String f103350r = this.f100858f.getF103350r();
        e eVar = this.f100859g;
        eVar.getClass();
        BeduinCartIconModel beduinCartIconModel = this.f100857e;
        e.a aVar = new e.a(f103350r, beduinCartIconModel.f100853b);
        LinkedHashMap linkedHashMap = eVar.f100870c;
        io.reactivex.rxjava3.disposables.d dVar2 = (io.reactivex.rxjava3.disposables.d) linkedHashMap.remove(aVar);
        if (dVar2 != null) {
            dVar2.dispose();
        }
        linkedHashMap.put(aVar, oC2.t0(new f(eVar, beduinCartIconModel)));
        L91.e eVar2 = dVar.f100866f;
        N n12 = dVar.f100863c;
        if (eVar2 != null) {
            n12.f176464O.removeObserver(eVar2);
        }
        NavigationBarCartNative.ShoppingCartButtonStyle shoppingCartButtonStyle = dVar.f100865e;
        NavigationBarCartNative.ShoppingCartButtonStyle shoppingCartButtonStyle2 = beduinCartIconModel.f100855d;
        if (shoppingCartButtonStyle2 != shoppingCartButtonStyle) {
            dVar.f100865e = shoppingCartButtonStyle2;
            frameLayout.removeAllViews();
            int i12 = d.a.f100867a[shoppingCartButtonStyle2.ordinal()];
            if (i12 == 1) {
                LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.redesign_cart_icon_view, frameLayout);
            } else if (i12 == 2) {
                View viewFindViewById = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.redesign_cart_icon_view, frameLayout).findViewById(R.id.cart_button);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ((ImageView) viewFindViewById).setImageTintList(ColorStateList.valueOf(C35835l0.d(R.attr.black, frameLayout.getContext())));
            } else if (i12 == 3) {
                com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.f176528a.a(LayoutInflater.from(new androidx.appcompat.view.d(frameLayout.getContext(), R.style.Theme_DesignSystem_Re23)).inflate(R.layout.redesign_cart_icon_view, frameLayout));
            }
        }
        L91.e eVar3 = new L91.e(dVar, 5);
        dVar.f100866f = eVar3;
        n12.f176464O.observeForever(eVar3);
    }
}
