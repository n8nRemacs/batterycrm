package com.avito.android.user_viewed.screen.ui;

import Cd.r;
import Me.m;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C23060r0;
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
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.BuyWithDeliveryInFavorites;
import com.avito.android.remote.model.FavoriteAdvertActionButton;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.favorite_contacts.Contacts;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.user_viewed.domain.model.UserViewedAdvert;
import com.avito.android.user_viewed.domain.model.UserViewedButton;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedState;
import com.avito.android.user_viewed.screen.ui.e;
import com.avito.android.user_viewed.screen.ui.item.empty.UserViewedEmptyItem;
import com.avito.android.user_viewed.screen.ui.item.error.UserViewedErrorItem;
import com.avito.android.user_viewed.screen.ui.item.loading.UserViewedLoadingItem;
import com.avito.android.user_viewed.screen.ui.item.tracker.UserViewedTrackerItem;
import com.avito.android.user_viewed.screen.ui.state.UserViewedUiState;
import com.avito.android.util.O2;
import com.avito.conveyor_item.ParcelableItem;
import fK0.InterfaceC40305b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import lK0.InterfaceC43650a;
import lK0.InterfaceC43651b;
import oK0.C44660b;
import z1.AbstractC50339a;

/* compiled from: UserViewedFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_viewed/screen/ui/UserViewedFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/bottom_navigation/ui/fragment/g;", "<init>", "()V", "a", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserViewedFragment extends TabBaseFragment implements InterfaceC28477j.b, com.avito.android.bottom_navigation.ui.fragment.g {

    /* renamed from: B0, reason: collision with root package name */
    @k
    public static final a f318464B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @l
    public SwipeRefreshLayout f318465A0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public e.a f318466t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final O0 f318467u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f318468v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public C44660b f318469w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f318470x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f318471y0;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public RecyclerView f318472z0;

    /* compiled from: UserViewedFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_viewed/screen/ui/UserViewedFragment$a;", "", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UserViewedFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC43651b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC43651b interfaceC43651b) {
            InterfaceC43651b interfaceC43651b2 = interfaceC43651b;
            UserViewedFragment userViewedFragment = (UserViewedFragment) this.receiver;
            a aVar = UserViewedFragment.f318464B0;
            userViewedFragment.getClass();
            if (interfaceC43651b2 instanceof InterfaceC43651b.a) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = userViewedFragment.f318471y0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                InterfaceC43651b.a aVar3 = (InterfaceC43651b.a) interfaceC43651b2;
                b.a.a(aVar2, aVar3.f413725a, null, aVar3.f413726b, 2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserViewedFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<UserViewedState, G0> {
        public c() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v11, types: [com.avito.android.remote.model.AdvertAction$Messenger] */
        /* JADX WARN: Type inference failed for: r12v9, types: [com.avito.android.remote.model.AdvertAction$Phone] */
        /* JADX WARN: Type inference failed for: r27v0 */
        /* JADX WARN: Type inference failed for: r27v1, types: [com.avito.android.remote.model.BuyWithDeliveryInFavorites] */
        /* JADX WARN: Type inference failed for: r27v2 */
        /* JADX WARN: Type inference failed for: r30v0 */
        /* JADX WARN: Type inference failed for: r30v1, types: [com.avito.android.remote.model.FavoriteAdvertActionButton] */
        /* JADX WARN: Type inference failed for: r30v2 */
        /* JADX WARN: Type inference failed for: r32v0 */
        /* JADX WARN: Type inference failed for: r32v1, types: [com.avito.android.remote.model.favorite_contacts.Contacts] */
        /* JADX WARN: Type inference failed for: r32v2 */
        /* JADX WARN: Type inference failed for: r41v0 */
        /* JADX WARN: Type inference failed for: r41v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r41v2 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String, kotlin.jvm.internal.w] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r8v13, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [com.avito.android.deep_linking.links.AdvertDetailsLink] */
        @Override // Y41.l
        public final G0 invoke(UserViewedState userViewedState) {
            ?? r42;
            ArrayList arrayListI0;
            UserViewedUiState userViewedUiState;
            ?? contacts;
            ?? buyWithDeliveryInFavorites;
            ?? favoriteAdvertActionButton;
            Object next;
            Object next2;
            RecyclerView.Adapter adapter;
            UserViewedState userViewedState2 = userViewedState;
            UserViewedFragment userViewedFragment = UserViewedFragment.this;
            C44660b c44660b = userViewedFragment.f318469w0;
            ArrayList arrayList = null;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            if (c44660b == null) {
                c44660b = null;
            }
            c44660b.getClass();
            int i12 = 1;
            if (userViewedState2.equals(UserViewedState.Loading.f318425b)) {
                userViewedUiState = new UserViewedUiState(Collections.singletonList(new UserViewedLoadingItem(z15 ? 1 : 0, i12, z14 ? 1 : 0)), false, false, false, false, 30, null);
            } else if (userViewedState2.equals(UserViewedState.Error.f318424b)) {
                userViewedUiState = new UserViewedUiState(Collections.singletonList(new UserViewedErrorItem(z13 ? 1 : 0, i12, z12 ? 1 : 0)), false, false, false, false, 30, null);
            } else {
                if (!(userViewedState2 instanceof UserViewedState.Content)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserViewedState.Content content = (UserViewedState.Content) userViewedState2;
                List<UserViewedAdvert> list = content.f318420b;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                for (UserViewedAdvert userViewedAdvert : list) {
                    GeoReference geoReference = userViewedAdvert.f318379m;
                    ArrayList arrayListSingletonList = geoReference != null ? Collections.singletonList(geoReference) : arrayList;
                    DeepLink deepLink = userViewedAdvert.f318370d;
                    ?? r82 = deepLink instanceof AdvertDetailsLink ? (AdvertDetailsLink) deepLink : arrayList;
                    ?? r412 = r82 != null ? r82.f132948c : arrayList;
                    ArrayList<UserViewedButton> arrayList3 = userViewedAdvert.f318380n;
                    if (arrayList3 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (UserViewedButton userViewedButton : arrayList3) {
                            String str = userViewedButton.f318384e;
                            ArrayList messenger = L.f(str, "message") ? new AdvertAction.Messenger(userViewedButton.f318381b, userViewedButton.f318382c, null, userViewedButton.f318383d, 4, null) : L.f(str, "phone") ? new AdvertAction.Phone(userViewedButton.f318381b, userViewedButton.f318382c, null, userViewedButton.f318383d, 4, null) : arrayList;
                            if (messenger != null) {
                                arrayList4.add(messenger);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            arrayList4 = arrayList;
                        }
                        contacts = arrayList4 != null ? new Contacts(arrayList4) : arrayList;
                    } else {
                        contacts = arrayList;
                    }
                    if (arrayList3 != null) {
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next2 = arrayList;
                                break;
                            }
                            next2 = it.next();
                            UserViewedButton userViewedButton2 = (UserViewedButton) next2;
                            if (L.f(userViewedButton2.f318384e, "buy") || L.f(userViewedButton2.f318384e, "booking")) {
                                break;
                            }
                        }
                        UserViewedButton userViewedButton3 = (UserViewedButton) next2;
                        buyWithDeliveryInFavorites = userViewedButton3 != null ? new BuyWithDeliveryInFavorites(userViewedButton3.f318381b, userViewedButton3.f318382c, userViewedButton3.f318383d) : arrayList;
                    } else {
                        buyWithDeliveryInFavorites = arrayList;
                    }
                    if (arrayList3 != null) {
                        Iterator it2 = arrayList3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = arrayList;
                                break;
                            }
                            next = it2.next();
                            if (L.f(((UserViewedButton) next).f318384e, "similar")) {
                                break;
                            }
                        }
                        UserViewedButton userViewedButton4 = (UserViewedButton) next;
                        favoriteAdvertActionButton = userViewedButton4 != null ? new FavoriteAdvertActionButton(userViewedButton4.f318382c, userViewedButton4.f318381b) : arrayList;
                    } else {
                        favoriteAdvertActionButton = arrayList;
                    }
                    arrayList2.add(new FavoriteAdvertItem(userViewedAdvert.f318368b, userViewedAdvert.f318374h, userViewedAdvert.f318375i, null, null, null, Long.valueOf(userViewedAdvert.f318371e), userViewedAdvert.f318377k, userViewedAdvert.f318373g, userViewedAdvert.f318369c, null, userViewedAdvert.f318370d, userViewedAdvert.f318376j, null, null, null, null, buyWithDeliveryInFavorites, null, null, favoriteAdvertActionButton, null, contacts, arrayListSingletonList, null, null, null, null, null, null, userViewedAdvert.f318378l, r412, null, null, false, null, null, null, null, null, 1056964608, 255, null));
                    arrayList = null;
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    r42 = 0;
                    arrayListI0 = C42745f0.i0(new UserViewedTrackerItem(false ? 1 : 0, i12, false ? 1 : 0), arrayList2);
                } else {
                    r42 = 0;
                    arrayListI0 = null;
                }
                userViewedUiState = new UserViewedUiState(arrayListI0 == null ? Collections.singletonList(new UserViewedEmptyItem(r42, i12, r42)) : arrayListI0, O2.a(arrayListI0), true, content.f318421c, content.f318422d);
            }
            SwipeRefreshLayout swipeRefreshLayout = userViewedFragment.f318465A0;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(userViewedUiState.f318510e);
            }
            SwipeRefreshLayout swipeRefreshLayout2 = userViewedFragment.f318465A0;
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.setEnabled(userViewedUiState.f318509d);
            }
            RecyclerView recyclerView = userViewedFragment.f318472z0;
            if (recyclerView != null) {
                recyclerView.setOverScrollMode(userViewedUiState.f318508c ? 0 : 2);
            }
            RecyclerView recyclerView2 = userViewedFragment.f318472z0;
            if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
                if (recyclerView2.d0()) {
                    recyclerView2.post(new com.avito.android.user_viewed.screen.ui.a(adapter, userViewedFragment, userViewedUiState));
                } else {
                    com.avito.konveyor.adapter.d dVar = userViewedFragment.f318470x0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    com.avito.android.user_viewed.screen.ui.b bVar = new com.avito.android.user_viewed.screen.ui.b(userViewedFragment);
                    List<ParcelableItem> list2 = userViewedUiState.f318507b;
                    if (userViewedUiState.f318511f) {
                        dVar.l(null, new m(dVar, list2, bVar, 28));
                    } else {
                        dVar.l(list2, null);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserViewedFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LlK0/a;", "it", "Lkotlin/G0;", "invoke", "(LlK0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<InterfaceC43650a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC43650a interfaceC43650a) {
            a aVar = UserViewedFragment.f318464B0;
            ((com.avito.android.user_viewed.screen.ui.e) UserViewedFragment.this.f318467u0.getValue()).accept(interfaceC43650a);
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f318476m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.l lVar) {
            super(0);
            this.f318476m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(UserViewedFragment.this, this.f318476m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return UserViewedFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f318478l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f318478l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f318478l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f318479l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f318479l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f318479l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f318480l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f318480l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f318480l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UserViewedFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/user_viewed/screen/ui/e;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/user_viewed/screen/ui/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<C23060r0, com.avito.android.user_viewed.screen.ui.e> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.user_viewed.screen.ui.e invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            e.a aVar = UserViewedFragment.this.f318466t0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public UserViewedFragment() {
        super(R.layout.user_viewed_fragment);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f318467u0 = new O0(m0.f406844a.b(com.avito.android.user_viewed.screen.ui.e.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.g
    public final void K3() {
        RecyclerView recyclerView = this.f318472z0;
        if (recyclerView != null) {
            recyclerView.A0(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f318468v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f318468v0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.user_viewed.screen.ui.e) this.f318467u0.getValue(), new b(1, this, UserViewedFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedOneTimeEvent;)V", 0), new c());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        RecyclerView recyclerView = this.f318472z0;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setAdapter(null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f318468v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        View viewFindViewById = view.findViewById(R.id.swipeRefreshLayout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.str_seller_orders.orders_seller.d(this, 9));
        this.f318465A0 = swipeRefreshLayout;
        View viewFindViewById2 = view.findViewById(R.id.recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        com.avito.konveyor.adapter.d dVar = this.f318470x0;
        recyclerView.setAdapter(dVar != null ? dVar : null);
        this.f318472z0 = recyclerView;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.user_viewed.di.a.a().a((InterfaceC40305b) C29972i.a(C29972i.b(this), InterfaceC40305b.class), cv.c.b(this), getResources(), new C28478k(UserViewedScreen.f318482d, s.c(this), null, 4, null), new d()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f318468v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
