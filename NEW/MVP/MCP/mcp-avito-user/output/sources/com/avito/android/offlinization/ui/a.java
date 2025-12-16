package com.avito.android.offlinization.ui;

import Oq0.d;
import Qb0.InterfaceC14878a;
import Ua0.InterfaceC15503a;
import Un0.InterfaceC15540a;
import Vq0.InterfaceC15708a;
import Z40.a;
import Zc0.InterfaceC19538a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.asynclayoutinflater.view.a;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.core.view.M;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.ReAgentSetProfileNameFragment;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameFragment;
import com.avito.android.photo_list_view.E;
import com.avito.android.player.view.PlayerFragment;
import com.avito.android.profile.user_profile.D;
import com.avito.android.profile_settings_basic.F;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.review_gallery.ReviewGalleryActivity;
import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeActivity;
import com.avito.android.safedeal.universal_delivery_type.o;
import com.avito.android.safedeal.universal_delivery_type.tabs_view.f;
import com.avito.android.safety.safety_settings.SafetySettingsFragment;
import com.avito.android.safety.safety_settings.mvi.entity.a;
import com.avito.android.sbc.autodispatches.z;
import com.avito.android.search.subscriptions.w;
import com.avito.android.seller_room.ui.SellerRoomFragment;
import com.avito.android.service_booking_day_settings.daysettings.DaySettingsFragment;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import com.avito.android.service_transportation_info.advert_details.g;
import com.avito.android.service_transportation_info.model.TransportInfo;
import com.avito.android.services_transportation_widget.dialog.a;
import com.avito.android.str_booking.mvi.entity.a;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersResult;
import com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.C;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.jvm.internal.L;
import kotlin.reflect.n;
import qK0.C47313c;
import qt0.i;
import r80.InterfaceC47509b;
import tz0.InterfaceC48745a;
import yc0.k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class a implements M, SwipeRefreshLayout.f, E.a, InterfaceC47509b, StyledPlayerView.b, C, androidx.fragment.app.C, f.a, a.e, a.InterfaceC8347a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f208625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f208626c;

    public /* synthetic */ a(Object obj, int i12) {
        this.f208625b = i12;
        this.f208626c = obj;
    }

    @Override // com.google.android.exoplayer2.ui.StyledPlayerView.b
    public void a(int i12) {
        PlayerFragment.a aVar = PlayerFragment.f220234F0;
        PlayerFragment playerFragment = (PlayerFragment) ((WeakReference) this.f208626c).get();
        if (playerFragment != null) {
            boolean z12 = i12 == 0;
            ImageView imageView = playerFragment.f220246y0;
            if (imageView != null) {
                D6.G(imageView, z12);
            }
        }
    }

    public void b(ServiceTransportationWidget.Field field, ServiceTransportationWidget.FieldValue fieldValue) {
        ((com.avito.android.services_transportation_widget.item.h) this.f208626c).k(field, fieldValue);
    }

    public void c(int i12) {
        UniversalDeliveryTypeActivity.a aVar = UniversalDeliveryTypeActivity.f256401C;
        UniversalDeliveryTypeActivity universalDeliveryTypeActivity = (UniversalDeliveryTypeActivity) this.f208626c;
        o oVarB2 = universalDeliveryTypeActivity.b2();
        com.avito.android.safedeal.universal_delivery_type.b bVar = universalDeliveryTypeActivity.f256412u;
        if (bVar == null) {
            bVar = null;
        }
        oVarB2.accept(new InterfaceC15540a.b(bVar.f256437m.get(i12)));
        ViewPager2 viewPager2 = universalDeliveryTypeActivity.f256411t;
        (viewPager2 != null ? viewPager2 : null).setCurrentItem(i12);
        universalDeliveryTypeActivity.invalidateOptionsMenu();
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(B b12) {
        int i12 = com.avito.android.rating.user_contacts.adapter.contact.l.f247705i;
        ((com.avito.android.rating.user_contacts.adapter.contact.l) this.f208626c).f247710f.setOnRatingSelectListener(new com.avito.android.rating.user_contacts.adapter.contact.k(b12));
    }

    @Override // androidx.asynclayoutinflater.view.a.e
    public void g(View view, ViewGroup viewGroup) {
        Object obj = this.f208626c;
        switch (this.f208625b) {
            case 22:
                int i12 = com.avito.android.service_booking_common.blueprints.price_list.e.f276479e;
                i.a aVar = (i.a) obj;
                view.setTag(aVar.f429450a);
                View viewFindViewById = view.findViewById(R.id.sb_price_list_value);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
                }
                DescriptionParameterItem descriptionParameterItem = (DescriptionParameterItem) viewFindViewById;
                I5.a(descriptionParameterItem.getLeftTextView(), aVar.f429451b, false);
                I5.a(descriptionParameterItem.getRightTextView(), aVar.f429452c, false);
                int iJ2 = aVar.f429453d ? C35835l0.j(R.attr.textH4, descriptionParameterItem.getContext()) : C35835l0.j(R.attr.textM2, descriptionParameterItem.getContext());
                descriptionParameterItem.getLeftTextView().setTextAppearance(iJ2);
                descriptionParameterItem.getRightTextView().setTextAppearance(iJ2);
                if (viewGroup != null) {
                    viewGroup.addView(view);
                    return;
                }
                return;
            case 23:
            default:
                int i13 = com.avito.android.service_transportation_info.advert_details.g.f279725f;
                g.a aVar2 = new g.a(view);
                TransportInfo.TransportInfoDetails transportInfoDetails = (TransportInfo.TransportInfoDetails) obj;
                I5.a(aVar2.f279730a, transportInfoDetails.getTitle(), true);
                I5.a(aVar2.f279731b, transportInfoDetails.getSubtitle(), true);
                I5.a(aVar2.f279732c, transportInfoDetails.getPrice(), true);
                I5.a(aVar2.f279733d, transportInfoDetails.getPriceUnit(), true);
                if (viewGroup != null) {
                    viewGroup.addView(view);
                    return;
                }
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i14 = com.avito.android.service_orders.list.blueprints.snippet_item.m.f279352m;
                View viewFindViewById2 = view.findViewById(R.id.srv_orders_list_snippet_price_value);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
                }
                DescriptionParameterItem descriptionParameterItem2 = (DescriptionParameterItem) viewFindViewById2;
                ServiceOrdersListSnippetItem.b bVar = (ServiceOrdersListSnippetItem.b) obj;
                I5.a(descriptionParameterItem2.getLeftTextView(), bVar.f279253a, false);
                I5.a(descriptionParameterItem2.getRightTextView(), bVar.f279254b, false);
                if (viewGroup != null) {
                    viewGroup.addView(view);
                    return;
                }
                return;
        }
    }

    @Override // androidx.core.view.M
    public J0 h(View view, J0 j02) {
        Object obj = this.f208626c;
        switch (this.f208625b) {
            case 0:
                b.k((b) obj, j02);
                return j02;
            case 2:
                ReAgentSetProfileNameFragment.a aVar = ReAgentSetProfileNameFragment.f211382C0;
                boolean zP2 = j02.p(8);
                ReAgentSetProfileNameFragment reAgentSetProfileNameFragment = (ReAgentSetProfileNameFragment) obj;
                C47313c c47313c = reAgentSetProfileNameFragment.f211391s0;
                if (zP2) {
                    n<Object> nVar = ReAgentSetProfileNameFragment.f211383D0[0];
                    ((ScrollView) c47313c.a()).scrollTo(0, reAgentSetProfileNameFragment.r5().getBottom());
                } else {
                    n<Object>[] nVarArr = ReAgentSetProfileNameFragment.f211383D0;
                    n<Object> nVar2 = nVarArr[0];
                    ScrollView scrollView = (ScrollView) c47313c.a();
                    C47313c c47313c2 = reAgentSetProfileNameFragment.f211393u0;
                    n<Object> nVar3 = nVarArr[2];
                    scrollView.scrollTo(0, ((TextView) c47313c2.a()).getTop());
                }
                return C22823h0.v(view, j02);
            case 3:
                SetProfileNameFragment.a aVar2 = SetProfileNameFragment.f212039E0;
                boolean zP3 = j02.p(8);
                SetProfileNameFragment setProfileNameFragment = (SetProfileNameFragment) obj;
                C47313c c47313c3 = setProfileNameFragment.f212052u0;
                if (zP3) {
                    n<Object> nVar4 = SetProfileNameFragment.f212040F0[0];
                    ((ScrollView) c47313c3.a()).scrollTo(0, setProfileNameFragment.t5().getBottom());
                } else {
                    n<Object>[] nVarArr2 = SetProfileNameFragment.f212040F0;
                    n<Object> nVar5 = nVarArr2[0];
                    ScrollView scrollView2 = (ScrollView) c47313c3.a();
                    C47313c c47313c4 = setProfileNameFragment.f212053v0;
                    n<Object> nVar6 = nVarArr2[1];
                    scrollView2.scrollTo(0, ((TextView) c47313c4.a()).getTop());
                }
                return C22823h0.v(view, j02);
            case 12:
                C22771k c22771kE = j02.e(2);
                ((View) obj).setPadding(c22771kE.f44775a, 0, c22771kE.f44777c, c22771kE.f44778d);
                return J0.f44939b;
            default:
                if (j02.p(8)) {
                    ((com.avito.android.saved_searches.presentation.main.h) obj).f258609e.C0(0, y6.b(10));
                }
                return C22823h0.v(view, j02);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void j0() {
        Object obj = this.f208626c;
        switch (this.f208625b) {
            case 1:
                BeduinOrdersFragment.a aVar = BeduinOrdersFragment.f209960E0;
                ((BeduinOrdersFragment) obj).s5().accept(new a.c(null, 1, null));
                break;
            case 7:
                ((D) obj).f224200d.accept(InterfaceC15503a.x.f16473a);
                break;
            case 8:
                ((F) obj).f228547f.invoke(InterfaceC14878a.e.f13867b);
                break;
            case 9:
                ((com.avito.android.profile_settings_extended.B) obj).f228959b.accept(new k.b(true, null, 2, null));
                break;
            case 10:
                ((com.avito.android.profile_vk_linking.request_token.k) obj).f231360b.accept(InterfaceC19538a.c.f20293a);
                break;
            case 17:
                ((z) obj).f258977d.invoke();
                break;
            case 18:
                ((w) obj).f264023c.j0();
                break;
            case 19:
                ((com.avito.android.seller_coach.all_advices.view.e) obj).f267431j.accept(G0.f406611a);
                break;
            case 20:
                ((com.avito.android.seller_promotions.n) obj).f268073a.invoke(d.h.f12586a);
                break;
            case 21:
                SellerRoomFragment.a aVar2 = SellerRoomFragment.f268217x0;
                ((SellerRoomFragment) obj).t5().accept(new InterfaceC15708a.b());
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((com.avito.android.str_booking.ui.f) obj).f286019f.accept(a.k.f285793a);
                break;
            default:
                ((com.avito.android.str_seller_orders.orders_buyer.g) obj).f288992b.invoke();
                break;
        }
    }

    @Override // androidx.fragment.app.C
    public void k(Bundle bundle, String str) {
        Integer numValueOf;
        List<GalleryItem.GalleryImage> list;
        Object obj = this.f208626c;
        switch (this.f208625b) {
            case 13:
                ReviewGalleryActivity.a aVar = ReviewGalleryActivity.f255437y;
                Image image = (Image) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("selectedImage", Image.class) : bundle.getParcelable("selectedImage"));
                ReviewGalleryActivity reviewGalleryActivity = (ReviewGalleryActivity) obj;
                Pv0.b bVar = reviewGalleryActivity.f255442q;
                if (bVar == null) {
                    bVar = null;
                }
                GalleryItem galleryItem = bVar.read();
                if (galleryItem == null || (list = galleryItem.f68405g) == null) {
                    numValueOf = null;
                } else {
                    Iterator<GalleryItem.GalleryImage> it = list.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                        } else if (!L.f(it.next().f68425b.getImage(), image)) {
                            i12++;
                        }
                    }
                    numValueOf = Integer.valueOf(i12);
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                if (iIntValue >= 0) {
                    ViewPager2 viewPager2 = reviewGalleryActivity.f255443r;
                    (viewPager2 != null ? viewPager2 : null).g(iIntValue, true);
                    break;
                }
                break;
            case 15:
                SafetySettingsFragment.a aVar2 = SafetySettingsFragment.f257523w0;
                ((SafetySettingsFragment) obj).q5().accept(a.j.a(bundle.getBoolean("SafetYSettingsTfaDisSucArg")));
                break;
            case 23:
                DaySettingsFragment.q5((DaySettingsFragment) obj, str, bundle);
                break;
            default:
                StrSellerOrdersFragment.a aVar3 = StrSellerOrdersFragment.f289214v0;
                ((StrSellerOrdersFragment) obj).q5().accept(new InterfaceC48745a.f((StrOrdersFiltersResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("str_orders_filters_result_key", StrOrdersFiltersResult.class) : bundle.getParcelable("str_orders_filters_result_key"))));
                break;
        }
    }
}
