package com.avito.android.app.coldstart;

import SK0.b;
import android.media.AudioManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.app.task.AppStartTypeDetermineTaskImpl;
import com.avito.android.authorization.change_password.s;
import com.avito.android.authorization.upgrade_password.E;
import com.avito.android.bottom_navigation.C28895q;
import com.avito.android.campaigns_sale.konveyor.editBlock.p;
import com.avito.android.code_check.code_confirm.CodeConfirmFragment;
import com.avito.android.comparison.l;
import com.avito.android.component.advert_contact_bar.C29563j;
import com.avito.android.component.advert_contact_bar.J;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.k;
import com.avito.android.edit_carousel.PagingBar;
import com.avito.android.extended_profile_ui_components.search_input.ProfileSearchInputView;
import com.avito.android.favorite_sellers.H;
import com.avito.android.home.bottom_navigation.C30759a;
import com.avito.android.home.bottom_navigation.C30760b;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.p6;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.vk.id.group.subscription.xml.GroupSubscriptionSheet;
import io.reactivex.rxjava3.core.InterfaceC41770c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.G0;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f91347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f91348c;

    public /* synthetic */ d(Object obj, int i12) {
        this.f91347b = i12;
        this.f91348c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [com.avito.android.iac_dialer.impl_module.device_status.gsm.a] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f91348c;
        switch (this.f91347b) {
            case 0:
                ((l0.a) obj).f406838b = false;
                break;
            case 1:
                h hVar = (h) obj;
                View view = hVar.f91365b;
                if (view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().removeOnDrawListener(hVar);
                    break;
                }
                break;
            case 2:
                AppStartTypeDetermineTaskImpl.execute$lambda$0((AppStartTypeDetermineTaskImpl) obj);
                break;
            case 3:
                InterfaceC41770c interfaceC41770c = (InterfaceC41770c) obj;
                if (!interfaceC41770c.i()) {
                    interfaceC41770c.e();
                    break;
                }
                break;
            case 4:
                ((GroupSubscriptionSheet) obj).show();
                break;
            case 5:
                s sVar = (s) obj;
                sVar.f93376a.setScrollY(sVar.f93379d.getTop());
                break;
            case 6:
                E e12 = (E) obj;
                e12.f94754f.setScrollY(e12.f94753e.getTop());
                break;
            case 7:
                int i12 = com.avito.android.beduin.common.component.photo_picker.j.f102024J0;
                p6 p6Var = new p6((com.avito.android.beduin.common.component.photo_picker.j) obj);
                while (p6Var.hasNext()) {
                    ((View) p6Var.next()).requestLayout();
                }
                break;
            case 8:
                com.avito.android.beduin.common.component.review_card.f fVar = (com.avito.android.beduin.common.component.review_card.f) obj;
                Layout layout = fVar.f102372d.getLayout();
                if (layout != null) {
                    int lineCount = layout.getLineCount();
                    TextView textView = fVar.f102374f;
                    if (lineCount <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
                        D6.w(textView);
                    } else {
                        D6.H(textView);
                    }
                    fVar.requestLayout();
                    break;
                }
                break;
            case 9:
                ((C28895q) obj).f107051b.setVisibility(0);
                break;
            case 10:
                ((p) obj).f114003d.callOnClick();
                break;
            case 11:
                ((com.avito.android.lib.design.modal.a) obj).dismiss();
                break;
            case 12:
                CodeConfirmFragment.a aVar = CodeConfirmFragment.f118629G0;
                CodeConfirmFragment codeConfirmFragment = (CodeConfirmFragment) obj;
                codeConfirmFragment.y5().v();
                codeConfirmFragment.y5().q();
                break;
            case 13:
                com.avito.android.comparison.s sVar2 = ((l) obj).f124087j;
                if (sVar2 != null) {
                    sVar2.e();
                    break;
                }
                break;
            case 14:
                com.avito.android.comparison.items.nested_scrolling_item.i iVar = (com.avito.android.comparison.items.nested_scrolling_item.i) obj;
                iVar.f124018e.setHorizontalOffset(iVar.f124015b.f124189b);
                iVar.f124020g.e();
                break;
            case 15:
                ((C29563j) obj).f125180a.setVisibility(0);
                break;
            case 16:
                ((J) obj).f125138a.setVisibility(0);
                break;
            case 17:
                ((LinearLayout) obj).removeAllViews();
                break;
            case 18:
                C35976x4.b(((k) obj).f135380c);
                break;
            case 19:
                ((com.avito.android.developments_agency_search.screen.deal_cabinet.l) obj).f136991a.notifyDataSetChanged();
                break;
            case 20:
                ((com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j) obj).f139027b.notifyDataSetChanged();
                break;
            case 21:
                PagingBar pagingBar = (PagingBar) obj;
                Y41.l<? super Integer, G0> lVar = pagingBar.f146234n;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(pagingBar.f146233m));
                    break;
                }
                break;
            case 22:
                ((ProfileSearchInputView) obj).f153390h.requestFocus();
                break;
            case 23:
                com.avito.android.extended_profile_widgets.adapter.about_v2.j jVar = (com.avito.android.extended_profile_widgets.adapter.about_v2.j) obj;
                Layout layout2 = jVar.f154191d.getLayout();
                if (layout2 != null) {
                    int lineCount2 = layout2.getLineCount();
                    TextView textView2 = jVar.f154192e;
                    if (lineCount2 > 0 && layout2.getEllipsisCount(lineCount2 - 1) > 0) {
                        D6.H(textView2);
                        break;
                    } else {
                        D6.w(textView2);
                        break;
                    }
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                com.avito.android.extended_profile_widgets.adapter.info.h hVar2 = (com.avito.android.extended_profile_widgets.adapter.info.h) obj;
                Layout layout3 = hVar2.f154481c.getLayout();
                if (layout3 != null) {
                    int lineCount3 = layout3.getLineCount();
                    TextView textView3 = hVar2.f154482d;
                    if (lineCount3 > 0 && layout3.getEllipsisCount(lineCount3 - 1) > 0) {
                        D6.H(textView3);
                        break;
                    } else {
                        D6.w(textView3);
                        break;
                    }
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((H) obj).f155445s.notifyDataSetChanged();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                C30759a c30759a = (C30759a) obj;
                if (!c30759a.f162338c.V()) {
                    b.a.a(c30759a.f162337b.f162347b, new C30760b(), null, null, null, 14);
                    break;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                AudioBluetoothManager.c.a aVar2 = ((AudioBluetoothManager.c) obj).f165778b;
                if (aVar2 != null) {
                    aVar2.a();
                    break;
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                com.avito.android.iac_dialer.impl_module.device_status.gsm.c cVar = com.avito.android.iac_dialer.impl_module.device_status.gsm.b.f165970f;
                final com.avito.android.iac_dialer.impl_module.device_status.gsm.b bVar = (com.avito.android.iac_dialer.impl_module.device_status.gsm.b) obj;
                if (Build.VERSION.SDK_INT < 31) {
                    com.avito.android.iac_dialer.impl_module.device_status.gsm.b.f165970f = new com.avito.android.iac_dialer.impl_module.device_status.gsm.c(bVar);
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacGsmCallStateProviderImpl", "Subscribed via phoneStateListener", null);
                    TelephonyManager telephonyManager = (TelephonyManager) bVar.f165975d.getValue();
                    com.avito.android.iac_dialer.impl_module.device_status.gsm.c cVar2 = com.avito.android.iac_dialer.impl_module.device_status.gsm.b.f165970f;
                    telephonyManager.listen(cVar2 != null ? cVar2 : null, 32);
                    break;
                } else {
                    com.avito.android.iac_dialer.impl_module.device_status.gsm.b.f165971g = new AudioManager.OnModeChangedListener() { // from class: com.avito.android.iac_dialer.impl_module.device_status.gsm.a
                        @Override // android.media.AudioManager.OnModeChangedListener
                        public final void onModeChanged(int i13) {
                            b bVar2 = bVar;
                            c cVar3 = b.f165970f;
                            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar3 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
                            StringBuilder sb2 = new StringBuilder("onAudioModeChangeListener: mode = ");
                            JK.e.f8872a.getClass();
                            sb2.append(JK.e.a(i13));
                            bVar3.a("IacAudioManager", sb2.toString(), null);
                            bVar2.d(i13 == 2);
                        }
                    };
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacGsmCallStateProviderImpl", "Subscribed via onAudioModeChangeListener", null);
                    bVar.d(((AudioManager) bVar.f165976e.getValue()).getMode() == 2);
                    AudioManager audioManager = (AudioManager) bVar.f165976e.getValue();
                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    com.avito.android.iac_dialer.impl_module.device_status.gsm.a aVar3 = com.avito.android.iac_dialer.impl_module.device_status.gsm.b.f165971g;
                    audioManager.addOnModeChangedListener(executorServiceNewSingleThreadExecutor, aVar3 != null ? aVar3 : null);
                    break;
                }
            default:
                com.avito.android.important_addresses_selection.presentation.d dVar = (com.avito.android.important_addresses_selection.presentation.d) obj;
                RecyclerView recyclerView = dVar.f169817b;
                if (!recyclerView.d0()) {
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                        break;
                    }
                } else {
                    recyclerView.post(new d(dVar, 29));
                    break;
                }
                break;
        }
    }
}
