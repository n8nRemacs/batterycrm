package com.avito.android.travel_guest_profile;

import Cd.C13243a;
import Dh0.InterfaceC13400a;
import QE0.a;
import QE0.c;
import QE0.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import com.avito.android.rating_ui.info_with_hint.RatingInfoWithHintItem;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.io.Serializable;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: TravelGuestProfileFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/travel_guest_profile/TravelGuestProfileFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelGuestProfileFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f301839v0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.travel_guest_profile.i f301840n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f301841o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f301842p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f301843q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f301844r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f301845s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public PhotoGalleryIntentFactory f301846t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.travel_guest_profile.g f301847u0;

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/travel_guest_profile/TravelGuestProfileFragment$a;", "", "<init>", "()V", "", "BOOKING_ID_KEY", "Ljava/lang/String;", "CONTEXT_KEY", "USER_KEY_KEY", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<QE0.c, G0> {
        public final void f(@Y61.k QE0.c cVar) {
            TravelGuestProfileFragment travelGuestProfileFragment = (TravelGuestProfileFragment) this.receiver;
            a aVar = TravelGuestProfileFragment.f301839v0;
            travelGuestProfileFragment.getClass();
            if (cVar instanceof c.a) {
                travelGuestProfileFragment.requireActivity().onBackPressed();
                return;
            }
            if (cVar instanceof c.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = travelGuestProfileFragment.f301845s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((c.b) cVar).f13613a, null, null, 6);
                return;
            }
            if (cVar instanceof c.C0892c) {
                PhotoGalleryIntentFactory photoGalleryIntentFactory = travelGuestProfileFragment.f301846t0;
                if (photoGalleryIntentFactory == null) {
                    photoGalleryIntentFactory = null;
                }
                c.C0892c c0892c = (c.C0892c) cVar;
                Integer num = c0892c.f13615b;
                travelGuestProfileFragment.startActivity(photoGalleryIntentFactory.b(c0892c.f13614a, num != null ? num.intValue() : 0, false, null));
                return;
            }
            if (!(cVar instanceof c.d)) {
                if (cVar instanceof c.e) {
                    com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, travelGuestProfileFragment.requireView(), com.avito.android.printable_text.b.c(R.string.travel_guest_profile_reviews_error_title, new Serializable[0]), null, Collections.singletonList(new c.a.C3719a(travelGuestProfileFragment.getResources().getString(R.string.error_layout_refresh), false, null, new com.avito.android.travel_guest_profile.d(travelGuestProfileFragment, cVar), 6, null)), null, new f.c(((c.e) cVar).f13618a), 2750, null, null, true, false, null, null, 3786);
                    return;
                }
                return;
            }
            com.avito.android.rating_ui.reviews_options.c cVar2 = new com.avito.android.rating_ui.reviews_options.c(travelGuestProfileFragment.requireView().getContext());
            I5.a(cVar2.f250404E, travelGuestProfileFragment.getResources().getString(R.string.reviews_sort), false);
            c.d dVar = (c.d) cVar;
            for (SearchParametersEntry.SearchParametersBlock.Sort.SortOption sortOption : dVar.f13617b) {
                String label = sortOption.getLabel();
                boolean zF2 = L.f(sortOption.getValue(), dVar.f13616a);
                com.avito.android.travel_guest_profile.c cVar3 = new com.avito.android.travel_guest_profile.c(travelGuestProfileFragment, sortOption, cVar2);
                View viewV = cVar2.V(label, zF2);
                viewV.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(11, cVar3));
                cVar2.f250405F.addView(viewV);
            }
            com.avito.android.lib.util.g.a(cVar2);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(QE0.c cVar) {
            f(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQE0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LQE0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<QE0.d, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(QE0.d dVar) {
            com.avito.android.travel_guest_profile.g gVar;
            a aVar = TravelGuestProfileFragment.f301839v0;
            TravelGuestProfileFragment travelGuestProfileFragment = TravelGuestProfileFragment.this;
            com.avito.android.travel_guest_profile.e eVar = new com.avito.android.travel_guest_profile.e(1, travelGuestProfileFragment.q5(), com.avito.android.travel_guest_profile.h.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            QE0.e eVar2 = dVar.f13630j;
            if (eVar2 instanceof e.c) {
                com.avito.android.travel_guest_profile.g gVar2 = travelGuestProfileFragment.f301847u0;
                if (gVar2 != null) {
                    D6.H(gVar2.f302037d);
                }
            } else if (eVar2 instanceof e.a) {
                com.avito.android.travel_guest_profile.g gVar3 = travelGuestProfileFragment.f301847u0;
                if (gVar3 != null) {
                    D6.w(gVar3.f302037d);
                    D6.w(gVar3.f302036c);
                    D6.H(gVar3.f302035b);
                    com.avito.konveyor.adapter.d dVar2 = travelGuestProfileFragment.f301843q0;
                    if (dVar2 == null) {
                        dVar2 = null;
                    }
                    dVar2.l(((e.a) eVar2).f13631a, null);
                }
            } else if ((eVar2 instanceof e.b) && (gVar = travelGuestProfileFragment.f301847u0) != null) {
                D6.w(gVar.f302037d);
                D6.w(gVar.f302035b);
                ContentPlaceholder contentPlaceholder = gVar.f302036c;
                D6.H(contentPlaceholder);
                e.b bVar = (e.b) eVar2;
                contentPlaceholder.setState(new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), bVar.f13632a, bVar.f13633b, com.avito.android.printable_text.b.c(R.string.error_layout_refresh, new Serializable[0]), new com.avito.android.seller_promotions.b(18, eVar)));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            TravelGuestProfileFragment.this.requireActivity().onBackPressed();
            return G0.f406611a;
        }
    }

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQE0/a;", "it", "Lkotlin/G0;", "invoke", "(LQE0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<QE0.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(QE0.a aVar) {
            a aVar2 = TravelGuestProfileFragment.f301839v0;
            TravelGuestProfileFragment.this.q5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = TravelGuestProfileFragment.f301839v0;
            TravelGuestProfileFragment.this.q5().accept(a.f.f13605a);
            return G0.f406611a;
        }
    }

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f301852l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            return G0.f406611a;
        }
    }

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<String, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = TravelGuestProfileFragment.f301839v0;
            TravelGuestProfileFragment.this.q5().accept(a.k.f13610a);
            return G0.f406611a;
        }
    }

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f301854l = new i();

        public i() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_ui/info_with_hint/RatingInfoWithHintItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/rating_ui/info_with_hint/RatingInfoWithHintItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<RatingInfoWithHintItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f301855l = new j();

        public j() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(RatingInfoWithHintItem ratingInfoWithHintItem) {
            return G0.f406611a;
        }
    }

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDh0/a;", "it", "Lkotlin/G0;", "invoke", "(LDh0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<InterfaceC13400a, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13400a interfaceC13400a) {
            a aVar = TravelGuestProfileFragment.f301839v0;
            TravelGuestProfileFragment.this.q5().accept(new a.j(interfaceC13400a));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f301857l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Y41.a aVar) {
            super(0);
            this.f301857l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f301857l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<Fragment> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TravelGuestProfileFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m f301859l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.f301859l = mVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f301859l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f301860l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f301860l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f301860l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f301861l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f301861l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f301861l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/travel_guest_profile/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<com.avito.android.travel_guest_profile.h> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.travel_guest_profile.h invoke() {
            com.avito.android.travel_guest_profile.i iVar = TravelGuestProfileFragment.this.f301840n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.travel_guest_profile.h) iVar.get();
        }
    }

    public TravelGuestProfileFragment() {
        super(0, 1, null);
        l lVar = new l(new q());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new n(new m()));
        this.f301841o0 = new O0(m0.f406844a.b(com.avito.android.travel_guest_profile.h.class), new o(interfaceC42726CB), lVar, new p(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f301842p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f301842p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, TravelGuestProfileFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileOneTimeEvent;)V", 0), new c());
        return layoutInflater.inflate(R.layout.travel_guest_profile_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f301847u0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.travel_guest_profile.g gVar = new com.avito.android.travel_guest_profile.g(view);
        gVar.f302034a.setState(new com.avito.android.lib.design.nav_bar.a(null, new d(), true, null, null, null, null, 113, null));
        requireContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        RecyclerView recyclerView = gVar.f302035b;
        recyclerView.setLayoutManager(linearLayoutManager);
        com.avito.konveyor.adapter.d dVar = this.f301843q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        C35976x4.a(recyclerView);
        com.avito.konveyor.a aVar = this.f301844r0;
        if (aVar == null) {
            aVar = null;
        }
        recyclerView.l(new NE0.a(aVar), -1);
        this.f301847u0 = gVar;
        ScreenPerformanceTracker screenPerformanceTracker = this.f301842p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(TravelGuestProfileScreen.f301863d, s.c(this), null, 4, null);
        String string = requireArguments().getString("user_key");
        String string2 = requireArguments().getString("context");
        String string3 = requireArguments().getString("booking_id");
        com.avito.android.travel_guest_profile.di.c.a().a((com.avito.android.travel_guest_profile.di.e) C29972i.a(C29972i.b(this), com.avito.android.travel_guest_profile.di.e.class), cv.c.b(this), new e(), c28478k, string, string2, string3, requireActivity(), new f(), g.f301852l, new h(), i.f301854l, j.f301855l, new k()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f301842p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.travel_guest_profile.h q5() {
        return (com.avito.android.travel_guest_profile.h) this.f301841o0.getValue();
    }
}
