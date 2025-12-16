package com.avito.android.profile_phones.phones_list;

import Au.C13079a;
import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.N1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.auth.C28629h;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.LandlinePhoneVerificationLink;
import com.avito.android.deep_linking.links.auth.MobilePhoneVerificationLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import com.avito.android.iac_problems.public_module.deeplink.IacShowProblemBottomSheetLink;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.profile_phones.deep_linking.a;
import com.avito.android.profile_phones.deep_linking.c;
import com.avito.android.profile_phones.perf_const.PhonesListScreen;
import com.avito.android.profile_phones.phones_list.P;
import com.avito.android.profile_phones.phones_list.PhonesListFragment;
import com.avito.android.profile_phones.phones_list.SectionForOpen;
import com.avito.android.profile_phones.phones_list.actions.PhoneActionsSheetDialogArguments;
import com.avito.android.profile_phones.phones_list.actions.PhoneActionsSheetDialogFragment;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.DeleteDeviceBottomSheetFragment;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import com.avito.android.profile_phones.phones_list.di.k;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetFragment;
import com.avito.android.profile_phones.phones_list.mvi.entity.IacEnableSwitchState;
import com.avito.android.profile_phones.phones_list.mvi.entity.NumbersListState;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import cv.InterfaceC39417a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kv.C43501a;
import vN.C49237a;
import wb0.InterfaceC49590a;
import wb0.InterfaceC49591b;
import z1.AbstractC50339a;

/* compiled from: PhonesListFragment.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/PhonesListFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/profile_phones/phones_list/phone_item/a;", "Lcom/avito/android/profile_phones/phones_list/device_list_item/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviState;", VoiceInfo.STATE, "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhonesListFragment extends TabBaseFragment implements com.avito.android.profile_phones.phones_list.phone_item.a, com.avito.android.profile_phones.phones_list.device_list_item.i, InterfaceC28477j.b {

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public static final a f227380K0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f227381A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f227382B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public C49237a f227383C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f227384D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f227385E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<G0> f227386F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f227387G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public DialogC33420e f227388H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f227389I0;

    /* renamed from: J0, reason: collision with root package name */
    public O f227390J0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public P.a f227391t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f227392u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f227393v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f227394w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f227395x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f227396y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public N1 f227397z0;

    /* compiled from: PhonesListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/PhonesListFragment$a;", "", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhonesListFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements Y41.p<C43501a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            C43501a c43501a2 = c43501a;
            PhonesListFragment phonesListFragment = (PhonesListFragment) this.receiver;
            a aVar = PhonesListFragment.f227380K0;
            phonesListFragment.getClass();
            InterfaceC14249c interfaceC14249c = c43501a2.f413261b;
            com.avito.android.deeplink_handler.handler.bundle.a aVar2 = c43501a2.f413260a;
            DeepLink deepLink = aVar2.f134520a;
            if ((deepLink instanceof MobilePhoneVerificationLink) && (interfaceC14249c instanceof c.a.b)) {
                c.a.b bVar = (c.a.b) interfaceC14249c;
                phonesListFragment.D5().accept(new InterfaceC49590a.l(bVar.f227121b));
                DeepLink deepLink2 = bVar.f227122c;
                if (deepLink2 != null) {
                    phonesListFragment.D5().accept(new InterfaceC49590a.q(deepLink2));
                }
            } else if ((deepLink instanceof LandlinePhoneVerificationLink) && (interfaceC14249c instanceof a.InterfaceC6897a.b)) {
                phonesListFragment.D5().accept(new InterfaceC49590a.l(((a.InterfaceC6897a.b) interfaceC14249c).f227108d));
            } else if (interfaceC14249c instanceof IacShowProblemBottomSheetLink.b) {
                phonesListFragment.D5().accept(InterfaceC49590a.h.f441639a);
            } else if (kotlin.jvm.internal.L.f(aVar2.f134521b, "perform_phone_action_request_code") && !(interfaceC14249c instanceof InterfaceC14247a.InterfaceC0545a)) {
                phonesListFragment.D5().accept(new InterfaceC49590a.l(null));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhonesListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_phones.phones_list.PhonesListFragment$onViewCreated$2", f = "PhonesListFragment.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f227398q;

        /* compiled from: PhonesListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile_phones.phones_list.PhonesListFragment$onViewCreated$2$1", f = "PhonesListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f227400q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PhonesListFragment f227401r;

            /* compiled from: PhonesListFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.profile_phones.phones_list.PhonesListFragment$onViewCreated$2$1$1", f = "PhonesListFragment.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.profile_phones.phones_list.PhonesListFragment$c$a$a, reason: collision with other inner class name */
            public static final class C6911a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f227402q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ PhonesListFragment f227403r;

                /* compiled from: PhonesListFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.profile_phones.phones_list.PhonesListFragment$c$a$a$a, reason: collision with other inner class name */
                public static final class C6912a extends kotlin.jvm.internal.N implements Y41.l<PhonesListMviState, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ PhonesListFragment f227404l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C6912a(PhonesListFragment phonesListFragment) {
                        super(1);
                        this.f227404l = phonesListFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(PhonesListMviState phonesListMviState) throws Resources.NotFoundException {
                        Object next;
                        IacEnableSwitchState iacEnableSwitchState;
                        String str;
                        String string;
                        String quantityString;
                        PhonesListMviState phonesListMviState2 = phonesListMviState;
                        PhonesListFragment phonesListFragment = this.f227404l;
                        C49237a c49237a = phonesListFragment.f227383C0;
                        if (c49237a == null) {
                            c49237a = null;
                        }
                        if (!c49237a.v().invoke().booleanValue()) {
                            if (phonesListMviState2.f228018b) {
                                O o12 = phonesListFragment.f227390J0;
                                if (o12 == null) {
                                    o12 = null;
                                }
                                o12.f227357c.k(null);
                            } else {
                                O o13 = phonesListFragment.f227390J0;
                                if (o13 == null) {
                                    o13 = null;
                                }
                                o13.f227357c.j();
                                O o14 = phonesListFragment.f227390J0;
                                if (o14 == null) {
                                    o14 = null;
                                }
                                View view = o14.f227371q;
                                NumbersListState numbersListState = phonesListMviState2.f228021e;
                                D6.G(view, numbersListState instanceof NumbersListState.EmptyNumbers);
                                O o15 = phonesListFragment.f227390J0;
                                if (o15 == null) {
                                    o15 = null;
                                }
                                D6.G(o15.f227370p, numbersListState instanceof NumbersListState.Error);
                                O o16 = phonesListFragment.f227390J0;
                                if (o16 == null) {
                                    o16 = null;
                                }
                                boolean z12 = numbersListState instanceof NumbersListState.Loaded;
                                D6.G(o16.f227367m, z12);
                                if (z12) {
                                    O o17 = phonesListFragment.f227390J0;
                                    if (o17 == null) {
                                        o17 = null;
                                    }
                                    NumbersListState.Loaded loaded = (NumbersListState.Loaded) numbersListState;
                                    D6.G(o17.f227373s, loaded.f227981c);
                                    boolean z13 = loaded.f227981c;
                                    List<PhoneListItem> list = loaded.f227980b;
                                    if (z13) {
                                        O o18 = phonesListFragment.f227390J0;
                                        if (o18 == null) {
                                            o18 = null;
                                        }
                                        int size = list.size();
                                        int i12 = com.avito.android.profile_phones.phones_list.mvi.O.f227945d;
                                        int i13 = size - i12;
                                        ImageView imageView = o18.f227374t;
                                        View view2 = o18.f227355a;
                                        boolean z14 = loaded.f227982d;
                                        if (z14) {
                                            imageView.setImageDrawable(C35835l0.h(R.attr.ic_arrowExpandMore20, view2.getContext()));
                                            quantityString = view2.getContext().getString(R.string.numbers_and_calls);
                                        } else {
                                            imageView.setImageDrawable(C35835l0.h(R.attr.ic_arrowExpandLess20, view2.getContext()));
                                            quantityString = view2.getResources().getQuantityString(R.plurals.more_phones_plural, i13, Integer.valueOf(i13));
                                        }
                                        o18.f227375u.setText(quantityString);
                                        if (z14) {
                                            com.avito.konveyor.adapter.a aVar = phonesListFragment.f227395x0;
                                            if (aVar == null) {
                                                aVar = null;
                                            }
                                            com.avito.konveyor.util.a.a(aVar, list);
                                        } else {
                                            com.avito.konveyor.adapter.a aVar2 = phonesListFragment.f227395x0;
                                            if (aVar2 == null) {
                                                aVar2 = null;
                                            }
                                            com.avito.konveyor.util.a.a(aVar2, C42745f0.E0(list, i12));
                                        }
                                    } else {
                                        com.avito.konveyor.adapter.a aVar3 = phonesListFragment.f227395x0;
                                        if (aVar3 == null) {
                                            aVar3 = null;
                                        }
                                        com.avito.konveyor.util.a.a(aVar3, list);
                                    }
                                    RecyclerView.Adapter<?> adapter = phonesListFragment.f227393v0;
                                    if (adapter == null) {
                                        adapter = null;
                                    }
                                    adapter.notifyDataSetChanged();
                                }
                                O o19 = phonesListFragment.f227390J0;
                                if (o19 == null) {
                                    o19 = null;
                                }
                                TextView textView = o19.f227362h;
                                boolean z15 = phonesListMviState2.f228027k;
                                D6.G(textView, z15);
                                D6.G(o19.f227364j, z15);
                                D6.G(o19.f227363i, z15);
                                String str2 = "";
                                if (z15) {
                                    O o22 = phonesListFragment.f227390J0;
                                    if (o22 == null) {
                                        o22 = null;
                                    }
                                    Input.t(o22.f227364j, phonesListMviState2.f228025i, false, 6);
                                    O o23 = phonesListFragment.f227390J0;
                                    if (o23 == null) {
                                        o23 = null;
                                    }
                                    org.threeten.bp.g gVar = com.avito.android.profile_phones.phones_list.mvi.O.f227944c;
                                    org.threeten.bp.g gVar2 = phonesListMviState2.f228023g;
                                    boolean zF2 = kotlin.jvm.internal.L.f(gVar2, gVar);
                                    org.threeten.bp.g gVar3 = phonesListMviState2.f228024h;
                                    boolean z16 = (zF2 && kotlin.jvm.internal.L.f(gVar3, gVar)) || (gVar2 == null && gVar3 == null);
                                    TextView textView2 = o23.f227362h;
                                    if (z16) {
                                        D6.w(textView2);
                                        string = "";
                                    } else {
                                        D6.H(textView2);
                                        string = o23.f227355a.getContext().getString(R.string.iac_settings_time_hint);
                                    }
                                    textView2.setText(string);
                                }
                                List<ScheduleOption> list2 = phonesListMviState2.f228026j;
                                boolean z17 = z15 && !list2.isEmpty();
                                O o24 = phonesListFragment.f227390J0;
                                if (o24 == null) {
                                    o24 = null;
                                }
                                D6.G(o24.f227365k, z17);
                                O o25 = phonesListFragment.f227390J0;
                                if (o25 == null) {
                                    o25 = null;
                                }
                                D6.G(o25.f227366l, z17);
                                Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (((ScheduleOption) next).f168412e) {
                                        break;
                                    }
                                }
                                ScheduleOption scheduleOption = (ScheduleOption) next;
                                if (scheduleOption != null && (str = scheduleOption.f168410c) != null) {
                                    str2 = str;
                                }
                                O o26 = phonesListFragment.f227390J0;
                                if (o26 == null) {
                                    o26 = null;
                                }
                                Input.t(o26.f227366l, str2, false, 6);
                                O o27 = phonesListFragment.f227390J0;
                                if (o27 == null) {
                                    o27 = null;
                                }
                                TextView textView3 = o27.f227376v;
                                boolean z18 = phonesListMviState2.f228020d;
                                D6.G(textView3, z18);
                                D6.G(o27.f227377w, z18);
                                D6.G(o27.f227378x, z18);
                                com.avito.konveyor.adapter.a aVar4 = phonesListFragment.f227396y0;
                                if (aVar4 == null) {
                                    aVar4 = null;
                                }
                                com.avito.konveyor.util.a.a(aVar4, phonesListMviState2.f228022f);
                                RecyclerView.Adapter<?> adapter2 = phonesListFragment.f227394w0;
                                if (adapter2 == null) {
                                    adapter2 = null;
                                }
                                adapter2.notifyDataSetChanged();
                                O o28 = phonesListFragment.f227390J0;
                                if (o28 == null) {
                                    o28 = null;
                                }
                                Banner banner = o28.f227360f;
                                boolean z19 = phonesListMviState2.f228030n;
                                D6.G(banner, z19);
                                O o29 = phonesListFragment.f227390J0;
                                if (o29 == null) {
                                    o29 = null;
                                }
                                D6.G(o29.f227359e, phonesListMviState2.f228029m);
                                O o32 = phonesListFragment.f227390J0;
                                if (o32 == null) {
                                    o32 = null;
                                }
                                D6.G(o32.f227358d, phonesListMviState2.f228028l);
                                if (z19 && (iacEnableSwitchState = phonesListMviState2.f228031o) != null) {
                                    O o33 = phonesListFragment.f227390J0;
                                    if (o33 == null) {
                                        o33 = null;
                                    }
                                    o33.f227361g.setLoading(iacEnableSwitchState.f227975c);
                                    O o34 = phonesListFragment.f227390J0;
                                    if (o34 == null) {
                                        o34 = null;
                                    }
                                    o34.f227361g.i();
                                    O o35 = phonesListFragment.f227390J0;
                                    if (o35 == null) {
                                        o35 = null;
                                    }
                                    o35.f227361g.setChecked(iacEnableSwitchState.f227974b);
                                    O o36 = phonesListFragment.f227390J0;
                                    (o36 != null ? o36 : null).f227361g.e(new C13079a(phonesListFragment, 6));
                                }
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6911a(PhonesListFragment phonesListFragment, Continuation<? super C6911a> continuation) {
                    super(2, continuation);
                    this.f227403r = phonesListFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6911a(this.f227403r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                    return ((C6911a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f227402q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = PhonesListFragment.f227380K0;
                        PhonesListFragment phonesListFragment = this.f227403r;
                        n2<PhonesListMviState> state = phonesListFragment.D5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = phonesListFragment.f227384D0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C6912a c6912a = new C6912a(phonesListFragment);
                        this.f227402q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6912a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: PhonesListFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.profile_phones.phones_list.PhonesListFragment$onViewCreated$2$1$2", f = "PhonesListFragment.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f227405q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ PhonesListFragment f227406r;

                /* compiled from: PhonesListFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.profile_phones.phones_list.PhonesListFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C6913a implements InterfaceC43172j, kotlin.jvm.internal.D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PhonesListFragment f227407b;

                    public C6913a(PhonesListFragment phonesListFragment) {
                        this.f227407b = phonesListFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC49591b interfaceC49591b = (InterfaceC49591b) obj;
                        a aVar = PhonesListFragment.f227380K0;
                        PhonesListFragment phonesListFragment = this.f227407b;
                        if (kotlin.jvm.internal.L.f(interfaceC49591b, InterfaceC49591b.d.f441656a)) {
                            phonesListFragment.f227386F0.b(G0.f406611a);
                        } else if (interfaceC49591b instanceof InterfaceC49591b.f) {
                            InterfaceC49591b.f fVar = (InterfaceC49591b.f) interfaceC49591b;
                            boolean z12 = fVar.f441659a;
                            IacEnableBottomSheetFragment.f227749o0.getClass();
                            IacEnableBottomSheetFragment.a.a(fVar.f441660b, z12).show(phonesListFragment.getParentFragmentManager(), "iac_enable_bottom_sheet_tag");
                            C22960s.b(phonesListFragment, "iac_enabled_result", new C33454x(phonesListFragment));
                        } else if (interfaceC49591b instanceof InterfaceC49591b.i) {
                            DialogC33420e dialogC33420e = new DialogC33420e(phonesListFragment.requireContext(), null, ((InterfaceC49591b.i) interfaceC49591b).f441664a, new A(phonesListFragment), 2, null);
                            phonesListFragment.f227388H0 = dialogC33420e;
                            com.avito.android.lib.util.g.a(dialogC33420e);
                        } else {
                            AttributeSet attributeSet = null;
                            if (interfaceC49591b instanceof InterfaceC49591b.h) {
                                List<ScheduleOption> list = ((InterfaceC49591b.h) interfaceC49591b).f441663a;
                                com.avito.android.lib.design.bottom_sheet.d dVar = phonesListFragment.f227389I0;
                                if (dVar != null) {
                                    dVar.dismiss();
                                }
                                ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, phonesListFragment.requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23));
                                LinearLayout linearLayout = new LinearLayout(contextThemeWrapperB);
                                linearLayout.setOrientation(1);
                                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                linearLayout.setPadding(0, y6.b(24), 0, y6.b(24));
                                ArrayList arrayList = new ArrayList();
                                for (ScheduleOption scheduleOption : list) {
                                    z zVar = new z(phonesListFragment, arrayList, scheduleOption);
                                    ListItemCheckmark listItemCheckmark = new ListItemCheckmark(contextThemeWrapperB, attributeSet);
                                    listItemCheckmark.setState((kV.b) new kV.d(scheduleOption.f168410c, scheduleOption.f168411d, null, null, null, false, null, new ToggleState(null, false, false, false, scheduleOption.f168412e ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b, 15, null), false, false, 892, null));
                                    listItemCheckmark.setOnClickListener(new ViewOnClickListenerC31042l(17, zVar));
                                    listItemCheckmark.setPadding(y6.b(16), 0, y6.b(16), 0);
                                    arrayList.add(listItemCheckmark);
                                    attributeSet = null;
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    linearLayout.addView((View) it.next());
                                }
                                com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(contextThemeWrapperB, R.style.Re23_BottomSheet_Default);
                                com.avito.android.lib.design.bottom_sheet.d.M(dVar2, contextThemeWrapperB.getString(R.string.numbers_and_calls_schedule_title), true, true, 2);
                                dVar2.setCancelable(true);
                                com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
                                dVar2.setContentView(linearLayout);
                                phonesListFragment.f227389I0 = dVar2;
                                com.avito.android.lib.util.g.a(dVar2);
                            } else if (interfaceC49591b instanceof InterfaceC49591b.j) {
                                DialogC33420e dialogC33420e2 = phonesListFragment.f227388H0;
                                if (dialogC33420e2 != null) {
                                    Throwable th2 = ((InterfaceC49591b.j) interfaceC49591b).f441665a;
                                    Button button = dialogC33420e2.f227738H;
                                    if (button != null) {
                                        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, button, com.avito.android.printable_text.b.c(R.string.iac_settings_time_error, new Serializable[0]), null, null, null, new f.c(th2), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4014);
                                    }
                                }
                            } else if (interfaceC49591b instanceof InterfaceC49591b.m) {
                                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, phonesListFragment, ((InterfaceC49591b.m) interfaceC49591b).f441668a, null, null, null, 0, null, 1022);
                            } else if (kotlin.jvm.internal.L.f(interfaceC49591b, InterfaceC49591b.a.f441652a)) {
                                DialogC33420e dialogC33420e3 = phonesListFragment.f227388H0;
                                if (dialogC33420e3 != null) {
                                    dialogC33420e3.dismiss();
                                }
                            } else if (interfaceC49591b instanceof InterfaceC49591b.g) {
                                InterfaceC49591b.g gVar = (InterfaceC49591b.g) interfaceC49591b;
                                String str = gVar.f441661a;
                                Fragment fragmentH = phonesListFragment.getParentFragmentManager().H("actions_fragment_tag");
                                if (fragmentH == null || !fragmentH.isAdded()) {
                                    PhoneActionsSheetDialogArguments phoneActionsSheetDialogArguments = new PhoneActionsSheetDialogArguments(gVar.f441662b, str);
                                    PhoneActionsSheetDialogFragment phoneActionsSheetDialogFragment = new PhoneActionsSheetDialogFragment();
                                    Bundle bundle = new Bundle();
                                    bundle.putParcelable("arguments", phoneActionsSheetDialogArguments);
                                    phoneActionsSheetDialogFragment.setArguments(bundle);
                                    C22960s.b(phonesListFragment, "PHONE_ACTION_REQUEST_CODE", new C33455y(phonesListFragment));
                                    phoneActionsSheetDialogFragment.show(phonesListFragment.getParentFragmentManager(), "actions_fragment_tag");
                                }
                            } else if (kotlin.jvm.internal.L.f(interfaceC49591b, InterfaceC49591b.c.f441655a)) {
                                phonesListFragment.B5(-1, null);
                            } else if (interfaceC49591b instanceof InterfaceC49591b.C12822b) {
                                InterfaceC49591b.C12822b c12822b = (InterfaceC49591b.C12822b) interfaceC49591b;
                                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, phonesListFragment, c12822b.f441653a, null, null, new f.c(c12822b.f441654b), 0, ToastBarPosition.f181046d, 942);
                            } else if (interfaceC49591b instanceof InterfaceC49591b.e) {
                                InterfaceC49591b.e eVar = (InterfaceC49591b.e) interfaceC49591b;
                                DeviceListItem deviceListItem = eVar.f441657a;
                                DeleteDeviceBottomSheetFragment.a aVar2 = DeleteDeviceBottomSheetFragment.f227518m0;
                                ArrayList arrayList2 = eVar.f441658b;
                                aVar2.getClass();
                                DeleteDeviceBottomSheetFragment.a.a(deviceListItem, arrayList2).show(phonesListFragment.getParentFragmentManager(), "delete_device_bottom_sheet_tag");
                                C22960s.b(phonesListFragment, "iac_enabled_result_success", new C33453w(phonesListFragment));
                            } else if (kotlin.jvm.internal.L.f(interfaceC49591b, InterfaceC49591b.l.f441667a)) {
                                C33413a c33413a = C33413a.f227434a;
                                B b12 = B.f227339l;
                                C c12 = new C(phonesListFragment);
                                D d12 = D.f227341l;
                                E e12 = E.f227342l;
                                F f12 = new F(phonesListFragment);
                                G g12 = G.f227344l;
                                H h12 = H.f227345l;
                                I i12 = I.f227346l;
                                com.avito.android.deeplink_handler.handler.composite.a aVar3 = phonesListFragment.f227381A0;
                                com.avito.android.deeplink_handler.handler.composite.a aVar4 = aVar3 != null ? aVar3 : null;
                                Resources resources = phonesListFragment.getResources();
                                c33413a.getClass();
                                C33413a.a(b12, c12, d12, e12, f12, g12, h12, i12, aVar4, phonesListFragment.f227387G0, resources);
                            } else if (interfaceC49591b instanceof InterfaceC49591b.k) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar5 = phonesListFragment.f227381A0;
                                if (aVar5 == null) {
                                    aVar5 = null;
                                }
                                b.a.a(aVar5, ((InterfaceC49591b.k) interfaceC49591b).f441666a, null, null, 6);
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                            return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f227407b, PhonesListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(PhonesListFragment phonesListFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f227406r = phonesListFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f227406r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f227405q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = PhonesListFragment.f227380K0;
                        PhonesListFragment phonesListFragment = this.f227406r;
                        InterfaceC43160i<InterfaceC49591b> events = phonesListFragment.D5().getEvents();
                        C6913a c6913a = new C6913a(phonesListFragment);
                        this.f227405q = 1;
                        if (events.collect(c6913a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PhonesListFragment phonesListFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f227401r = phonesListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f227401r, continuation);
                aVar.f227400q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f227400q;
                PhonesListFragment phonesListFragment = this.f227401r;
                C49237a c49237a = phonesListFragment.f227383C0;
                if (c49237a == null) {
                    c49237a = null;
                }
                if (!c49237a.v().invoke().booleanValue()) {
                    C43259k.d(t12, null, null, new C6911a(phonesListFragment, null), 3);
                }
                C43259k.d(t12, null, null, new b(phonesListFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return PhonesListFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f227398q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                PhonesListFragment phonesListFragment = PhonesListFragment.this;
                a aVar = new a(phonesListFragment, null);
                this.f227398q = 1;
                if (C23056p0.b(phonesListFragment, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f227409m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f227409m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(PhonesListFragment.this, this.f227409m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PhonesListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f227411l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f227411l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f227411l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f227412l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f227412l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f227412l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f227413l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f227413l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f227413l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PhonesListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/profile_phones/phones_list/P;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/profile_phones/phones_list/P;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<C23060r0, P> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final P invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            P.a aVar = PhonesListFragment.this.f227391t0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public PhonesListFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f227392u0 = new O0(m0.f406844a.b(P.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f227385E0 = new NavigationState(false, null, 2, null);
        this.f227386F0 = registerForActivityResult(new C33425j(this), new C28629h(4));
        this.f227387G0 = new io.reactivex.rxjava3.disposables.c();
    }

    public final P D5() {
        return (P) this.f227392u0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f227384D0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C49237a c49237a = this.f227383C0;
        if (!(c49237a != null ? c49237a : null).v().invoke().booleanValue()) {
            return layoutInflater.inflate(R.layout.phones_list_fragment, viewGroup, false);
        }
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(-1703877397, new C33452v(this), true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f227389I0;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f227389I0 = null;
        this.f227387G0.e();
        D5().accept(InterfaceC49590a.p.f441648a);
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f227384D0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        C49237a c49237a = this.f227383C0;
        if (c49237a == null) {
            c49237a = null;
        }
        if (!c49237a.v().invoke().booleanValue()) {
            this.f227390J0 = new O(view);
            C49237a c49237a2 = this.f227383C0;
            if (c49237a2 == null) {
                c49237a2 = null;
            }
            if (!c49237a2.v().invoke().booleanValue()) {
                O o12 = this.f227390J0;
                if (o12 == null) {
                    o12 = null;
                }
                Toolbar toolbar = o12.f227356b;
                if (toolbar != null) {
                    final int i12 = 1;
                    toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.i

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ PhonesListFragment f227748c;

                        {
                            this.f227748c = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            PhonesListFragment phonesListFragment = this.f227748c;
                            switch (i12) {
                                case 0:
                                    PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
                                    phonesListFragment.D5().accept(InterfaceC49590a.k.f441643a);
                                    break;
                                case 1:
                                    PhonesListFragment.a aVar2 = PhonesListFragment.f227380K0;
                                    Bundle arguments = phonesListFragment.getArguments();
                                    if (arguments != null && arguments.getBoolean("default_ok")) {
                                        phonesListFragment.B5(-1, null);
                                    }
                                    phonesListFragment.r5();
                                    break;
                                case 2:
                                    PhonesListFragment.a aVar3 = PhonesListFragment.f227380K0;
                                    phonesListFragment.D5().accept(InterfaceC49590a.r.f441650a);
                                    break;
                                case 3:
                                    PhonesListFragment.a aVar4 = PhonesListFragment.f227380K0;
                                    phonesListFragment.D5().accept(InterfaceC49590a.n.f441646a);
                                    break;
                                case 4:
                                    PhonesListFragment.a aVar5 = PhonesListFragment.f227380K0;
                                    phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                    break;
                                case 5:
                                    PhonesListFragment.a aVar6 = PhonesListFragment.f227380K0;
                                    phonesListFragment.D5().accept(InterfaceC49590a.m.f441645a);
                                    break;
                                case 6:
                                    PhonesListFragment.a aVar7 = PhonesListFragment.f227380K0;
                                    phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                    break;
                                case 7:
                                    PhonesListFragment.a aVar8 = PhonesListFragment.f227380K0;
                                    phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                    break;
                                case 8:
                                    PhonesListFragment.a aVar9 = PhonesListFragment.f227380K0;
                                    phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                    break;
                                default:
                                    PhonesListFragment.a aVar10 = PhonesListFragment.f227380K0;
                                    phonesListFragment.D5().accept(InterfaceC49590a.f.f441637a);
                                    break;
                            }
                        }
                    });
                }
                O o13 = this.f227390J0;
                if (o13 == null) {
                    o13 = null;
                }
                RecyclerView recyclerView = o13.f227367m;
                RecyclerView.Adapter<?> adapter = this.f227393v0;
                if (adapter == null) {
                    adapter = null;
                }
                recyclerView.setAdapter(adapter);
                O o14 = this.f227390J0;
                if (o14 == null) {
                    o14 = null;
                }
                RecyclerView recyclerView2 = o14.f227378x;
                RecyclerView.Adapter<?> adapter2 = this.f227394w0;
                if (adapter2 == null) {
                    adapter2 = null;
                }
                recyclerView2.setAdapter(adapter2);
                O o15 = this.f227390J0;
                if (o15 == null) {
                    o15 = null;
                }
                final int i13 = 2;
                o15.f227364j.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ PhonesListFragment f227748c;

                    {
                        this.f227748c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PhonesListFragment phonesListFragment = this.f227748c;
                        switch (i13) {
                            case 0:
                                PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.k.f441643a);
                                break;
                            case 1:
                                PhonesListFragment.a aVar2 = PhonesListFragment.f227380K0;
                                Bundle arguments = phonesListFragment.getArguments();
                                if (arguments != null && arguments.getBoolean("default_ok")) {
                                    phonesListFragment.B5(-1, null);
                                }
                                phonesListFragment.r5();
                                break;
                            case 2:
                                PhonesListFragment.a aVar3 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.r.f441650a);
                                break;
                            case 3:
                                PhonesListFragment.a aVar4 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.n.f441646a);
                                break;
                            case 4:
                                PhonesListFragment.a aVar5 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            case 5:
                                PhonesListFragment.a aVar6 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.m.f441645a);
                                break;
                            case 6:
                                PhonesListFragment.a aVar7 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 7:
                                PhonesListFragment.a aVar8 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 8:
                                PhonesListFragment.a aVar9 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            default:
                                PhonesListFragment.a aVar10 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.f.f441637a);
                                break;
                        }
                    }
                });
                O o16 = this.f227390J0;
                if (o16 == null) {
                    o16 = null;
                }
                final int i14 = 3;
                o16.f227366l.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ PhonesListFragment f227748c;

                    {
                        this.f227748c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PhonesListFragment phonesListFragment = this.f227748c;
                        switch (i14) {
                            case 0:
                                PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.k.f441643a);
                                break;
                            case 1:
                                PhonesListFragment.a aVar2 = PhonesListFragment.f227380K0;
                                Bundle arguments = phonesListFragment.getArguments();
                                if (arguments != null && arguments.getBoolean("default_ok")) {
                                    phonesListFragment.B5(-1, null);
                                }
                                phonesListFragment.r5();
                                break;
                            case 2:
                                PhonesListFragment.a aVar3 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.r.f441650a);
                                break;
                            case 3:
                                PhonesListFragment.a aVar4 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.n.f441646a);
                                break;
                            case 4:
                                PhonesListFragment.a aVar5 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            case 5:
                                PhonesListFragment.a aVar6 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.m.f441645a);
                                break;
                            case 6:
                                PhonesListFragment.a aVar7 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 7:
                                PhonesListFragment.a aVar8 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 8:
                                PhonesListFragment.a aVar9 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            default:
                                PhonesListFragment.a aVar10 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.f.f441637a);
                                break;
                        }
                    }
                });
                O o17 = this.f227390J0;
                if (o17 == null) {
                    o17 = null;
                }
                final int i15 = 4;
                o17.f227358d.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ PhonesListFragment f227748c;

                    {
                        this.f227748c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PhonesListFragment phonesListFragment = this.f227748c;
                        switch (i15) {
                            case 0:
                                PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.k.f441643a);
                                break;
                            case 1:
                                PhonesListFragment.a aVar2 = PhonesListFragment.f227380K0;
                                Bundle arguments = phonesListFragment.getArguments();
                                if (arguments != null && arguments.getBoolean("default_ok")) {
                                    phonesListFragment.B5(-1, null);
                                }
                                phonesListFragment.r5();
                                break;
                            case 2:
                                PhonesListFragment.a aVar3 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.r.f441650a);
                                break;
                            case 3:
                                PhonesListFragment.a aVar4 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.n.f441646a);
                                break;
                            case 4:
                                PhonesListFragment.a aVar5 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            case 5:
                                PhonesListFragment.a aVar6 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.m.f441645a);
                                break;
                            case 6:
                                PhonesListFragment.a aVar7 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 7:
                                PhonesListFragment.a aVar8 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 8:
                                PhonesListFragment.a aVar9 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            default:
                                PhonesListFragment.a aVar10 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.f.f441637a);
                                break;
                        }
                    }
                });
                O o18 = this.f227390J0;
                if (o18 == null) {
                    o18 = null;
                }
                final int i16 = 5;
                o18.f227368n.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ PhonesListFragment f227748c;

                    {
                        this.f227748c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PhonesListFragment phonesListFragment = this.f227748c;
                        switch (i16) {
                            case 0:
                                PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.k.f441643a);
                                break;
                            case 1:
                                PhonesListFragment.a aVar2 = PhonesListFragment.f227380K0;
                                Bundle arguments = phonesListFragment.getArguments();
                                if (arguments != null && arguments.getBoolean("default_ok")) {
                                    phonesListFragment.B5(-1, null);
                                }
                                phonesListFragment.r5();
                                break;
                            case 2:
                                PhonesListFragment.a aVar3 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.r.f441650a);
                                break;
                            case 3:
                                PhonesListFragment.a aVar4 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.n.f441646a);
                                break;
                            case 4:
                                PhonesListFragment.a aVar5 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            case 5:
                                PhonesListFragment.a aVar6 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.m.f441645a);
                                break;
                            case 6:
                                PhonesListFragment.a aVar7 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 7:
                                PhonesListFragment.a aVar8 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 8:
                                PhonesListFragment.a aVar9 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            default:
                                PhonesListFragment.a aVar10 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.f.f441637a);
                                break;
                        }
                    }
                });
                O o19 = this.f227390J0;
                if (o19 == null) {
                    o19 = null;
                }
                final int i17 = 6;
                o19.f227369o.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ PhonesListFragment f227748c;

                    {
                        this.f227748c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PhonesListFragment phonesListFragment = this.f227748c;
                        switch (i17) {
                            case 0:
                                PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.k.f441643a);
                                break;
                            case 1:
                                PhonesListFragment.a aVar2 = PhonesListFragment.f227380K0;
                                Bundle arguments = phonesListFragment.getArguments();
                                if (arguments != null && arguments.getBoolean("default_ok")) {
                                    phonesListFragment.B5(-1, null);
                                }
                                phonesListFragment.r5();
                                break;
                            case 2:
                                PhonesListFragment.a aVar3 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.r.f441650a);
                                break;
                            case 3:
                                PhonesListFragment.a aVar4 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.n.f441646a);
                                break;
                            case 4:
                                PhonesListFragment.a aVar5 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            case 5:
                                PhonesListFragment.a aVar6 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.m.f441645a);
                                break;
                            case 6:
                                PhonesListFragment.a aVar7 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 7:
                                PhonesListFragment.a aVar8 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 8:
                                PhonesListFragment.a aVar9 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            default:
                                PhonesListFragment.a aVar10 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.f.f441637a);
                                break;
                        }
                    }
                });
                O o22 = this.f227390J0;
                if (o22 == null) {
                    o22 = null;
                }
                final int i18 = 7;
                o22.f227372r.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ PhonesListFragment f227748c;

                    {
                        this.f227748c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PhonesListFragment phonesListFragment = this.f227748c;
                        switch (i18) {
                            case 0:
                                PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.k.f441643a);
                                break;
                            case 1:
                                PhonesListFragment.a aVar2 = PhonesListFragment.f227380K0;
                                Bundle arguments = phonesListFragment.getArguments();
                                if (arguments != null && arguments.getBoolean("default_ok")) {
                                    phonesListFragment.B5(-1, null);
                                }
                                phonesListFragment.r5();
                                break;
                            case 2:
                                PhonesListFragment.a aVar3 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.r.f441650a);
                                break;
                            case 3:
                                PhonesListFragment.a aVar4 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.n.f441646a);
                                break;
                            case 4:
                                PhonesListFragment.a aVar5 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            case 5:
                                PhonesListFragment.a aVar6 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.m.f441645a);
                                break;
                            case 6:
                                PhonesListFragment.a aVar7 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 7:
                                PhonesListFragment.a aVar8 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 8:
                                PhonesListFragment.a aVar9 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            default:
                                PhonesListFragment.a aVar10 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.f.f441637a);
                                break;
                        }
                    }
                });
                O o23 = this.f227390J0;
                if (o23 == null) {
                    o23 = null;
                }
                final int i19 = 8;
                o23.f227358d.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ PhonesListFragment f227748c;

                    {
                        this.f227748c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PhonesListFragment phonesListFragment = this.f227748c;
                        switch (i19) {
                            case 0:
                                PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.k.f441643a);
                                break;
                            case 1:
                                PhonesListFragment.a aVar2 = PhonesListFragment.f227380K0;
                                Bundle arguments = phonesListFragment.getArguments();
                                if (arguments != null && arguments.getBoolean("default_ok")) {
                                    phonesListFragment.B5(-1, null);
                                }
                                phonesListFragment.r5();
                                break;
                            case 2:
                                PhonesListFragment.a aVar3 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.r.f441650a);
                                break;
                            case 3:
                                PhonesListFragment.a aVar4 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.n.f441646a);
                                break;
                            case 4:
                                PhonesListFragment.a aVar5 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            case 5:
                                PhonesListFragment.a aVar6 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.m.f441645a);
                                break;
                            case 6:
                                PhonesListFragment.a aVar7 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 7:
                                PhonesListFragment.a aVar8 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 8:
                                PhonesListFragment.a aVar9 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            default:
                                PhonesListFragment.a aVar10 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.f.f441637a);
                                break;
                        }
                    }
                });
                O o24 = this.f227390J0;
                if (o24 == null) {
                    o24 = null;
                }
                final int i22 = 9;
                o24.f227359e.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ PhonesListFragment f227748c;

                    {
                        this.f227748c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PhonesListFragment phonesListFragment = this.f227748c;
                        switch (i22) {
                            case 0:
                                PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.k.f441643a);
                                break;
                            case 1:
                                PhonesListFragment.a aVar2 = PhonesListFragment.f227380K0;
                                Bundle arguments = phonesListFragment.getArguments();
                                if (arguments != null && arguments.getBoolean("default_ok")) {
                                    phonesListFragment.B5(-1, null);
                                }
                                phonesListFragment.r5();
                                break;
                            case 2:
                                PhonesListFragment.a aVar3 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.r.f441650a);
                                break;
                            case 3:
                                PhonesListFragment.a aVar4 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.n.f441646a);
                                break;
                            case 4:
                                PhonesListFragment.a aVar5 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            case 5:
                                PhonesListFragment.a aVar6 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.m.f441645a);
                                break;
                            case 6:
                                PhonesListFragment.a aVar7 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 7:
                                PhonesListFragment.a aVar8 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 8:
                                PhonesListFragment.a aVar9 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            default:
                                PhonesListFragment.a aVar10 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.f.f441637a);
                                break;
                        }
                    }
                });
                O o25 = this.f227390J0;
                if (o25 == null) {
                    o25 = null;
                }
                final int i23 = 0;
                o25.f227373s.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ PhonesListFragment f227748c;

                    {
                        this.f227748c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PhonesListFragment phonesListFragment = this.f227748c;
                        switch (i23) {
                            case 0:
                                PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.k.f441643a);
                                break;
                            case 1:
                                PhonesListFragment.a aVar2 = PhonesListFragment.f227380K0;
                                Bundle arguments = phonesListFragment.getArguments();
                                if (arguments != null && arguments.getBoolean("default_ok")) {
                                    phonesListFragment.B5(-1, null);
                                }
                                phonesListFragment.r5();
                                break;
                            case 2:
                                PhonesListFragment.a aVar3 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.r.f441650a);
                                break;
                            case 3:
                                PhonesListFragment.a aVar4 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.n.f441646a);
                                break;
                            case 4:
                                PhonesListFragment.a aVar5 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            case 5:
                                PhonesListFragment.a aVar6 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.m.f441645a);
                                break;
                            case 6:
                                PhonesListFragment.a aVar7 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 7:
                                PhonesListFragment.a aVar8 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.C12821a.f441632a);
                                break;
                            case 8:
                                PhonesListFragment.a aVar9 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.g.f441638a);
                                break;
                            default:
                                PhonesListFragment.a aVar10 = PhonesListFragment.f227380K0;
                                phonesListFragment.D5().accept(InterfaceC49590a.f.f441637a);
                                break;
                        }
                    }
                });
            }
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f227381A0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new b(2, this, PhonesListFragment.class, "handleDeepLinkResult", "handleDeepLinkResult(Lcom/avito/android/deeplink_handler/handler/result/DeeplinkResultEvent;)V", 4), kotlinx.coroutines.rx3.y.a(aVar.d9())), C22984Q.a(getViewLifecycleOwner()));
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        k.a aVarA = com.avito.android.profile_phones.phones_list.di.a.a();
        Resources resources = getResources();
        com.avito.android.profile_phones.phones_list.di.j jVar = (com.avito.android.profile_phones.phones_list.di.j) C29972i.a(C29972i.b(this), com.avito.android.profile_phones.phones_list.di.j.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        boolean z12 = bundle != null;
        C28478k c28478k = new C28478k(PhonesListScreen.f227245d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        SectionForOpen.a aVar = SectionForOpen.f227421b;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("section_for_open") : null;
        aVar.getClass();
        aVarA.a(this, resources, c28478k, z12, this, this, kotlin.jvm.internal.L.f(string, "timeRangePicker") ? SectionForOpen.f227422c : null, interfaceC39417aB, jVar).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f227384D0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f227384D0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    @Override // com.avito.android.profile_phones.phones_list.phone_item.a
    public final void q2(@Y61.k PhoneListItem phoneListItem) {
        D5().accept(new InterfaceC49590a.j(phoneListItem));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF152474Z0() {
        return this.f227385E0;
    }

    @Override // com.avito.android.profile_phones.phones_list.device_list_item.i
    public final void w4(@Y61.k DeviceListItem deviceListItem) {
        D5().accept(new InterfaceC49590a.c(deviceListItem));
    }
}
