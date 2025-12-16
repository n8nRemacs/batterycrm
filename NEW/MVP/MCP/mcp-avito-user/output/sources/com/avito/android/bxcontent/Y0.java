package com.avito.android.bxcontent;

import android.view.View;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.bxcontent.mvi.entity.LoadState;
import com.avito.android.bxcontent.mvi.entity.q;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.serp.Onboarding;
import com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding;
import com.avito.android.serp.adapter.floating_promo_widget.FloatingPromoWidgetItem;
import com.avito.android.shortcut_navigation_bar.InterfaceC34996m;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import dU0.InterfaceC39628a;
import java.util.List;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BxContentView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/bxcontent/Y0;", "Lcom/avito/android/shortcut_navigation_bar/m;", "Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber;", "Lcom/avito/android/favorite/s;", "Lcom/avito/android/advert/viewed/j;", "LqK0/d;", "LLa/e;", "Lcom/avito/android/serp/adapter/closable/e;", "Lcom/avito/android/favorite_apprater/k;", "Lcom/avito/android/serp/adapter/advert_xl/C;", "Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener;", "Lcom/avito/android/async_phone/o;", "Lcom/avito/android/advertising/kebab/e;", "Lcom/avito/android/bx_beduin_native_items/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface Y0 extends InterfaceC34996m, FloatingViewsPresenter.Subscriber, com.avito.android.favorite.s, com.avito.android.advert.viewed.j, qK0.d, La.e, com.avito.android.serp.adapter.closable.e, com.avito.android.favorite_apprater.k, com.avito.android.serp.adapter.advert_xl.C, InlineFilterDialogOpener, com.avito.android.async_phone.o, com.avito.android.advertising.kebab.e, com.avito.android.bx_beduin_native_items.b {

    /* compiled from: BxContentView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    /* renamed from: BB */
    DN.b getF112687R();

    void BS(@Y61.k View view, @Y61.k Onboarding onboarding, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2, @Y61.k Y41.a<kotlin.G0> aVar3);

    void DM();

    @Y61.l
    SimpleDraweeView Ew(int i12);

    void FL(boolean z12);

    void Fi(@Y61.k String str);

    void Gv();

    void HK(@Y61.k ReplaceMainExitOnboarding replaceMainExitOnboarding);

    void Hw(@Y61.k String str, @Y61.l Throwable th2);

    void If();

    @Y61.k
    cU.s Iv();

    void J20(int i12);

    void Lw();

    @Y61.k
    InterfaceC43160i<Float> M6(boolean z12);

    void OP(@Y61.k AbstractC40048c abstractC40048c);

    void OQ(@Y61.k View view, @Y61.k Onboarding onboarding, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2);

    void OS(@Y61.k com.avito.android.bxcontent.mvi.entity.C c12);

    float OZ(int i12);

    void Oy(boolean z12);

    void R30(@Y61.k q.f fVar);

    void RX();

    void ST(boolean z12, boolean z13);

    void SU(@Y61.k BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain);

    void SZ(@Y61.k InterfaceC39628a interfaceC39628a);

    @Y61.k
    InterfaceC43160i<InterfaceC29127b> U5();

    void Uh();

    @Y61.k
    /* renamed from: Up */
    com.avito.android.bxcontent.search_bar_promo_widget.l getF112715d1();

    @Y61.k
    /* renamed from: V00 */
    com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.j getF112706a1();

    void Vv(@Y61.k String str);

    void Wt(@Y61.k FloatingPromoWidgetItem floatingPromoWidgetItem);

    void XB(boolean z12);

    void ZB(int i12);

    @Y61.k
    /* renamed from: a80 */
    com.avito.android.hero_banner.widget.l getF112718e1();

    void aQ();

    void aq(@Y61.k List<C29126a.b> list);

    void dw(@Y61.l com.avito.android.bxcontent.mvi.entity.A a12);

    void fZ(@Y61.l LoadState loadState, @Y61.k LoadState loadState2);

    void hG();

    @Y61.k
    /* renamed from: hS */
    com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.p getF112712c1();

    void i80(@Y61.l Throwable th2);

    void ia(@Y61.k ProgressInfoToastBarData progressInfoToastBarData);

    void j3(@Y61.k String str);

    @Y61.k
    /* renamed from: jI */
    PN.b getF112689S();

    void k70(boolean z12);

    void kB(boolean z12);

    void lU();

    void m40(@Y61.l LoadState loadState, @Y61.k LoadState loadState2);

    void mV(int i12, @Y61.k Y41.a<kotlin.G0> aVar);

    int ml();

    void n70(boolean z12);

    @Y61.k
    /* renamed from: nC */
    com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.i getF112721f1();

    @Y61.k
    /* renamed from: nO */
    com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.k getF112709b1();

    void nr(@Y61.k BxContentBusiness360.Toast toast);

    void onDataChanged();

    void pZ();

    void rh();

    @Y61.l
    StyledPlayerView sN(int i12);

    void sw(int i12);

    void t2();

    void v5(boolean z12);

    void vW(@Y61.l com.avito.android.bxcontent.mvi.entity.u uVar, @Y61.l String str, @Y61.k com.avito.android.bxcontent.analytics.a aVar);

    void vn(boolean z12);

    void xZ(@Y61.k String str);

    void yR(boolean z12);

    void yl(@Y61.k com.avito.android.serp.adapter.G0 g02);

    void zF(boolean z12);
}
