package com.avito.android.job.cv_info_actualization.ui.items.radio;

import NB0.a;
import NB0.c;
import RJ0.a;
import TP.a;
import Y41.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.lib.design.photo_uploader_image.PhotoUploaderImage;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.k;
import com.avito.android.photo_gallery.autoteka_teaser.AutotekaTeaserGalleryInsightsListViewFullScreen;
import com.avito.android.photo_gallery.autoteka_teaser.AutotekaTeaserGallerySingleInsightViewFullScreen;
import com.avito.android.photo_gallery.autoteka_teaser.v2.AutotekaTeaserV2GalleryInsightListViewFullScreen;
import com.avito.android.photo_gallery.autoteka_teaser.v3.AutotekaTeaserV3GalleryViewFullScreen;
import com.avito.android.photo_list_view.A;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.profile_settings_extended.adapter.link_edit.LinkEditItem;
import com.avito.android.publish.details.adapter.historical_suggest.p;
import com.avito.android.publish.items.video_upload.VideoUploadItemView;
import com.avito.android.publish.slots.delivery_summary_edit.item.m;
import com.avito.android.publish.slots.delivery_summary_edit.re23.j;
import com.avito.android.rating.details.RatingDetailsFragment;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import com.avito.android.reward_bug_entry_impl.mvi.a;
import com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import com.avito.android.user_stats.extended_user_stats.J;
import com.avito.android.user_stats.extended_user_stats.metrics.item.StatMetric;
import com.avito.android.util.N0;
import com.avito.android.webview.l;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import hf0.C40928a;
import hf0.C40930c;
import hf0.DialogC40929b;
import iy.DialogC42133a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.G0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import qt0.C47439c;
import ru.cyberity.cbr.core.widget.CBRDateTimeInputLayout;
import ru.cyberity.cbr.core.widget.autocompletePhone.PhoneNumberKitV2;
import wK0.AbstractC49526a;
import wc0.C49602g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f174304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f174305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f174306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f174307e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g(l lVar, DeepLink deepLink, com.jakewharton.rxrelay3.c cVar) {
        this.f174304b = 22;
        this.f174305c = (H) lVar;
        this.f174306d = deepLink;
        this.f174307e = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [Y41.l, kotlin.jvm.internal.H] */
    /* JADX WARN: Type inference failed for: r7v20, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r7v25, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k<?> firstWheelValue;
        k<?> firstWheelValue2;
        String str;
        com.avito.android.lib.design.bottom_sheet.d dVar;
        Object obj = this.f174307e;
        Object obj2 = this.f174306d;
        Object obj3 = this.f174305c;
        switch (this.f174304b) {
            case 0:
                int i12 = i.f174311f;
                ((l) obj3).invoke(new a.AbstractC1070a.e(((c) obj2).f174292b, ((d) obj).f174299a));
                break;
            case 1:
                int i13 = AutotekaTeaserGalleryInsightsListViewFullScreen.f216778j;
                com.avito.android.photo_gallery.autoteka_teaser.b bVar = (com.avito.android.photo_gallery.autoteka_teaser.b) obj3;
                if (bVar != null) {
                    AutotekaTeaserGalleryInsightsListViewFullScreen autotekaTeaserGalleryInsightsListViewFullScreen = (AutotekaTeaserGalleryInsightsListViewFullScreen) obj;
                    bVar.b(((AutotekaTeaserResult) obj2).getReportLink().getUrl(), autotekaTeaserGalleryInsightsListViewFullScreen.getFromBlock(), autotekaTeaserGalleryInsightsListViewFullScreen.getUtmCampaign());
                    break;
                }
                break;
            case 2:
                int i14 = AutotekaTeaserGallerySingleInsightViewFullScreen.f216796i;
                com.avito.android.photo_gallery.autoteka_teaser.b bVar2 = (com.avito.android.photo_gallery.autoteka_teaser.b) obj3;
                if (bVar2 != null) {
                    AutotekaTeaserGallerySingleInsightViewFullScreen autotekaTeaserGallerySingleInsightViewFullScreen = (AutotekaTeaserGallerySingleInsightViewFullScreen) obj;
                    bVar2.b(((AutotekaTeaserResult) obj2).getReportLink().getUrl(), autotekaTeaserGallerySingleInsightViewFullScreen.getFromBlock(), autotekaTeaserGallerySingleInsightViewFullScreen.getUtmCampaign());
                    break;
                }
                break;
            case 3:
                int i15 = AutotekaTeaserV2GalleryInsightListViewFullScreen.f216830m;
                com.avito.android.photo_gallery.autoteka_teaser.b bVar3 = (com.avito.android.photo_gallery.autoteka_teaser.b) obj3;
                if (bVar3 != null) {
                    AutotekaTeaserV2GalleryInsightListViewFullScreen autotekaTeaserV2GalleryInsightListViewFullScreen = (AutotekaTeaserV2GalleryInsightListViewFullScreen) obj;
                    bVar3.b(((AutotekaTeaserResult) obj2).getReportLink().getUrl(), autotekaTeaserV2GalleryInsightListViewFullScreen.getFromBlock(), autotekaTeaserV2GalleryInsightListViewFullScreen.getUtmCampaign());
                    break;
                }
                break;
            case 4:
                int i16 = AutotekaTeaserV3GalleryViewFullScreen.f216857h;
                com.avito.android.photo_gallery.autoteka_teaser.b bVar4 = (com.avito.android.photo_gallery.autoteka_teaser.b) obj3;
                if (bVar4 != null) {
                    AutotekaTeaserV3GalleryViewFullScreen autotekaTeaserV3GalleryViewFullScreen = (AutotekaTeaserV3GalleryViewFullScreen) obj;
                    bVar4.b(((AutotekaTeaserResult) obj2).getReportLink().getUrl(), autotekaTeaserV3GalleryViewFullScreen.getFromBlock(), autotekaTeaserV3GalleryViewFullScreen.getUtmCampaign());
                    break;
                }
                break;
            case 5:
                int i17 = A.f218051g;
                InterfaceC33208b interfaceC33208b = (InterfaceC33208b) obj3;
                InterfaceC33208b.InterfaceC6540b f218070c = interfaceC33208b.getF218094c();
                PhotoUploaderImage photoUploaderImage = (PhotoUploaderImage) obj2;
                if (!(f218070c instanceof InterfaceC33208b.InterfaceC6540b.C6541b)) {
                    if (!(f218070c instanceof InterfaceC33208b.InterfaceC6540b.c)) {
                        ((A) obj).f218106b.B(interfaceC33208b.getF218092a(), null);
                        break;
                    } else {
                        ImageView imageView = photoUploaderImage.f179951c;
                        if (imageView == null) {
                            imageView = null;
                        }
                        imageView.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, photoUploaderImage.f179965q, null, 0, null, 0, 124));
                        ImageView imageView2 = photoUploaderImage.f179951c;
                        if (imageView2 == null) {
                            imageView2 = null;
                        }
                        imageView2.setClickable(true);
                        ImageView imageView3 = photoUploaderImage.f179952d;
                        photoUploaderImage.e(imageView3 != null ? imageView3 : null);
                        break;
                    }
                } else {
                    InterfaceC33208b.InterfaceC6540b f218070c2 = interfaceC33208b.getF218094c();
                    InterfaceC33208b.InterfaceC6540b.C6541b c6541b = f218070c2 instanceof InterfaceC33208b.InterfaceC6540b.C6541b ? (InterfaceC33208b.InterfaceC6540b.C6541b) f218070c2 : null;
                    if (c6541b != null) {
                        photoUploaderImage.k(c6541b.f218118a);
                        break;
                    }
                }
                break;
            case 6:
                int i18 = com.avito.android.publish.details.adapter.historical_suggest.h.f233239g;
                com.avito.android.publish.details.adapter.historical_suggest.h hVar = (com.avito.android.publish.details.adapter.historical_suggest.h) obj3;
                hVar.B80((ListItemCheckmark) obj2);
                l<? super String, G0> lVar = hVar.f233243e;
                if (lVar != null) {
                    lVar.invoke((String) obj);
                    break;
                }
                break;
            case 7:
                int i19 = p.f233280g;
                p pVar = (p) obj3;
                pVar.B80((ListItemCheckmark) obj2);
                l<? super String, G0> lVar2 = pVar.f233284e;
                if (lVar2 != null) {
                    lVar2.invoke((String) obj);
                    break;
                }
                break;
            case 8:
                com.avito.android.publish.items.video_upload.f fVar = (com.avito.android.publish.items.video_upload.f) obj3;
                Q1 q12 = fVar.f237274c;
                q12.getClass();
                n<Object> nVar = Q1.f67448x0[19];
                if (!((Boolean) q12.f67514u.a().invoke()).booleanValue()) {
                    fVar.f237285n.accept((ParameterElement.J) obj2);
                    break;
                } else {
                    ((VideoUploadItemView) obj).w70(null, false);
                    break;
                }
            case 9:
                int i22 = com.avito.android.publish.slots.delivery_summary_edit.item.l.f243796l;
                hf0.e eVar = ((m) obj).f243811c;
                if (eVar != null) {
                    com.avito.android.lib.util.g.a(new DialogC40929b(((com.avito.android.publish.slots.delivery_summary_edit.item.l) obj2).f243801f.getContext(), eVar, (l) obj3));
                    break;
                }
                break;
            case 10:
                int i23 = j.f243845t;
                hf0.e eVar2 = ((m) obj).f243811c;
                if (eVar2 != null) {
                    com.avito.android.lib.util.g.a(new DialogC40929b(((j) obj2).f243849p.getContext(), eVar2, (l) obj3));
                    break;
                }
                break;
            case 11:
                int i24 = com.avito.android.publish.slots.imv.item.f.f244280g;
                ((l) obj3).invoke((BubbleInfo) obj2);
                ((com.avito.android.publish.slots.imv.item.f) obj).Af();
                break;
            case 12:
                RatingDetailsFragment.C34165a c34165a = RatingDetailsFragment.f246422S0;
                ((RatingDetailsFragment) obj3).E5().accept(new a.i((DeepLink) obj2, null, null, 6, null));
                ((com.avito.android.lib.design.bottom_sheet.d) obj).dismiss();
                break;
            case 13:
                DeepLink deepLink = (DeepLink) obj2;
                com.avito.android.reward_bug_entry_impl.f fVar2 = (com.avito.android.reward_bug_entry_impl.f) obj3;
                fVar2.f255629e.accept(new a.c(deepLink));
                Context context = (Context) obj;
                if (!(deepLink instanceof WebViewLink)) {
                    T0 t02 = context instanceof T0 ? (T0) context : null;
                    if (t02 != null) {
                        b.a.a((com.avito.android.deeplink_handler.handler.composite.d) new P0(t02).a(com.avito.android.deeplink_handler.handler.composite.d.class), deepLink, null, null, 6);
                        break;
                    }
                } else {
                    context.startActivity(l.a.a(fVar2.f255627c, ((WebViewLink) deepLink).getF133855b(), null, 6));
                    break;
                }
                break;
            case 14:
                int i25 = com.avito.android.screens.bbip.ui.items.duration.a.f260339E;
                Picker picker = (Picker) obj2;
                Integer num = (picker == null || (firstWheelValue = picker.getFirstWheelValue()) == null) ? null : firstWheelValue.f180046a;
                Integer num2 = num instanceof Integer ? num : null;
                if (num2 != null) {
                    ((Y41.l) obj3).invoke(Integer.valueOf(num2.intValue() + 1));
                    ((com.avito.android.screens.bbip.ui.items.duration.a) obj).dismiss();
                    break;
                }
                break;
            case 15:
                int i26 = com.avito.android.screens.bbip_private.ui.items.duration.a.f260830E;
                Picker picker2 = (Picker) obj2;
                Integer num3 = (picker2 == null || (firstWheelValue2 = picker2.getFirstWheelValue()) == null) ? null : firstWheelValue2.f180046a;
                Integer num4 = num3 instanceof Integer ? num3 : null;
                if (num4 != null) {
                    ((Y41.l) obj3).invoke(Integer.valueOf(num4.intValue() + 1));
                    ((com.avito.android.screens.bbip_private.ui.items.duration.a) obj).dismiss();
                    break;
                }
                break;
            case 16:
                int i27 = com.avito.android.service_booking_common.blueprints.check_price_list.p.f276262h;
                ((Y41.p) obj3).invoke((C47439c.a) obj2, (String) obj);
                break;
            case 17:
                int i28 = com.avito.android.service_booking_common.blueprints.check_price_list.p.f276262h;
                ((N) obj3).invoke((C47439c.a) obj2, (String) obj);
                break;
            case 18:
                TariffCpxLimitFragment.a aVar = TariffCpxLimitFragment.f297225w0;
                com.avito.android.tariff.cpx.limit.sheet.e eVarF5 = ((TariffCpxLimitFragment) obj3).f5();
                c.b bVar5 = ((NB0.c) obj).f11309c;
                eVarF5.accept(new a.d((DeepLink) obj2, bVar5 != null ? bVar5.f11321a.intValue() : 0));
                break;
            case 19:
                com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.g gVar = (com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.g) obj3;
                gVar.f313708b.b((PanelCardItem) obj2, (PanelCardItem.b) obj);
                gVar.C80();
                break;
            case 20:
                Y41.l<? super com.avito.android.lib.design.bottom_sheet.k, G0> lVar3 = ((J) obj3).f317147b;
                if (lVar3 != null) {
                    lVar3.invoke((com.avito.android.lib.design.bottom_sheet.k) obj2);
                }
                ((com.avito.android.lib.design.bottom_sheet.d) obj).r();
                break;
            case 21:
                com.avito.android.user_stats.extended_user_stats.metrics.a aVar2 = (com.avito.android.user_stats.extended_user_stats.metrics.a) obj3;
                Y41.l<? super com.avito.android.user_stats.extended_user_stats.metrics.f, G0> lVar4 = aVar2.f317275b;
                if (lVar4 != null) {
                    StatMetric statMetric = (StatMetric) obj2;
                    lVar4.invoke(new com.avito.android.user_stats.extended_user_stats.metrics.f(new com.avito.android.lib.design.bottom_sheet.k(statMetric.f317299e, statMetric.f317298d, null, null, null, null, null, null, null, null, null, null, 4092, null), (String) obj));
                }
                com.avito.android.lib.design.bottom_sheet.d dVar2 = aVar2.f317277d;
                (dVar2 != null ? dVar2 : null).r();
                break;
            case 22:
                ?? r72 = (H) obj3;
                DeepLink deepLink2 = (DeepLink) obj2;
                if (r72 != 0) {
                    r72.invoke(new a.f(deepLink2));
                }
                com.jakewharton.rxrelay3.c cVar = (com.jakewharton.rxrelay3.c) obj;
                if (cVar != null) {
                    cVar.accept(deepLink2);
                    break;
                }
                break;
            case 23:
                Y41.p<? super NP0.n, ? super com.avito.android.widget_filters.analytics.a, G0> pVar2 = ((com.avito.android.widget_filters.ui.items.location.k) obj3).f330533x;
                if (pVar2 != null) {
                    pVar2.invoke((NP0.n) obj2, (com.avito.android.widget_filters.analytics.a) obj);
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                com.avito.android.lib.util.g.a(new DialogC40929b(((C40928a.C11267a) obj3).itemView.getContext(), ((C40930c) obj2).f397349c, ((C40928a) obj).f397343d));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i29 = DialogC40929b.f397345F;
                hf0.e eVar3 = (hf0.e) obj2;
                if (eVar3 != null && (str = eVar3.f397351b) != null) {
                    ((Y41.l) obj3).invoke(str);
                }
                N0.a((DialogC40929b) obj);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i32 = DialogC42133a.f405407E;
                Picker picker3 = (Picker) obj2;
                k<?> firstWheelValue3 = picker3.getFirstWheelValue();
                Integer num5 = firstWheelValue3 != null ? firstWheelValue3.f180046a : null;
                Integer num6 = num5 instanceof Integer ? num5 : null;
                k<?> secondWheelValue = picker3.getSecondWheelValue();
                Integer num7 = secondWheelValue != null ? secondWheelValue.f180046a : null;
                Integer num8 = num7 instanceof Integer ? num7 : null;
                if (num6 != null && num8 != null) {
                    ((Y41.l) obj3).invoke(Integer.valueOf(num8.intValue() + (num6.intValue() * 60)));
                    ((DialogC42133a) obj).dismiss();
                    break;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                CBRDateTimeInputLayout.m290showTime$lambda8((Calendar) obj3, (MaterialTimePicker) obj2, (CBRDateTimeInputLayout) obj, view);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PhoneNumberKitV2.m313_init_$lambda12((List) obj3, (ArrayList) obj2, (PhoneNumberKitV2) obj, view);
                break;
            default:
                C49602g c49602g = (C49602g) obj3;
                c49602g.f441693c.invoke((LinkEditItem.Action) obj2, (LinkEditItem) obj);
                com.avito.android.lib.design.bottom_sheet.d dVar3 = c49602g.f441694d;
                if (dVar3 != null && dVar3.isShowing() && (dVar = c49602g.f441694d) != null) {
                    dVar.dismiss();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g(Y41.p pVar, C47439c.a aVar, String str) {
        this.f174304b = 17;
        this.f174305c = (N) pVar;
        this.f174306d = aVar;
        this.f174307e = str;
    }

    public /* synthetic */ g(Picker picker, Y41.l lVar, com.avito.android.lib.design.bottom_sheet.d dVar, int i12) {
        this.f174304b = i12;
        this.f174306d = picker;
        this.f174305c = lVar;
        this.f174307e = dVar;
    }

    public /* synthetic */ g(Object obj, Object obj2, Y41.l lVar, int i12) {
        this.f174304b = i12;
        this.f174306d = obj;
        this.f174307e = obj2;
        this.f174305c = lVar;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i12) {
        this.f174304b = i12;
        this.f174305c = obj;
        this.f174306d = obj2;
        this.f174307e = obj3;
    }
}
