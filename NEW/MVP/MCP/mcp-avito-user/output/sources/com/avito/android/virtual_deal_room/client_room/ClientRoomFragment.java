package com.avito.android.virtual_deal_room.client_room;

import Cd.C13243a;
import EN0.b;
import EN0.d;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.preference.q;
import androidx.view.C22981N;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.gsm_call_starter.public_module.link.GsmCallStartLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.virtual_deal_room.VDRCategoryScreen;
import com.avito.android.virtual_deal_room.client_room.ClientRoomActivity;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomActivityResult;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomArguments;
import com.avito.android.virtual_deal_room.deeplink.ClientEditDeeplink;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import fv.C40482a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import okhttp3.internal.ws.WebSocketProtocol;
import z1.AbstractC50339a;

/* compiled from: ClientRoomFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/ClientRoomFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClientRoomFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f326248u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public o f326249n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f326250o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f326251p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f326252q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public Map<Category, zN0.b> f326253r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.virtual_deal_room.client_room.j f326254s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f326255t0;

    /* compiled from: ClientRoomFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/ClientRoomFragment$a;", "", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ClientRoomFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/virtual_deal_room/client_room/model/ClientRoomArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ClientRoomArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ClientRoomArguments invoke() {
            Bundle bundleRequireArguments = ClientRoomFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("category_arguments", ClientRoomArguments.class) : bundleRequireArguments.getParcelable("category_arguments");
            if (parcelable != null) {
                return (ClientRoomArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: ClientRoomFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<EN0.a, G0> {
        @Override // Y41.l
        public final G0 invoke(EN0.a aVar) {
            ((n) this.receiver).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientRoomFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<EN0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(EN0.b bVar) {
            EN0.b bVar2 = bVar;
            ClientRoomFragment clientRoomFragment = (ClientRoomFragment) this.receiver;
            a aVar = ClientRoomFragment.f326248u0;
            clientRoomFragment.getClass();
            if (bVar2 instanceof b.e) {
                b.e eVar = (b.e) bVar2;
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, clientRoomFragment, eVar.f3963a, null, null, new f.c(new ApiError.UnknownError(eVar.f3963a.k0(clientRoomFragment.requireContext()), null, null, 6, null)), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            } else if (bVar2 instanceof b.f) {
                b.f fVar = (b.f) bVar2;
                clientRoomFragment.getChildFragmentManager().a0(1, null);
                androidx.fragment.app.H hE2 = clientRoomFragment.getChildFragmentManager().e();
                Map<Category, zN0.b> map = clientRoomFragment.f326253r0;
                if (map == null) {
                    map = null;
                }
                DN0.b bVar3 = fVar.f3964a;
                zN0.b bVar4 = map.get(bVar3.f3167a);
                Fragment fragmentA = bVar4 != null ? bVar4.a(bVar3.f3168b) : null;
                if (fragmentA == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                hE2.n(R.id.category_container, fragmentA, null);
                hE2.e();
            } else if (bVar2 instanceof b.C0230b) {
                ActivityC22955m activityC22955mRequireActivity = clientRoomFragment.requireActivity();
                ClientRoomActivity.a aVar2 = ClientRoomActivity.f326247m;
                ClientRoomActivityResult clientRoomActivityResult = new ClientRoomActivityResult(((b.C0230b) bVar2).f3955a);
                aVar2.getClass();
                activityC22955mRequireActivity.setResult(-1, new Intent().putExtra("category_result", clientRoomActivityResult));
                clientRoomFragment.requireActivity().finish();
            } else if (bVar2 instanceof b.a) {
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = clientRoomFragment.f326252q0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                b.a.a(aVar3, new GsmCallStartLink(((b.a) bVar2).f3954a, null, null, new ToastMessageLink(clientRoomFragment.getString(R.string.virtual_deal_room_error_dealer_call), null, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT, null), null, null, 54, null), null, null, 6);
            } else if (bVar2 instanceof b.d) {
                com.avito.android.deeplink_handler.handler.composite.a aVar4 = clientRoomFragment.f326252q0;
                if (aVar4 == null) {
                    aVar4 = null;
                }
                b.d dVar = (b.d) bVar2;
                b.a.a(aVar4, new ClientEditDeeplink(dVar.f3957a, dVar.f3958b, dVar.f3959c, dVar.f3960d, dVar.f3961e, dVar.f3962f), null, null, 6);
            } else if (bVar2 instanceof b.c) {
                ((ClipboardManager) clientRoomFragment.requireActivity().getApplicationContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("phone", ((b.c) bVar2).f3956a));
                if (Build.VERSION.SDK_INT <= 32) {
                    com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, clientRoomFragment, com.avito.android.printable_text.b.c(R.string.virtual_deal_room_phone_copied_successfully, new Serializable[0]), null, null, null, 0, null, 1022);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientRoomFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<EN0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(EN0.c cVar) {
            Image image;
            zN0.c cVar2;
            EN0.c cVar3 = cVar;
            com.avito.android.virtual_deal_room.client_room.j jVar = ((ClientRoomFragment) this.receiver).f326254s0;
            if (jVar != null) {
                EN0.d dVar = cVar3.f3982r;
                boolean z12 = dVar instanceof d.a;
                View view = jVar.f326319d;
                View view2 = jVar.f326318c;
                View view3 = jVar.f326317b;
                if (z12) {
                    D6.g(view3);
                    D6.g(view2);
                    D6.H(view);
                    d.a aVar = (d.a) dVar;
                    D6.G(jVar.f326322g, aVar.f3985c);
                    com.avito.android.virtual_deal_room.client_room.k kVar = new com.avito.android.virtual_deal_room.client_room.k(jVar);
                    boolean z13 = aVar.f3986d;
                    jVar.f326326k.setState(new com.akita.view.component.pull_to_refresh.state.a(z13, false, kVar));
                    TabGroup tabGroup = jVar.f326325j;
                    int tabCount = tabGroup.getTabCount();
                    ArrayList arrayList = aVar.f3990h;
                    boolean z14 = tabCount == 0 || (tabGroup.getTabCount() == 1 && arrayList.size() > 1) || (tabGroup.getTabCount() > 1 && arrayList.size() <= 1);
                    tabGroup.setState(new com.avito.android.lib.design.tab_group.d(arrayList, aVar.f3991i, new l(jVar, aVar.f3983a)));
                    if (z14) {
                        boolean z15 = arrayList.size() > 1;
                        D6.G(tabGroup, z15);
                        WeakReference<zN0.c> weakReference = jVar.f326330o;
                        if (weakReference != null && (cVar2 = weakReference.get()) != null) {
                            D6.l(true, jVar.f326327l, new m(jVar, z15, cVar2));
                        }
                    }
                    ImageView imageView = jVar.f326320e;
                    Context context = imageView.getContext();
                    DN0.a aVar2 = aVar.f3989g;
                    aVar2.getClass();
                    boolean zA2 = com.avito.android.lib.util.darkTheme.c.a(context);
                    Image image2 = aVar2.f3165a;
                    if (zA2 && (image = aVar2.f3166b) != null) {
                        image2 = image;
                    }
                    com.avito.android.image_loader.m mVar = image2 != null ? new com.avito.android.image_loader.m(image2, null, 2, null) : null;
                    Uri uriA = mVar != null ? mVar.a(imageView) : null;
                    if (!L.f(uriA, jVar.f326329n) && mVar != null) {
                        ImageRequest.a aVar3 = new ImageRequest.a(new DM.a(imageView));
                        aVar3.d(mVar);
                        aVar3.f169485c = Integer.valueOf(R.drawable.virtual_deal_room_category_shape);
                        aVar3.f169503u = true;
                        aVar3.c();
                        jVar.f326329n = uriA;
                    }
                    jVar.f326323h.setText(aVar.f3987e);
                    String str = aVar.f3988f;
                    ImageButton imageButton = jVar.f326321f;
                    if (str != null) {
                        D6.H(imageButton);
                    } else {
                        D6.g(imageButton);
                    }
                    I5.a(jVar.f326324i, str, false);
                    jVar.b().f355974K = !z13;
                } else if (dVar instanceof d.b) {
                    D6.H(view3);
                    D6.g(view2);
                    D6.g(view);
                } else if (dVar.equals(d.c.f3993a)) {
                    D6.g(view3);
                    D6.H(view2);
                    D6.g(view);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f326257l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f326257l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f326257l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ClientRoomFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f326259l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f326259l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f326259l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f326260l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f326260l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f326260l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f326261l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f326261l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f326261l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ClientRoomFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/virtual_deal_room/client_room/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<n> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final n invoke() {
            o oVar = ClientRoomFragment.this.f326249n0;
            if (oVar == null) {
                oVar = null;
            }
            return (n) oVar.get();
        }
    }

    public ClientRoomFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f326250o0 = new O0(m0.f406844a.b(n.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f326255t0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f326252q0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.virtual_deal_room.client_room.d(this, null), C40482a.b(aVar)), C22981N.a(getLifecycle()));
        getChildFragmentManager().f46377o.add(new androidx.view.fragment.a(this, 1));
        getChildFragmentManager().b(new q(this, 3));
        getChildFragmentManager().p0("ClientRoomChildFragmentResult", this, new com.avito.android.str_seller_orders.orders_seller.d(this, 11));
        com.avito.android.ui.fragments.e.b(requireActivity(), getChildFragmentManager(), new com.avito.android.virtual_deal_room.client_room.c(this));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f326251p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.virtual_deal_room_category_layout, viewGroup, false);
        this.f326254s0 = new com.avito.android.virtual_deal_room.client_room.j(viewInflate, new c(1, q5(), n.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f326251p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new d(1, this, ClientRoomFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomOneTimeEvent;)V", 0), new e(1, this, ClientRoomFragment.class, "render", "render(Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomState;)V", 0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f326254s0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        Object next;
        com.avito.android.virtual_deal_room.client_room.j jVar;
        super.onViewCreated(view, bundle);
        if (bundle == null && L.f(((ClientRoomArguments) this.f326255t0.getValue()).f326341d, Boolean.TRUE) && (jVar = this.f326254s0) != null) {
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, jVar.f326319d, com.avito.android.printable_text.b.c(R.string.virtual_deal_room_deal_created, new Serializable[0]), null, null, null, null, 0, null, null, false, false, null, null, 4094);
        }
        Iterator<T> it = getChildFragmentManager().P().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Fragment) next) instanceof zN0.c) {
                    break;
                }
            }
        }
        Fragment fragment = (Fragment) next;
        if (fragment != null) {
            if (bundle == null) {
                fragment = null;
            }
            if (fragment != null) {
                r5(fragment);
            }
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f326251p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.virtual_deal_room.client_room.di.c.a().a((com.avito.android.virtual_deal_room.client_room.di.b) C29972i.a(C29972i.b(this), com.avito.android.virtual_deal_room.client_room.di.b.class), cv.c.b(this), new C28478k(VDRCategoryScreen.f326097d, s.c(this), null, 4, null), (ClientRoomArguments) this.f326255t0.getValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f326251p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final n q5() {
        return (n) this.f326250o0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"HardcodeStringDetector"})
    public final void r5(Fragment fragment) {
        if (fragment instanceof DialogFragment) {
            return;
        }
        if (!(fragment instanceof zN0.c)) {
            throw new IllegalStateException("All child fragments must implement ClientRoomChildFragmentBehaviour interface");
        }
        com.avito.android.virtual_deal_room.client_room.j jVar = this.f326254s0;
        if (jVar != null) {
            zN0.c cVar = (zN0.c) fragment;
            jVar.f326330o = new WeakReference<>(cVar);
            D6.l(true, jVar.f326327l, new m(jVar, jVar.f326325j.getVisibility() == 0, cVar));
        }
    }
}
