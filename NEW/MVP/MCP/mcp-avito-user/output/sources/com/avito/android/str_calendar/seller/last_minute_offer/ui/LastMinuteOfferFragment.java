package com.avito.android.str_calendar.seller.last_minute_offer.ui;

import Au.C13079a;
import Cd.C13243a;
import Ky0.C14362a;
import Ky0.b;
import Ky0.c;
import Y41.p;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferState;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.a;
import com.avito.android.str_calendar.seller.last_minute_offer.o;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: LastMinuteOfferFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/ui/LastMinuteOfferFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LastMinuteOfferFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public o f287980n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f287981o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f287982p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_calendar.seller.core.c f287983q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f287984r0;

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f287979t0 = {m0.f406844a.e(new Y(LastMinuteOfferFragment.class, "viewHolder", "getViewHolder()Lcom/avito/android/str_calendar/seller/last_minute_offer/ui/LastMinuteOfferViewHolder;", 0))};

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f287978s0 = new a(null);

    /* compiled from: LastMinuteOfferFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/ui/LastMinuteOfferFragment$a;", "", "<init>", "()V", "", "ADVERT_ID_PARAM", "Ljava/lang/String;", "SELECTED_DATE_RANGE_PARAM", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LastMinuteOfferFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Ky0.c, G0> {
        public final void f(@Y61.k Ky0.c cVar) {
            View view;
            LastMinuteOfferFragment lastMinuteOfferFragment = (LastMinuteOfferFragment) this.receiver;
            a aVar = LastMinuteOfferFragment.f287978s0;
            lastMinuteOfferFragment.getClass();
            if (cVar instanceof c.C0601c) {
                c.C0601c c0601c = (c.C0601c) cVar;
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, lastMinuteOfferFragment, c0601c.f9739a, null, null, c0601c.f9740b, 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            } else if (!(cVar instanceof c.a)) {
                if (cVar instanceof c.b) {
                    C43259k.d(C22981N.a(lastMinuteOfferFragment.getLifecycle()), null, null, new com.avito.android.str_calendar.seller.last_minute_offer.ui.a(lastMinuteOfferFragment, cVar, null), 3);
                }
            } else {
                if (((c.a) cVar).f9736a || (view = lastMinuteOfferFragment.getView()) == null) {
                    return;
                }
                view.clearFocus();
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Ky0.c cVar) {
            f(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LastMinuteOfferFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<LastMinuteOfferState, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(LastMinuteOfferState lastMinuteOfferState) {
            Object next;
            a aVar = LastMinuteOfferFragment.f287978s0;
            LastMinuteOfferFragment lastMinuteOfferFragment = LastMinuteOfferFragment.this;
            com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.a aVar2 = lastMinuteOfferState.f287945h;
            if (aVar2 instanceof a.b) {
                lastMinuteOfferFragment.q5().f288012k.a("");
            } else {
                G0 g02 = null;
                if (aVar2 instanceof a.c) {
                    lastMinuteOfferFragment.q5().f288012k.k(null);
                } else if (aVar2 instanceof a.C8652a) {
                    a.C8652a c8652a = (a.C8652a) aVar2;
                    com.avito.android.str_calendar.seller.last_minute_offer.ui.c cVarQ5 = lastMinuteOfferFragment.q5();
                    cVarQ5.f288012k.j();
                    I5.a(cVarQ5.f288003b, c8652a.f287952b, false);
                    I5.a(cVarQ5.f288004c, c8652a.f287953c, false);
                    C35949t5.c(cVarQ5.f288005d, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(c8652a.f287951a, com.avito.android.lib.util.darkTheme.c.b(lastMinuteOfferFragment.requireContext()))), null, null, null, 14);
                    C14362a c14362a = c8652a.f287954d;
                    boolean z12 = c14362a.f9721a;
                    ListItemSwitcher listItemSwitcher = cVarQ5.f288006e;
                    listItemSwitcher.setChecked(z12);
                    listItemSwitcher.setTitle(c14362a.f9722b);
                    Button button = cVarQ5.f288014m;
                    com.avito.android.lib.design.button.b.a(button, c8652a.f287955e, false);
                    button.setEnabled(c8652a.f287956f);
                    button.setVisibility(!c8652a.f287957g ? 4 : 0);
                    button.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(24, lastMinuteOfferFragment, c8652a));
                    boolean z13 = c14362a.f9721a;
                    View view = cVarQ5.f288002a;
                    if (z13) {
                        D6.H(view);
                        I5.a(cVarQ5.f288007f, c14362a.f9723c, false);
                        I5.a(cVarQ5.f288008g, c14362a.f9724d, false);
                        Input input = cVarQ5.f288009h;
                        String deformattedText = input.getDeformattedText();
                        String str = c14362a.f9726f;
                        if (!L.f(deformattedText, str)) {
                            Input.t(input, str, true, 2);
                        }
                        boolean z14 = c8652a.f287958h;
                        ComponentContainer componentContainer = cVarQ5.f288010i;
                        if (z14) {
                            ComponentContainer.l(componentContainer, new int[]{input.getId()}, c8652a.f287959i, 4);
                            Input.f179303W.getClass();
                            input.setState(Input.f179305b0);
                        } else {
                            componentContainer.o(componentContainer.f178848i, new int[]{input.getId()});
                            Input.f179303W.getClass();
                            input.setState(Input.f179304a0);
                        }
                        ArrayList arrayList = c14362a.f9727g;
                        Chips chips = cVarQ5.f288011j;
                        chips.setData(arrayList);
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((Ky0.d) next).f9743d) {
                                break;
                            }
                        }
                        Ky0.d dVar = (Ky0.d) next;
                        if (dVar != null) {
                            chips.q(dVar, true);
                            g02 = G0.f406611a;
                        }
                        if (g02 == null) {
                            chips.j();
                        }
                    } else {
                        D6.w(view);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LastMinuteOfferFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.last_minute_offer.ui.LastMinuteOfferFragment$onViewCreated$3", f = "LastMinuteOfferFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f287986q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = LastMinuteOfferFragment.this.new d(continuation);
            dVar.f287986q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
            return ((d) create(bool, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Boolean bool = (Boolean) this.f287986q;
            a aVar = LastMinuteOfferFragment.f287978s0;
            LastMinuteOfferFragment.this.r5().accept(new b.C0600b(bool.booleanValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: LastMinuteOfferFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = LastMinuteOfferFragment.f287978s0;
            LastMinuteOfferFragment.this.r5().accept(b.e.f9732a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f287993l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f287993l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f287993l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return LastMinuteOfferFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f287995l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f287995l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f287995l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f287996l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f287996l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f287996l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f287997l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f287997l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f287997l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LastMinuteOfferFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_calendar/seller/last_minute_offer/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.str_calendar.seller.last_minute_offer.n> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_calendar.seller.last_minute_offer.n invoke() {
            o oVar = LastMinuteOfferFragment.this.f287980n0;
            if (oVar == null) {
                oVar = null;
            }
            return (com.avito.android.str_calendar.seller.last_minute_offer.n) oVar.get();
        }
    }

    public LastMinuteOfferFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f287981o0 = new O0(m0.f406844a.b(com.avito.android.str_calendar.seller.last_minute_offer.n.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f287984r0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f287982p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.str_calendar_last_minute_offer_fragment, viewGroup, false);
        com.avito.android.str_calendar.seller.last_minute_offer.ui.c cVar = new com.avito.android.str_calendar.seller.last_minute_offer.ui.c(viewInflate);
        C47313c c47313c = this.f287984r0;
        n<Object> nVar = f287979t0[0];
        c47313c.b(this, cVar);
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f287982p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, r5(), new b(1, this, LastMinuteOfferFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferOneTimeEvent;)V", 0), new c());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f287982p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.d();
        C43175k.K(new C43197r1(new d(null), y.a(K2.h(requireActivity()))), C22984Q.a(getViewLifecycleOwner()));
        com.avito.android.str_calendar.seller.last_minute_offer.ui.c cVarQ5 = q5();
        cVarQ5.f288013l.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 10));
        cVarQ5.f288012k.f231600j = new e();
        cVarQ5.f288006e.e(new C13079a(this, 10));
        Input input = cVarQ5.f288009h;
        input.b(new g(input, this));
        Chips chips = cVarQ5.f288011j;
        chips.setKeepSelected(true);
        chips.setChipsSelectedListener(new f());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            SelectedDateRange selectedDateRange = (SelectedDateRange) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("selected_date_range_param", SelectedDateRange.class) : arguments.getParcelable("selected_date_range_param"));
            if (selectedDateRange != null) {
                Bundle arguments2 = getArguments();
                String string = arguments2 != null ? arguments2.getString("advert_id_param") : null;
                if (string == null) {
                    throw new IllegalStateException("advertId not set");
                }
                com.avito.android.str_calendar.seller.last_minute_offer.di.a.a().a((com.avito.android.str_calendar.seller.last_minute_offer.di.c) C29972i.a(C29972i.b(this), com.avito.android.str_calendar.seller.last_minute_offer.di.c.class), (com.avito.android.str_calendar.seller.core.di.c) C29972i.a(C29972i.b(this), com.avito.android.str_calendar.seller.core.di.c.class), s.c(this), selectedDateRange, string).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f287982p0;
                (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
                return;
            }
        }
        throw new IllegalArgumentException("selectedDateRange not set");
    }

    public final com.avito.android.str_calendar.seller.last_minute_offer.ui.c q5() {
        C47313c c47313c = this.f287984r0;
        n<Object> nVar = f287979t0[0];
        return (com.avito.android.str_calendar.seller.last_minute_offer.ui.c) c47313c.a();
    }

    public final com.avito.android.str_calendar.seller.last_minute_offer.n r5() {
        return (com.avito.android.str_calendar.seller.last_minute_offer.n) this.f287981o0.getValue();
    }

    /* compiled from: LastMinuteOfferFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/str_calendar/seller/last_minute_offer/ui/LastMinuteOfferFragment$f", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements Chips.c {
        public f() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            a aVar = LastMinuteOfferFragment.f287978s0;
            LastMinuteOfferFragment.this.r5().accept(new b.d((Ky0.d) hVar));
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f287990b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f287991c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LastMinuteOfferFragment f287992d;

        public g(Input input, LastMinuteOfferFragment lastMinuteOfferFragment) {
            this.f287991c = input;
            this.f287992d = lastMinuteOfferFragment;
            this.f287990b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f287991c.getDeformattedText();
            if (L.f(deformattedText, this.f287990b)) {
                return;
            }
            a aVar = LastMinuteOfferFragment.f287978s0;
            this.f287992d.r5().accept(new b.a(deformattedText));
            this.f287990b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
