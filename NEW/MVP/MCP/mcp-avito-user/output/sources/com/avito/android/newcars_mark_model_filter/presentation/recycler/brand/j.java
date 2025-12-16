package com.avito.android.newcars_mark_model_filter.presentation.recycler.brand;

import C40.a;
import D90.a;
import Y41.l;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.onboarding.dialog.view.quiz.OnboardingQuizItem;
import com.avito.android.passport.profile_add.merge.full_screen_error_dialog.FullScreenUserDialogFragment;
import com.avito.android.payment_list.ui.list.shift_item.PaymentItem;
import com.avito.android.personal_filters.filters_change_dialog.PersonalFiltersChangeDialogFragment;
import com.avito.android.personal_filters.filters_change_dialog.ui.PersonalFiltersChangeDialogData;
import com.avito.android.phone_protection_info.item.b;
import com.avito.android.photo_gallery.autoteka_teaser.AutotekaTeaserGalleryInsightsListViewFullScreen;
import com.avito.android.photo_gallery.autoteka_teaser.AutotekaTeaserGallerySingleInsightViewFullScreen;
import com.avito.android.photo_gallery.autoteka_teaser.v4.AutotekaTeaserGalleryViewV4;
import com.avito.android.photo_gallery.autoteka_teaser.v4.AutotekaTeaserGalleryViewV4FullScreen;
import com.avito.android.photo_list_view.D;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view_group_selection.items.imageGroup.PhotoItemGroupSelectionImageGroupItem;
import com.avito.android.photo_list_view_groups.o;
import com.avito.android.photo_picker.legacy.AbstractC33240b;
import com.avito.android.photo_picker.legacy.E;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.ChartMobileColsItemPromotionsItemData;
import com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ProfileOtherDashboardItem;
import com.avito.android.profile.pro.impl.screen.item.dashboard_stats.StatsItem;
import com.avito.android.profile.pro.impl.screen.item.geo_banner.ProfileProGeoBannerItem;
import com.avito.android.profile.pro.impl.screen.item.group.row.ProfileProGroupRowItem;
import com.avito.android.profile.pro.impl.screen.item.my_services.ProfileProMyServiceItem;
import com.avito.android.profile.pro.impl.screen.item.name.ProfileProNameItem;
import com.avito.android.profile.pro.impl.screen.item.rating.ProfileProRatingItem;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.GalleryButton;
import com.avito.android.remote.model.autotekateaser.AutotekaButton;
import com.avito.android.remote.model.autotekateaser.FullGallery;
import com.avito.android.remote.model.autotekateaser.MiniGallery;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.conveyor_item.ParcelableItem;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import e80.InterfaceC39964a;
import g70.InterfaceC40541a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.collections.P0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f207378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f207379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f207380d;

    public /* synthetic */ j(int i12, Object obj, Object obj2) {
        this.f207378b = i12;
        this.f207379c = obj;
        this.f207380d = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v32, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r7v39, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeepLink deepLink;
        Object obj = this.f207379c;
        Object obj2 = this.f207380d;
        switch (this.f207378b) {
            case 0:
                int i12 = k.f207381e;
                ((l) obj).invoke(Long.valueOf(((b) obj2).f207369c));
                break;
            case 1:
                ((com.avito.android.onboarding.dialog.view.quiz.f) obj).f209056c.invoke(new a.f((OnboardingQuizItem) obj2));
                break;
            case 2:
                com.avito.android.passport.profile_add.merge.full_screen_error_dialog.k kVar = ((FullScreenUserDialogFragment) obj).f213052n0;
                (kVar != null ? kVar : null).C4(((Action) obj2).getDeepLink());
                break;
            case 3:
                int i13 = com.avito.android.payment_list.ui.list.shift_item.c.f215063i;
                ((l) obj).invoke(((PaymentItem) obj2).f215045d);
                break;
            case 4:
                PersonalFiltersChangeDialogFragment personalFiltersChangeDialogFragment = (PersonalFiltersChangeDialogFragment) obj;
                if (!personalFiltersChangeDialogFragment.f215708l0) {
                    personalFiltersChangeDialogFragment.f215709m0 = (Button) view;
                    com.avito.android.personal_filters.filters_change_dialog.g gVar = (com.avito.android.personal_filters.filters_change_dialog.g) personalFiltersChangeDialogFragment.f215706j0.getValue();
                    boolean z12 = personalFiltersChangeDialogFragment.f215707k0;
                    PersonalFiltersChangeDialogData.ApplyButton applyButton = ((PersonalFiltersChangeDialogData) obj2).f215764d;
                    Map<String, String> map = applyButton.f215768c;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
                    Iterator<T> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        linkedHashMap.put(entry.getKey(), (String) entry.getValue());
                    }
                    gVar.accept(new InterfaceC40541a.C11192a(z12, linkedHashMap, applyButton.f215769d));
                    break;
                }
                break;
            case 5:
                int i14 = com.avito.android.phone_protection_info.item.d.f216021g;
                ((l) obj).invoke(((b.a) obj2).f216018d);
                break;
            case 6:
                int i15 = AutotekaTeaserGalleryInsightsListViewFullScreen.f216778j;
                com.avito.android.photo_gallery.autoteka_teaser.b bVar = (com.avito.android.photo_gallery.autoteka_teaser.b) obj;
                if (bVar != null) {
                    bVar.d(((AutotekaTeaserGalleryInsightsListViewFullScreen) obj2).getFromBlock());
                    break;
                }
                break;
            case 7:
                int i16 = AutotekaTeaserGallerySingleInsightViewFullScreen.f216796i;
                com.avito.android.photo_gallery.autoteka_teaser.b bVar2 = (com.avito.android.photo_gallery.autoteka_teaser.b) obj;
                if (bVar2 != null) {
                    bVar2.d(((AutotekaTeaserGallerySingleInsightViewFullScreen) obj2).getFromBlock());
                    break;
                }
                break;
            case 8:
                int i17 = AutotekaTeaserGalleryViewV4.f216868h;
                com.avito.android.photo_gallery.autoteka_teaser.b bVar3 = (com.avito.android.photo_gallery.autoteka_teaser.b) obj;
                if (bVar3 != null) {
                    bVar3.e(((MiniGallery) obj2).getButton().getAction().getDeeplink());
                    break;
                }
                break;
            case 9:
                int i18 = AutotekaTeaserGalleryViewV4FullScreen.f216875n;
                com.avito.android.photo_gallery.autoteka_teaser.b bVar4 = (com.avito.android.photo_gallery.autoteka_teaser.b) obj;
                if (bVar4 != null) {
                    bVar4.e(((FullGallery) obj2).getButton().getAction().getDeeplink());
                    break;
                }
                break;
            case 10:
                l<? super GalleryButton, G0> lVar = ((com.avito.android.photo_gallery.ui.d) obj).f217712d;
                if (lVar != null) {
                    lVar.invoke((GalleryButton) obj2);
                    break;
                }
                break;
            case 11:
                int i19 = com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4.f.f217880c;
                ((l) obj).invoke(((AutotekaButton) obj2).getAction().getDeeplink());
                break;
            case 12:
                int i22 = D.f218066d;
                ((D) obj).f218106b.B(((InterfaceC33208b) obj2).getF218092a(), null);
                break;
            case 13:
                ((com.avito.android.photo_list_view.re23.j) obj).f218278b.invoke(((ImageAction) obj2).getPurpose());
                break;
            case 14:
                int i23 = com.avito.android.photo_list_view.re23.viewholders.b.f218280d;
                ((com.avito.android.photo_list_view.re23.viewholders.b) obj).f218279b.B(((InterfaceC33208b) obj2).getF218092a(), null);
                break;
            case 15:
                com.avito.android.photo_list_view.re23.viewholders.h hVar = (com.avito.android.photo_list_view.re23.viewholders.h) obj;
                hVar.C80((G) obj2, hVar.f218309c);
                break;
            case 16:
                int i24 = com.avito.android.photo_list_view_group_selection.items.imageGroup.g.f218435d;
                if (!((ListItemRadio) view).isChecked()) {
                    ((com.avito.android.photo_list_view_group_selection.items.imageGroup.g) obj).f218437c.invoke(new InterfaceC39964a.C11054a(((PhotoItemGroupSelectionImageGroupItem) obj2).f218425c));
                    break;
                }
                break;
            case 17:
                ((o) obj).f218635b.invoke(((ImageAction) obj2).getPurpose());
                break;
            case 18:
                com.avito.android.photo_list_view_groups.view_holders.f fVar = (com.avito.android.photo_list_view_groups.view_holders.f) obj;
                fVar.D80((G) obj2, fVar.f218671d);
                break;
            case 19:
                com.avito.android.photo_list_view_groups.view_holders.j jVar = (com.avito.android.photo_list_view_groups.view_holders.j) obj;
                jVar.f218686c.Yb();
                jVar.f218688b.B(((InterfaceC33208b) obj2).getF218092a(), null);
                break;
            case 20:
                ((E) obj).e(((AbstractC33240b.a) ((AbstractC33240b) obj2)).f219639a);
                break;
            case 21:
                int i25 = com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.h.f220933n;
                ((l) obj).invoke(((V80.b) obj2).f16936b);
                break;
            case 22:
                int i26 = com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.h.f220933n;
                ((l) obj).invoke(((ChartMobileColsItemPromotionsItemData) obj2).f220399b);
                break;
            case 23:
                int i27 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.g.f223138m;
                ProfileOtherDashboardItem profileOtherDashboardItem = (ProfileOtherDashboardItem) obj2;
                ((l) obj).invoke(new a.d(profileOtherDashboardItem.f223116c, profileOtherDashboardItem.f223127n, profileOtherDashboardItem.f223128o));
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i28 = com.avito.android.profile.pro.impl.screen.item.dashboard_stats.h.f223174f;
                StatsItem statsItem = (StatsItem) obj2;
                ((com.avito.android.profile.pro.impl.screen.item.dashboard_stats.h) obj).f223176d.invoke(new a.f(statsItem.f223161i, statsItem.f223156d));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i29 = com.avito.android.profile.pro.impl.screen.item.geo_banner.g.f223280j;
                ProfileProGeoBannerItem.Action action = ((ProfileProGeoBannerItem) obj2).f223265f;
                if (action != null && (deepLink = action.f223268b) != null) {
                    ((l) obj).invoke(deepLink);
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i32 = com.avito.android.profile.pro.impl.screen.item.group.row.h.f223314g;
                ((l) obj).invoke(new a.l((ProfileProGroupRowItem) obj2));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i33 = com.avito.android.profile.pro.impl.screen.item.my_services.g.f223344e;
                ((l) obj).invoke(new a.m((ProfileProMyServiceItem) obj2));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i34 = com.avito.android.profile.pro.impl.screen.item.name.g.f223357c;
                DeepLink deepLink2 = ((ProfileProNameItem) obj2).f223350d;
                if (deepLink2 != null) {
                    ((l) obj).invoke(new a.n(deepLink2));
                    break;
                }
                break;
            default:
                int i35 = com.avito.android.profile.pro.impl.screen.item.rating.g.f223401c;
                DeepLink deepLink3 = ((ProfileProRatingItem) obj2).f223394d;
                if (deepLink3 != null) {
                    ((l) obj).invoke(new a.t(deepLink3));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(ParcelableItem parcelableItem, l lVar, int i12) {
        this.f207378b = i12;
        this.f207380d = parcelableItem;
        this.f207379c = lVar;
    }
}
