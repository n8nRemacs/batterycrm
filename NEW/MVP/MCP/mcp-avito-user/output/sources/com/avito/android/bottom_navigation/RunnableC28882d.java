package com.avito.android.bottom_navigation;

import Ie0.InterfaceC14065a;
import T70.g;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.checkout.CheckoutFragment;
import com.avito.android.extended_profile.data.b;
import com.avito.android.extended_profile.l0;
import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.l;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateState;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import com.avito.android.hotel_booking.select_radio.SelectRadioFragment;
import com.avito.android.hotel_booking.select_single_value.SelectSingleValueFragment;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.photo_gallery.autoteka_teaser.v2.AutotekaTeaserV2GalleryInsightListViewFullScreen;
import com.avito.android.photo_gallery.ui.PhotoGallery;
import com.avito.android.photo_gallery_carousel.gallery_view.CarouselPhotoGalleryView;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_management_core.edit_text_field.AboutPopup;
import com.avito.android.profile_management_core.edit_text_field.PopupTab;
import com.avito.android.public_profile.ui.tab.TabItem;
import com.avito.android.publish.details.C33789t;
import com.avito.android.publish.details.InterfaceC33778p;
import com.avito.android.publish.scanner.ScannerFragment;
import com.avito.android.publish.slots.card_select.item.k;
import com.avito.android.remote.model.Location;
import com.avito.android.search.filter.FiltersFragment;
import com.avito.android.search.filter.InterfaceC34566e0;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.BeduinView;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import fA.C40269b;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import xo.InterfaceC49973b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.bottom_navigation.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC28882d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f107000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f107001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f107002d;

    public /* synthetic */ RunnableC28882d(int i12, Object obj, Object obj2) {
        this.f107000b = i12;
        this.f107001c = obj;
        this.f107002d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v34, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v14, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        NavigationState.NavbarBusiness360 navbarBusiness360;
        ?? arrayList;
        com.avito.android.extended_profile.mvi.entity.a aVar;
        Object next;
        RecyclerView recyclerViewA;
        b.a aVar2;
        b.a aVar3;
        Integer num;
        Integer num2;
        g0 = null;
        G0 g02 = null;
        Object obj = this.f107002d;
        Object obj2 = this.f107001c;
        switch (this.f107000b) {
            case 0:
                C28885g c28885g = (C28885g) obj2;
                LinkedHashMap linkedHashMap = c28885g.f107008d.f107164g;
                NavigationTabSetItem navigationTabSetItem = (NavigationTabSetItem) obj;
                TabContainerFragment tabContainerFragment = (TabContainerFragment) linkedHashMap.get(navigationTabSetItem);
                if (tabContainerFragment != null ? tabContainerFragment.g5() : false) {
                    TabContainerFragment tabContainerFragment2 = (TabContainerFragment) linkedHashMap.get(navigationTabSetItem);
                    NavigationState navigationStateU0 = tabContainerFragment2 != null ? tabContainerFragment2.u0() : null;
                    if (navigationStateU0 == null || (navbarBusiness360 = navigationStateU0.f107150c) == null) {
                        navbarBusiness360 = NavigationState.NavbarBusiness360.Hide.f107152c;
                    }
                    c28885g.f107007c.invoke(navbarBusiness360);
                    c28885g.f107006b.setVisible(navigationStateU0 != null ? navigationStateU0.f107149b : true);
                    break;
                }
                break;
            case 1:
                ((C28885g) obj2).f107006b.r((J) obj);
                break;
            case 2:
                CheckoutFragment.a aVar4 = CheckoutFragment.f118107C0;
                ((RecyclerView) obj2).A0(((InterfaceC49973b.e) ((InterfaceC49973b) obj)).f442643a);
                break;
            case 3:
                ((com.avito.android.edit_text_field.y) obj2).b((PopupTab) C42745f0.E(((AboutPopup) obj).f226608b));
                break;
            case 4:
                com.avito.android.extended_profile.A a12 = (com.avito.android.extended_profile.A) obj2;
                a12.e();
                com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i iVar = a12.f149235T;
                if (iVar != null) {
                    com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.g gVar = iVar.f151395h;
                    if (gVar != null) {
                        com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.l lVar = gVar.f151387y;
                        Iterable iterable = lVar != null ? lVar.f151401a.f4014b : null;
                        if (iterable == null) {
                            iterable = C42784z0.f406748b;
                        }
                        arrayList = new ArrayList();
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            Object state = ((l.a) it.next()).f151409a.getState();
                            OT0.a aVar5 = state instanceof OT0.a ? (OT0.a) state : null;
                            Object state2 = aVar5 != null ? aVar5.f12282c.getState() : null;
                            com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.d dVar = state2 instanceof com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.d ? (com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.d) state2 : null;
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = C42784z0.f406748b;
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = C42784z0.f406748b;
                }
                Iterator it2 = ((Iterable) arrayList).iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    aVar = ((C40269b) obj).f395742a;
                    if (zHasNext) {
                        next = it2.next();
                        String str = ((com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.d) next).f151428a;
                        com.avito.android.extended_profile.data.b bVar = aVar.f150240b;
                        if (str.equals((bVar == null || (aVar3 = bVar.f149467b) == null) ? null : aVar3.f149474a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.d dVar2 = (com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.d) next;
                if (dVar2 != null) {
                    com.avito.android.extended_profile.data.b bVar2 = aVar.f150240b;
                    if (bVar2 != null && (aVar2 = bVar2.f149467b) != null) {
                        ET0.b bVar3 = dVar2.f151429b;
                        int i12 = bVar3 != null ? bVar3.f4019d : 0;
                        int i13 = bVar3 != null ? bVar3.f4018c : 0;
                        View view = a12.f149266z;
                        D6.H(view);
                        view.setPadding(0, i12, 0, i13);
                        List<TabItem> list = a12.f149232Q;
                        List<TabItem> list2 = aVar2.f149475b;
                        if (!kotlin.jvm.internal.L.f(list, list2)) {
                            a12.f149250j.get().E5(list2);
                            l0 l0Var = l0.f150023a;
                            List<TabItem> list3 = a12.f149232Q;
                            l0Var.getClass();
                            List<TabItem> list4 = list3;
                            ?? arrayList2 = new ArrayList(C42745f0.q(list4, 10));
                            Iterator it3 = list4.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(TabItem.d((TabItem) it3.next(), ""));
                            }
                            List<TabItem> list5 = list2;
                            ArrayList arrayList3 = new ArrayList(C42745f0.q(list5, 10));
                            Iterator it4 = list5.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(TabItem.d((TabItem) it4.next(), ""));
                            }
                            boolean zEquals = arrayList2.equals(arrayList3);
                            ViewPager viewPager = a12.f149265y;
                            if (!zEquals) {
                                h31.e<TabPagerAdapter> eVar = a12.f149248h;
                                viewPager.setAdapter(eVar.get());
                                eVar.get().h();
                            }
                            a12.f149232Q = list2;
                            int currentItem = viewPager.getCurrentItem();
                            h31.e<com.avito.android.lib.deprecated_design.tab.adapter.c<BaseTabItem>> eVar2 = a12.f149247g;
                            com.avito.android.lib.deprecated_design.tab.adapter.c<BaseTabItem> cVar = eVar2.get();
                            AvitoTabLayout avitoTabLayout = a12.f149264x;
                            com.avito.android.lib.deprecated_design.tab.l.d(avitoTabLayout, cVar);
                            eVar2.get().d();
                            avitoTabLayout.post(new androidx.camera.video.internal.audio.q(currentItem, 5, a12));
                            Integer num3 = aVar2.f149476c;
                            if (num3 != null) {
                                viewPager.x(num3.intValue(), false);
                            }
                        }
                        g02 = G0.f406611a;
                    }
                    if (g02 == null) {
                        a12.b();
                    }
                } else {
                    a12.b();
                }
                BeduinView beduinView = a12.f149216A;
                if (beduinView != null && (recyclerViewA = CA.b.a(beduinView)) != null) {
                    C35976x4.b(recyclerViewA);
                    break;
                }
                break;
            case 5:
                ((com.avito.android.extended_profile_adverts.s) obj2).a((pA.d) obj);
                break;
            case 6:
                com.avito.android.extended_profile_selection_create.select.H h12 = (com.avito.android.extended_profile_selection_create.select.H) obj2;
                h12.f152009g.f13653f = ((ExtendedProfileSelectionCreateState) obj).f152358s;
                C35976x4.b(h12.f152028z);
                break;
            case 7:
                UV0.c cVar2 = new UV0.c(((ExtendedProfileSerpState) obj2).f152966p);
                com.avito.android.extended_profile_serp.F f12 = (com.avito.android.extended_profile_serp.F) obj;
                f12.f152537n.c(cVar2);
                f12.f152536m.c(cVar2);
                f12.f152529f.c(cVar2);
                f12.f152532i.c(cVar2);
                f12.f152533j.c(cVar2);
                break;
            case 8:
                com.avito.android.fps.e eVar3 = (com.avito.android.fps.e) obj2;
                Duration durationDividedBy = 0 < eVar3.f158631g ? Duration.ofSeconds(1L).dividedBy(eVar3.f158631g) : null;
                if (durationDividedBy != null) {
                    Duration durationDividedBy2 = 0 < eVar3.f158631g ? Duration.ofSeconds(1L).dividedBy(eVar3.f158631g) : null;
                    Duration durationMultipliedBy = durationDividedBy2 != null ? durationDividedBy2.multipliedBy(2L) : null;
                    if (durationMultipliedBy != null) {
                        Duration durationOfNanos = Duration.ofNanos(((androidx.metrics.performance.c) obj).f52697c);
                        Duration durationMultipliedBy2 = durationDividedBy.multipliedBy((long) Math.ceil(durationOfNanos.toNanos() / durationDividedBy.toNanos()));
                        Duration durationMinus = durationMultipliedBy.compareTo(durationOfNanos) < 0 ? durationMultipliedBy2.minus(durationDividedBy) : Duration.ZERO;
                        com.avito.android.time.c.f301452a.getClass();
                        eVar3.f158626b.accept(new com.avito.android.fps.a(durationOfNanos, durationMultipliedBy2, durationMinus, com.avito.android.time.c.f301453b.a()));
                        break;
                    }
                }
                break;
            case 9:
                com.avito.android.hotel_booking.select_radio.d dVar3 = ((SelectRadioFragment) obj2).f163982l0;
                if (dVar3 != null && (num = ((TI.d) obj).f15528b) != null) {
                    dVar3.f164000c.l1(num.intValue());
                    break;
                }
                break;
            case 10:
                com.avito.android.hotel_booking.select_single_value.b bVar4 = ((SelectSingleValueFragment) obj2).f164059l0;
                if (bVar4 != null && (num2 = ((VI.d) obj).f17063b) != null) {
                    bVar4.f164075c.l1(num2.intValue());
                    break;
                }
                break;
            case 11:
                ((com.avito.android.inline_filters.dialog.suggest.o) obj2).le((List) obj);
                break;
            case 12:
                int i14 = com.avito.android.job.survey_vacancy_reliability.h.f174690R;
                D6.w((View) obj2);
                com.avito.android.job.survey_vacancy_reliability.h hVar = (com.avito.android.job.survey_vacancy_reliability.h) obj;
                D6.H(hVar.f174697K);
                D6.H(hVar.f174698L);
                break;
            case 13:
                ((kotlin.jvm.internal.N) obj2).invoke((String) obj);
                break;
            case 14:
                com.avito.android.lib.design.gallery.h hVar2 = (com.avito.android.lib.design.gallery.h) obj2;
                hVar2.A0(((com.avito.beduin.v2.component.scroll_container.state.d) obj).f336197e);
                hVar2.D0(1, 0, null);
                break;
            case 15:
                int i15 = Badge.f178358i;
                Badge badge = (Badge) obj;
                ((View) obj2).setLayoutParams(new FrameLayout.LayoutParams(badge.getWidth(), badge.getHeight()));
                break;
            case 16:
                Class<Context>[] clsArr = ComponentContainer.f178840r;
                ComponentContainer componentContainer = (ComponentContainer) obj2;
                componentContainer.k();
                ComponentContainer.SavedState savedState = (ComponentContainer.SavedState) obj;
                ComponentContainer.State state3 = savedState.f178861b;
                int[] iArr = savedState.f178864e;
                componentContainer.g(state3, Arrays.copyOf(iArr, iArr.length), savedState.f178863d, savedState.f178862c);
                break;
            case 17:
                com.avito.android.lib.design.gallery.a aVar6 = (com.avito.android.lib.design.gallery.a) obj2;
                com.avito.android.lib.design.page_indicator_re23.b.a(aVar6.f179204c, aVar6.f179203b);
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 18:
                D6.m(((com.avito.android.messenger.conversation.adapter.v) obj).f189309b, kotlin.math.b.b(16 * ((View) obj2).getResources().getDisplayMetrics().density));
                break;
            case 19:
                ((com.avito.android.motivation_screen.ui.confetti.c) obj2).f206417a.addView((com.avito.android.motivation_screen.ui.confetti.b) obj);
                break;
            case 20:
                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, (ViewGroup) obj2, (PrintableText) obj, null, null, null, null, 0, null, null, false, false, null, null, 4094);
                break;
            case 21:
                AutotekaTeaserV2GalleryInsightListViewFullScreen.b((AutotekaTeaserV2GalleryInsightListViewFullScreen) obj2, (String) obj);
                break;
            case 22:
                Integer num4 = ((g.a) ((T70.g) obj2)).f15428c;
                if (num4 != null) {
                    int iIntValue = num4.intValue();
                    RecyclerView.m layoutManager = ((com.avito.android.photo_gallery.grid_gallery.y) obj).f217444e.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.b2(iIntValue, y6.b(16));
                        break;
                    }
                }
                break;
            case 23:
                int i16 = PhotoGallery.f217675i;
                com.avito.android.photo_gallery.adapter.g gVar2 = (com.avito.android.photo_gallery.adapter.g) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                boolean zF2 = kotlin.jvm.internal.L.f(gVar2.f216723l, arrayList4);
                gVar2.f216723l = arrayList4;
                if (!zF2) {
                    gVar2.h();
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                CarouselPhotoGalleryView.a((CarouselPhotoGalleryView) obj2, (List) obj);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                InterfaceC33778p interfaceC33778p = ((C33789t) obj2).f234942b.get();
                if (interfaceC33778p != null) {
                    interfaceC33778p.j3((String) obj);
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kotlin.reflect.n<Object>[] nVarArr = ScannerFragment.f239116D0;
                ((ScannerFragment) obj2).s5().E9((ArrayList) obj);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((com.avito.android.publish.screen.step.params.view.j) obj2).f241605c.invoke(new InterfaceC14065a.d.C0475d((k.b) obj));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((com.avito.android.publish.slots.item_info.c) obj2).f244350a.addView((com.avito.android.publish.slots.item_info.b) obj);
                break;
            default:
                InterfaceC34566e0 interfaceC34566e0 = ((FiltersFragment) obj2).f261843t0;
                (interfaceC34566e0 != null ? interfaceC34566e0 : null).m((Location) obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC28882d(String str, Y41.l lVar) {
        this.f107000b = 13;
        this.f107001c = (kotlin.jvm.internal.N) lVar;
        this.f107002d = str;
    }
}
