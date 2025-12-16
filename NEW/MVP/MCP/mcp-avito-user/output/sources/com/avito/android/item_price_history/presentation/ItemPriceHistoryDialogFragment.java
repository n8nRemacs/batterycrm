package com.avito.android.item_price_history.presentation;

import Cd.C13243a;
import EO.a;
import VU.b;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
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
import com.avito.android.di.C29972i;
import com.avito.android.item_price_history.di.b;
import com.avito.android.item_price_history.presentation.mvi.entity.IsFavoriteState;
import com.avito.android.item_price_history.presentation.mvi.q;
import com.avito.android.item_price_history.presentation.mvi.r;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.floating_container.a;
import com.avito.android.lib.design.floating_container.b;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import z1.AbstractC50339a;

/* compiled from: ItemPriceHistoryDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/item_price_history/presentation/ItemPriceHistoryDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ItemPriceHistoryDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f173686u0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public r f173687h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f173688i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f173689j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f173690k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f173691l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f173692m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public c f173693n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f173694o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public FloatingContainer f173695p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public ContextThemeWrapper f173696q0;

    /* renamed from: r0, reason: collision with root package name */
    public final int f173697r0;

    /* renamed from: s0, reason: collision with root package name */
    public final int f173698s0;

    /* renamed from: t0, reason: collision with root package name */
    public final int f173699t0;

    /* compiled from: ItemPriceHistoryDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_price_history/presentation/ItemPriceHistoryDialogFragment$a;", "", "<init>", "()V", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ItemPriceHistoryDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.item_price_history.presentation.ItemPriceHistoryDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C5114a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ItemPriceHistoryInitialData f173700l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5114a(ItemPriceHistoryInitialData itemPriceHistoryInitialData) {
                super(1);
                this.f173700l = itemPriceHistoryInitialData;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key.item_price_history_initial_data", this.f173700l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ItemPriceHistoryDialogFragment a(@Y61.k ItemPriceHistoryInitialData itemPriceHistoryInitialData) {
            ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = new ItemPriceHistoryDialogFragment();
            C35966w1.a(itemPriceHistoryDialogFragment, 1, new C5114a(itemPriceHistoryInitialData));
            return itemPriceHistoryDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: ItemPriceHistoryDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[IsFavoriteState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IsFavoriteState isFavoriteState = IsFavoriteState.f173796b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IsFavoriteState isFavoriteState2 = IsFavoriteState.f173796b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ItemPriceHistoryDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/item_price_history/presentation/ItemPriceHistoryDialogFragment$c", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.avito.android.lib.design.bottom_sheet.d {
        public c(Context context) {
            super(context, R.style.ItemPriceHistory_BottomSheet);
        }

        @Override // androidx.view.r, android.app.Dialog
        @InterfaceC42830m
        public final void onBackPressed() {
            super.onBackPressed();
            ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = ItemPriceHistoryDialogFragment.this;
            String tag = itemPriceHistoryDialogFragment.getTag();
            if (tag == null) {
                tag = "";
            }
            C22960s.a(C22777e.a(), itemPriceHistoryDialogFragment, tag);
        }
    }

    /* compiled from: ItemPriceHistoryDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = (ItemPriceHistoryDialogFragment) this.receiver;
            a aVar = ItemPriceHistoryDialogFragment.f173686u0;
            itemPriceHistoryDialogFragment.getClass();
            ViewParent parent = view2.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
            }
            itemPriceHistoryDialogFragment.f173695p0 = (FloatingContainer) view2.findViewById(R.id.item_price_history_footer);
            return G0.f406611a;
        }
    }

    /* compiled from: ItemPriceHistoryDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = (ItemPriceHistoryDialogFragment) this.receiver;
            com.avito.android.recycler.data_aware.c cVar = itemPriceHistoryDialogFragment.f173690k0;
            if (cVar == null) {
                cVar = null;
            }
            com.avito.konveyor.adapter.j jVar = itemPriceHistoryDialogFragment.f173691l0;
            if (jVar == null) {
                jVar = null;
            }
            C43259k.d(C22981N.a(itemPriceHistoryDialogFragment.getLifecycle()), null, null, new com.avito.android.item_price_history.presentation.d(itemPriceHistoryDialogFragment, new com.avito.android.item_price_history.presentation.h(jVar, view2, cVar, new com.avito.android.item_price_history.presentation.c(1, itemPriceHistoryDialogFragment.f5(), q.class, "accept", "accept(Ljava/lang/Object;)V", 0)), null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: ItemPriceHistoryDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f173703m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c cVar) {
            super(0);
            this.f173703m = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = ItemPriceHistoryDialogFragment.this;
            String tag = itemPriceHistoryDialogFragment.getTag();
            if (tag == null) {
                tag = "";
            }
            C22960s.a(C22777e.a(), itemPriceHistoryDialogFragment, tag);
            this.f173703m.dismiss();
            return G0.f406611a;
        }
    }

    /* compiled from: ItemPriceHistoryDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEO/a;", "it", "Lkotlin/G0;", "invoke", "(LEO/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<EO.a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(EO.a aVar) {
            a aVar2 = ItemPriceHistoryDialogFragment.f173686u0;
            ItemPriceHistoryDialogFragment.this.f5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ItemPriceHistoryDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = ItemPriceHistoryDialogFragment.this;
            com.avito.android.lib.design.toast_bar.k kVar = itemPriceHistoryDialogFragment.f173694o0;
            if (kVar != null) {
                kVar.f();
            }
            itemPriceHistoryDialogFragment.f5().accept(a.b.f3995a);
            return G0.f406611a;
        }
    }

    /* compiled from: ItemPriceHistoryDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = ItemPriceHistoryDialogFragment.this;
            com.avito.android.lib.design.toast_bar.k kVar = itemPriceHistoryDialogFragment.f173694o0;
            if (kVar != null) {
                kVar.f();
            }
            itemPriceHistoryDialogFragment.f5().accept(a.b.f3995a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f173707l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f173707l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f173707l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ItemPriceHistoryDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f173709l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f173709l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f173709l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f173710l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f173710l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f173710l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f173711l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f173711l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f173711l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ItemPriceHistoryDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/item_price_history/presentation/mvi/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<q> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = ItemPriceHistoryDialogFragment.this.f173687h0;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    public ItemPriceHistoryDialogFragment() {
        super(0, 1, null);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f173688i0 = new O0(m0.f406844a.b(q.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f173697r0 = y6.b(10);
        this.f173698s0 = y6.b(10);
        this.f173699t0 = y6.b(16);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(ItemPriceHistoryScreen.f173719d, s.b(this), null, 4, null);
        b.a aVarTg = ((b.InterfaceC5113b) C29972i.a(C29972i.b(this), b.InterfaceC5113b.class)).tg();
        cv.d dVarD = cv.c.d(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ItemPriceHistoryInitialData itemPriceHistoryInitialData = (ItemPriceHistoryInitialData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key.item_price_history_initial_data", ItemPriceHistoryInitialData.class) : arguments.getParcelable("key.item_price_history_initial_data"));
            if (itemPriceHistoryInitialData != null) {
                aVarTg.a(dVarD, itemPriceHistoryInitialData, new g(), c28478k, getResources(), c28478k.f90637b).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f173689j0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                screenPerformanceTracker.a(fA2.b());
                return;
            }
        }
        throw new IllegalStateException("ItemPriceHistoryInitialData is not specified");
    }

    public final q f5() {
        return (q) this.f173688i0.getValue();
    }

    public final void g5(FloatingContainer floatingContainer, IsFavoriteState isFavoriteState) {
        int iOrdinal = isFavoriteState.ordinal();
        if (iOrdinal == 0) {
            floatingContainer.setState(new com.avito.android.lib.design.floating_container.a(new a.AbstractC5270a.b(new UU.a(null, null, false, true, false, null, null, null, null, false, 1015, null))));
            return;
        }
        if (iOrdinal == 1) {
            b.a aVar = com.avito.android.lib.design.floating_container.b.f179184i;
            Context context = floatingContainer.getContext();
            int iJ2 = C35835l0.j(R.attr.floatingContainerOneButtonPrimary, floatingContainer.getContext());
            aVar.getClass();
            com.avito.android.lib.design.floating_container.b bVarB = b.a.b(iJ2, context);
            b.a aVar2 = VU.b.f17147t;
            Context context2 = floatingContainer.getContext();
            int iJ3 = C35835l0.j(R.attr.buttonSecondaryLarge, floatingContainer.getContext());
            aVar2.getClass();
            floatingContainer.setStyle(com.avito.android.lib.design.floating_container.b.a(bVarB, new b.AbstractC5272b.a(b.a.c(iJ3, context2)), this.f173699t0, this.f173697r0, this.f173698s0, 240));
            floatingContainer.setState(new com.avito.android.lib.design.floating_container.a(new a.AbstractC5270a.b(new UU.a(getString(R.string.item_price_history_unsubscribe), null, false, false, false, new i(), null, null, null, false, 982, null))));
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        b.a aVar3 = com.avito.android.lib.design.floating_container.b.f179184i;
        Context context3 = floatingContainer.getContext();
        int iJ4 = C35835l0.j(R.attr.floatingContainerOneButtonPrimary, floatingContainer.getContext());
        aVar3.getClass();
        com.avito.android.lib.design.floating_container.b bVarB2 = b.a.b(iJ4, context3);
        b.a aVar4 = VU.b.f17147t;
        Context context4 = floatingContainer.getContext();
        int iJ5 = C35835l0.j(R.attr.buttonPrimaryLarge, floatingContainer.getContext());
        aVar4.getClass();
        floatingContainer.setStyle(com.avito.android.lib.design.floating_container.b.a(bVarB2, new b.AbstractC5272b.a(b.a.c(iJ5, context4)), this.f173699t0, this.f173697r0, this.f173698s0, 240));
        floatingContainer.setState(new com.avito.android.lib.design.floating_container.a(new a.AbstractC5270a.b(new UU.a(getString(R.string.item_price_history_track_the_price), null, false, false, false, new h(), null, null, null, false, 982, null))));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final Context getContext() {
        ContextThemeWrapper contextThemeWrapper = this.f173696q0;
        return contextThemeWrapper == null ? super.getContext() : contextThemeWrapper;
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f173689j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        this.f173696q0 = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23));
        c cVar = new c(requireContext());
        this.f173693n0 = cVar;
        com.avito.android.lib.design.bottom_sheet.d.I(cVar, true);
        cVar.B(R.layout.item_price_history_fragment, R.layout.item_price_history_footer, new e(1, this, ItemPriceHistoryDialogFragment.class, "onInflated", "onInflated(Landroid/view/View;)V", 0), new d(1, this, ItemPriceHistoryDialogFragment.class, "onFooterInflated", "onFooterInflated(Landroid/view/View;)V", 0), true);
        com.avito.android.lib.design.bottom_sheet.j.c(cVar, getString(R.string.item_price_history_screen_title), true, 0, 0, 0, 120);
        cVar.R(new f(cVar));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f173689j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        com.avito.android.lib.design.toast_bar.k kVar = this.f173694o0;
        if (kVar != null) {
            kVar.f();
        }
        super.onDestroy();
    }
}
