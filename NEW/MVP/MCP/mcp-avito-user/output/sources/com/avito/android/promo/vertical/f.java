package com.avito.android.promo.vertical;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.promo.PromoAction;
import com.avito.android.promo.PromoStyle;
import com.avito.android.promo.PromoWidgetItem;
import j.f0;
import java.util.List;
import kotlin.Metadata;
import ld0.C43735f;
import ld0.InterfaceC43733d;
import ld0.InterfaceC43734e;

/* compiled from: PromoWidgetItemVerticalViewImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/promo/vertical/f;", "Lcom/avito/konveyor/adapter/b;", "Lld0/e;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends com.avito.konveyor.adapter.b implements InterfaceC43734e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43735f f231689b;

    public f(@k View view, @k InterfaceC43733d interfaceC43733d) {
        super(view);
        this.f231689b = new C43735f(view, interfaceC43733d, LayoutInflater.from(new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23)).inflate(R.layout.simple_promo_block_content, (ViewGroup) null));
    }

    @Override // ld0.InterfaceC43734e
    public final void BM(@f0 int i12) {
        this.f231689b.BM(R.style.Re23_Text_H20);
    }

    @Override // ld0.InterfaceC43734e
    public final void Gg(@l String str, boolean z12) {
        this.f231689b.Gg(str, z12);
    }

    @Override // ld0.InterfaceC43734e
    public final void SG(@k List<PromoAction> list, @k PromoWidgetItem promoWidgetItem, int i12) {
        this.f231689b.SG(list, promoWidgetItem, i12);
    }

    @Override // ld0.InterfaceC43734e
    public final void W2() {
        this.f231689b.W2();
    }

    @Override // ld0.InterfaceC43734e
    public final void WU(@k PromoStyle promoStyle, boolean z12) {
        this.f231689b.WU(promoStyle, z12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f231689b.getClass();
    }

    @Override // ld0.InterfaceC43734e
    public final void r6(@k String str) {
        this.f231689b.r6(str);
    }

    @Override // ld0.InterfaceC43734e
    public final void v8() {
        this.f231689b.v8();
    }
}
