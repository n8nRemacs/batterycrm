package com.avito.android.serp.adapter.search_bar;

import Ip0.C14142a;
import android.content.res.Resources;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: UdfToolbarPresenter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/search_bar/T;", "Lcom/avito/android/serp/adapter/search_bar/O;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class T implements O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public fG0.d f271615a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f271616b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f271617c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f271618d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f271619e;

    @Inject
    public T() {
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        this.f271616b = f2.b(0, 1, bufferOverflow, 1);
        this.f271617c = f2.b(0, 1, bufferOverflow, 1);
        this.f271618d = f2.b(0, 1, bufferOverflow, 1);
        this.f271619e = f2.b(0, 1, bufferOverflow, 1);
    }

    @Override // com.avito.android.serp.adapter.search_bar.O
    public final void a(@Y61.k fG0.d dVar) {
        this.f271615a = dVar;
        P p12 = new P(this);
        Q q12 = new Q(this);
        S s5 = new S(this);
        dVar.f395796f.setOnClickListener(new com.avito.android.vas_planning_checkout.item.checkout.i(20, p12));
        dVar.f395799i.setOnClickListener(new com.avito.android.vas_planning_checkout.item.checkout.i(21, q12));
        dVar.f395797g.setOnClickListener(new com.avito.android.seller_promotions.b(29, s5));
    }

    @Override // com.avito.android.serp.adapter.search_bar.O
    @Y61.k
    public final InterfaceC43160i<G0> b() {
        return C43175k.a(this.f271617c);
    }

    @Override // com.avito.android.serp.adapter.search_bar.O
    public final void c(@Y61.k UdfToolbarColors udfToolbarColors) throws Resources.NotFoundException {
        fG0.d dVar = this.f271615a;
        if (dVar != null) {
            dVar.a(udfToolbarColors);
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.O
    public final void d(@Y61.k C14142a c14142a, @Y61.k UdfToolbarStyle udfToolbarStyle) {
        fG0.d dVar = this.f271615a;
        if (dVar != null) {
            dVar.setState((fG0.d) c14142a);
        }
        fG0.d dVar2 = this.f271615a;
        if (dVar2 != null) {
            dVar2.setStyle((fG0.d) udfToolbarStyle);
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.O
    @Y61.k
    public final InterfaceC43160i<String> e() {
        return C43175k.a(this.f271619e);
    }

    @Override // com.avito.android.serp.adapter.search_bar.O
    public final void e0() {
        this.f271615a = null;
    }

    @Override // com.avito.android.serp.adapter.search_bar.O
    @Y61.k
    public final InterfaceC43160i<InterfaceC31171n> f() {
        return C43175k.a(this.f271616b);
    }

    @Override // com.avito.android.serp.adapter.search_bar.O
    @Y61.k
    public final InterfaceC43160i<G0> g() {
        return C43175k.a(this.f271618d);
    }
}
