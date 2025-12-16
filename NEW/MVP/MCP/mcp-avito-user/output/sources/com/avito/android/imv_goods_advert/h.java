package com.avito.android.imv_goods_advert;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC22983P;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.L5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImvGoodsAdvertFragmentDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_advert/h;", "Lcom/avito/android/advert_core/advert/l;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements com.avito.android.advert_core.advert.l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f170531a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f170532b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Context f170533c;

    public h(@Y61.k Fragment fragment, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f170531a = fragment;
        this.f170532b = interfaceC35741a1;
        this.f170533c = fragment.getContext();
    }

    @Override // com.avito.android.advert_core.advert.l
    @Y61.k
    public final FragmentManager a() {
        return this.f170531a.getChildFragmentManager();
    }

    @Override // com.avito.android.advert_core.advert.l
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final Fragment getF170531a() {
        return this.f170531a;
    }

    @Override // com.avito.android.advert_core.advert.l
    public final void c(@Y61.l Throwable th2) {
        Context context;
        if (this.f170531a.isVisible() && (context = this.f170533c) != null) {
            L5.b(context, InterfaceC35741a1.a.a(this.f170532b, th2, null, null, 6).k0(context), 0);
        }
    }

    @Override // com.avito.android.advert_core.advert.l
    public final void d(@Y61.k Y41.l<? super Context, G0> lVar) {
        Context context = this.f170533c;
        if (context != null) {
            lVar.invoke(context);
        }
    }

    @Override // com.avito.android.advert_core.advert.l
    @Y61.k
    public final InterfaceC22983P e() {
        return this.f170531a.getViewLifecycleOwner();
    }
}
