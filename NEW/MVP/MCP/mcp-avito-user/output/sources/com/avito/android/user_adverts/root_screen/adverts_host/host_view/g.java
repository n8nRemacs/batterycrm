package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import CN0.a;
import VO0.a;
import android.content.Context;
import android.media.AudioManager;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.TopUpFormLink;
import com.avito.android.photo_list_view.re23.image.loading.PublishImageLoading;
import com.avito.android.photo_list_view.re23.image.loading.a;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.a;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import com.avito.android.util.D6;
import com.avito.android.vas_performance.ui.PerformanceVasFragment;
import com.avito.android.vas_performance.ui.competitive.CompetitiveVasFragment;
import com.avito.android.vas_performance.ui.stickers.buy.StickersBuyVasFragment;
import com.avito.android.vas_planning.balance_lack.VasPlanBalanceLackDialogFragment;
import com.avito.android.vas_planning.balance_lack.j;
import com.avito.android.video_requirements.view.VideoRequirementsDialog;
import com.avito.android.virtual_deal_room_reference_category.reference_category.ReferenceCategoryFragment;
import com.avito.android.work_profile.profile.about_me.ui.AboutMeFragment;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.my.target.C37796l;
import com.my.target.C37798m;
import com.my.target.C37811t;
import com.my.target.D;
import com.my.target.V;
import e11.i2;
import hQ0.InterfaceC40866a;
import java.lang.ref.WeakReference;
import kotlin.G0;
import lK0.InterfaceC43650a;
import org.webrtc.MediaStreamTrack;
import rO0.InterfaceC47577a;
import rQ0.AbstractC47586a;
import zN0.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f313015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f313016c;

    public /* synthetic */ g(Object obj, int i12) {
        this.f313015b = i12;
        this.f313016c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j.a.C9960a.C9961a c9961a;
        DeepLink deepLink;
        Y41.a<G0> aVar;
        Object obj = this.f313016c;
        switch (this.f313015b) {
            case 0:
                ((j) obj).f313038t.d(a.C9589a.f312999a);
                break;
            case 1:
                com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.g gVar = (com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.g) obj;
                PanelCardItem panelCardItem = gVar.f313719m;
                if (panelCardItem != null) {
                    gVar.f313708b.a(panelCardItem);
                    break;
                }
                break;
            case 2:
                ((com.avito.android.user_adverts_filters.main.view.a) obj).f316332b.invoke();
                break;
            case 3:
                ((com.avito.android.user_adverts_views.advert_item.p) obj).f316572j.performClick();
                break;
            case 4:
                ((com.avito.android.user_viewed.screen.ui.item.error.e) obj).f318496b.invoke(InterfaceC43650a.d.f413720a);
                break;
            case 5:
                ((com.avito.android.vas_performance.screens.stickers.buy.a) obj).f320611E.invoke();
                break;
            case 6:
                com.avito.android.vas_performance.o oVar = ((PerformanceVasFragment) obj).f321388p0;
                (oVar != null ? oVar : null).pa();
                break;
            case 7:
                com.avito.android.vas_performance.ui.competitive.p pVar = ((CompetitiveVasFragment) obj).f321468p0;
                (pVar != null ? pVar : null).L8();
                break;
            case 8:
                com.avito.android.vas_performance.ui.stickers.buy.v vVar = ((StickersBuyVasFragment) obj).f321933p0;
                (vVar != null ? vVar : null).c6(Integer.valueOf(view.getId()));
                break;
            case 9:
                com.avito.android.vas_planning.balance_lack.j jVar = ((VasPlanBalanceLackDialogFragment) obj).f322200h0;
                if (jVar == null) {
                    jVar = null;
                }
                j.a value = jVar.f322225M.getValue();
                j.a.C9960a c9960a = value instanceof j.a.C9960a ? (j.a.C9960a) value : null;
                if (c9960a != null && (c9961a = c9960a.f322231c) != null && (deepLink = c9961a.f322233b) != null) {
                    if (deepLink instanceof TopUpFormLink) {
                        jVar.f322221E.c(new XL0.b());
                    }
                    jVar.f322226N.postValue(deepLink);
                    break;
                }
                break;
            case 10:
                com.avito.android.vas_planning.dialog.g gVar2 = (com.avito.android.vas_planning.dialog.g) obj;
                org.threeten.bp.g gVarU = org.threeten.bp.g.u(gVar2.f322318J, gVar2.f322319K);
                org.threeten.bp.f fVarF = org.threeten.bp.f.F();
                org.threeten.bp.e eVar = gVar2.f322313E;
                if (eVar != null && org.threeten.bp.f.G(eVar, gVarU).C(fVarF)) {
                    gVar2.f322314F.accept(gVarU);
                    gVar2.dismiss();
                    break;
                } else {
                    TextView textView = gVar2.f322322N;
                    if (textView == null) {
                        textView = null;
                    }
                    D6.H(textView);
                    TextView textView2 = gVar2.f322322N;
                    (textView2 != null ? textView2 : null).setText(R.string.vas_planning_select_time_error);
                    break;
                }
                break;
            case 11:
                com.avito.android.vas_planning.item.radio.i iVar = (com.avito.android.vas_planning.item.radio.i) obj;
                if (!iVar.f322400b.isChecked() && (aVar = iVar.f322401c) != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 12:
                ((l41.g) obj).accept(G0.f406611a);
                break;
            case 13:
                com.avito.android.lib.util.g.a((com.avito.android.lib.design.bottom_sheet.o) obj);
                break;
            case 14:
                VideoRequirementsDialog.a aVar2 = VideoRequirementsDialog.f326034r0;
                ((VideoRequirementsDialog) obj).dismiss();
                break;
            case 15:
                ((com.avito.android.virtual_deal_room.client_edit.f) obj).f326157a.invoke(a.C0105a.f2131a);
                break;
            case 16:
                ((com.avito.android.virtual_deal_room_reference_category.client_add.g) obj).f327157a.invoke(InterfaceC47577a.C12372a.f429776a);
                break;
            case 17:
                ReferenceCategoryFragment.a aVar3 = ReferenceCategoryFragment.f327227o0;
                c.a.a((ReferenceCategoryFragment) obj);
                break;
            case 18:
                int i12 = com.avito.android.wallet.page.history.mvi.b.f327999E;
                ((com.avito.android.wallet.page.history.mvi.b) obj).dismiss();
                break;
            case 19:
                ((com.avito.android.wallet.page.history.mvi.d) obj).f328056a.invoke(a.d.f17107a);
                break;
            case 20:
                com.avito.android.widget_filters.ui.items.category.m mVar = (com.avito.android.widget_filters.ui.items.category.m) obj;
                Y41.l<? super Integer, G0> lVar = mVar.f330356k;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(mVar.getAdapterPosition()));
                    break;
                }
                break;
            case 21:
                com.avito.android.widget_filters.ui.items.dates.l lVar2 = (com.avito.android.widget_filters.ui.items.dates.l) obj;
                Y41.l<? super Integer, G0> lVar3 = lVar2.f330392l;
                if (lVar3 != null) {
                    lVar3.invoke(Integer.valueOf(lVar2.getAdapterPosition()));
                    break;
                }
                break;
            case 22:
                com.avito.android.widget_filters.ui.items.location.k kVar = (com.avito.android.widget_filters.ui.items.location.k) obj;
                Y41.l<? super Integer, G0> lVar4 = kVar.f330534y;
                if (lVar4 != null) {
                    lVar4.invoke(Integer.valueOf(kVar.getAdapterPosition()));
                    break;
                }
                break;
            case 23:
                AboutMeFragment.a aVar4 = AboutMeFragment.f330814x0;
                ((AboutMeFragment) obj).t5().accept(new InterfaceC40866a.b(true));
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ((com.avito.android.work_profile.profile.gig.ui.b) obj).f331168b.invoke();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((com.avito.android.work_profile.profile.work_profile_host.ui.f) obj).f331315a.invoke(AbstractC47586a.C12375a.f429808a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Y41.a<G0> aVar5 = ((com.avito.beduin.v2.component.video.state.e) obj).f336367h;
                if (aVar5 != null) {
                    aVar5.invoke();
                    break;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i13 = PublishImageLoading.f218254l;
                ((a.d) obj).f218272b.invoke();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C37798m c37798m = (C37798m) obj;
                c37798m.getClass();
                Context context = view.getContext();
                D d12 = c37798m.f364921b;
                if (d12 != null) {
                    if (!d12.c()) {
                        d12.b(context);
                        break;
                    }
                } else {
                    String str = c37798m.f364923d;
                    if (str != null) {
                        i2.a(str, context);
                        break;
                    }
                }
                break;
            default:
                C37796l c37796l = ((C37811t) obj).f365152n;
                WeakReference<Context> weakReference = c37796l.f364912u;
                Context context2 = weakReference != null ? weakReference.get() : null;
                if (context2 == null) {
                    context2 = view.getContext();
                }
                AudioManager audioManager = (AudioManager) context2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    audioManager.requestAudioFocus(c37796l.f364896e, 3, 2);
                }
                if (!c37796l.f364915x) {
                    if (c37796l.f364909r == 1) {
                        c37796l.f364909r = 4;
                    }
                    try {
                        new V(c37796l, context2).show();
                        c37796l.f364906o = true;
                        break;
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        c37796l.q();
                    }
                }
                break;
        }
    }
}
