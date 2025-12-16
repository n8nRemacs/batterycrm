package com.avito.android.beduin.common.component.cart_icon;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.beduin.common.navigation_bar.cart_native.NavigationBarCartNative;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N;
import ej.InterfaceC40116e;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCartIconContainer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_icon/d;", "Lej/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FrameLayout f100862b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final N f100863c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final L f100864d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public NavigationBarCartNative.ShoppingCartButtonStyle f100865e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public L91.e f100866f;

    /* compiled from: BeduinCartIconContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100867a;

        static {
            int[] iArr = new int[NavigationBarCartNative.ShoppingCartButtonStyle.values().length];
            try {
                iArr[NavigationBarCartNative.ShoppingCartButtonStyle.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationBarCartNative.ShoppingCartButtonStyle.Redesign.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationBarCartNative.ShoppingCartButtonStyle.AvitoBlack.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100867a = iArr;
        }
    }

    public d(@k FrameLayout frameLayout, @k N n12, @k L l12) {
        this.f100862b = frameLayout;
        this.f100863c = n12;
        this.f100864d = l12;
    }

    @Override // ej.InterfaceC40116e
    /* renamed from: getRoot */
    public final View getF103243b() {
        return this.f100862b;
    }
}
