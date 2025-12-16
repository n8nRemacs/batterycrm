package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import android.view.MenuItem;
import android.view.View;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.util.D6;
import com.jakewharton.rxbinding4.view.C37722i;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CartMenuIconView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/L;", "", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final N f176456a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f176457b;

    public L(InterfaceC22983P interfaceC22983P, N n12, boolean z12, int i12, C42822w c42822w) {
        z12 = (i12 & 4) != 0 ? true : z12;
        this.f176456a = n12;
        this.f176457b = z12;
        interfaceC22983P.getLifecycle().a(new I(this));
    }

    public static void a(InterfaceC31171n interfaceC31171n, Badge badge, View view) {
        String string;
        if (kotlin.jvm.internal.L.f(interfaceC31171n, InterfaceC31171n.b.f176507a)) {
            return;
        }
        if (!(interfaceC31171n instanceof InterfaceC31171n.a)) {
            if (kotlin.jvm.internal.L.f(interfaceC31171n, InterfaceC31171n.d.f176509a)) {
                D6.w(badge);
                D6.H(view);
                return;
            } else {
                if (kotlin.jvm.internal.L.f(interfaceC31171n, InterfaceC31171n.c.f176508a)) {
                    D6.w(badge);
                    D6.w(view);
                    return;
                }
                return;
            }
        }
        if (badge != null) {
            int i12 = ((InterfaceC31171n.a) interfaceC31171n).f176506a;
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 > 99) {
                numValueOf = null;
            }
            if (numValueOf == null || (string = numValueOf.toString()) == null) {
                string = "99+";
            }
            badge.setTitleText(string);
        }
        D6.w(view);
        D6.H(badge);
    }

    public static void f(@Y61.k View view, @Y61.k InterfaceC31171n interfaceC31171n) {
        a(interfaceC31171n, (Badge) view.findViewById(R.id.cart_counter), view.findViewById(R.id.cart_point));
    }

    public static void g(@Y61.k MenuItem menuItem, @Y61.k InterfaceC31171n interfaceC31171n) {
        View actionView = menuItem.getActionView();
        if (actionView == null) {
            return;
        }
        View viewFindViewById = actionView.findViewById(R.id.cart_counter);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        Badge badge = (Badge) viewFindViewById;
        View viewFindViewById2 = actionView.findViewById(R.id.cart_point);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        a(interfaceC31171n, badge, viewFindViewById2);
    }

    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.O b(@Y61.k MenuItem menuItem) {
        return C37722i.a(menuItem.getActionView()).K(new J(this));
    }

    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.O c(@Y61.k View view) {
        return C37722i.a(view).K(new K(this));
    }

    public final boolean d() {
        N n12 = this.f176456a;
        return n12.me(n12.f176465P, n12.f176467R) && this.f176457b;
    }

    public final boolean e(@Y61.l InterfaceC31171n interfaceC31171n) {
        boolean zD2 = d();
        return interfaceC31171n == null ? zD2 : zD2 && !(interfaceC31171n instanceof InterfaceC31171n.b);
    }
}
